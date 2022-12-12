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
     * 查询【医生挂号量json】
     */
    @Override
    public HisRegSum selectHisRegSumById(Long medicalId,String json)
    {
        return hisRegSumMapper.selectHisRegSumByIdByday(medicalId,json);
    }


    /**
     * 新增【医生挂号量json】
     */
    @Override
    public int insertHisRegSum(HisRegSum hisRegSum)
    {
        return hisRegSumMapper.insertHisRegSum(hisRegSum);
    }

    /**
     * 修改【医生挂号量json】
     */
    @Override
    public int updateHisRegSum(HisRegSum hisRegSum)
    {
        return hisRegSumMapper.updateHisRegSum(hisRegSum);
    }
}
