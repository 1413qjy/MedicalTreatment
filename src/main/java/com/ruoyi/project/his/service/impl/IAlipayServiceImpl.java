package com.ruoyi.project.his.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.thread.ThreadUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.ruoyi.project.his.config.AliPayConfig;
import com.ruoyi.project.his.domain.HisHospitalAppointment;
import com.ruoyi.project.his.domain.HisIndent;
import com.ruoyi.project.his.domain.HisLockStock;
import com.ruoyi.project.his.domain.HisRegSum;
import com.ruoyi.project.his.entity.Alipay;
import com.ruoyi.project.his.entity.AppointMentIndent;
import com.ruoyi.project.his.mapper.HisHospitalAppointmentMapper;
import com.ruoyi.project.his.mapper.HisIndentMapper;
import com.ruoyi.project.his.mapper.HisLockStockMapper;
import com.ruoyi.project.his.mapper.HisRegSumMapper;
import com.ruoyi.project.his.service.IAlipayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class IAlipayServiceImpl implements IAlipayService {

    //    支付宝沙箱应用ID
    private String appId = "2021000121695047";

    //    商户私钥
    private String privateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCnzZ289+g+co8vFGb23v8n+hSd410CTnykZ2pvItJO62gRCMrt24XYvCTMfRum9Zao841ENGBHRSvvNoHvobHqBtU4E3muJgqbr5/VBnCGz7TAsDSH60gjdGX2foxAvFqXnOHTL/vkCVS91iGzGHZ6vaEVzcKknjvSJ+Uyld7Pej5hd2xyVRd1e4GZvXtT8NoPVdFdbw0/HG5/xTScM1h+QpGIfVkrnp3PsDy1VVMhrI8bJ5GXrn/kaeyBTf2bP6mqrWPkx3DdxoI2tC6WTckJBUFMCejkaE1fqwnZT8KUXnWifAdi5rNnF/Itv86+liqxL+cLYp4HloYV7Y4bO1SrAgMBAAECggEAYvdF3LlpY8s031NtFpSWcAFyP1xk8oNPx7amcz1aQ+layxEgfgBGhHkSSvhOYr3dSW+7FUq+rcoCC2deYvI+eAPnpNb3oNoWz5NY9M6Ddz7xH+PMV41QUnjH2gTwuw1bcKe6GE/og6ltLTkpTvNSjTlh0/Yyodwg8+VLq/XwHvTHgEM15/GZKM05aZMeNbfLTg53aP+WwevnL+1X2nqMuKiw3h0fE2wMBKIa4mj2nil01EjkH8MsH5I8pdybNq+G1TBXvPlvM1WCNP2520IMS2vtAEiFyfKTkApLWwpfJ36vGgQTVA8IS3dPgMCGxbZzFi6Mb/AIQB1qTkdk7vybgQKBgQDrIeLSKETCptIiH/Ij8HntsjCLMtaP22/tx8ueqLesn61L0zNeYvgZgVMIK77agy+qZ+AA2yGqqAWNE3iTKiWst62elbbCphn1zoEW8hnI3iAHoWv5VqsRPN/aBCRjgwcrNgBUZdq4wGWWaMxD61fJysLueCfZsA8Qg7HjodUZ0QKBgQC2sgm2iUdnC3/zNSXeY+2as2T6xXqv3+hQ9AfXH+VG6R4tUPKSbM5CflQYSu7sgSIivCSr8LgYseYG8UGULDO6ogrkPmS27bOPEPWOo/3nwgkRNefxZE1RvJlAfOJKJw2LRgVmXtDsnrLQ0GwqzOde73myWkscnW7AfrJVGT8puwKBgB0ngHZKY+w2vwtYJq/qG1QrqfU4gn4n2UMEaOztQoj264fhUhc78kNHU8JJmkqBxaE9a/rvMMd2Oen6JhMpQK6fv7lQGu8bpVBjIIJ11lifoh0QGNE7u85RW/guV0y3bGYhNf1A+9O4l2AE8n7haWst5ummoFpPiC6mBaKR6FhhAoGAR2RnW0dl+aSKyXV5aOBP12ZHDZ/iA5xR4mCaN7ylEgLC4h6BzCpsp5tKLXwKxazos/4lrnMQ3cWXCBt67vYe+M2dx/eBz+Ivirar3qPC8q/mby1LiA8UD97NXF/w5d1A863XKlve9LhHVEY+HrOXroeSXNngBDyZLOvVsF9/SUUCgYEA3TdSupVTOMYnO714UAoI9cvMvdmzxogefLkVaXa4wMbShfoccM4O8InQ/6T50orSIyDU0YSlpqzVx/Ux3M6Xag7WapUIwa3U8CK6x5NaVPA+0hNujlfRaJUj4ew1TTifZ0/3V5aTee4glieF1ZA23PwDmhUfuv2LTaEfsLfvgPg=";

    //    支付宝公钥
    private String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh3/SQA15gnQIwAtlll0j3tQ8MoNsvb0lr1km+YWRl8m9YbKDKOgP+vzt88f8RZwc7rCSzgAvRoSURkbnYpMXx5byAlgYK6gon76M9RqVe06U4GKL3QFXRTu9hmVa7nJvRkB0SbsaAyUlhM2OOnMxu9jFpbbGT42EdnfeuUw+BtAGLnJXJR3d75Lepz31/ES/ZGDUs9Wa2U2wVxfmSGayndkQ8WMOnx8a7jUVXqWwA16e7oAdpGxscz2qI73AiBCCzaNP6XeQ3Myk+rNCXnzed/FafL9aAvG58KW76KU6xUk/8xwFzEfX+qddGg33IgMlcXYZIQQXuCZv1a46nclsPwIDAQAB";

    //    服务器异步通知页面路径
    private String notifyUrl = "http://localhost:8080/his/alipay/success";

    //    页面跳转同步通知页面路径
    private String returnUrl = "http://localhost:8080/his/alipay/returnUrl";

    //    签名方式
    private String signType = "RSA2";

    //    字符编码格式
    private String charset = "utf-8";

    //    支付宝网关
    private String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    private final String format = "json";
//    private Alipay alipay;

    @Autowired
    private HisIndentMapper hisIndentMapper;

    @Autowired
    private HisHospitalAppointmentMapper hisHospitalAppointmentMapper;

//    @Autowired
//    private HisLockStockMapper hisLockStockMapper;
    @Autowired
    private HisRegSumMapper hisRegSumMapper;

    @Override
    @ResponseBody
    public String alipay(AppointMentIndent appointMentIndent) throws AlipayApiException, ParseException {
        Alipay alipay = new Alipay();
        boolean isShowIndent = false;
        if (appointMentIndent.getIndentNumber() == null){
            // 设置订单号
            alipay.setOut_trade_no(UUID.randomUUID().toString().replaceAll("-",""));
        }else {
            alipay.setOut_trade_no(appointMentIndent.getIndentNumber());
            isShowIndent = true;
        }
//        设置交易标题
        alipay.setSubject(appointMentIndent.getIndentType());
//        设置交易金额
        alipay.setTotal_amount(appointMentIndent.getSum());
//        设置商品信息
        alipay.setBody(appointMentIndent.getIndentMessage());
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayUrl, appId, privateKey, format, charset, publicKey, signType);
        //PC网页支付使用AlipayTradePagePayRequest传参，下面调用的是pageExecute方法
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(returnUrl);
        alipayRequest.setNotifyUrl(notifyUrl);
        alipayRequest.setBizContent(JSON.toJSONString(alipay));
        // 调用SDK生成表单
        String result = alipayClient.pageExecute(alipayRequest).getBody();
//        判断是否有相同订单存在
        if (result != null && isShowIndent == false){
            // 不存在就把订单信息存入订单表中
            HisIndent indent = new HisIndent();
            Date date = new Date();
            indent.setIndentTime(date);
            indent.setIndentNumber(alipay.getOut_trade_no());
            indent.setIndentTitle(alipay.getSubject());
            indent.setIndentSum(alipay.getTotal_amount());
            indent.setIndentMode("未支付");
            indent.setUserId(appointMentIndent.getUserId());
            // 原始订单信息
            indent.setIndentOriginal(appointMentIndent.getIndentOriginal());
//            存入订单表中
            int a = hisIndentMapper.insertHisIndent(indent);
            // 创建一个预约信息存储对象
            HisHospitalAppointment hisHospitalAppointment = new HisHospitalAppointment();
            // 设置预约表商户订单号
            hisHospitalAppointment.setIndentOuttrade(alipay.getOut_trade_no());
            // 设置就诊人姓名
            hisHospitalAppointment.setDoctorName(appointMentIndent.getName());
            // 设置就诊人电话
            hisHospitalAppointment.setDoctorPhone(appointMentIndent.getPhone());
            // 设置就诊人身份证
            hisHospitalAppointment.setDoctorNumber(appointMentIndent.getIdNumber());
            // 设置就诊信息
            hisHospitalAppointment.setDoctorMessage(appointMentIndent.getIndentMessage());
            // 设置预约时间
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            hisHospitalAppointment.setAppointmentTime(simpleDateFormat.parse(appointMentIndent.getTime()));
            // 设置账号id
            hisHospitalAppointment.setUserId(appointMentIndent.getUserId());
            // 设置星期
            hisHospitalAppointment.setDoctorDay(appointMentIndent.getDay());
            // 设置上下午
            hisHospitalAppointment.setAmPm(appointMentIndent.getAmPm());
            // 设置预约科室id
            hisHospitalAppointment.setDeptsId(appointMentIndent.getDeptsId());
            // 设置预约详细科室id
            hisHospitalAppointment.setDeptsCareid(appointMentIndent.getDeptsCareId());
            //设置职位id
            hisHospitalAppointment.setMedicalPostid(appointMentIndent.getMedicalPostId());
            // 设置医生id
            hisHospitalAppointment.setMedicalId(appointMentIndent.getMedicalId());
            // 设置年龄
            hisHospitalAppointment.setAge(appointMentIndent.getAge());
            // 设置性别
            hisHospitalAppointment.setSex(appointMentIndent.getSex());
            hisHospitalAppointmentMapper.insertHisHospitalAppointment(hisHospitalAppointment);
        }
        String day = appointMentIndent.getDay();
        String amPm = appointMentIndent.getAmPm();
        Long medicalId = appointMentIndent.getMedicalId();
        String condition = "$"+"."+day+"."+amPm;
        HisRegSum hisRegSum = hisRegSumMapper.selectHisRegSumByIdByday(medicalId,condition);
        JSONObject jsonObject = JSONObject.parseObject(hisRegSum.getRegSumJson());
        long remain = Long.parseLong(jsonObject.getString("remain"));
        long version = Long.parseLong(jsonObject.getString("version"));
        long vueVersion = Long.parseLong(appointMentIndent.getVersion());
        if(remain <=0){
            return "无挂号位";
        }else {
//            余号减一
            remain = remain-1;
//            版本号加一
            version = version+1;
            String condition1 = "$"+"."+day+"."+amPm+"."+"remain";
            String condition2 = "$"+"."+day+"."+amPm+"."+"version";
            int i = hisRegSumMapper.updateHisRegSumVersion(remain,version,vueVersion,medicalId,condition1,condition2);
            if(i == 0){
                return "您的预约位已被占用，请重新发起订单";
            }
        }
        System.out.println(hisRegSum);
//        返回给前端一个支付宝的字符串表单
        return result;
    }

    @Override
    @ResponseBody
    public String recordalipay(AppointMentIndent appointMentIndent) throws AlipayApiException, ParseException {
        Alipay alipay = new Alipay();
        boolean isShowIndent = false;
        if (appointMentIndent.getIndentNumber() == null){

            alipay.setOut_trade_no(UUID.randomUUID().toString().replaceAll("-",""));
        }else {
            // 设置订单号
//            String indentNumber ="{" + appointMentIndent.getIndentNumber() + "}";
            alipay.setOut_trade_no(appointMentIndent.getIndentNumber());
            isShowIndent = true;
        }
//        设置交易金额
        alipay.setTotal_amount("600");
//        设置商品信息
        alipay.setSubject(appointMentIndent.getIndentTitle());
        alipay.setBody("中途订单");
        AlipayClient alipayClient = new DefaultAlipayClient(gatewayUrl, appId, privateKey, format, charset, publicKey, signType);
        //PC网页支付使用AlipayTradePagePayRequest传参，下面调用的是pageExecute方法
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(returnUrl);
        alipayRequest.setNotifyUrl(notifyUrl);
        alipayRequest.setBizContent(JSON.toJSONString(alipay));
        // 调用SDK生成表单
        String result = alipayClient.pageExecute(alipayRequest).getBody();
//        返回给前端一个支付宝的字符串表单
        return result;
    }
    @Override
    public Map<String, Object> QRScan(AppointMentIndent appointMentIndent, String authCode) throws AlipayApiException, ParseException {
//        log.info("付款码是：" + authCode);
        AliPayConfig aliPayConfig = new AliPayConfig();
        AlipayTradePayRequest payRequest = new AlipayTradePayRequest();
        // 用于在线下场景交易一次创建并支付掉 当面付
        AlipayTradePayModel payModel = new AlipayTradePayModel();
        payModel.setTotalAmount(appointMentIndent.getSum());
        payModel.setScene("bar_code");
        payModel.setSubject(appointMentIndent.getIndentType());//支付宝APP——账单——账单详情——商品说明的内容
        payModel.setOutTradeNo(UUID.randomUUID().toString().replaceAll("-",""));
        payModel.setTimeoutExpress("1m");
        payModel.setAuthCode(authCode);
        payRequest.setBizModel(payModel);
        AlipayClient alipayClient = new DefaultAlipayClient(aliPayConfig.getGateway_url(), aliPayConfig.getAppid(), aliPayConfig.getApp_private_key(),
                "json", "UTF-8", aliPayConfig.getAli_public_key(), "RSA2");
        AlipayTradePayResponse payResponse = alipayClient.execute(payRequest);
        System.out.println("状态码：" + payResponse.getCode());
        System.out.println("信息提示：" + payResponse.getMsg());
        System.out.println(payResponse.getSubMsg());
        Map<String, Object> res = new HashMap<>(3);
        res.put("code", payResponse.getCode());
        res.put("msg", payResponse.getMsg());
        res.put("subMsg", payResponse.getSubMsg());
        //调用成功
        if (payResponse.isSuccess()) {
            if (payResponse.getCode().equals(aliPayConfig.ALI_QRCODE_PAY)) {
                //支付成功
//                log.info("支付成功");
                HisIndent indent = new HisIndent();
                Date date = new Date();
                indent.setIndentTime(date);
                indent.setIndentNumber(payResponse.getOutTradeNo());
                indent.setIndentTitle(appointMentIndent.getIndentType());
                indent.setIndentSum(appointMentIndent.getSum());
                indent.setIndentMode("已支付");
                indent.setUserId(appointMentIndent.getUserId());
                // 原始订单信息
                indent.setIndentOriginal(appointMentIndent.getIndentOriginal());
//            存入订单表中
                int a = hisIndentMapper.insertHisIndent(indent);
                // 创建一个预约信息存储对象
                HisHospitalAppointment hisHospitalAppointment = new HisHospitalAppointment();
                // 设置预约表商户订单号
                hisHospitalAppointment.setIndentOuttrade(payResponse.getOutTradeNo());
                // 设置就诊人姓名
                hisHospitalAppointment.setDoctorName(appointMentIndent.getName());
                // 设置就诊人电话
                hisHospitalAppointment.setDoctorPhone(appointMentIndent.getPhone());
                // 设置就诊人身份证
                hisHospitalAppointment.setDoctorNumber(appointMentIndent.getIdNumber());
                // 设置就诊信息
                hisHospitalAppointment.setDoctorMessage(appointMentIndent.getIndentMessage());
                // 设置预约时间
//                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                hisHospitalAppointment.setAppointmentTime(date);
                // 设置账号id
                hisHospitalAppointment.setUserId(appointMentIndent.getUserId());
                // 设置星期
                hisHospitalAppointment.setDoctorDay(appointMentIndent.getDay());
                // 设置上下午
                hisHospitalAppointment.setAmPm(appointMentIndent.getAmPm());
                // 设置预约科室id
                hisHospitalAppointment.setDeptsId(appointMentIndent.getDeptsId());
                // 设置预约详细科室id
                hisHospitalAppointment.setDeptsCareid(appointMentIndent.getDeptsCareId());
                //设置职位id
                hisHospitalAppointment.setMedicalPostid(appointMentIndent.getMedicalPostId());
                // 设置医生id
                hisHospitalAppointment.setMedicalId(appointMentIndent.getMedicalId());
                // 设置年龄
                hisHospitalAppointment.setAge(appointMentIndent.getAge());
                // 设置性别
                hisHospitalAppointment.setSex(appointMentIndent.getSex());
                hisHospitalAppointmentMapper.insertHisHospitalAppointment(hisHospitalAppointment);
                return res;
            } else if (payResponse.getCode().equals(aliPayConfig.ALI_WAITCODE_PAY)) {
                //TODO 间隔3秒轮询请求alipay.trade.query查询交易状态，超过设置过期时间返回交易失败
                TimeInterval timer = DateUtil.timer();
                while (true) {
                    ThreadUtil.sleep(5000L);//未完成支付，间隔5秒发起请求查询支付状态
                    //实例化客户端
                    AlipayClient alipay = new DefaultAlipayClient(aliPayConfig.getGateway_url(),
                            aliPayConfig.getAppid(), aliPayConfig.getApp_private_key(), "json", "UTF-8", aliPayConfig.getAli_public_key(), "RSA2");  //获得初始化的AlipayClient
                    AlipayTradeQueryRequest request = new AlipayTradeQueryRequest(); //创建API对应的request类
                    AlipayTradePayModel tradePayModel = new AlipayTradePayModel();
                    tradePayModel.setOutTradeNo(payResponse.getTradeNo());
                    request.setBizModel(tradePayModel);//设置业务参数
                    // 支付宝交易查询响应
                    //通过alipayClient调用API，获得对应的response类
                    AlipayTradeQueryResponse response = alipay.execute(request);
                    response.getOutTradeNo();
                    System.out.print(response.getBody());
                    if (response.isSuccess()) {
                        //根据response中的结果继续业务逻辑处理
                        if (response.getCode().equals(aliPayConfig.ALI_QRCODE_PAY)) {
                            res.put("code", 0);
                            return res;
                        }
                        //超过一分钟，返回失败
                        if (timer.interval() >= 60 * 1000) {
                            res.put("code", -1);
                            res.put("msg","支付超时");
                            return res;
                        }
                    } else {
                        res.put("code", -1);
                        res.put("msg","获取订单状态失败");
                        return res;
                    }
                }
            }

            return res;

        }
        return res;
    }
}
