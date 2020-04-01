package com.kmxy.service;

import com.github.pagehelper.PageInfo;
import com.kmxy.entity.Announcement;
import com.kmxy.entity.AnnouncementExample;

/**
 * 公告管理服务层接口
 *
 
 */
public interface AnnouncementService {
    /**
     * 功能描述: 分页查询公告信息
     *
     * @param pageNum  1
     * @param pageSize 2
     * @return com.github.pagehelper.PageInfo<com.kmxy.entity.Announcement>
     * 
     **/
    PageInfo<Announcement> page(Integer pageNum, Integer pageSize);

    /**
     * 功能描述: 公告详情查看
     *
     * @param id 1
     * @return com.kmxy.entity.Announcement
     * 
     * @date 2019/12/24 8:36
     **/
    Announcement getAnnc(Integer id);

    /**
     * 功能描述: 分页查询公告信息（自定义查询条件）
     *
     * @param announcementExample 1
     * @param pageNum             2
     * @param pageSize            3
     * @return com.github.pagehelper.PageInfo<com.kmxy.entity.Announcement>
     * 
     * @date 2019/12/25 12:12
     **/
    PageInfo<Announcement> page(AnnouncementExample announcementExample, Integer pageNum, Integer pageSize);

    /**
     * 功能描述: 主键查询
     *
     * @param id 1
     * @return com.kmxy.entity.Announcement
     * 
     * @date 2019/12/25 14:00
     **/
    Announcement findOne(Integer id);

    /**
     * 功能描述: 删除公告信息
     *
     * @param id 1
     * @return void
     * 
     * @date 2019/12/25 14:06
     **/
    void deleteAnnouncement(Integer id);

    /**
     * 功能描述: 更新公告信息
     *
     * @param announcement 1
     * @return void
     * 
     * @date 2019/12/25 14:20
     **/
    void saveAnnouncement(Announcement announcement);
}
