package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-12-12
 */
@Mapper
public interface HisRecordMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param recordId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public HisRecord selectHisRecordById(Long recordId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisRecord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisRecord> selectHisRecordList(HisRecord hisRecord);

    /**
     * 新增【请填写功能名称】
     * 
     * @param hisRecord 【请填写功能名称】
     * @return 结果
     */
    public int insertHisRecord(HisRecord hisRecord);

    /**
     * 修改【请填写功能名称】
     * 
     * @param hisRecord 【请填写功能名称】
     * @return 结果
     */
    public int updateHisRecord(HisRecord hisRecord);

    /**
     * 删除【请填写功能名称】
     * 
     * @param recordId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHisRecordById(Long recordId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param recordIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHisRecordByIds(Long[] recordIds);
}
