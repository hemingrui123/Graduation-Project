package com.kmxy.mapper;

import com.kmxy.entity.BlogTag;
import com.kmxy.entity.BlogTagExample;
import com.kmxy.pojo.TopTag;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogTagExtendMapper {

    /**
     * 功能描述: 查询指定数量的top标签的博客数
     *
     * @param topSize 1
     * @return java.util.List<com.kmxy.pojo.TopTag>
     **/
    List<TopTag> getTopTagList(Integer topSize);
}