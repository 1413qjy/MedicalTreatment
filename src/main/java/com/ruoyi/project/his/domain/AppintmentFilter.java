package com.ruoyi.project.his.domain;

import lombok.Data;


public class AppintmentFilter {

    private Long hospitalId;
    private Long deptsId;
    private Object day;
    private String time;
    private String appointmentTime;

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Long getDeptsId() {
        return deptsId;
    }

    public void setDeptsId(Long deptsId) {
        this.deptsId = deptsId;
    }

    public Object getDay() {
        return day;
    }

    public void setDay(Object day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}
