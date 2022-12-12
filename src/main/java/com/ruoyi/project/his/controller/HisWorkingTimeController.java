package com.ruoyi.project.his.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ruoyi.project.his.domain.HisHospitalMedical;
import com.ruoyi.project.his.domain.HisWorkingTime;
import com.ruoyi.project.his.service.IHisHospitalMedicalService;
import com.ruoyi.project.his.service.IHisWorkingTimeService;
import org.apache.poi.ss.formula.functions.T;
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
 * @date 2022-11-30
 */
@RestController
@RequestMapping("/his/time")
public class HisWorkingTimeController extends BaseController
{
    @Autowired
    private IHisWorkingTimeService hisWorkingTimeService;

    @Autowired
    private IHisHospitalMedicalService hisHospitalMedicalService;

    /**
     * 查询【医生排班】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:time:list')")
    @GetMapping("/listMedicalWorking")
    public TableDataInfo listMedical(HisWorkingTime hisWorkingTime)
    {
        startPage();
        List<HisWorkingTime> list = hisWorkingTimeService.selectHisWorkingTimeList(hisWorkingTime);
        return getDataTable(list);
    }

    /**
     * 查询【医生】列表
     */
    @GetMapping("/listMedical")
    public TableDataInfo list(HisHospitalMedical hisHospitalMedical)
    {
        startPage();
        List<HisHospitalMedical> list = hisHospitalMedicalService.selectHisHospitalMedicalWorkingList(hisHospitalMedical);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:time:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HisWorkingTime hisWorkingTime)
    {
        List<HisWorkingTime> list = hisWorkingTimeService.selectHisWorkingTimeList(hisWorkingTime);
        ExcelUtil<HisWorkingTime> util = new ExcelUtil<HisWorkingTime>(HisWorkingTime.class);
        return util.exportExcel(list, "time");
    }

    /**
     * 获取【医生排班】详细信息
     */
//    @PreAuthorize("@ss.hasPermi('system:time:query')")
    @GetMapping(value = "/{hisWtId}")
    public AjaxResult getInfo(@PathVariable("hisWtId") Long hisWtId)
    {
        return AjaxResult.success(hisWorkingTimeService.selectHisWorkingTimeById(hisWtId));
    }

    /**
     * 新增医生排班
     */
//    @PreAuthorize("@ss.hasPermi('system:time:add')")
    @Log(title = "新增医生排班", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisWorkingTime hisWorkingTime)
    {
        Long medicalId = hisWorkingTime.getMedicalId();
//        System.out.println(medicalId);
//        修改医生表中的是否排班
        hisHospitalMedicalService.updateMedicalIsWorking(medicalId);
        return toAjax(hisWorkingTimeService.insertHisWorkingTime(hisWorkingTime));
    }

    /**
     * 修改医生排班
     */
//    @PreAuthorize("@ss.hasPermi('system:time:edit')")
    @Log(title = "修改医生排班", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HisWorkingTime hisWorkingTime)
    {
        return toAjax(hisWorkingTimeService.updateHisWorkingTime(hisWorkingTime));
    }

    /**
     * 删除【医生排班】
     */
//    @PreAuthorize("@ss.hasPermi('system:time:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{hisWtIds}")
    public AjaxResult remove(@PathVariable Long[] hisWtIds)
    {
        return toAjax(hisWorkingTimeService.deleteHisWorkingTimeByIds(hisWtIds));
    }

    /**
     * 这是把am、pm转换为上下午的方法
     * @return
     */
    @GetMapping("/dict")
    public List<Map> dict() {
        List<Map> list = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Map<String, String> map3 = new HashMap<>();
        Map<String, String> map4 = new HashMap<>();
        map1.put("time", "am");
        map1.put("value","上午");
        map2.put("time", "pm");
        map2.put("value","下午");
        map3.put("time", "am,pm");
        map3.put("value","上午,下午");
        map4.put("time", "null");
        map4.put("value","无排班");
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        return list;
    }
}
