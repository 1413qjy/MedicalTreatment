package com.ruoyi.project.his.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 his_record
 * 
 * @author ruoyi
 * @date 2022-12-12
 */
public class HisRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 病历id */
    private Long recordId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 年龄 */
    @Excel(name = "年龄")
    private String age;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 电话 */
    @Excel(name = "电话")
    private String phone;

    /** 身份证 */
    @Excel(name = "身份证")
    private String idNumber;

    /** 详细科室id */
    @Excel(name = "详细科室id")
    private Long deptsCareId;

    /** 预诊断 */
    @Excel(name = "预诊断")
    private String yudiagnose;

    /** 诊断 */
    @Excel(name = "诊断")
    private String diagnose;

    /** 检查 */
    @Excel(name = "检查")
    private String examine;

    /** 药品 */
    @Excel(name = "药品")
    private String drug;

    /** 账号id */
    @Excel(name = "账号id")
    private Long userId;

    public void setRecordId(Long recordId) 
    {
        this.recordId = recordId;
    }

    public Long getRecordId() 
    {
        return recordId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
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
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setIdNumber(String idNumber) 
    {
        this.idNumber = idNumber;
    }

    public String getIdNumber() 
    {
        return idNumber;
    }
    public void setDeptsCareId(Long deptsCareId) 
    {
        this.deptsCareId = deptsCareId;
    }

    public Long getDeptsCareId() 
    {
        return deptsCareId;
    }
    public void setYudiagnose(String yudiagnose) 
    {
        this.yudiagnose = yudiagnose;
    }

    public String getYudiagnose() 
    {
        return yudiagnose;
    }
    public void setDiagnose(String diagnose) 
    {
        this.diagnose = diagnose;
    }

    public String getDiagnose() 
    {
        return diagnose;
    }
    public void setExamine(String examine) 
    {
        this.examine = examine;
    }

    public String getExamine() 
    {
        return examine;
    }
    public void setDrug(String drug) 
    {
        this.drug = drug;
    }

    public String getDrug() 
    {
        return drug;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("recordId", getRecordId())
            .append("name", getName())
            .append("age", getAge())
            .append("sex", getSex())
            .append("phone", getPhone())
            .append("idNumber", getIdNumber())
            .append("deptsCareId", getDeptsCareId())
            .append("yudiagnose", getYudiagnose())
            .append("diagnose", getDiagnose())
            .append("examine", getExamine())
            .append("drug", getDrug())
            .append("userId", getUserId())
            .toString();
    }
}
