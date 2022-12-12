package com.ruoyi.project.his.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.his.domain.HisIndent;
import com.ruoyi.project.his.domain.HisUserType;
import com.ruoyi.project.his.service.IHisIndentService;
import com.ruoyi.project.his.service.IHisUserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 【订单操作类】Controller
 * @date 2022-12-07
 */
@RestController
@RequestMapping("/his/indent")
public class HisIndentController extends BaseController {

    @Autowired
    private IHisIndentService hisIndentService;

    @Autowired
    private IHisUserTypeService hisUserTypeService;

    /**
     * 查询【当前登录账户订单】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:indent:list')")
    @GetMapping("/list")
    public TableDataInfo list(HisIndent hisIndent)
    {
        List<HisUserType> userList = hisUserTypeService.selectUserTypeList(hisIndent.getUserId());
        for (int i=0;i<userList.size();i++){
            if (hisIndent.getUserId().equals(userList.get(i).getUserId()) && (userList.get(i).getRoleId() == 1 || userList.get(i).getRoleId() == 100)){
                hisIndent.setUserId(null);
            }
        }
        startPage();
        List<HisIndent> list = hisIndentService.selectIndentList(hisIndent);
        return getDataTable(list);
    }

    /**
     * 查询【当前登录账户订单】详细信息
     */
//    @PreAuthorize("@ss.hasPermi('his:indent:query')")
    @GetMapping(value = "/{userId}")
    public TableDataInfo getInfo(@PathVariable("userId") Long userId) {
        startPage();
        List<HisIndent> list = hisIndentService.selectHisIndentById(userId);
        return getDataTable(list);
    }


    @Scheduled(cron ="0/10 * * * * ?")
    public int deleteOvertimeIndent(){
        int result = hisIndentService.deleteOvertimeIndent();
//        System.out.println("这是一个订时任务");
        return 0;
    }


}
