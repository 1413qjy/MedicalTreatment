package com.ruoyi.project.his.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 his_examine
 * 
 * @author ruoyi
 * @date 2022-12-12
 */
public class HisExamine extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 检查项目id */
    private Long examineId;

    /** 检查项目名称 */
    @Excel(name = "检查项目名称")
    private String examineName;

    /** 检查项目金额 */
    @Excel(name = "检查项目金额")
    private String examineSum;

    /** 检查医生id */
    @Excel(name = "检查医生id")
    private Long examineMedicalId;

    /** 检查类目id */
    @Excel(name = "检查类目id")
    private Long examineTypeId;

    public void setExamineId(Long examineId) 
    {
        this.examineId = examineId;
    }

    public Long getExamineId() 
    {
        return examineId;
    }
    public void setExamineName(String examineName) 
    {
        this.examineName = examineName;
    }

    public String getExamineName() 
    {
        return examineName;
    }
    public void setExamineSum(String examineSum) 
    {
        this.examineSum = examineSum;
    }

    public String getExamineSum() 
    {
        return examineSum;
    }
    public void setExamineMedicalId(Long examineMedicalId) 
    {
        this.examineMedicalId = examineMedicalId;
    }

    public Long getExamineMedicalId() 
    {
        return examineMedicalId;
    }
    public void setExamineTypeId(Long examineTypeId) 
    {
        this.examineTypeId = examineTypeId;
    }

    public Long getExamineTypeId() 
    {
        return examineTypeId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("examineId", getExamineId())
            .append("examineName", getExamineName())
            .append("examineSum", getExamineSum())
            .append("examineMedicalId", getExamineMedicalId())
            .append("examineTypeId", getExamineTypeId())
            .toString();
    }
}
