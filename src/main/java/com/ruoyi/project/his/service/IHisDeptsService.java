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

    List<HisDeptsCare> selectHisDeptsCareList(HisDeptsCare hisDeptsCare);

    int updateHisDepts(HisDepts hisDepts);

    int deleteHisDeptsByIds(Long[] deptsIds);

    int deleteHisDeptsById(Long deptsId);

    int insertHisDeptsCare(HisDeptsCare hisDeptsCare);
}
