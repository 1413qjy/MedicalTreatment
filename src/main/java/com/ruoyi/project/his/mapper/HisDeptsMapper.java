package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisDepts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HisDeptsMapper {

    List<HisDepts> selectDeptsList(HisDepts hisDepts);

    int insertHisDepts(HisDepts hisDepts);

    int updateDeptsNum(Long deptsid);

    HisDepts selectHisDeptsById(Long deptsId);

    int updateHisDepts(HisDepts hisDepts);

    int deleteHisDeptsById(Long deptsId);

    int deleteHisDeptsByIds(Long[] deptsIds);
}
