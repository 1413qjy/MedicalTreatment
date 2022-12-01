package com.ruoyi.project.his.service;

import com.ruoyi.project.his.domain.HisWorkingTime;

import java.util.List;


/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-11-30
 */
public interface IHisWorkingTimeService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param hisWtId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public HisWorkingTime selectHisWorkingTimeById(Long hisWtId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisWorkingTime 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisWorkingTime> selectHisWorkingTimeList(HisWorkingTime hisWorkingTime);

    /**
     * 新增【请填写功能名称】
     * 
     * @param hisWorkingTime 【请填写功能名称】
     * @return 结果
     */
    public int insertHisWorkingTime(HisWorkingTime hisWorkingTime);

    /**
     * 修改【请填写功能名称】
     * 
     * @param hisWorkingTime 【请填写功能名称】
     * @return 结果
     */
    public int updateHisWorkingTime(HisWorkingTime hisWorkingTime);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param hisWtIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHisWorkingTimeByIds(Long[] hisWtIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param hisWtId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHisWorkingTimeById(Long hisWtId);
}
