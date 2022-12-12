package com.ruoyi.project.his.controller;

import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.his.domain.HisDeptsCare;
import com.ruoyi.project.his.service.IHisDeptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/his/deptsCare")
public class HisDeptsCareController extends BaseController {

    @Autowired
    private IHisDeptsService hisDeptsService;

    /**
     * 修改【详细科室】
     */
//    @PreAuthorize("@ss.hasPermi('his:care:edit')")
    @Log(title = "【修改详细科室】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult editDeptsCare(@RequestBody HisDeptsCare hisDeptsCare)
    {
        return toAjax(hisDeptsService.updateHisDeptsCare(hisDeptsCare));
    }

    /**
     * 获取【某个详细科室】详细信息
     */
//    @PreAuthorize("@ss.hasPermi('his:care:query')")
    @GetMapping(value = "/{deptsCareId}")
    public AjaxResult getInfo(@PathVariable("deptsCareId") Long deptsCareId)
    {
        return AjaxResult.success(hisDeptsService.HisDeptsCareById(deptsCareId));
    }

    /**
     * 删除【某个详细科室】
     */
//    @PreAuthorize("@ss.hasPermi('system:care:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{deptsCareIds}")
    public AjaxResult remove(@PathVariable Long[] deptsCareIds)
    {
        return toAjax(hisDeptsService.deleteHisDeptsCareByIds(deptsCareIds));
    }

}
