package com.ruoyi.project.his.service.impl;

import com.ruoyi.project.his.domain.HisLockStock;
import com.ruoyi.project.his.mapper.HisLockStockMapper;
import com.ruoyi.project.his.service.IHisLockStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HisLockStockServicelmpl implements IHisLockStockService {

    @Autowired
    private HisLockStockMapper hisLockStockMapper;

    @Override
    public HisLockStock selectHisLockStockRegSumJson(String condition,Long medicalId) {
        return hisLockStockMapper.selectHisLockStockRegSumJson(condition,medicalId);
    }
}
