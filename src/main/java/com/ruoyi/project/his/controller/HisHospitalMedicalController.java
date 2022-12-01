package com.ruoyi.project.his.controller;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.his.domain.*;
import com.ruoyi.project.his.service.IHisHospitalMedicalService;
import com.ruoyi.project.his.service.IHisRegSumService;
//import com.ruoyi.project.his.utils.JsonConvertUtilS;
import com.ruoyi.project.his.utils.MinioUtilS;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.web.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2022-11-22
 */
@RestController
@Slf4j
@RequestMapping("/his/medical")
public class HisHospitalMedicalController extends BaseController
{
    @Autowired
    private IHisHospitalMedicalService hisHospitalMedicalService;
    @Autowired
    private MinioUtilS minioUtilS;
    @Value("${minio.endpoint}")
    private String address;
    @Value("${minio.bucketName}")
    private String bucketName;
    @Autowired
    private IHisRegSumService hisRegSumService;
//    @Autowired
//    private JsonConvertUtilS jsonConvertUtilS;

    /**
     * 查询【医生】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:medical:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisHospitalMedical hisHospitalMedical)
    {
        startPage();
        List<HisHospitalMedical> list = hisHospitalMedicalService.selectHisHospitalMedicalList(hisHospitalMedical);
        return getDataTable(list);
    }

    /**
     * 获取【医生】详细信息
     */
//    @PreAuthorize("@ss.hasPermi('his:medical:query')")
    @GetMapping(value = "/{medicalId}")
    public AjaxResult getInfo(@PathVariable("medicalId") Long medicalId)
    {
        return AjaxResult.success(hisHospitalMedicalService.selectHisHospitalMedicalById(medicalId));
    }

    /**
     * 新增【医生信息】
     */
//    @PreAuthorize("@ss.hasPermi('system:medical:add')")
    @Log(title = "新增【医生信息】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HisHospitalMedical hisHospitalMedical)
    {
        return toAjax(hisHospitalMedicalService.insertHisHospitalMedical(hisHospitalMedical));
    }

    /**
     * 修改【医生信息】
     */
//    @PreAuthorize("@ss.hasPermi('system:medical:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HisHospitalMedical hisHospitalMedical)
    {
        return toAjax(hisHospitalMedicalService.updateHisHospitalMedical(hisHospitalMedical));
    }

    /**
     * 删除【医生】
     */
//    @PreAuthorize("@ss.hasPermi('system:medical:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{medicalIds}")
    public AjaxResult remove(@PathVariable Long[] medicalIds)
    {
        return toAjax(hisHospitalMedicalService.deleteHisHospitalMedicalByIds(medicalIds));
    }

    /**
     * 查询【职位】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:post:list')")
    @GetMapping("/postList")
    public TableDataInfo postList(HisPost hisPost)
    {
        startPage();
        List<HisPost> list = hisHospitalMedicalService.selectHisPostList(hisPost);
        return getDataTable(list);
    }

    /**
     * 上传图片的方法
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public Object upload(MultipartFile file){
        List<String> upload = minioUtilS.upload(new MultipartFile[]{file});
        return address+"/"+bucketName+"/"+upload.get(0);
    }

    /**
     * 简述 根据条件查询预约
     * @author 写你自己的名字一般都是英文不可以汉字
     * @date:  9:34
     * @param appintmentFilter
     * @return {@link List<  T > }
     *
     */
    @Log(title = "根据条件查询预约", businessType = BusinessType.OTHER)
    @PostMapping("/at")
    public TableDataInfo selectAppointment(@RequestBody AppintmentFilter appintmentFilter) {
        System.out.println(appintmentFilter);
        startPage();
        List<HisHospitalMedical> hislist = hisHospitalMedicalService.selectAtList(appintmentFilter);
        return getDataTable(hislist);
    }

//    查询医生的挂号量
    @GetMapping("/regSumlist")
    public TableDataInfo regSumlistlist(HisRegSum hisRegSum)
    {
        startPage();
        List<HisRegSum> list = hisRegSumService.selectHisRegSumList(hisRegSum);
        return getDataTable(list);
    }
}
