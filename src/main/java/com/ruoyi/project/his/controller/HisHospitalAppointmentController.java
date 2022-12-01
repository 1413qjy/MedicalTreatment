package com.ruoyi.project.his.controller;

import java.util.List;

import com.ruoyi.project.his.domain.AppintmentFilter;
import com.ruoyi.project.his.domain.HisHospital;
import com.ruoyi.project.his.domain.HisHospitalAppointment;
import com.ruoyi.project.his.service.IHisHospitalAppointmentService;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
 * @date 2022-11-16.
 */
@RestController
@RequestMapping("/his/appointment")
public class HisHospitalAppointmentController extends BaseController
{
    @Autowired
    private IHisHospitalAppointmentService hisHospitalAppointmentService;

    /**
     * 查询【获取已经预约的预约信息】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:appointment:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisHospitalAppointment hisHospitalAppointment)
    {
        startPage();
        List<HisHospitalAppointment> list = hisHospitalAppointmentService.selectHisHospitalAppointmentList(hisHospitalAppointment);
        return getDataTable(list);
    }

    /**
     * 简述 获取医院和科室的信息
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date: 2 13:42
     * @param hisHospital
     * @return {@link com.ruoyi.framework.web.page.TableDataInfo }
     *
     */
    @GetMapping("/message")
    public TableDataInfo message(HisHospital hisHospital){
        List<HisHospital> list = hisHospitalAppointmentService.selectHospitalMessage(hisHospital);
        return getDataTable(list);
    }

    /**
     * 简述 新增预约信息
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  15:18
     * @param hisHospitalAppointment
     * @return {@link AjaxResult }
     *
     */
//    @PreAuthorize("@ss.hasPermi('system:appointment:add')")
    @Log(title = "新增预约", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisHospitalAppointment hisHospitalAppointment)
    {
        System.out.println("数据是"+hisHospitalAppointment);
        Long deptsId = hisHospitalAppointment.getDeptsId();
        hisHospitalAppointmentService.updatedeptNum(deptsId);
        return toAjax(hisHospitalAppointmentService.insertHisHospitalAppointment(hisHospitalAppointment));
    }

}
