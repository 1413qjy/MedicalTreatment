package com.ruoyi.project.his.service;

import com.ruoyi.project.his.domain.HisUserType;

import java.util.List;

public interface IHisUserTypeService {

    public List<HisUserType> selectUserTypeList(Long userId);
}
