package com.ruoyi.project.his.mapper;

import com.ruoyi.project.his.domain.HisPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HisPostMapper {

    /**
     * 查询【请填写功能名称】列表
     *
     * @param hisPost 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<HisPost> selectHisPostList(HisPost hisPost);

    public HisPost selectHisPostById(Long postId);
}
