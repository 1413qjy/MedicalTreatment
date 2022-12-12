package com.ruoyi.project.his.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.ruoyi.project.his.domain.HisAllExamine;
import com.ruoyi.project.his.domain.HisIndent;
import com.ruoyi.project.his.domain.HisRecord;
import com.ruoyi.project.his.domain.HisUserType;
import com.ruoyi.project.his.service.IHisAllExamineService;
import com.ruoyi.project.his.service.IHisIndentService;
import com.ruoyi.project.his.service.IHisRecordService;
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
 * 【我的病历】Controller
 * 
 * @author ruoyi
 * @date 2022-12-12
 */
@RestController
@RequestMapping("/his/record")
public class HisRecordController extends BaseController
{
    @Autowired
    private IHisRecordService hisRecordService;

    @Autowired
    private IHisAllExamineService hisAllExamineService;

    @Autowired
    private IHisUserTypeService hisUserTypeService;

    @Autowired
    private IHisIndentService hisIndentService;

    /**
     * 查询【我的病历】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:record:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisRecord hisRecord)
    {
        List<HisUserType> userList = hisUserTypeService.selectUserTypeList(hisRecord.getUserId());
        for (int i=0;i<userList.size();i++){
            if (hisRecord.getUserId().equals(userList.get(i).getUserId()) && (userList.get(i).getRoleId() == 1 || userList.get(i).getRoleId() == 100)){
                hisRecord.setUserId(null);
            }
        }
        startPage();
        List<HisRecord> list = hisRecordService.selectHisRecordList(hisRecord);
        return getDataTable(list);
    }

    /**
     * 导出【我的病历】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:record:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HisRecord hisRecord)
    {
        List<HisRecord> list = hisRecordService.selectHisRecordList(hisRecord);
        ExcelUtil<HisRecord> util = new ExcelUtil<HisRecord>(HisRecord.class);
        return util.exportExcel(list, "record");
    }

    /**
     * 获取【我的病历】详细信息
     */
//    @PreAuthorize("@ss.hasPermi('system:record:query')")
    @GetMapping(value = "/{recordId}")
    public AjaxResult getInfo(@PathVariable("recordId") Long recordId)
    {
        return AjaxResult.success(hisRecordService.selectHisRecordById(recordId));
    }

    /**
     * 新增【我的病历】
     */
//    @PreAuthorize("@ss.hasPermi('system:record:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisRecord hisRecord)
    {
        String examine = hisRecord.getExamine();
        String [] examines = new String[1];
        if (examine.contains(",")) {
            examines =  examine.split(",");
        } else if (examine.contains(" ")) {
            examines = examine.split(" ");
        } else {
            examines[0] = examine;
        }
        int i = 0;
        String [] arr = new String[10];
        String indetnNumber = UUID.randomUUID().toString().replaceAll("-","");
        for (String teleexamine : examines){
            arr[i] = teleexamine;
            i++;
            HisAllExamine hisAllExamine = new HisAllExamine();
            hisAllExamine.setName(hisRecord.getName());
            hisAllExamine.setExamineName(teleexamine);
            hisAllExamine.setUserId(hisRecord.getUserId());
            hisAllExamine.setIndentNumber(indetnNumber);
            int a = hisAllExamineService.insertHisAllExamine(hisAllExamine);
            System.out.println(teleexamine);
        }
        HisIndent indent = new HisIndent();
        Date date = new Date();
        indent.setIndentTime(date);
        indent.setIndentNumber(indetnNumber);
        indent.setIndentTitle("检查项目");
        indent.setIndentSum("600");
        indent.setIndentMode("未支付");
        indent.setUserId(hisRecord.getUserId());
        int a = hisIndentService.insertHisIndent(indent);
        System.out.println(arr);
        return toAjax(hisRecordService.insertHisRecord(hisRecord));
    }

    /**
     * 修改【我的病历】
     */
//    @PreAuthorize("@ss.hasPermi('system:record:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HisRecord hisRecord)
    {
        return toAjax(hisRecordService.updateHisRecord(hisRecord));
    }

    /**
     * 删除【我的病历】
     */
//    @PreAuthorize("@ss.hasPermi('system:record:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{recordIds}")
    public AjaxResult remove(@PathVariable Long[] recordIds)
    {
        return toAjax(hisRecordService.deleteHisRecordByIds(recordIds));
    }
}
