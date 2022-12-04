package com.ruoyi.project.his.service.impl;

import java.util.List;

import com.ruoyi.project.his.domain.HisRegSum;
import com.ruoyi.project.his.mapper.HisRegSumMapper;
import com.ruoyi.project.his.service.IHisRegSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-01
 */
@Service
public class HisRegSumServiceImpl implements IHisRegSumService
{
    @Autowired
    private HisRegSumMapper hisRegSumMapper;

    /**
     * 查询【医生挂号量】
     * 
     * @param regSumId 【医生挂号量】ID
     * @return 【医生挂号量】
     */
    @Override
    public HisRegSum selectHisRegSumById(Long regSumId)
    {
        return hisRegSumMapper.selectHisRegSumById(regSumId);
    }

    @Override
    public HisRegSum selectHisRegSumById(Long medicalId,String json)
    {
        return hisRegSumMapper.selectHisRegSumByIdByday(medicalId,json);
    }

    /**
     * 查询【医生挂号量】列表
     * 
     * @param hisRegSum 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<HisRegSum> selectHisRegSumList(HisRegSum hisRegSum)
    {
        return hisRegSumMapper.selectHisRegSumList(hisRegSum);
    }

    /**
     * 新增【医生挂号量】
     * 
     * @param hisRegSum 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHisRegSum(HisRegSum hisRegSum)
    {
        return hisRegSumMapper.insertHisRegSum(hisRegSum);
    }

    /**
     * 修改【医生挂号量】
     * 
     * @param hisRegSum 【医生挂号量】
     * @return 结果
     */
    @Override
    public int updateHisRegSum(HisRegSum hisRegSum)
    {
        return hisRegSumMapper.updateHisRegSum(hisRegSum);
    }

    /**
     * 批量删除【医生挂号量】
     * 
     * @param regSumIds 需要删除的【医生挂号量】ID
     * @return 结果
     */
    @Override
    public int deleteHisRegSumByIds(Long[] regSumIds)
    {
        return hisRegSumMapper.deleteHisRegSumByIds(regSumIds);
    }

    /**
     * 删除【医生挂号量】信息
     * 
     * @param regSumId 【医生挂号量】ID
     * @return 结果
     */
    @Override
    public int deleteHisRegSumById(Long regSumId)
    {
        return hisRegSumMapper.deleteHisRegSumById(regSumId);
    }
}
