package com.ruoyi.project.his.controller;

import java.util.List;

import com.ruoyi.project.his.domain.HisExamine;
import com.ruoyi.project.his.service.IHisExamineService;
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
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2022-12-12
 */
@RestController
@RequestMapping("/his/examine")
public class HisExamineController extends BaseController
{
    @Autowired
    private IHisExamineService hisExamineService;

    /**
     * 查询【检查项目】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:examine:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisExamine hisExamine)
    {
        startPage();
        List<HisExamine> list = hisExamineService.selectHisExamineList(hisExamine);
        return getDataTable(list);
    }

    /**
     * 导出【检查项目】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:examine:export')")
    @Log(title = "【检查项目】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HisExamine hisExamine)
    {
        List<HisExamine> list = hisExamineService.selectHisExamineList(hisExamine);
        ExcelUtil<HisExamine> util = new ExcelUtil<HisExamine>(HisExamine.class);
        return util.exportExcel(list, "examine");
    }

    /**
     * 获取【检查项目】详细信息
     */
//    @PreAuthorize("@ss.hasPermi('system:examine:query')")
    @GetMapping(value = "/{examineId}")
    public AjaxResult getInfo(@PathVariable("examineId") Long examineId)
    {
        return AjaxResult.success(hisExamineService.selectHisExamineById(examineId));
    }

    /**
     * 新增【检查项目】
     */
//    @PreAuthorize("@ss.hasPermi('system:examine:add')")
    @Log(title = "【检查项目】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisExamine hisExamine)
    {
        return toAjax(hisExamineService.insertHisExamine(hisExamine));
    }

    /**
     * 修改【检查项目】
     */
//    @PreAuthorize("@ss.hasPermi('system:examine:edit')")
    @Log(title = "【检查项目】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HisExamine hisExamine)
    {
        return toAjax(hisExamineService.updateHisExamine(hisExamine));
    }

    /**
     * 删除【检查项目】
     */
//    @PreAuthorize("@ss.hasPermi('system:examine:remove')")
    @Log(title = "【检查项目】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{examineIds}")
    public AjaxResult remove(@PathVariable Long[] examineIds)
    {
        return toAjax(hisExamineService.deleteHisExamineByIds(examineIds));
    }
}
