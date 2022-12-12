package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisDeptsCare;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HisDeptsCareMapper {

    public List<HisDeptsCare> selectHisDeptsCareList(HisDeptsCare hisDeptsCare);

    public List<HisDeptsCare> selectHisDeptsCareById(Long deptsId);

    public int insertHisDeptsCare(HisDeptsCare hisDeptsCare);

    public List<HisDeptsCare> DeptsCareById(Long deptsCareId);

    public int updateHisDeptsCare(HisDeptsCare hisDeptsCare);

    public HisDeptsCare HisDeptsCareById(Long deptsCareId);
    /**
     * 删除【详细科室】
     */
    public int deleteHisDeptsCareById(Long deptsCareId);

    /**
     * 批量删除【详细科室】
     */
    public int deleteHisDeptsCareByIds(Long[] deptsCareIds);
}
