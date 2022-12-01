package com.ruoyi.project.his.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 his_hospital_medical
 * 
 * @author ruoyi
 * @date 2022-11-22
 */
public class HisHospitalMedical extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long medicalId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String medicalName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String medicalAge;

    /** 医生职位 */
    @Excel(name = "医生职位")
    private String medicalPost;

    /** $column.columnComment */
    @Excel(name = "医生职位")
    private Long hospitalId;

    /** $column.columnComment */
    @Excel(name = "医生职位")
    private Long deptsId;

    /** $column.columnComment */
    @Excel(name = "医生职位")
    private String deptsMinute;

    /** $column.columnComment */
    @Excel(name = "医生职位", width = 30, dateFormat = "yyyy-MM-dd")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date inductionTime;

    /** $column.columnComment */
    @Excel(name = "医生职位")
    private String yiling;

    /** 图片 */
    @Excel(name = "图片")
    private String image;

    /** 是否排班 */
    @Excel(name = "是否排班")
    private String isWorking;

    public void setMedicalId(Long medicalId)
    {
        this.medicalId = medicalId;
    }

    public Long getMedicalId()
    {
        return medicalId;
    }
    public void setMedicalName(String medicalName)
    {
        this.medicalName = medicalName;
    }

    public String getMedicalName()
    {
        return medicalName;
    }
    public void setMedicalAge(String medicalAge)
    {
        this.medicalAge = medicalAge;
    }

    public String getMedicalAge()
    {
        return medicalAge;
    }
    public void setMedicalPost(String medicalPost)
    {
        this.medicalPost = medicalPost;
    }

    public String getMedicalPost()
    {
        return medicalPost;
    }
    public void setHospitalId(Long hospitalId)
    {
        this.hospitalId = hospitalId;
    }

    public Long getHospitalId()
    {
        return hospitalId;
    }
    public void setDeptsId(Long deptsId)
    {
        this.deptsId = deptsId;
    }

    public Long getDeptsId()
    {
        return deptsId;
    }
    public void setDeptsMinute(String deptsMinute)
    {
        this.deptsMinute = deptsMinute;
    }

    public String getDeptsMinute()
    {
        return deptsMinute;
    }
    public void setInductionTime(Date inductionTime)
    {
        this.inductionTime = inductionTime;
    }

    public Date getInductionTime()
    {
        return inductionTime;
    }
    public void setYiling(String yiling)
    {
        this.yiling = yiling;
    }

    public String getYiling()
    {
        return yiling;
    }
    public void setImage(String image)
    {
        this.image = image;
    }

    public String getImage()
    {
        return image;
    }
    public void setIsWorking(String isWorking)
    {
        this.isWorking = isWorking;
    }

    public String getIsWorking()
    {
        return isWorking;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("medicalId", getMedicalId())
                .append("medicalName", getMedicalName())
                .append("medicalAge", getMedicalAge())
                .append("medicalPost", getMedicalPost())
                .append("hospitalId", getHospitalId())
                .append("deptsId", getDeptsId())
                .append("deptsMinute", getDeptsMinute())
                .append("inductionTime", getInductionTime())
                .append("yiling", getYiling())
                .append("image", getImage())
                .append("isWorking", getIsWorking())
                .toString();
    }
}
