package com.ruoyi.project.his.controller;

import java.util.List;

import com.ruoyi.project.his.domain.HisHospitalNurse;
import com.ruoyi.project.his.service.IHisHospitalNurseService;
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
@RequestMapping("/his/nurse")
public class HisHospitalNurseController extends BaseController
{
    @Autowired
    private IHisHospitalNurseService hisHospitalNurseService;

    /**
     * 查询【护士信息】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:nurse:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisHospitalNurse hisHospitalNurse)
    {
        startPage();
        List<HisHospitalNurse> list = hisHospitalNurseService.selectHisHospitalNurseList(hisHospitalNurse);
        return getDataTable(list);
    }

    /**
     * 导出【护士信息】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:nurse:export')")
    @Log(title = "【护士信息】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HisHospitalNurse hisHospitalNurse)
    {
        List<HisHospitalNurse> list = hisHospitalNurseService.selectHisHospitalNurseList(hisHospitalNurse);
        ExcelUtil<HisHospitalNurse> util = new ExcelUtil<HisHospitalNurse>(HisHospitalNurse.class);
        return util.exportExcel(list, "nurse");
    }

    /**
     * 获取【护士信息】详细信息
     */
//    @PreAuthorize("@ss.hasPermi('system:nurse:query')")
    @GetMapping(value = "/{nurseId}")
    public AjaxResult getInfo(@PathVariable("nurseId") Long nurseId)
    {
        return AjaxResult.success(hisHospitalNurseService.selectHisHospitalNurseById(nurseId));
    }

    /**
     * 新增【护士信息】
     */
//    @PreAuthorize("@ss.hasPermi('system:nurse:add')")
    @Log(title = "【护士信息】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisHospitalNurse hisHospitalNurse)
    {
        return toAjax(hisHospitalNurseService.insertHisHospitalNurse(hisHospitalNurse));
    }

    /**
     * 修改【护士信息】
     */
//    @PreAuthorize("@ss.hasPermi('system:nurse:edit')")
    @Log(title = "【护士信息】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HisHospitalNurse hisHospitalNurse)
    {
        return toAjax(hisHospitalNurseService.updateHisHospitalNurse(hisHospitalNurse));
    }

    /**
     * 删除【护士信息】
     */
//    @PreAuthorize("@ss.hasPermi('system:nurse:remove')")
    @Log(title = "【护士信息】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{nurseIds}")
    public AjaxResult remove(@PathVariable Long[] nurseIds)
    {
        return toAjax(hisHospitalNurseService.deleteHisHospitalNurseByIds(nurseIds));
    }
}
