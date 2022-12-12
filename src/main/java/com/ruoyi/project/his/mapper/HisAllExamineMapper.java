package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisAllExamine;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-12-12
 */
public interface HisAllExamineMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public HisAllExamine selectHisAllExamineById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisAllExamine 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisAllExamine> selectHisAllExamineList(HisAllExamine hisAllExamine);

    /**
     * 新增【请填写功能名称】
     * 
     * @param hisAllExamine 【请填写功能名称】
     * @return 结果
     */
    public int insertHisAllExamine(HisAllExamine hisAllExamine);

    /**
     * 修改【请填写功能名称】
     * 
     * @param hisAllExamine 【请填写功能名称】
     * @return 结果
     */
    public int updateHisAllExamine(HisAllExamine hisAllExamine);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHisAllExamineById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteHisAllExamineByIds(Long[] ids);
}
