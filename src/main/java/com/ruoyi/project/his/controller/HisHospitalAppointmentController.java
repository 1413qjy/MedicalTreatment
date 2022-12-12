package com.ruoyi.project.his.controller;

import java.util.List;

import com.ruoyi.project.his.domain.AppintmentFilter;
import com.ruoyi.project.his.domain.HisHospital;
import com.ruoyi.project.his.domain.HisHospitalAppointment;
import com.ruoyi.project.his.domain.HisUserType;
import com.ruoyi.project.his.service.IHisHospitalAppointmentService;
import com.ruoyi.project.his.service.IHisUserTypeService;
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

    @Autowired
    private IHisUserTypeService hisUserTypeService;

    /**
     * 查询【获取已经预约的预约信息】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:appointment:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisHospitalAppointment hisHospitalAppointment)
    {
        System.out.println(hisHospitalAppointment);
        List<HisUserType> userList = hisUserTypeService.selectUserTypeList(hisHospitalAppointment.getUserId());
        for (int i=0;i<userList.size();i++){
            if (hisHospitalAppointment.getUserId().equals(userList.get(i).getUserId()) && (userList.get(i).getRoleId() == 1 || userList.get(i).getRoleId() == 100)){
                hisHospitalAppointment.setUserId(null);
            }
        }
        startPage();
        List<HisHospitalAppointment> list = hisHospitalAppointmentService.selectHisHospitalAppointmentList(hisHospitalAppointment);
        return getDataTable(list);
    }

    /**
     * 获取医院和科室的信息
     */
    @GetMapping("/message")
    public TableDataInfo message(HisHospital hisHospital){
        List<HisHospital> list = hisHospitalAppointmentService.selectHospitalMessage(hisHospital);
        return getDataTable(list);
    }

    /**
     * 新增预约信息
     */
//    @PreAuthorize("@ss.hasPermi('system:appointment:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisHospitalAppointment hisHospitalAppointment)
    {
        return toAjax(hisHospitalAppointmentService.insertHisHospitalAppointment(hisHospitalAppointment));
    }

    /**
     * 修改预约信息
     */
//    @PreAuthorize("@ss.hasPermi('system:appointment:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HisHospitalAppointment hisHospitalAppointment)
    {
        return toAjax(hisHospitalAppointmentService.updateHisHospitalAppointment(hisHospitalAppointment));
    }

    /**
     * 删除预约信息
     */
//    @PreAuthorize("@ss.hasPermi('system:appointment:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{appointmentIds}")
    public AjaxResult remove(@PathVariable Long[] appointmentIds)
    {
        return toAjax(hisHospitalAppointmentService.deleteHisHospitalAppointmentByIds(appointmentIds));
    }

}
