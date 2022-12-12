package com.ruoyi.project.his.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.his.domain.HisDepts;
import com.ruoyi.project.his.domain.HisDeptsCare;
import com.ruoyi.project.his.mapper.HisDeptsCareMapper;
import com.ruoyi.project.his.mapper.HisDeptsMapper;
import com.ruoyi.project.his.service.IHisDeptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IHisDeptsServicelmpl implements IHisDeptsService {

    @Autowired
    private HisDeptsMapper hisDeptsMapper;
    @Autowired
    private HisDeptsCareMapper hisDeptsCareMapper;

    @Override
    public List<HisDepts> selectDeptsList(HisDepts hisDepts) {
        return hisDeptsMapper.selectDeptsList(hisDepts);
    }

    @Override
    public HisDepts selectHisDeptsById(Long deptsId) {
        return hisDeptsMapper.selectHisDeptsById(deptsId);
    }

    @Override
    public int insertHisDepts(HisDepts hisDepts) {
        return hisDeptsMapper.insertHisDepts(hisDepts);
    }

    @Override
    public List<HisDeptsCare> selectDeptsCareById(Long deptsId) {
        return hisDeptsCareMapper.selectHisDeptsCareById(deptsId);
    }

    @Override
    public List<HisDeptsCare> DeptsCareById(Long deptsCareId) {
        return hisDeptsCareMapper.DeptsCareById(deptsCareId);
    }

    @Override
    public HisDeptsCare HisDeptsCareById(Long deptsCareId) {
        return hisDeptsCareMapper.HisDeptsCareById(deptsCareId);
    }

    @Override
    public List<HisDeptsCare> selectHisDeptsCareList(HisDeptsCare hisDeptsCare) {
        return hisDeptsCareMapper.selectHisDeptsCareList(hisDeptsCare);
    }

    @Override
    public int updateHisDepts(HisDepts hisDepts) {
        hisDepts.setUpdateTime(DateUtils.getNowDate());
        return hisDeptsMapper.updateHisDepts(hisDepts);
    }

    @Override
    public int deleteHisDeptsByIds(Long[] deptsIds) {
        return hisDeptsMapper.deleteHisDeptsByIds(deptsIds);
    }

    @Override
    public int deleteHisDeptsById(Long deptsId) {
        return hisDeptsMapper.deleteHisDeptsById(deptsId);
    }

    @Override
    public int insertHisDeptsCare(HisDeptsCare hisDeptsCare)
    {
        return hisDeptsCareMapper.insertHisDeptsCare(hisDeptsCare);
    }

    @Override
    public int updateHisDeptsCare(HisDeptsCare hisDeptsCare) {
        return hisDeptsCareMapper.updateHisDeptsCare(hisDeptsCare);
    }


    /**
     * 批量删除【详细科室】
     */
    @Override
    public int deleteHisDeptsCareByIds(Long[] deptsCareIds)
    {
        return hisDeptsCareMapper.deleteHisDeptsCareByIds(deptsCareIds);
    }

    /**
     * 删除【详细科室】信息
     */
    @Override
    public int deleteHisDeptsCareById(Long deptsCareId)
    {
        return hisDeptsCareMapper.deleteHisDeptsCareById(deptsCareId);
    }

}
