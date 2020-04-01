package com.kmxy.vo;

import lombok.Data;
import java.util.List;

import com.kmxy.entity.Blog;
import com.kmxy.entity.BlogTag;


/**
 * 博客信息vo
 *
 */
@Data
public class BlogVo extends Blog {
    /**
     * 博客作者昵称
     */
    private String nickname;


    /**
     * 博客作者头像
     */
    private String headPortrait;

    /**
     * 当前登录用户是否点赞过
     */
    private Boolean flag;

    /**
     * 博客标签列表
     */
    private List<BlogTag> tags;
}
