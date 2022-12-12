package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisExamine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-12-12
 */

@Mapper
public interface HisExamineMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param examineId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public HisExamine selectHisExamineById(Long examineId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisExamine 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisExamine> selectHisExamineList(HisExamine hisExamine);

    /**
     * 新增【请填写功能名称】
     * 
     * @param hisExamine 【请填写功能名称】
     * @return 结果
     */
    public int insertHisExamine(HisExamine hisExamine);

    /**
     * 修改【请填写功能名称】
     * 
     * @param hisExamine 【请填写功能名称】
     * @return 结果
     */
    public int updateHisExamine(HisExamine hisExamine);

    /**
     * 删除【请填写功能名称】
     * 
     * @param examineId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHisExamineById(Long examineId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param examineIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHisExamineByIds(Long[] examineIds);
}
