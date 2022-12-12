package com.ruoyi.project.his.mapper;

import java.util.List;
import com.ruoyi.project.his.domain.HisRegSum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 【医生挂号量】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-12-01
 */
@Mapper
public interface HisRegSumMapper 
{
    /**
     * 查询【医生挂号量】
     * 
     * @param regSumId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public HisRegSum selectHisRegSumById(Long regSumId);

    public HisRegSum selectHisRegSumByIdByday(Long medicalId, @Param(value = "json") String json);
    /**
     * 查询【医生挂号量】列表
     * 
     * @param hisRegSum 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisRegSum> selectHisRegSumList(HisRegSum hisRegSum);

    /**
     * 新增【医生挂号量】
     * 
     * @param hisRegSum 【请填写功能名称】
     * @return 结果
     */
    public int insertHisRegSum(HisRegSum hisRegSum);

    /**
     * 修改【医生挂号量】
     * 
     * @param hisRegSum 【请填写功能名称】
     * @return 结果
     */
    public int updateHisRegSum(HisRegSum hisRegSum);

    public int updateHisRegSumVersion(Long remain,Long version,Long vueVersion,Long medicalId,String condition1,String condition2);

    /**
     * 删除【医生挂号量】
     * 
     * @param regSumId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHisRegSumById(Long regSumId);

    /**
     * 批量删除【医生挂号量】
     * 
     * @param regSumIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHisRegSumByIds(Long[] regSumIds);
}
