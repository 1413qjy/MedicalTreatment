package com.ruoyi.project.his.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

public class HisIndent extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 订单id

     */
    private Long indentId;

    /** 订单编号
     */
    @Excel(name = "订单编号 ")
    private String indentNumber;

    /** 订单标题
     */
    @Excel(name = "订单标题 ")
    private String indentTitle;

    /** 订单总金额 */
    @Excel(name = "订单总金额")
    private String indentSum;

    /** 订单时间 */
//    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @Excel(name = "订单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date indentTime;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private String indentMode;

    /** 账号id */
    @Excel(name = "账号id")
    private Long userId;

    /** 原始订单 */
    @Excel(name = "原始订单")
    private String indentOriginal;

    public void setIndentId(Long indentId)
    {
        this.indentId = indentId;
    }

    public Long getIndentId()
    {
        return indentId;
    }
    public void setIndentNumber(String indentNumber)
    {
        this.indentNumber = indentNumber;
    }

    public String getIndentNumber()
    {
        return indentNumber;
    }
    public void setIndentTitle(String indentTitle)
    {
        this.indentTitle = indentTitle;
    }

    public String getIndentTitle()
    {
        return indentTitle;
    }
    public void setIndentSum(String indentSum)
    {
        this.indentSum = indentSum;
    }

    public String getIndentSum()
    {
        return indentSum;
    }
    public void setIndentTime(Date indentTime)
    {
        this.indentTime = indentTime;
    }

    public Date getIndentTime()
    {
        return indentTime;
    }
    public void setIndentMode(String indentMode)
    {
        this.indentMode = indentMode;
    }

    public String getIndentMode()
    {
        return indentMode;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setIndentOriginal(String indentOriginal)
    {
        this.indentOriginal = indentOriginal;
    }

    public String getIndentOriginal()
    {
        return indentOriginal;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("indentId", getIndentId())
                .append("indentNumber", getIndentNumber())
                .append("indentTitle", getIndentTitle())
                .append("indentSum", getIndentSum())
                .append("indentTime", getIndentTime())
                .append("indentMode", getIndentMode())
                .append("userId", getUserId())
                .append("indentOriginal", getIndentOriginal())
                .toString();
    }
}

