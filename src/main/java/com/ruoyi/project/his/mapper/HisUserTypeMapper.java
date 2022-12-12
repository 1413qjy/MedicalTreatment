package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisUserType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HisUserTypeMapper {

    public List<HisUserType> selectUserTypeList(Long userId);
}
