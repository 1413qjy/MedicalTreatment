package com.ruoyi.project.his.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 简述 这是通过筛选条件查出医生的id
 * @author 写你自己的名字一般都是英文不可以汉字
 * @date:  14:10
 * @return {@link null }
 *
 */
@Data
@Component
public class MedicalIdItem {

    private Long medicalId;
}
