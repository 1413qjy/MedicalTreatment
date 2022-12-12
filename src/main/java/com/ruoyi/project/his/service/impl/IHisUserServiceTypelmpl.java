package com.ruoyi.project.his.service.impl;

import com.ruoyi.project.his.domain.HisUserType;
import com.ruoyi.project.his.mapper.HisUserTypeMapper;
import com.ruoyi.project.his.service.IHisUserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IHisUserServiceTypelmpl implements IHisUserTypeService {

    @Autowired
    private HisUserTypeMapper hisUserTypeMapper;

    @Override
    public List<HisUserType> selectUserTypeList(Long userId) {
        return hisUserTypeMapper.selectUserTypeList(userId);
    }
}
