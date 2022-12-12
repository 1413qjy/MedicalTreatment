package com.ruoyi.project.his.controller;

import java.util.List;

import com.ruoyi.project.his.domain.HisRegSum;
import com.ruoyi.project.his.service.IHisRegSumService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 【医生挂号量的操作类】Controller
 * 
 * @author ruoyi
 * @date 2022-12-01
 */
@RestController
@RequestMapping("/his/sum")
public class HisRegSumController extends BaseController
{
    @Autowired
    private IHisRegSumService hisRegSumService;

    /**
     * 新增【医生挂号量信息(Json格式的信息)】
     */
//    @PreAuthorize("@ss.hasPermi('his:sum:add')")
    @Log(title = "【医生挂号量信息(Json格式的信息)】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisRegSum hisRegSum)
    {
        return toAjax(hisRegSumService.insertHisRegSum(hisRegSum));
    }

    /**
     * 修改【医生挂号量信息(Json格式的信息)】
     */
//    @PreAuthorize("@ss.hasPermi('system:sum:edit')")
    @Log(title = "【医生挂号量信息(Json格式的信息)】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HisRegSum hisRegSum)
    {
        return toAjax(hisRegSumService.updateHisRegSum(hisRegSum));
    }

}
