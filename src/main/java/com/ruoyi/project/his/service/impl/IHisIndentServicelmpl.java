package com.ruoyi.project.his.service.impl;

import com.ruoyi.project.his.domain.HisIndent;
import com.ruoyi.project.his.mapper.HisIndentMapper;
import com.ruoyi.project.his.service.IHisIndentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单服务接口实现类
 * @author hct
 * @date:  9:52
 * @return {@link null }
 *
 */
@Service
public class IHisIndentServicelmpl implements IHisIndentService {

    @Autowired
    private HisIndentMapper hisIndentMapper;

    /**
     * 新增【订单】
     */
    @Override
    public int insertHisIndent(HisIndent hisIndent) {
        return hisIndentMapper.insertHisIndent(hisIndent);
    }

    /**
     * 查询【当前登录账户订单】详细信息
     */
    @Override
    public List<HisIndent> selectHisIndentById(Long userId) {
        return hisIndentMapper.selectHisIndentById(userId);
    }

    /**
     * 查询【当前登录账户订单】详细信息
     */
    @Override
    public List<HisIndent> selectIndentList(HisIndent hisIndent) {
        return hisIndentMapper.selectHisIndentList(hisIndent);
    }

    /**
     * 修改【支付成功后修改订单支付状态】详细信息
     */
    @Override
    public int updateHisIndent(String indentNumber) {
        return hisIndentMapper.updateHisIndent(indentNumber);
    }

    @Override
    public int deleteOvertimeIndent() {
        return hisIndentMapper.deleteOvertimeIndent();
    }
}
