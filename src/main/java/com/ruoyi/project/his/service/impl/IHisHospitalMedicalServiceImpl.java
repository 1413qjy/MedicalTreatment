package com.ruoyi.project.his.service.impl;

import java.util.List;

import com.ruoyi.project.his.domain.AppintmentFilter;
import com.ruoyi.project.his.domain.HisHospitalAppointment;
import com.ruoyi.project.his.domain.HisHospitalMedical;
import com.ruoyi.project.his.domain.HisPost;
import com.ruoyi.project.his.mapper.HisHospitalMedicalMapper;
import com.ruoyi.project.his.mapper.HisPostMapper;
import com.ruoyi.project.his.service.IHisHospitalMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-22
 */
@Service
public class IHisHospitalMedicalServiceImpl implements IHisHospitalMedicalService
{
    @Autowired
    private HisHospitalMedicalMapper hisHospitalMedicalMapper;
    @Autowired
    private HisPostMapper hisPostMapper;

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisHospitalMedical 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<HisHospitalMedical> selectHisHospitalMedicalList(HisHospitalMedical hisHospitalMedical)
    {
        return hisHospitalMedicalMapper.selectHisHospitalMedicalList(hisHospitalMedical);
    }

    @Override
    public List<HisPost> selectHisPostList(HisPost hisPost) {
        return hisPostMapper.selectHisPostList(hisPost);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param hisHospitalMedical 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHisHospitalMedical(HisHospitalMedical hisHospitalMedical)
    {
        return hisHospitalMedicalMapper.insertHisHospitalMedical(hisHospitalMedical);
    }

    @Override
    public List<HisHospitalMedical> selectAtList(AppintmentFilter appintmentFilter) {
        return hisHospitalMedicalMapper.selectAtList(appintmentFilter);
    }

    @Override
    public HisHospitalMedical selectHisHospitalMedicalById(Long medicalId)
    {
        return hisHospitalMedicalMapper.selectHisHospitalMedicalById(medicalId);
    }

    @Override
    public int updateHisHospitalMedical(HisHospitalMedical hisHospitalMedical)
    {
        return hisHospitalMedicalMapper.updateHisHospitalMedical(hisHospitalMedical);
    }

    @Override
    public int deleteHisHospitalMedicalByIds(Long[] medicalIds)
    {
        return hisHospitalMedicalMapper.deleteHisHospitalMedicalByIds(medicalIds);
    }

    @Override
    public int deleteHisHospitalMedicalById(Long medicalId)
    {
        return hisHospitalMedicalMapper.deleteHisHospitalMedicalById(medicalId);
    }

    @Override
    public List<HisHospitalMedical> selectHisHospitalMedicalWorkingList(HisHospitalMedical hisHospitalMedical) {
        return hisHospitalMedicalMapper.selectHisHospitalMedicaWorkinglList(hisHospitalMedical);
    }

    @Override
    public int updateMedicalIsWorking(Long medicalId) {
        return hisHospitalMedicalMapper.updateMedicalIsWorking(medicalId);
    }

    @Override
    public HisPost selectHisPostById(Long postId) {
        return hisPostMapper.selectHisPostById(postId);
    }
}
