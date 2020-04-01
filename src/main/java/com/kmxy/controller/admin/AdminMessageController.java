package com.kmxy.controller.admin;

import com.kmxy.entity.MessageExample;
import com.kmxy.service.MessageService;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

/**
 * 留言管理：管理员
 *
 */
@Slf4j
@Controller
@RequestMapping("/admin")
public class AdminMessageController {
    /**
     * 留言等级对应map
     */
    private static Map<String, String> messageLevelMap = new HashMap<>();

    static {
        messageLevelMap.put("1", "留言");
        messageLevelMap.put("2", "回复");
    }

    @Autowired
    private MessageService messageService;

    /**
     * 功能描述: 留言查询
     *
     * @param pageNum  1
     * @param pageSize 2
     * @param model    3
     * @return java.lang.String
     **/
    @GetMapping("/toMessagePage")
    public String toMessagePage(@RequestParam(defaultValue = "1") Integer pageNum,
                                @RequestParam(defaultValue = "10") Integer pageSize, Model model) {
        MessageExample messageExample = new MessageExample();
        messageExample.createCriteria().andDelFlagEqualTo(false);
        messageExample.setOrderByClause("create_time desc");
        model.addAttribute("page", messageService.page(messageExample, pageNum, pageSize));
        model.addAttribute("messageLevelMap", messageLevelMap);
        return "admin/messages";
    }

    /**
     * 功能描述: 留言搜索
     *
     * @return java.lang.String
     **/
    @PostMapping("/messages/search")
    public String search(@RequestParam(defaultValue = "1") Integer pageNum,
                         @RequestParam(defaultValue = "10") Integer pageSize,
                         String messageLevel, Model model) {
        MessageExample messageExample = new MessageExample();
        MessageExample.Criteria criteria = messageExample.createCriteria().andDelFlagEqualTo(false);
        messageExample.setOrderByClause("create_time desc");
        if (StringUtils.isNotBlank(messageLevel)) {
            criteria.andMessageLevelEqualTo(messageLevel);
        }
        model.addAttribute("messageLevelMap", messageLevelMap);
        model.addAttribute("page", messageService.page(messageExample, pageNum, pageSize));
        return "admin/messages:: messageList";
    }
    
    /**
     * 功能描述: 删除留言
     *
     * @param id 1
     * @return void
    
     **/
    @GetMapping("/messages/{id}/delete")
    public String deleteUser(@PathVariable Integer id, RedirectAttributes attributes) {
    	try {
            attributes.addFlashAttribute("message", "删除成功");
            messageService.deleteMessage(id);
        } catch (Exception e) {
            log.error("删除失败", e);
            attributes.addFlashAttribute("message", "删除失败");
        }
        return "redirect:/admin/toMessagePage";
    }
}
