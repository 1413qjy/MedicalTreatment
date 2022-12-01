package com.ruoyi.project.his.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 his_working_time
 * 
 * @author ruoyi
 * @date 2022-11-30
 */
public class HisWorkingTime extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 工作时间id */
    private Long hisWtId;

    /** 医生id */
    @Excel(name = "医生id")
    private Long medicalId;

    /** 星期一 */
    @Excel(name = "星期一")
    private String monday;

    /** 星期二 */
    @Excel(name = "星期二")
    private String tuesday;

    /** 星期三 */
    @Excel(name = "星期三")
    private String wednesday;

    /** 星期四 */
    @Excel(name = "星期四")
    private String thursday;

    /** 星期五 */
    @Excel(name = "星期五")
    private String friday;

    /** 星期六 */
    @Excel(name = "星期六")
    private String saturday;

    /** 星期天 */
    @Excel(name = "星期天")
    private String sunday;

    /** 休假 */
    @Excel(name = "休假")
    private String vacation;

    public void setHisWtId(Long hisWtId) 
    {
        this.hisWtId = hisWtId;
    }

    public Long getHisWtId() 
    {
        return hisWtId;
    }
    public void setMedicalId(Long medicalId) 
    {
        this.medicalId = medicalId;
    }

    public Long getMedicalId() 
    {
        return medicalId;
    }
    public void setMonday(String monday) 
    {
        this.monday = monday;
    }

    public String getMonday() 
    {
        return monday;
    }
    public void setTuesday(String tuesday) 
    {
        this.tuesday = tuesday;
    }

    public String getTuesday() 
    {
        return tuesday;
    }
    public void setWednesday(String wednesday) 
    {
        this.wednesday = wednesday;
    }

    public String getWednesday() 
    {
        return wednesday;
    }
    public void setThursday(String thursday) 
    {
        this.thursday = thursday;
    }

    public String getThursday() 
    {
        return thursday;
    }
    public void setFriday(String friday) 
    {
        this.friday = friday;
    }

    public String getFriday() 
    {
        return friday;
    }
    public void setSaturday(String saturday) 
    {
        this.saturday = saturday;
    }

    public String getSaturday() 
    {
        return saturday;
    }
    public void setSunday(String sunday) 
    {
        this.sunday = sunday;
    }

    public String getSunday() 
    {
        return sunday;
    }
    public void setVacation(String vacation) 
    {
        this.vacation = vacation;
    }

    public String getVacation() 
    {
        return vacation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("hisWtId", getHisWtId())
            .append("medicalId", getMedicalId())
            .append("monday", getMonday())
            .append("tuesday", getTuesday())
            .append("wednesday", getWednesday())
            .append("thursday", getThursday())
            .append("friday", getFriday())
            .append("saturday", getSaturday())
            .append("sunday", getSunday())
            .append("vacation", getVacation())
            .toString();
    }
}
