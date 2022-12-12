package com.ruoyi.project.his.controller;

import java.util.List;

import com.ruoyi.project.his.domain.HisAllExamine;
import com.ruoyi.project.his.domain.HisUserType;
import com.ruoyi.project.his.service.IHisAllExamineService;
import com.ruoyi.project.his.service.IHisUserTypeService;
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
 * 【全部检查项目】Controller
 * 
 * @author ruoyi
 * @date 2022-12-12
 */
@RestController
@RequestMapping("/his/allExamine")
public class HisAllExamineController extends BaseController
{
    @Autowired
    private IHisAllExamineService hisAllExamineService;

    @Autowired
    private IHisUserTypeService hisUserTypeService;
    /**
     * 查询【全部检查项目】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:examine:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisAllExamine hisAllExamine)
    {
        List<HisUserType> userList = hisUserTypeService.selectUserTypeList(hisAllExamine.getUserId());
        for (int i=0;i<userList.size();i++){
            if (hisAllExamine.getUserId().equals(userList.get(i).getUserId()) && (userList.get(i).getRoleId() == 1 || userList.get(i).getRoleId() == 100)){
                hisAllExamine.setUserId(null);
            }
        }
        startPage();
        List<HisAllExamine> list = hisAllExamineService.selectHisAllExamineList(hisAllExamine);
        return getDataTable(list);
    }

    /**
     * 导出【全部检查项目】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:examine:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HisAllExamine hisAllExamine)
    {
        List<HisAllExamine> list = hisAllExamineService.selectHisAllExamineList(hisAllExamine);
        ExcelUtil<HisAllExamine> util = new ExcelUtil<HisAllExamine>(HisAllExamine.class);
        return util.exportExcel(list, "examine");
    }

    /**
     * 获取【全部检查项目】详细信息
     */
//    @PreAuthorize("@ss.hasPermi('system:examine:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(hisAllExamineService.selectHisAllExamineById(id));
    }

    /**
     * 新增【检查项目】
     */
//    @PreAuthorize("@ss.hasPermi('system:examine:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisAllExamine hisAllExamine)
    {
        return toAjax(hisAllExamineService.insertHisAllExamine(hisAllExamine));
    }

    /**
     * 修改【检查项目】
     */
//    @PreAuthorize("@ss.hasPermi('system:examine:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HisAllExamine hisAllExamine)
    {
        return toAjax(hisAllExamineService.updateHisAllExamine(hisAllExamine));
    }

    /**
     * 删除【检查项目】
     */
//    @PreAuthorize("@ss.hasPermi('system:examine:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(hisAllExamineService.deleteHisAllExamineByIds(ids));
    }
}
