package com.kmxy.controller;

import com.kmxy.constant.BlogConstant;
import com.kmxy.entity.BlogExample;
import com.kmxy.entity.User;
import com.kmxy.pojo.TopTag;
import com.kmxy.service.BlogService;
import com.kmxy.service.TagService;
import com.kmxy.service.TypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * 标签管理
 *
 */
@Controller
public class TagShowController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private TagService tagService;

    @Autowired
    private TypeService typeService;

    /**
     * 功能描述: 标签页
     *
     * @param pageNum  1
     * @param pageSize 2
     * @param id       3
     * @param model    4
     * @return java.lang.String
     **/
    @GetMapping("/tags/{id}")
    public String tags(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue =
            "10") Integer pageSize, @PathVariable Integer id, Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        Integer userId = user == null ? null : user.getUserId();
        List<TopTag> tags = blogService.getTopTagList(10000);
        if (id == -1) {
        	System.out.println("list数组"+tags);
        	id = tags.get(0).getTagId();
        }
        model.addAttribute("tags", tags);
        BlogExample blogExample = new BlogExample();
        blogExample.createCriteria().andTagIdStrLike("%," + id + ",%").andPublishedEqualTo(true);
        blogExample.setOrderByClause("create_time desc");
        model.addAttribute("page", blogService.page(blogExample, pageNum, pageSize,userId));
        model.addAttribute("activeTagId", id);
        model.addAttribute("typeMap", typeService.getAllTypes());
        model.addAttribute("tagMap", tagService.getAllTags());
        return BlogConstant.TAGS_PAGE;
    }
    }

