package com.ruoyi.project.his.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 his_reg_sum
 * 
 * @author ruoyi
 * @date 2022-12-01
 */
public class HisRegSum extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 挂号量id */
    private Long regSumId;

    /** 医生id */
    @Excel(name = "医生id")
    private Long medicalId;

    /** 医生排班时间json数据 */
    @Excel(name = "医生排班时间json数据")
    private String regSumJson;

    public void setRegSumId(Long regSumId) 
    {
        this.regSumId = regSumId;
    }

    public Long getRegSumId() 
    {
        return regSumId;
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
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("regSumId", getRegSumId())
            .append("medicalId", getMedicalId())
            .append("regSumJson", getRegSumJson())
            .toString();
    }
}
