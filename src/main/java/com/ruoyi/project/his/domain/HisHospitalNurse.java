package com.ruoyi.project.his.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 his_hospital_nurse
 * 
 * @author ruoyi
 * @date 2022-12-12
 */
public class HisHospitalNurse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 护士id */
    private Long nurseId;

    /** 护士姓名 */
    @Excel(name = "护士姓名")
    private String nurseName;

    /** 护士年龄 */
    @Excel(name = "护士年龄")
    private String nurseAge;

    /** 医院id */
    @Excel(name = "医院id")
    private Long hospitalId;

    /** 科室id */
    @Excel(name = "科室id")
    private Long deptsId;

    /** 详细科室 */
    @Excel(name = "详细科室")
    private String deptsMinute;

    /** 入职时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入职时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date inductionTime;

    /** 图片 */
    @Excel(name = "图片")
    private String image;

    /** 是否排班 */
    @Excel(name = "是否排班")
    private String isWorking;

    public void setNurseId(Long nurseId) 
    {
        this.nurseId = nurseId;
    }

    public Long getNurseId() 
    {
        return nurseId;
    }
    public void setNurseName(String nurseName) 
    {
        this.nurseName = nurseName;
    }

    public String getNurseName() 
    {
        return nurseName;
    }
    public void setNurseAge(String nurseAge) 
    {
        this.nurseAge = nurseAge;
    }

    public String getNurseAge() 
    {
        return nurseAge;
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
            .append("nurseId", getNurseId())
            .append("nurseName", getNurseName())
            .append("nurseAge", getNurseAge())
            .append("hospitalId", getHospitalId())
            .append("deptsId", getDeptsId())
            .append("deptsMinute", getDeptsMinute())
            .append("inductionTime", getInductionTime())
            .append("image", getImage())
            .append("isWorking", getIsWorking())
            .toString();
    }
}
