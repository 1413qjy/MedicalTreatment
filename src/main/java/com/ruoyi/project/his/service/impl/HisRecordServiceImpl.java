package com.ruoyi.project.his.service.impl;

import java.util.List;

import com.ruoyi.project.his.domain.HisRecord;
import com.ruoyi.project.his.mapper.HisRecordMapper;
import com.ruoyi.project.his.service.IHisRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-12
 */
@Service
public class HisRecordServiceImpl implements IHisRecordService
{
    @Autowired
    private HisRecordMapper hisRecordMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param recordId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public HisRecord selectHisRecordById(Long recordId)
    {
        return hisRecordMapper.selectHisRecordById(recordId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisRecord 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<HisRecord> selectHisRecordList(HisRecord hisRecord)
    {
        return hisRecordMapper.selectHisRecordList(hisRecord);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param hisRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHisRecord(HisRecord hisRecord)
    {
        return hisRecordMapper.insertHisRecord(hisRecord);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param hisRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateHisRecord(HisRecord hisRecord)
    {
        return hisRecordMapper.updateHisRecord(hisRecord);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param recordIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteHisRecordByIds(Long[] recordIds)
    {
        return hisRecordMapper.deleteHisRecordByIds(recordIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param recordId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteHisRecordById(Long recordId)
    {
        return hisRecordMapper.deleteHisRecordById(recordId);
    }
}
