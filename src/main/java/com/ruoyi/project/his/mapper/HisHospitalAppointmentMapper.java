package com.ruoyi.project.his.mapper;

import java.util.List;

import com.ruoyi.project.his.domain.AppintmentFilter;
import com.ruoyi.project.his.domain.HisHospital;
import com.ruoyi.project.his.domain.HisHospitalAppointment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.poi.ss.formula.functions.T;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-16
 */
@Mapper
public interface HisHospitalAppointmentMapper 
{
    /**
     * 查询预约信息列表
     */
    public List<HisHospitalAppointment> selectHisHospitalAppointmentList(HisHospitalAppointment hisHospitalAppointment);

    /**
     * 新增预约信息
     */
    public int insertHisHospitalAppointment(HisHospitalAppointment hisHospitalAppointment);

    /**
     * 修改预约信息
     */
    public int updateHisHospitalAppointment(HisHospitalAppointment hisHospitalAppointment);

    /**
     * 删除预约信息
     */
    public int deleteHisHospitalAppointmentById(Long appointmentId);

    /**
     * 批量删除预约信息
     */
    public int deleteHisHospitalAppointmentByIds(Long[] appointmentIds);

}
