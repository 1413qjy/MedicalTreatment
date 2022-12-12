package com.ruoyi.project.his.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class HisLockStock extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 锁库存表id */
    private Long hisLockStockid;

    /** 医生id */
    @Excel(name = "医生id")
    private Long medicalId;

    /** 医生挂号量json数据 */
    @Excel(name = "医生挂号量json数据")
    private String regSumJson;

    public void setHisLockStockid(Long hisLockStockid)
    {
        this.hisLockStockid = hisLockStockid;
    }

    public Long getHisLockStockid()
    {
        return hisLockStockid;
    }
    public void setMedicalId(Long medicalId)
    {
        this.medicalId = medicalId;
    }

    public Long getMedicalId()
    {
        return medicalId;
    }
    public void setRegSumJson(String regSumJson)
    {
        this.regSumJson = regSumJson;
    }

    public String getRegSumJson()
    {
        return regSumJson;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("hisLockStockid", getHisLockStockid())
                .append("medicalId", getMedicalId())
                .append("regSumJson", getRegSumJson())
                .toString();
    }
}