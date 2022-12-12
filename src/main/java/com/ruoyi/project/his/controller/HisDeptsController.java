package com.ruoyi.project.his.controller;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.his.domain.HisDepts;
import com.ruoyi.project.his.domain.HisDeptsCare;
import com.ruoyi.project.his.service.IHisDeptsService;
import com.ruoyi.project.system.domain.SysPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/his/depts")
public class HisDeptsController extends BaseController {

    @Autowired
    private IHisDeptsService hisDeptsService;

    /**
     * 查询【这是查询科室列表的方法】
     */
//    @PreAuthorize("@ss.hasPermi('his:depts:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisDepts hisDepts){
        startPage();
        List<HisDepts> list = hisDeptsService.selectDeptsList(hisDepts);
        return getDataTable(list);
    }


    /**
     * 获取【通过id查询要修改科室的信息】详细信息
     */
//    @PreAuthorize("@ss.hasPermi('his:depts:query')")
    @GetMapping("/deptsId{deptsId}")
    public AjaxResult getInfo(@PathVariable(value = "deptsId") Long deptsId)
    {
        return AjaxResult.success(hisDeptsService.selectHisDeptsById(deptsId));
    }

    /**
     * 查询【这是根据科室Id查询详细科室信息集合的方法】
     */
//    @PreAuthorize("@ss.hasPermi('his:care:query')")
    @GetMapping("/{deptsId}")
    public TableDataInfo DeptsCareList(@PathVariable("deptsId") Long deptsId){
        startPage();
        List<HisDeptsCare> list = hisDeptsService.selectDeptsCareById(deptsId);
        return getDataTable(list);
    }

    /**
     * 查询【全部详细科室信息】列表
     */
//    @PreAuthorize("@ss.hasPermi('his:care:list')")
    @GetMapping("/listCare")
    public TableDataInfo list(HisDeptsCare hisDeptsCare)
    {
        startPage();
        List<HisDeptsCare> list = hisDeptsService.selectHisDeptsCareList(hisDeptsCare);
        return getDataTable(list);
    }

    /**
     * 新增【这是新增科室的方法】
     */
//    @PreAuthorize("@ss.hasPermi('his:depts:add')")
    @Log(title = "【新增科室】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisDepts hisDepts)
    {
        return toAjax(hisDeptsService.insertHisDepts(hisDepts));
    }


    /**
     * 新增【请填写功能名称】
     */
//    @PreAuthorize("@ss.hasPermi('his:care:add')")
    @Log(title = "【新增详细科室】", businessType = BusinessType.INSERT)
    @PostMapping("/care")
    public AjaxResult addDeptsCare(@RequestBody HisDeptsCare hisDeptsCare)
    {
        return toAjax(hisDeptsService.insertHisDeptsCare(hisDeptsCare));
    }
    /**
     * 修改【科室】
     */
//    @PreAuthorize("@ss.hasPermi('his:depts:edit')")
    @Log(title = "【修改科室】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HisDepts hisDepts)
    {
        return toAjax(hisDeptsService.updateHisDepts(hisDepts));
    }
    /**
     * 删除【根据科室id删除科室】
     */
//    @PreAuthorize("@ss.hasPermi('his:depts:remove')")
    @Log(title = "【删除科室】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{deptsIds}")
    public AjaxResult remove(@PathVariable Long[] deptsIds)
    {
        return toAjax(hisDeptsService.deleteHisDeptsByIds(deptsIds));
    }
}
