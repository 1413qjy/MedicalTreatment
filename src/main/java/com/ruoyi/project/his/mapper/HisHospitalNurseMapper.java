package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisHospitalNurse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-12-12
 */

@Mapper
public interface HisHospitalNurseMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param nurseId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public HisHospitalNurse selectHisHospitalNurseById(Long nurseId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hisHospitalNurse 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisHospitalNurse> selectHisHospitalNurseList(HisHospitalNurse hisHospitalNurse);

    /**
     * 新增【请填写功能名称】
     * 
     * @param hisHospitalNurse 【请填写功能名称】
     * @return 结果
     */
    public int insertHisHospitalNurse(HisHospitalNurse hisHospitalNurse);

    /**
     * 修改【请填写功能名称】
     * 
     * @param hisHospitalNurse 【请填写功能名称】
     * @return 结果
     */
    public int updateHisHospitalNurse(HisHospitalNurse hisHospitalNurse);

    /**
     * 删除【请填写功能名称】
     * 
     * @param nurseId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteHisHospitalNurseById(Long nurseId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param nurseIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHisHospitalNurseByIds(Long[] nurseIds);
}
