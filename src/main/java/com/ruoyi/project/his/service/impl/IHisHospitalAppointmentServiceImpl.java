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
     * 查询【请填写功能名称】列表
     * 
     * @param hisHospitalAppointment 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<HisHospitalAppointment> selectHisHospitalAppointmentList(HisHospitalAppointment hisHospitalAppointment) {
        return hisHospitalAppointmentMapper.selectHisHospitalAppointmentList(hisHospitalAppointment);
    }

    /**
     * 简述 获取医院的信息
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  13:43
     * @param hisHospital
     * @return {@link List< HisHospital> }
     *
     */
    @Override
    public List<HisHospital> selectHospitalMessage(HisHospital hisHospital) {
        return hisHospitalMapper.selectHospitalAllList(hisHospital);
    }

    /**
     * 简述 新增预约信息
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  15:19
     * @param hisHospitalAppointment
     * @return {@link int }
     *
     */
    @Override
    public int insertHisHospitalAppointment(HisHospitalAppointment hisHospitalAppointment) {
        return hisHospitalAppointmentMapper.insertHisHospitalAppointment(hisHospitalAppointment);
    }

    /**
     * 简述 随着挂号增加科室挂号量
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  13:12
     * @param deptsid
     * @return {@link int }
     *
     */
    @Override
    public int updatedeptNum(Long deptsid) {
        return hisDeptsMapper.updateDeptsNum(deptsid);
    }



}
