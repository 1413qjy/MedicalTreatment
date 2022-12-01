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
     * 查询【请填写功能名称】列表
     * 
     * @param hisHospitalAppointment 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisHospitalAppointment> selectHisHospitalAppointmentList(HisHospitalAppointment hisHospitalAppointment);

    /**
     * 简述 获取医院的信息
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  13:43
     * @param hisHospital
     * @return {@link List< HisHospital> }
     *
     */
    public List<HisHospital> selectHospitalMessage(HisHospital hisHospital);

    /**
     * 简述 新增预约信息
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  15:19
     * @param hisHospitalAppointment
     * @return {@link int }
     *
     */
    public int insertHisHospitalAppointment(HisHospitalAppointment hisHospitalAppointment);

    /**
     * 简述 随着挂号增加科室挂号量
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  13:12
     * @param deptsid
     * @return {@link int }
     *
     */
    public int updatedeptNum(Long deptsid);


}
