package com.ruoyi.project.his.service.impl;

import java.util.List;

import com.ruoyi.project.his.domain.HisWorkingTime;
import com.ruoyi.project.his.mapper.HisWorkingTimeMapper;
import com.ruoyi.project.his.service.IHisWorkingTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-11-30
 */
@Service
public class HisWorkingTimeServiceImpl implements IHisWorkingTimeService
{
    @Autowired
    private HisWorkingTimeMapper hisWorkingTimeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param hisWtId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public HisWorkingTime selectHisWorkingTimeById(Long hisWtId)
    {
        return hisWorkingTimeMapper.selectHisWorkingTimeById(hisWtId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisWorkingTime 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<HisWorkingTime> selectHisWorkingTimeList(HisWorkingTime hisWorkingTime)
    {
        return hisWorkingTimeMapper.selectHisWorkingTimeList(hisWorkingTime);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param hisWorkingTime 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHisWorkingTime(HisWorkingTime hisWorkingTime)
    {
        return hisWorkingTimeMapper.insertHisWorkingTime(hisWorkingTime);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param hisWorkingTime 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateHisWorkingTime(HisWorkingTime hisWorkingTime)
    {
        return hisWorkingTimeMapper.updateHisWorkingTime(hisWorkingTime);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param hisWtIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteHisWorkingTimeByIds(Long[] hisWtIds)
    {
        return hisWorkingTimeMapper.deleteHisWorkingTimeByIds(hisWtIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param hisWtId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteHisWorkingTimeById(Long hisWtId)
    {
        return hisWorkingTimeMapper.deleteHisWorkingTimeById(hisWtId);
    }
}
