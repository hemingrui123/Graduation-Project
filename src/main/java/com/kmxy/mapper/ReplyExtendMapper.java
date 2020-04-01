package com.kmxy.mapper;

import org.apache.ibatis.annotations.Param;

import com.kmxy.pojo.ReplyExtend;

import java.util.List;

/**
 * 回复管理扩展mapper
 *
 *
 */
public interface ReplyExtendMapper {
    /**
     * 功能描述: 获取回复列表
     *
     * @param commentId 1
     * @return java.util.List<com.jicl.pojo.ReplyExtend>
     **/
    List<ReplyExtend> getReplys(@Param("commentId") Integer commentId);
}
