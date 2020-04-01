package com.kmxy.controller;

import com.kmxy.constant.BlogConstant;
import com.kmxy.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 归档管理
 *
 */
@Controller
public class ArchiveController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/archives")
    public String archives(Model model) {
        model.addAttribute("archiveMap", blogService.archiveBlog(null));
        model.addAttribute("blogCount", blogService.countBlog(null));
        return BlogConstant.ARCHIVES_PAGE;
    }
}
