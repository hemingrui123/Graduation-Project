package com.kmxy.constant;

/**
 * 博客数据字典
 *
 */
public interface BlogDataDictionary {
    /*==============用户角色类型==================*/
    /**
     * 超级管理员
     */
    String USER_ROLE_SUPER_ADMIN = "1";
   
    /**
     * 普通用户
     */
    String USER_ROLE_GENERAL_USER = "2";


    /*==============用户状态==================*/
    /**
     * 正常
     */
    String USER_STATUS_NORMAL = "1";
    /**
     * 封禁
     */
    String USER_STATUS_BAN = "0";
}
