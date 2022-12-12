package com.ruoyi.project.his.service.impl;

import java.util.List;

import com.ruoyi.project.his.domain.AppintmentFilter;
import com.ruoyi.project.his.domain.HisDepts;
import com.ruoyi.project.his.domain.HisHospital;
import com.ruoyi.project.his.mapper.HisDeptsMapper;
import com.ruoyi.project.his.mapper.HisHospitalMapper;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.his.domain.HisHospitalAppointment;
import com.ruoyi.project.his.mapper.HisHospitalAppointmentMapper;
import com.ruoyi.project.his.service.IHisHospitalAppointmentService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-16
 */
@Service
public class IHisHospitalAppointmentServiceImpl implements IHisHospitalAppointmentService
{
//    这是操作预约信息
    @Autowired
    private HisHospitalAppointmentMapper hisHospitalAppointmentMapper;
//    这是获取医院信息的
    @Autowired
    private HisHospitalMapper hisHospitalMapper;
//    这是获取科室信息的
    @Autowired
    private HisDeptsMapper hisDeptsMapper;

    /**
     * 查询预约信息列表
     */
    @Override
    public List<HisHospitalAppointment> selectHisHospitalAppointmentList(HisHospitalAppointment hisHospitalAppointment) {
        return hisHospitalAppointmentMapper.selectHisHospitalAppointmentList(hisHospitalAppointment);
    }

    /**
     * 获取医院的信息
     */
    @Override
    public List<HisHospital> selectHospitalMessage(HisHospital hisHospital) {
        return hisHospitalMapper.selectHospitalAllList(hisHospital);
    }

    /**
     * 新增预约信息
     */
    @Override
    public int insertHisHospitalAppointment(HisHospitalAppointment hisHospitalAppointment) {
        return hisHospitalAppointmentMapper.insertHisHospitalAppointment(hisHospitalAppointment);
    }

    /**
     * 随着挂号增加科室挂号量
     */
    @Override
    public int updatedeptNum(Long deptsid) {
        return hisDeptsMapper.updateDeptsNum(deptsid);
    }

    /**
     * 修改预约信息
     */
    @Override
    public int updateHisHospitalAppointment(HisHospitalAppointment hisHospitalAppointment)
    {
        return hisHospitalAppointmentMapper.updateHisHospitalAppointment(hisHospitalAppointment);
    }

    /**
     * 批量删除预约信息
     */
    @Override
    public int deleteHisHospitalAppointmentByIds(Long[] appointmentIds)
    {
        return hisHospitalAppointmentMapper.deleteHisHospitalAppointmentByIds(appointmentIds);
    }

    /**
     * 删除【请填写功能名称】信息
     */
    @Override
    public int deleteHisHospitalAppointmentById(Long appointmentId)
    {
        return hisHospitalAppointmentMapper.deleteHisHospitalAppointmentById(appointmentId);
    }
}
