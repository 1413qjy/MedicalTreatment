package com.ruoyi.project.his.service;

import com.ruoyi.project.his.domain.HisIndent;

import java.util.List;

/**
 * 订单服务接口
 * @author hct
 * @date:  9:52
 * @return {@link null }
 */
public interface IHisIndentService {

    /**
     * 新增【订单】
     */
    public int insertHisIndent(HisIndent hisIndent);

    /**
     * 查询【当前登录账户订单】详细信息
     */
    public List<HisIndent> selectHisIndentById(Long userId);

    /**
     * 查询【当前登录账户订单,有分页】详细信息
     */
    public List<HisIndent> selectIndentList(HisIndent hisIndent);

    /**
     * 修改【支付成功后修改订单支付状态】详细信息
     */
    public int updateHisIndent(String indentNumber);

    /**
     * 删除【删除超时订单】
     */
    public int deleteOvertimeIndent();

}
