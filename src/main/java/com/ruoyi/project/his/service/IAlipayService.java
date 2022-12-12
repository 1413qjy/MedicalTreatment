package com.ruoyi.project.his.service;

import com.alipay.api.AlipayApiException;
import com.ruoyi.project.his.entity.AppointMentIndent;

import java.text.ParseException;
import java.util.Map;

public interface IAlipayService {

    public String alipay(AppointMentIndent appointMentIndent) throws AlipayApiException, ParseException;

    public String recordalipay(AppointMentIndent appointMentIndent) throws AlipayApiException, ParseException;

    public Map<String,Object> QRScan(AppointMentIndent appointMentIndent, String authCode) throws AlipayApiException, ParseException;
}


