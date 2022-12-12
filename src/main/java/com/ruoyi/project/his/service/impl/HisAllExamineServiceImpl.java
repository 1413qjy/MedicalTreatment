package com.ruoyi.project.his.service.impl;

import java.util.List;

import com.ruoyi.project.his.domain.HisAllExamine;
import com.ruoyi.project.his.mapper.HisAllExamineMapper;
import com.ruoyi.project.his.service.IHisAllExamineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-12
 */
@Service
public class HisAllExamineServiceImpl implements IHisAllExamineService
{
    @Autowired
    private HisAllExamineMapper hisAllExamineMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public HisAllExamine selectHisAllExamineById(Long id)
    {
        return hisAllExamineMapper.selectHisAllExamineById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisAllExamine 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<HisAllExamine> selectHisAllExamineList(HisAllExamine hisAllExamine)
    {
        return hisAllExamineMapper.selectHisAllExamineList(hisAllExamine);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param hisAllExamine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHisAllExamine(HisAllExamine hisAllExamine)
    {
        return hisAllExamineMapper.insertHisAllExamine(hisAllExamine);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param hisAllExamine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateHisAllExamine(HisAllExamine hisAllExamine)
    {
        return hisAllExamineMapper.updateHisAllExamine(hisAllExamine);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteHisAllExamineByIds(Long[] ids)
    {
        return hisAllExamineMapper.deleteHisAllExamineByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteHisAllExamineById(Long id)
    {
        return hisAllExamineMapper.deleteHisAllExamineById(id);
    }
}
