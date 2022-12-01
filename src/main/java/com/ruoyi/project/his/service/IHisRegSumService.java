package com.ruoyi.project.his.service;

import com.ruoyi.project.his.domain.HisRegSum;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-12-01
 */
public interface IHisRegSumService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param regSumId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public HisRegSum selectHisRegSumById(Long regSumId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisRegSum 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisRegSum> selectHisRegSumList(HisRegSum hisRegSum);

    /**
     * 新增【请填写功能名称】
     * 
     * @param hisRegSum 【请填写功能名称】
     * @return 结果
     */
    public int insertHisRegSum(HisRegSum hisRegSum);

    /**
     * 修改【请填写功能名称】
     * 
     * @param hisRegSum 【请填写功能名称】
     * @return 结果
     */
    public int updateHisRegSum(HisRegSum hisRegSum);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param regSumIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHisRegSumByIds(Long[] regSumIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param regSumId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHisRegSumById(Long regSumId);
}
