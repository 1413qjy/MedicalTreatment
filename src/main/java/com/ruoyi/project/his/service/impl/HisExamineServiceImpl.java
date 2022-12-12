package com.ruoyi.project.his.service.impl;

import java.util.List;

import com.ruoyi.project.his.domain.HisExamine;
import com.ruoyi.project.his.mapper.HisExamineMapper;
import com.ruoyi.project.his.service.IHisExamineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-12
 */
@Service
public class HisExamineServiceImpl implements IHisExamineService
{
    @Autowired
    private HisExamineMapper hisExamineMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param examineId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public HisExamine selectHisExamineById(Long examineId)
    {
        return hisExamineMapper.selectHisExamineById(examineId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisExamine 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<HisExamine> selectHisExamineList(HisExamine hisExamine)
    {
        return hisExamineMapper.selectHisExamineList(hisExamine);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param hisExamine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHisExamine(HisExamine hisExamine)
    {
        return hisExamineMapper.insertHisExamine(hisExamine);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param hisExamine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateHisExamine(HisExamine hisExamine)
    {
        return hisExamineMapper.updateHisExamine(hisExamine);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param examineIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteHisExamineByIds(Long[] examineIds)
    {
        return hisExamineMapper.deleteHisExamineByIds(examineIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param examineId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteHisExamineById(Long examineId)
    {
        return hisExamineMapper.deleteHisExamineById(examineId);
    }
}
