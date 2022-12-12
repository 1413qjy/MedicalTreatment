package com.ruoyi.project.his.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.ruoyi.project.his.domain.HisIndent;
import com.ruoyi.project.his.entity.AppointMentIndent;
import com.ruoyi.project.his.service.IAlipayService;
import com.ruoyi.project.his.service.IHisIndentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("his/alipay")
public class AlipayController {

    @Autowired
    private IAlipayService alipayService;

    @Autowired
    private IHisIndentService hisIndentService;

    private String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh3/SQA15gnQIwAtlll0j3tQ8MoNsvb0lr1km+YWRl8m9YbKDKOgP+vzt88f8RZwc7rCSzgAvRoSURkbnYpMXx5byAlgYK6gon76M9RqVe06U4GKL3QFXRTu9hmVa7nJvRkB0SbsaAyUlhM2OOnMxu9jFpbbGT42EdnfeuUw+BtAGLnJXJR3d75Lepz31/ES/ZGDUs9Wa2U2wVxfmSGayndkQ8WMOnx8a7jUVXqWwA16e7oAdpGxscz2qI73AiBCCzaNP6XeQ3Myk+rNCXnzed/FafL9aAvG58KW76KU6xUk/8xwFzEfX+qddGg33IgMlcXYZIQQXuCZv1a46nclsPwIDAQAB";

    //    签名方式
    private String signType = "RSA2";

    //    字符编码格式
    private String charset = "utf-8";

    /**
     * pc端支付的方法
     */
    @PostMapping
    @ResponseBody
    public String pay(@RequestBody AppointMentIndent appointMentIndent) throws AlipayApiException, ParseException {
        System.out.println(appointMentIndent);
        List<HisIndent> list = hisIndentService.selectHisIndentById(appointMentIndent.getUserId());
        String xinIndent = appointMentIndent.getIndentOriginal();
        String orScan = "";
        // 把订单信息拼接好去订单表查询是否存在订单
        for (int i=0;i<list.size();i++){
            String weiIndent = list.get(i).getIndentOriginal();
            if (weiIndent.equals(xinIndent)){
                return "已存在订单，请勿重复下单";
            }
        }
        String returnMssage = "";
        // 判断是否是当面付
        if(appointMentIndent.getPaymentCode() == null){
            // xinIndent = appointMentIndent.getIndentOriginal();
            // 拿到的是一个表单字符串数据
            // 判断是否是中途中断的订单
            if(appointMentIndent.getIndentNumber() != null){
                String result = alipayService.recordalipay(appointMentIndent);
                return result;
            }
            returnMssage = alipayService.alipay(appointMentIndent);
        }else {
            orScan = String.valueOf(alipayService.QRScan(appointMentIndent,appointMentIndent.getPaymentCode()));
            return orScan;
        }
        if(appointMentIndent.getIndentNumber() != null){
            String result = alipayService.recordalipay(appointMentIndent);
            return result;
        }

        return returnMssage;
    }

//    @PostMapping("/personPay")
//    @ResponseBody
//    public Map<String,Object> personPay(@ResponseBody AppointMentIndent appointMentIndent){
//
//    }

    /**
     * pc端支付成功后响应
     */
    @RequestMapping("/success")
    @ResponseBody
    public String success() {
        return "交易成功！";
    }

    /**
     * pc端支付成功后的回调函数
     */
    @RequestMapping(value = "/returnUrl")
    public String payCoin(HttpServletRequest request, HttpSession session, Model model, HttpServletResponse response) throws IOException, AlipayApiException {
        System.out.println("执行了回调方法");
        // 获取支付宝GET过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            // 乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }
        //查看参数都有哪些
        System.out.println(params);
        //验证签名（支付宝公钥）
        boolean signVerified = AlipaySignature.rsaCheckV1(params, publicKey, charset, signType); // 调用SDK验证签名
        //验证签名通过
        if (signVerified) {
            // 商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");
            // 支付宝交易流水号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");
            // 付款金额
            float money = Float.parseFloat(new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8"));

            System.out.println("商户订单号="+out_trade_no);
            System.out.println("支付宝交易号="+trade_no);
            System.out.println("付款金额="+money);
            // 修改订单支付状态
            hisIndentService.updateHisIndent(out_trade_no);
            // 修改库存

            model.addAttribute("msg","支持");
            response.sendRedirect("http://localhost:81/app/my_app");
            return "yes";
        }else {
            return "no";
        }
    }
}
