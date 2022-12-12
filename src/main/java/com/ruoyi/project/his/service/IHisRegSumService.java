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
     * 查询【医生挂号量json】
     */
    public HisRegSum selectHisRegSumById(Long medicalId,String json);

    /**
     * 新增【医生挂号量json】
     */
    public int insertHisRegSum(HisRegSum hisRegSum);

    /**
     * 修改【医生挂号量json】
     */
    public int updateHisRegSum(HisRegSum hisRegSum);

}
