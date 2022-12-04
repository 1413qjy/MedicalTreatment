package com.ruoyi.project.his.controller;

import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.his.domain.HisDeptsCare;
import com.ruoyi.project.his.service.IHisDeptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
