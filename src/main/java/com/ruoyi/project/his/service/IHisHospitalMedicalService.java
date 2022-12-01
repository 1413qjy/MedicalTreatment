package com.ruoyi.project.his.service;

import com.ruoyi.project.his.domain.AppintmentFilter;
import com.ruoyi.project.his.domain.HisHospitalAppointment;
import com.ruoyi.project.his.domain.HisHospitalMedical;
import com.ruoyi.project.his.domain.HisPost;

import java.util.List;


/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-11-22
 */
public interface IHisHospitalMedicalService
{
    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisHospitalMedical 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisHospitalMedical> selectHisHospitalMedicalList(HisHospitalMedical hisHospitalMedical);

    /**
     * 查询【职位】列表
     *
     * @param hisPost 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisPost> selectHisPostList(HisPost hisPost);

    /**
     * 新增【请填写功能名称】
     *
     * @param hisHospitalMedical 【请填写功能名称】
     * @return 结果
     */
    public int insertHisHospitalMedical(HisHospitalMedical hisHospitalMedical);

    public List<HisHospitalMedical> selectAtList(AppintmentFilter appintmentFilter);

    public HisHospitalMedical selectHisHospitalMedicalById(Long medicalId);

    public int updateHisHospitalMedical(HisHospitalMedical hisHospitalMedical);

    public int deleteHisHospitalMedicalByIds(Long[] medicalIds);

    public int deleteHisHospitalMedicalById(Long medicalId);

    public List<HisHospitalMedical> selectHisHospitalMedicalWorkingList(HisHospitalMedical hisHospitalMedical);

    public int updateMedicalIsWorking(Long medicalId);
}
