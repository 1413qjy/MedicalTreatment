package com.ruoyi.project.his.config;

import lombok.Data;


/**
  * @Author liangling
  * @Description //TODO 2020/12/14
  * @Date 14:02 2020/12/14
  **/
@Data
public class AliPayConfig {

    /**
     *  appid
     */
    private String appid="2021000121695047";
    /**
     *  应用公钥
     */
    private String app_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAp82dvPfoPnKPLxRm9t7/J/oUneNdAk58pGdqbyLSTutoEQjK7duF2LwkzH0bpvWWqPONRDRgR0Ur7zaB76Gx6gbVOBN5riYKm6+f1QZwhs+0wLA0h+tII3Rl9n6MQLxal5zh0y/75AlUvdYhsxh2er2hFc3CpJ470iflMpXez3o+YXdsclUXdXuBmb17U/DaD1XRXW8NPxxuf8U0nDNYfkKRiH1ZK56dz7A8tVVTIayPGyeRl65/5GnsgU39mz+pqq1j5Mdw3caCNrQulk3JCQVBTAno5GhNX6sJ2U/ClF51onwHYuazZxfyLb/OvpYqsS/nC2KeB5aGFe2OGztUqwIDAQAB";

    /**
     *  应用私钥
     */
    private String app_private_key="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCnzZ289+g+co8vFGb23v8n+hSd410CTnykZ2pvItJO62gRCMrt24XYvCTMfRum9Zao841ENGBHRSvvNoHvobHqBtU4E3muJgqbr5/VBnCGz7TAsDSH60gjdGX2foxAvFqXnOHTL/vkCVS91iGzGHZ6vaEVzcKknjvSJ+Uyld7Pej5hd2xyVRd1e4GZvXtT8NoPVdFdbw0/HG5/xTScM1h+QpGIfVkrnp3PsDy1VVMhrI8bJ5GXrn/kaeyBTf2bP6mqrWPkx3DdxoI2tC6WTckJBUFMCejkaE1fqwnZT8KUXnWifAdi5rNnF/Itv86+liqxL+cLYp4HloYV7Y4bO1SrAgMBAAECggEAYvdF3LlpY8s031NtFpSWcAFyP1xk8oNPx7amcz1aQ+layxEgfgBGhHkSSvhOYr3dSW+7FUq+rcoCC2deYvI+eAPnpNb3oNoWz5NY9M6Ddz7xH+PMV41QUnjH2gTwuw1bcKe6GE/og6ltLTkpTvNSjTlh0/Yyodwg8+VLq/XwHvTHgEM15/GZKM05aZMeNbfLTg53aP+WwevnL+1X2nqMuKiw3h0fE2wMBKIa4mj2nil01EjkH8MsH5I8pdybNq+G1TBXvPlvM1WCNP2520IMS2vtAEiFyfKTkApLWwpfJ36vGgQTVA8IS3dPgMCGxbZzFi6Mb/AIQB1qTkdk7vybgQKBgQDrIeLSKETCptIiH/Ij8HntsjCLMtaP22/tx8ueqLesn61L0zNeYvgZgVMIK77agy+qZ+AA2yGqqAWNE3iTKiWst62elbbCphn1zoEW8hnI3iAHoWv5VqsRPN/aBCRjgwcrNgBUZdq4wGWWaMxD61fJysLueCfZsA8Qg7HjodUZ0QKBgQC2sgm2iUdnC3/zNSXeY+2as2T6xXqv3+hQ9AfXH+VG6R4tUPKSbM5CflQYSu7sgSIivCSr8LgYseYG8UGULDO6ogrkPmS27bOPEPWOo/3nwgkRNefxZE1RvJlAfOJKJw2LRgVmXtDsnrLQ0GwqzOde73myWkscnW7AfrJVGT8puwKBgB0ngHZKY+w2vwtYJq/qG1QrqfU4gn4n2UMEaOztQoj264fhUhc78kNHU8JJmkqBxaE9a/rvMMd2Oen6JhMpQK6fv7lQGu8bpVBjIIJ11lifoh0QGNE7u85RW/guV0y3bGYhNf1A+9O4l2AE8n7haWst5ummoFpPiC6mBaKR6FhhAoGAR2RnW0dl+aSKyXV5aOBP12ZHDZ/iA5xR4mCaN7ylEgLC4h6BzCpsp5tKLXwKxazos/4lrnMQ3cWXCBt67vYe+M2dx/eBz+Ivirar3qPC8q/mby1LiA8UD97NXF/w5d1A863XKlve9LhHVEY+HrOXroeSXNngBDyZLOvVsF9/SUUCgYEA3TdSupVTOMYnO714UAoI9cvMvdmzxogefLkVaXa4wMbShfoccM4O8InQ/6T50orSIyDU0YSlpqzVx/Ux3M6Xag7WapUIwa3U8CK6x5NaVPA+0hNujlfRaJUj4ew1TTifZ0/3V5aTee4glieF1ZA23PwDmhUfuv2LTaEfsLfvgPg=";
    /**
     *  支付宝公钥
     */
    private String ali_public_key="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh3/SQA15gnQIwAtlll0j3tQ8MoNsvb0lr1km+YWRl8m9YbKDKOgP+vzt88f8RZwc7rCSzgAvRoSURkbnYpMXx5byAlgYK6gon76M9RqVe06U4GKL3QFXRTu9hmVa7nJvRkB0SbsaAyUlhM2OOnMxu9jFpbbGT42EdnfeuUw+BtAGLnJXJR3d75Lepz31/ES/ZGDUs9Wa2U2wVxfmSGayndkQ8WMOnx8a7jUVXqWwA16e7oAdpGxscz2qI73AiBCCzaNP6XeQ3Myk+rNCXnzed/FafL9aAvG58KW76KU6xUk/8xwFzEfX+qddGg33IgMlcXYZIQQXuCZv1a46nclsPwIDAQAB";
    /**
     *  支付宝公钥
     */
    private String gateway_url= "https://openapi.alipaydev.com/gateway.do";
    /**
     * 支付宝条码付支付成功的状态码
     */
    public String ALI_QRCODE_PAY="10000";
    /**
     * 支付宝等待支付状态码
     */
    public String ALI_WAITCODE_PAY="10003";
    /**
     *
     */


}
