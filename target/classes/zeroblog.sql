/*
 Navicat Premium Data Transfer

 Source Server         : myblog
 Source Server Type    : MySQL
 Source Server Version : 100309
 Source Host           : localhost:3306
 Source Schema         : zeroblog

 Target Server Type    : MySQL
 Target Server Version : 100309
 File Encoding         : 65001

 Date: 19/03/2020 16:37:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_announcement
-- ----------------------------
DROP TABLE IF EXISTS `t_announcement`;
CREATE TABLE `t_announcement`  (
  `annc_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '公告id，主键',
  `annc_title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '公告标题',
  `annc_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '公告描述',
  `annc_content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '公告内容',
  `top_flag` bit(1) NOT NULL COMMENT '是否置顶',
  `published` bit(1) NOT NULL COMMENT '是否发布：0-草稿 1-发布',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  `del_flag` bit(1) NOT NULL COMMENT '删除标志：1-删除 0-未删除',
  `del_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`annc_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '公告表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_announcement
-- ----------------------------
INSERT INTO `t_announcement` VALUES (1, '这是一个公告，看过来', '1', '22v分v分v阿', b'1', b'1', '2020-03-15 15:33:06', '2020-03-17 20:47:43', b'1', '2020-03-17 23:28:02');
INSERT INTO `t_announcement` VALUES (2, '这是一个公告', '恶风无法', '使得烦烦烦烦烦烦烦烦烦烦烦烦烦烦烦烦烦烦', b'1', b'1', '2020-03-17 23:28:37', '2020-03-17 23:28:37', b'0', NULL);
INSERT INTO `t_announcement` VALUES (3, '跌幅为单位', '俄方违法', '恶风微蜂窝', b'1', b'1', '2020-03-17 23:28:50', '2020-03-17 23:28:50', b'0', NULL);

-- ----------------------------
-- Table structure for t_blog
-- ----------------------------
DROP TABLE IF EXISTS `t_blog`;
CREATE TABLE `t_blog`  (
  `blog_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '博主id，对应用户id',
  `blog_flag` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '博客标志：1-原创，2-转载，3-翻译',
  `blog_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '博客描述',
  `recommend` bit(1) NOT NULL COMMENT '是否推荐',
  `share_flag` bit(1) NOT NULL COMMENT '转载声明是否开启',
  `type_id` int(11) NULL DEFAULT NULL COMMENT '博客类型',
  `tag_id_str` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '博客标签字符串，格式：,1,2,3,4,5,',
  `first_picture_addr` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '首图地址',
  `published` bit(1) NOT NULL COMMENT '是否发布：0-草稿 1-发布',
  `blog_title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '博客标题',
  `blog_content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '博客内容',
  `blog_views` int(11) NOT NULL COMMENT '博客浏览次数',
  `appreciation_flag` bit(1) NOT NULL COMMENT '是否开启赞赏',
  `commentabled` bit(1) NOT NULL COMMENT '是否开启评论',
  `blog_comments` int(11) NOT NULL COMMENT '博客评论次数',
  `blog_likes` int(11) NOT NULL COMMENT '博客点赞次数',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  `del_flag` bit(1) NOT NULL COMMENT '删除标识',
  `del_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`blog_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_blog
-- ----------------------------
INSERT INTO `t_blog` VALUES (1, 1, '原创', '杀尽天下傻逼', b'0', b'1', 1, ',1,', 'https://hmr-myblog.oss-cn-beijing.aliyuncs.com/public/headr1.jpg', b'1', '博客开发开始', '是市场上出售', 1, b'0', b'1', 1, 0, '2020-03-14 22:42:15', '2020-03-14 22:58:33', b'0', NULL);
INSERT INTO `t_blog` VALUES (2, 2, '原创', 'vvv热v热', b'0', b'1', 2, ',2,', 'https://hmr-myblog.oss-cn-beijing.aliyuncs.com/public/headr1.jpg', b'1', '博客开发', '发v分v分', 8, b'0', b'0', 0, 1, '2020-03-14 23:08:45', '2020-03-18 12:50:02', b'0', NULL);
INSERT INTO `t_blog` VALUES (3, 2, '原创', '反反复复', b'1', b'1', 1, ',1,', 'https://hmr-myblog.oss-cn-beijing.aliyuncs.com/public/headr1.jpg', b'1', '感时花笺', '###### 当当的vv恶风阿达撒大网\r\n###### 1、的vDVDVC的v阿道夫违法违规v让', 2, b'1', b'1', 1, 0, '2020-03-15 14:14:35', '2020-03-17 10:56:06', b'1', '2020-03-17 10:56:06');
INSERT INTO `t_blog` VALUES (4, 3, '原创', '但是', b'0', b'1', 2, ',1,', 'https://hmr-myblog.oss-cn-beijing.aliyuncs.com/public/headr1.jpg', b'1', '我在空荡荡的房间拖着匹配的身体', '舒适的纯色的', 12, b'0', b'1', 1, 0, '2020-03-17 11:06:43', '2020-03-19 12:20:47', b'0', NULL);

-- ----------------------------
-- Table structure for t_blog_tag
-- ----------------------------
DROP TABLE IF EXISTS `t_blog_tag`;
CREATE TABLE `t_blog_tag`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `blog_id` int(11) NOT NULL COMMENT '博客id',
  `tag_id` int(11) NOT NULL COMMENT '标签id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_blog_tag
-- ----------------------------
INSERT INTO `t_blog_tag` VALUES (2, 1, 1);
INSERT INTO `t_blog_tag` VALUES (4, 3, 1);
INSERT INTO `t_blog_tag` VALUES (7, 4, 1);
INSERT INTO `t_blog_tag` VALUES (8, 2, 2);

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment`  (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `comment_content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '评论内容',
  `user_id` int(11) NOT NULL COMMENT '评论用户id',
  `blog_id` int(11) NOT NULL COMMENT '评论的博客id',
  `comment_time` datetime(0) NOT NULL COMMENT '评论时间',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  `del_flag` bit(1) NOT NULL COMMENT '删除标志：1-删除 0-未删除',
  `del_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`comment_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_comment
-- ----------------------------
INSERT INTO `t_comment` VALUES (1, '好的', 1, 1, '2020-03-14 22:42:40', '2020-03-14 22:42:40', '2020-03-14 22:42:40', b'0', NULL);
INSERT INTO `t_comment` VALUES (2, '发发发', 2, 3, '2020-03-15 14:15:00', '2020-03-15 14:15:00', '2020-03-15 14:15:00', b'0', NULL);
INSERT INTO `t_comment` VALUES (3, 'hao', 2, 4, '2020-03-18 10:24:02', '2020-03-18 10:24:02', '2020-03-18 10:24:02', b'0', NULL);

-- ----------------------------
-- Table structure for t_message
-- ----------------------------
DROP TABLE IF EXISTS `t_message`;
CREATE TABLE `t_message`  (
  `message_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `message_user_id` int(11) NOT NULL COMMENT '存储已经登录的用户id，否则为0',
  `message_nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '留言者昵称',
  `replied_user_id` int(11) NULL DEFAULT NULL COMMENT '被回复id，一级留言为空，二级留言游客为0',
  `replied_user_nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '被回复昵称，一级留言为空',
  `message_email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '留言者邮箱',
  `message_content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '留言内容',
  `message_level` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '留言等级：1-留言，2-对留言的回复',
  `parent_message_id` int(11) NOT NULL COMMENT '父留言id，没有上层为0',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  `del_flag` bit(1) NOT NULL COMMENT '删除标志：1-删除 0-未删除',
  `del_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`message_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_message
-- ----------------------------
INSERT INTO `t_message` VALUES (1, 1, 'hemingrui', NULL, NULL, '3103285129@qq.com', 'ggg', '1', 0, '2020-03-13 23:19:40', '2020-03-13 23:19:40', b'0', NULL);
INSERT INTO `t_message` VALUES (2, 1, 'hemingrui', NULL, NULL, '3103285129@qq.com', '当当', '1', 0, '2020-03-14 21:02:04', '2020-03-14 21:02:04', b'0', NULL);
INSERT INTO `t_message` VALUES (3, 1, 'hemingrui', 1, 'hemingrui', '3103285129@qq.com', '动次打次', '2', 1, '2020-03-14 21:02:09', '2020-03-14 21:02:09', b'0', NULL);
INSERT INTO `t_message` VALUES (4, 1, 'hemingrui', 1, 'hemingrui', '3103285129@qq.com', '当当', '2', 1, '2020-03-14 21:02:16', '2020-03-14 21:02:16', b'0', NULL);

-- ----------------------------
-- Table structure for t_reply
-- ----------------------------
DROP TABLE IF EXISTS `t_reply`;
CREATE TABLE `t_reply`  (
  `reply_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `comment_id` int(11) NOT NULL COMMENT '评论id',
  `reply_content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '回复内容',
  `user_id` int(11) NOT NULL COMMENT '回复的用户id',
  `reply_time` datetime(0) NOT NULL COMMENT '回复时间',
  `replied_user_id` int(11) NOT NULL COMMENT '被回复的用户id',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  `del_flag` bit(1) NOT NULL COMMENT '删除标志：1-删除 0-未删除',
  `del_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`reply_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_reply
-- ----------------------------
INSERT INTO `t_reply` VALUES (1, 3, 'haoshenm\n', 2, '2020-03-18 10:24:12', 2, '2020-03-18 10:24:12', '2020-03-18 10:24:12', b'0', NULL);

-- ----------------------------
-- Table structure for t_tag
-- ----------------------------
DROP TABLE IF EXISTS `t_tag`;
CREATE TABLE `t_tag`  (
  `tag_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tag_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '标签名',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  `del_flag` bit(1) NOT NULL COMMENT '删除标志：1-删除 0-未删除',
  `del_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`tag_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_tag
-- ----------------------------
INSERT INTO `t_tag` VALUES (1, '标签', '2020-03-14 08:14:25', '2020-03-14 08:14:29', b'0', '2020-03-14 08:14:35');
INSERT INTO `t_tag` VALUES (2, '开心', '2020-03-14 17:01:46', '2020-03-14 17:01:50', b'0', '2020-03-14 17:01:57');
INSERT INTO `t_tag` VALUES (3, '哈哈', '2020-03-17 20:46:36', '2020-03-17 20:46:36', b'0', NULL);

-- ----------------------------
-- Table structure for t_type
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type`  (
  `type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `type_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '类型名',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  `del_flag` bit(1) NOT NULL COMMENT '删除标志：1-删除 0-未删除',
  `del_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`type_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_type
-- ----------------------------
INSERT INTO `t_type` VALUES (1, '方法', '2020-03-14 17:02:27', '2020-03-14 17:02:31', b'0', '2020-03-14 17:02:46');
INSERT INTO `t_type` VALUES (2, '哈哈', '2020-03-14 22:40:00', '2020-03-14 22:40:03', b'0', '2020-03-14 22:40:08');
INSERT INTO `t_type` VALUES (3, '计算机', '2020-03-18 10:11:41', '2020-03-18 10:11:41', b'0', NULL);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '用户登录名',
  `nickname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '昵称',
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '登录密码',
  `user_gender` bit(1) NOT NULL COMMENT '用户性别：1-男，0-女',
  `user_role` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '角色类型：1-超级管理员；2-普通管理员；3-VIP用户；4-普通用户',
  `user_status` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '用户状态：0-封禁；1-正常',
  `telephone` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '联系方式',
  `email` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '邮箱',
  `head_portrait` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '用户头像',
  `register_time` datetime(0) NOT NULL COMMENT '注册时间',
  `last_login_time` datetime(0) NOT NULL COMMENT '最后登录时间',
  `last_login_ip` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '最后登录ip',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  `del_flag` bit(1) NOT NULL COMMENT '删除标识',
  `del_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (2, '15877801461', 'hemingrui', '8c81cf41c47fb33401bda080939f2809', b'1', '1', '1', '15877801461', '3103285129@qq.com', 'https://hmr-myblog.oss-cn-beijing.aliyuncs.com/public/headr1.jpg', '2020-03-14 10:56:19', '2020-03-19 15:09:28', '0:0:0:0:0:0:0:1', '2020-03-14 10:56:19', '2020-03-17 22:59:19', b'0', NULL);
INSERT INTO `t_user` VALUES (3, '13708688443', 'hemingrui', '8c81cf41c47fb33401bda080939f2809', b'0', '1', '1', '13708688443', '3103285129@qq.com', 'https://hmr-myblog.oss-cn-beijing.aliyuncs.com/public/headr1.jpg', '2020-03-15 15:27:22', '2020-03-17 11:05:18', '0:0:0:0:0:0:0:1', '2020-03-15 15:27:22', '2020-03-15 15:27:22', b'0', NULL);
INSERT INTO `t_user` VALUES (4, 'wx', '小武哥', 'e10adc3949ba59abbe56e057f20f883e', b'1', '2', '1', '', '1176553152@qq.com', 'https://hmr-myblog.oss-cn-beijing.aliyuncs.com/public/headr1.jpg', '2020-03-15 16:52:16', '2020-03-15 16:55:04', '127.0.0.1', '2020-03-15 16:52:16', '2020-03-15 16:52:16', b'0', NULL);
INSERT INTO `t_user` VALUES (6, '15877801461', 'hemingrui', '8c81cf41c47fb33401bda080939f2809', b'1', '2', '1', '15877801461', '3103285129@qq.com', 'https://hmr-myblog.oss-cn-beijing.aliyuncs.com/public/headr1.jpg', '2020-03-19 15:09:16', '2020-03-19 15:09:16', '0:0:0:0:0:0:0:1', '2020-03-19 15:09:16', '2020-03-19 15:09:16', b'0', NULL);

SET FOREIGN_KEY_CHECKS = 1;
