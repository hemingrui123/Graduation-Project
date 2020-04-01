package com.kmxy.mapper;

import org.apache.ibatis.annotations.Param;

import com.kmxy.pojo.CommentExtend;

import java.util.List;

/**
 * 评论管理扩展mapper
 *
 */
public interface CommentExtendMapper {
    /**
     * 功能描述: 获取评论信息列表
     *
     * @param blogId 1
     * @return java.util.List<com.kmxy.pojo.CommentExtend>
     **/
    public List<CommentExtend> getComments(@Param("blogId") Integer blogId);
}
