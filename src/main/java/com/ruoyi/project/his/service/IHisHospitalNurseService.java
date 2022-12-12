package com.ruoyi.project.his.service;

import com.ruoyi.project.his.domain.HisHospitalNurse;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-12-12
 */
public interface IHisHospitalNurseService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param nurseId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public HisHospitalNurse selectHisHospitalNurseById(Long nurseId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisHospitalNurse 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisHospitalNurse> selectHisHospitalNurseList(HisHospitalNurse hisHospitalNurse);

    /**
     * 新增【请填写功能名称】
     * 
     * @param hisHospitalNurse 【请填写功能名称】
     * @return 结果
     */
    public int insertHisHospitalNurse(HisHospitalNurse hisHospitalNurse);

    /**
     * 修改【请填写功能名称】
     * 
     * @param hisHospitalNurse 【请填写功能名称】
     * @return 结果
     */
    public int updateHisHospitalNurse(HisHospitalNurse hisHospitalNurse);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param nurseIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHisHospitalNurseByIds(Long[] nurseIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param nurseId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHisHospitalNurseById(Long nurseId);
}
