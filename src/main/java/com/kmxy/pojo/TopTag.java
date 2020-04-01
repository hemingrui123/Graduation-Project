package com.kmxy.pojo;

import lombok.Builder;
import lombok.Data;

/**
 * 首页标签排行榜
 *
 
 */
@Data
@Builder
public class TopTag {
    /**
     * 标签id
     */
    private Integer tagId;
    /**
     * 标签名
     */
    private String tagName;
    /**
     * 标签下对应的博客数目
     */
    private Integer blogNums;
}
