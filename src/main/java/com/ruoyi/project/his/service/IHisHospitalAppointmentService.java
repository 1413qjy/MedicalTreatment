package com.ruoyi.project.his.service;

import java.util.List;

import com.ruoyi.project.his.controller.HisHospitalController;
import com.ruoyi.project.his.domain.AppintmentFilter;
import com.ruoyi.project.his.domain.HisHospital;
import com.ruoyi.project.his.domain.HisHospitalAppointment;
import org.apache.poi.ss.formula.functions.T;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-11-16
 */
public interface IHisHospitalAppointmentService 
{
    /**
     * 查询预约集合列表
     */
    public List<HisHospitalAppointment> selectHisHospitalAppointmentList(HisHospitalAppointment hisHospitalAppointment);

    /**
     * 获取医院的信息
     */
    public List<HisHospital> selectHospitalMessage(HisHospital hisHospital);

    /**
     * 新增预约信息
     * 未使用
     */
    public int insertHisHospitalAppointment(HisHospitalAppointment hisHospitalAppointment);

    /**
     * 随着挂号增加科室挂号量
     */
    public int updatedeptNum(Long deptsid);

    /**
     * 修改预约信息
     * 未使用
     */
    public int updateHisHospitalAppointment(HisHospitalAppointment hisHospitalAppointment);

    /**
     * 批量删除预约信息
     * 未使用
     */
    public int deleteHisHospitalAppointmentByIds(Long[] appointmentIds);

    /**
     * 删除预约信息
     * 未使用
     */
    public int deleteHisHospitalAppointmentById(Long appointmentId);

}
