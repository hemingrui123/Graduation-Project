package com.kmxy.mapper;

import com.kmxy.entity.MessageExample;
import com.kmxy.pojo.MessageExtend;

import java.util.List;

/**
 * 留言扩展mapper
 *
 * 
 */
public interface MessageExtendMapper {
    /**
     * 功能描述: 分页获取留言信箱列表
     *
     * @return java.util.List<com.jicl.pojo.MessageExtend>
     * @author xianzilei
     * @date 2019/12/12 19:02
     **/
    List<MessageExtend> page(MessageExample messageExample);
}
