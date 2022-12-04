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
     * 查询【医生挂号量】列表
     */
//    @PreAuthorize("@ss.hasPermi('his:sum:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisRegSum hisRegSum)
    {
        startPage();
        List<HisRegSum> list = hisRegSumService.selectHisRegSumList(hisRegSum);
        return getDataTable(list);
    }

    /**
     * 导出【医生挂号量】列表
     */
//    @PreAuthorize("@ss.hasPermi('his:sum:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HisRegSum hisRegSum)
    {
        List<HisRegSum> list = hisRegSumService.selectHisRegSumList(hisRegSum);
        ExcelUtil<HisRegSum> util = new ExcelUtil<HisRegSum>(HisRegSum.class);
        return util.exportExcel(list, "sum");
    }

    /**
     * 获取【某个医生挂号量】详细信息
     */
//    @PreAuthorize("@ss.hasPermi('his:sum:query')")
    @GetMapping(value = "/{regSumId}")
    public AjaxResult getInfo(@PathVariable("regSumId") Long regSumId)
    {
        return AjaxResult.success(hisRegSumService.selectHisRegSumById(regSumId));
    }

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

    /**
     * 删除【医生挂号量的信息】
     */
//    @PreAuthorize("@ss.hasPermi('system:sum:remove')")
    @Log(title = "【医生挂号量信息(Json格式的信息)】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{regSumIds}")
    public AjaxResult remove(@PathVariable Long[] regSumIds)
    {
        return toAjax(hisRegSumService.deleteHisRegSumByIds(regSumIds));
    }
}
