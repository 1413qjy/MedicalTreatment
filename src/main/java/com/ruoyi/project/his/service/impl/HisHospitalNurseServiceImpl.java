package com.ruoyi.project.his.service.impl;

import java.util.List;

import com.ruoyi.project.his.domain.HisHospitalNurse;
import com.ruoyi.project.his.mapper.HisHospitalNurseMapper;
import com.ruoyi.project.his.service.IHisHospitalNurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-12
 */
@Service
public class HisHospitalNurseServiceImpl implements IHisHospitalNurseService
{
    @Autowired
    private HisHospitalNurseMapper hisHospitalNurseMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param nurseId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public HisHospitalNurse selectHisHospitalNurseById(Long nurseId)
    {
        return hisHospitalNurseMapper.selectHisHospitalNurseById(nurseId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisHospitalNurse 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<HisHospitalNurse> selectHisHospitalNurseList(HisHospitalNurse hisHospitalNurse)
    {
        return hisHospitalNurseMapper.selectHisHospitalNurseList(hisHospitalNurse);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param hisHospitalNurse 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHisHospitalNurse(HisHospitalNurse hisHospitalNurse)
    {
        return hisHospitalNurseMapper.insertHisHospitalNurse(hisHospitalNurse);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param hisHospitalNurse 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateHisHospitalNurse(HisHospitalNurse hisHospitalNurse)
    {
        return hisHospitalNurseMapper.updateHisHospitalNurse(hisHospitalNurse);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param nurseIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteHisHospitalNurseByIds(Long[] nurseIds)
    {
        return hisHospitalNurseMapper.deleteHisHospitalNurseByIds(nurseIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param nurseId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteHisHospitalNurseById(Long nurseId)
    {
        return hisHospitalNurseMapper.deleteHisHospitalNurseById(nurseId);
    }
}
