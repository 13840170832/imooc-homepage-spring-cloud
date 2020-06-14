/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : imooc_homepage_sc

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2020-06-14 23:07:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for homepage_course
-- ----------------------------
DROP TABLE IF EXISTS `homepage_course`;
CREATE TABLE `homepage_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增 id',
  `course_name` varchar(128) NOT NULL DEFAULT '' COMMENT '课程名称',
  `course_type` varchar(128) NOT NULL DEFAULT '' COMMENT '课程类型',
  `course_icon` varchar(128) NOT NULL DEFAULT '' COMMENT '课程图标',
  `course_intro` varchar(128) NOT NULL DEFAULT '' COMMENT '课程介绍',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 08:00:00' COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 08:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `key_course_name` (`course_name`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='课程表';

-- ----------------------------
-- Records of homepage_course
-- ----------------------------
INSERT INTO `homepage_course` VALUES ('6', 'JAVA全栈课', '0', 'https://www.imooc.com', '电商小程序JAVA全栈课', '2020-06-14 16:11:27', '2020-06-14 16:11:27');
INSERT INTO `homepage_course` VALUES ('7', 'SpringCloud微服务架构', '1', 'https://www.imooc.com/', '基于SpringCloud框架实现慕课网主页后端开发', '2020-06-14 16:11:27', '2020-06-14 16:11:27');
INSERT INTO `homepage_course` VALUES ('11', 'JAVA全栈课二期', '0', 'https://www.imooc.com', '电商小程序JAVA全栈课升级', '2020-06-14 16:18:31', '2020-06-14 16:18:31');
INSERT INTO `homepage_course` VALUES ('12', 'SpringCloud实现前后端分离项目', '1', 'https://www.imooc.com/', '基于SpringCloud框架实现慕课网主页后端开发', '2020-06-14 16:18:32', '2020-06-14 16:18:32');

-- ----------------------------
-- Table structure for homepage_user
-- ----------------------------
DROP TABLE IF EXISTS `homepage_user`;
CREATE TABLE `homepage_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增 id',
  `username` varchar(128) NOT NULL DEFAULT '' COMMENT '用户名',
  `email` varchar(128) NOT NULL DEFAULT '' COMMENT '用户邮箱',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 08:00:00' COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 08:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `key_username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='用户信息表';

-- ----------------------------
-- Records of homepage_user
-- ----------------------------

-- ----------------------------
-- Table structure for homepage_user_course
-- ----------------------------
DROP TABLE IF EXISTS `homepage_user_course`;
CREATE TABLE `homepage_user_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增 id',
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '用户 id',
  `course_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '课程 id',
  `create_time` datetime NOT NULL DEFAULT '1970-01-01 08:00:00' COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 08:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `key_user_course` (`user_id`,`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='用户课程表';

-- ----------------------------
-- Records of homepage_user_course
-- ----------------------------
