package com.kmxy.controller;

import com.kmxy.constant.BlogConstant;
import com.kmxy.entity.User;
import com.kmxy.service.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 留言控制层
 *
 */
@Controller
public class MessageShowController {

    @Autowired
    private MessageService messageService;

    /**
     * 功能描述: 跳转留言页
     *
     * @return java.lang.String
     **/
    @GetMapping("/toMessagePage")
    public String toMessagePage(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                                Model model) {
        model.addAttribute("page", messageService.page(pageNum, pageSize));
        return BlogConstant.MESSAGE_PAGE;
    }

    @GetMapping("/getMessages")
    public String getMessages(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                              @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                              Model model) {
        model.addAttribute("page", messageService.page(pageNum, pageSize));
        return "messages::messageList";
    }

    @ResponseBody
    @PostMapping("/messages")
    public void addMessage(String nickname, String email, String content, HttpSession session) {
        User user = (User) session.getAttribute("user");
        messageService.addMessage(nickname, email, content, user);
    }

    /**
     * 功能描述: 新增留言的回复
     *
     * @param nickname            1
     * @param email               2
     * @param content             3
     * @param messageId           4
     * @param repliedUserId       5
     * @param repliedUserNickname 6
     * @param session             7
     * @return void
     **/
    @ResponseBody
    @PostMapping("/addMessageReply")
    public void addMessageReply(String nickname, String email, String content, Integer messageId,
                                Integer repliedUserId, String repliedUserNickname,
                                HttpSession session) {
        User user = (User) session.getAttribute("user");
        messageService.addMessageReply(nickname, email, content, messageId, repliedUserId, repliedUserNickname, user);
    }
}
