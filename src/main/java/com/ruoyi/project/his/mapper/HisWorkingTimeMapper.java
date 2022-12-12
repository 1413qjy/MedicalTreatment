package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisWorkingTime;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-30
 */
@Mapper
public interface HisWorkingTimeMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param hisWtId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHisWorkingTimeById(Long hisWtId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param hisWtIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHisWorkingTimeByIds(Long[] hisWtIds);
}
