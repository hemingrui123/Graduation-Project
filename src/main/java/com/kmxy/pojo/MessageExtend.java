package com.kmxy.pojo;

import lombok.Data;

import java.util.List;

import com.kmxy.entity.Message;

/**
 * 留言扩展类
 *
 */
@Data
public class MessageExtend extends Message {
    /**
     * 留言的回复数
     */
    private long replyNums;
    /**
     * 回复列表
     */
    private List<Message> replyList;
}
