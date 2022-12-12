package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisIndent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HisIndentMapper {

    /**
     * 新增【订单】
     */
    public int insertHisIndent(HisIndent hisIndent);

    /**
     * 查询【当前登录账户订单】详细信息
     */
    public List<HisIndent> selectHisIndentById(Long userId);

    /**
     * 修改【支付成功后修改订单支付状态】详细信息
     */
    public int updateHisIndent(String indentNumber);

    public int deleteOvertimeIndent();

    public List<HisIndent> selectHisIndentList(HisIndent hisIndent);
}
