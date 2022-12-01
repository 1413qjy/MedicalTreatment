package com.ruoyi.project.his.mapper;

import java.util.List;
import com.ruoyi.project.his.domain.HisRegSum;
import org.apache.ibatis.annotations.Mapper;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-12-01
 */
@Mapper
public interface HisRegSumMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param regSumId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHisRegSumById(Long regSumId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param regSumIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHisRegSumByIds(Long[] regSumIds);
}
