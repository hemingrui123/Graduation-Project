package com.kmxy.interceptor;

import com.kmxy.constant.BlogDataDictionary;
import com.kmxy.entity.User;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器
 *
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        String url = request.getRequestURL().toString();
        String redirectUrl = null;
        if (url.contains("/admin")) {
            redirectUrl = "/admin/toAdminLoginPage";
        } else {
            redirectUrl = "/user/toLoginPage";
        }
        if (request.getSession().getAttribute("user") != null) {
            User user = (User) request.getSession().getAttribute("user");
            if (StringUtils.equalsAny(user.getUserRole(), BlogDataDictionary.USER_ROLE_SUPER_ADMIN) && url.contains("/admin")) {
                return true;
            } else if (StringUtils.equalsAny(user.getUserRole(),BlogDataDictionary.USER_ROLE_GENERAL_USER) && !url.contains("/admin")) {
                return true;
            }
        }
        response.sendRedirect(redirectUrl);
        return false;
    }
}
