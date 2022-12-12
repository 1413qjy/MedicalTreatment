package com.ruoyi.project.his.service;

import com.ruoyi.project.his.domain.HisDepts;
import com.ruoyi.project.his.domain.HisDeptsCare;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface IHisDeptsService {
    List<HisDepts> selectDeptsList(HisDepts hisDepts);

    HisDepts selectHisDeptsById(Long deptsId);

    int insertHisDepts(HisDepts hisDepts);

    List<HisDeptsCare> selectDeptsCareById(Long deptsId);

    List<HisDeptsCare> DeptsCareById(Long deptsCareId);

    HisDeptsCare HisDeptsCareById(Long deptsCareId);

    List<HisDeptsCare> selectHisDeptsCareList(HisDeptsCare hisDeptsCare);

    int updateHisDepts(HisDepts hisDepts);

    int deleteHisDeptsByIds(Long[] deptsIds);

    int deleteHisDeptsById(Long deptsId);

    int insertHisDeptsCare(HisDeptsCare hisDeptsCare);

    int updateHisDeptsCare(HisDeptsCare hisDeptsCare);


    /**
     * 批量删除【详细科室】
     */
    public int deleteHisDeptsCareByIds(Long[] deptsCareIds);

    /**
     * 删除【详细科室】信息
     */
    public int deleteHisDeptsCareById(Long deptsCareId);
}
