package com.ruoyi.project.his.mapper;


import com.ruoyi.project.his.domain.HisLockStock;
import org.apache.ibatis.annotations.Mapper;

/**
 * 这是锁库存
 */
@Mapper
public interface HisLockStockMapper {

    public HisLockStock selectHisLockStockRegSumJson(String condition,Long medicalId);
}
