package com.ruoyi.project.his.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 his_hospital_appointment
 * 
 * @author ruoyi
 * @date 2022-11-16
 */
public class HisHospitalAppointment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long appointmentId;

    /** 就诊人姓名 */
    @Excel(name = "就诊人姓名")
    private String doctorName;

    /** 就诊人电话 */
    @Excel(name = "就诊人电话")
    private String doctorPhone;

    /** 就诊人身份证 */
    @Excel(name = "就诊人身份证")
    private String doctorNumber;

    /** 就诊人所预约医生、科室等信息 */
    @Excel(name = "就诊人所预约医生、科室等信息")
    private String doctorMessage;

    /** $column.columnComment */
    @Excel(name = "就诊人所预约医生、科室等信息")
    private Long hospitalId;

    /** $column.columnComment */
    @Excel(name = "就诊人所预约医生、科室等信息", width = 30, dateFormat = "yyyy-MM-dd")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date appointmentTime;

    /** 账号id */
    @Excel(name = "账号id")
    private Long userId;

    /** 商户订单号 */
    @Excel(name = "商户订单号")
    private String indentOuttrade;

    /** 预约星期 */
    @Excel(name = "预约星期")
    private String doctorDay;

    /** 上下午 */
    @Excel(name = "上下午")
    private String amPm;

    /** 预约科室id */
    @Excel(name = "预约科室id")
    private Long deptsId;

    /** 预约科室详细id */
    @Excel(name = "预约科室详细id")
    private Long deptsCareid;

    /** 职位id */
    @Excel(name = "职位id")
    private Long medicalPostid;

    /** 医生id */
    @Excel(name = "医生id")
    private Long medicalId;

    /** 年龄 */
    @Excel(name = "年龄")
    private String age;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    public void setAppointmentId(Long appointmentId)
    {
        this.appointmentId = appointmentId;
    }

    public Long getAppointmentId()
    {
        return appointmentId;
    }
    public void setDoctorName(String doctorName)
    {
        this.doctorName = doctorName;
    }

    public String getDoctorName()
    {
        return doctorName;
    }
    public void setDoctorPhone(String doctorPhone)
    {
        this.doctorPhone = doctorPhone;
    }

    public String getDoctorPhone()
    {
        return doctorPhone;
    }
    public void setDoctorNumber(String doctorNumber)
    {
        this.doctorNumber = doctorNumber;
    }

    public String getDoctorNumber()
    {
        return doctorNumber;
    }
    public void setDoctorMessage(String doctorMessage)
    {
        this.doctorMessage = doctorMessage;
    }

    public String getDoctorMessage()
    {
        return doctorMessage;
    }
    public void setHospitalId(Long hospitalId)
    {
        this.hospitalId = hospitalId;
    }

    public Long getHospitalId()
    {
        return hospitalId;
    }
    public void setAppointmentTime(Date appointmentTime)
    {
        this.appointmentTime = appointmentTime;
    }

    public Date getAppointmentTime()
    {
        return appointmentTime;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setIndentOuttrade(String indentOuttrade)
    {
        this.indentOuttrade = indentOuttrade;
    }

    public String getIndentOuttrade()
    {
        return indentOuttrade;
    }

    public void setDoctorDay(String doctorDay)
    {
        this.doctorDay = doctorDay;
    }

    public String getDoctorDay()
    {
        return doctorDay;
    }
    public void setAmPm(String amPm)
    {
        this.amPm = amPm;
    }

    public String getAmPm()
    {
        return amPm;
    }

    public void setDeptsId(Long deptsId)
    {
        this.deptsId = deptsId;
    }

    public Long getDeptsId()
    {
        return deptsId;
    }
    public void setDeptsCareid(Long deptsCareid)
    {
        this.deptsCareid = deptsCareid;
    }

    public Long getDeptsCareid()
    {
        return deptsCareid;
    }
    public void setMedicalPostid(Long medicalPostid)
    {
        this.medicalPostid = medicalPostid;
    }

    public Long getMedicalPostid()
    {
        return medicalPostid;
    }
    public void setMedicalId(Long medicalId)
    {
        this.medicalId = medicalId;
    }

    public Long getMedicalId()
    {
        return medicalId;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public String getAge()
    {
        return age;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("appointmentId", getAppointmentId())
                .append("doctorName", getDoctorName())
                .append("doctorPhone", getDoctorPhone())
                .append("doctorNumber", getDoctorNumber())
                .append("doctorMessage", getDoctorMessage())
                .append("hospitalId", getHospitalId())
                .append("appointmentTime", getAppointmentTime())
                .append("userId", getUserId())
                .append("indentOuttrade", getIndentOuttrade())
                .append("doctorDay", getDoctorDay())
                .append("amPm", getAmPm())
                .append("deptsId", getDeptsId())
                .append("deptsCareid", getDeptsCareid())
                .append("medicalPostid", getMedicalPostid())
                .append("medicalId", getMedicalId())
                .append("age", getAge())
                .append("sex", getSex())
                .toString();
    }
}
