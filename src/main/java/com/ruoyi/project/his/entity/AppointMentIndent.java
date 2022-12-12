package com.ruoyi.project.his.entity;

/**
 * 暂时接收预约表单信息实体类
 */
public class AppointMentIndent {

//    用户id
    private Long userId;

//    病患姓名
    private String name;

//    病患身份证
    private String idNumber;

//    病患手机号
    private String phone;

//    预约时间
    private String time;

//    订单名称
    private String indentTitle;

//    订单描述
    private String indentType;

//    订单信息
    private String indentMessage;

//    订单金额
    private String sum;

//    星期
    private String day;

//    上下午
    private String amPm;

//    订单编号
    private String indentNumber;

//    原始订单
    private String indentOriginal;

//    科室id
    private Long deptsId;

//    详细科室id
    private Long deptsCareId;

//    职位id
    private Long medicalPostId;

//    医生id
    private Long medicalId;
//    版本号
    private String version;

//    年龄
    private String age;

//    性别
    private String sex;

    private String paymentCode;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIndentTitle() {
        return indentTitle;
    }

    public void setIndentTitle(String indentTitle) {
        this.indentTitle = indentTitle;
    }

    public String getIndentType() {
        return indentType;
    }



    public void setIndentType(String indentType) {
        this.indentType = indentType;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIndentMessage() {
        return indentMessage;
    }

    public void setIndentMessage(String indentMessage) {
        this.indentMessage = indentMessage;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getAmPm() {
        return amPm;
    }

    public void setAmPm(String amPm) {
        this.amPm = amPm;
    }

    public String getIndentNumber() {
        return indentNumber;
    }

    public void setIndentNumber(String indentNumber) {
        this.indentNumber = indentNumber;
    }

    public String getIndentOriginal() {
        return indentOriginal;
    }

    public void setIndentOriginal(String indentOriginal) {
        this.indentOriginal = indentOriginal;
    }

    public Long getDeptsId() {
        return deptsId;
    }

    public void setDeptsId(Long deptsId) {
        this.deptsId = deptsId;
    }

    public Long getDeptsCareId() {
        return deptsCareId;
    }

    public void setDeptsCareId(Long deptsCareId) {
        this.deptsCareId = deptsCareId;
    }

    public Long getMedicalPostId() {
        return medicalPostId;
    }

    public void setMedicalPostId(Long medicalPostId) {
        this.medicalPostId = medicalPostId;
    }

    public Long getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Long medicalId) {
        this.medicalId = medicalId;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
