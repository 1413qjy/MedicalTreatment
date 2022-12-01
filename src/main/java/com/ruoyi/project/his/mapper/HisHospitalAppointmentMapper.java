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
     * 查询【请填写功能名称】列表
     * 
     * @param hisHospitalAppointment 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisHospitalAppointment> selectHisHospitalAppointmentList(HisHospitalAppointment hisHospitalAppointment);

    /**
     * 新增【请填写功能名称】
     *
     * @param hisHospitalAppointment 【请填写功能名称】
     * @return 结果
     */
    public int insertHisHospitalAppointment(HisHospitalAppointment hisHospitalAppointment);


}
