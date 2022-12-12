package com.ruoyi.project.his.service;


import com.ruoyi.project.his.domain.HisLockStock;

public interface IHisLockStockService {

    HisLockStock selectHisLockStockRegSumJson(String condition,Long medicalId);
}
