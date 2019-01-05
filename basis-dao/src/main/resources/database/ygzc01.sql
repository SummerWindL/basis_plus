/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : ygzc01

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2018-06-13 14:01:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for air_table
-- ----------------------------
DROP TABLE IF EXISTS `air_table`;
CREATE TABLE `air_table` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `SERIAL` int(11) unsigned NOT NULL COMMENT '序号',
  `BRAND_CN` varchar(12) NOT NULL COMMENT '中文品牌',
  `BRAND_EN` varchar(33) NOT NULL COMMENT '英文品牌',
  `MODEL` char(8) NOT NULL COMMENT '型号',
  `PINYIN` varchar(9) NOT NULL COMMENT '拼音',
  `CODE` char(90) NOT NULL COMMENT '码库',
  PRIMARY KEY (`ID`),
  KEY `air_table_BRAND_CN` (`BRAND_CN`),
  KEY `air_table_MODEL` (`MODEL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='遥控空气净化器码表';

-- ----------------------------
-- Records of air_table
-- ----------------------------

-- ----------------------------
-- Table structure for application
-- ----------------------------
DROP TABLE IF EXISTS `application`;
CREATE TABLE `application` (
  `id` varchar(36) NOT NULL COMMENT '应用id',
  `uid` varchar(36) NOT NULL,
  `app_name` varchar(50) NOT NULL,
  `flag` int(11) NOT NULL DEFAULT '0' COMMENT '标志位',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_user` varchar(36) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_user` varchar(36) NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='应用记录表';

-- ----------------------------
-- Records of application
-- ----------------------------

-- ----------------------------
-- Table structure for application_gateway
-- ----------------------------
DROP TABLE IF EXISTS `application_gateway`;
CREATE TABLE `application_gateway` (
  `id` varchar(36) NOT NULL COMMENT '应用网关id',
  `uid` varchar(36) NOT NULL COMMENT '用户id',
  `hard_gateway_id` varchar(36) NOT NULL COMMENT '设备初始化（intelligent_hardware）id',
  `uniq_id` varchar(16) NOT NULL COMMENT '二维码',
  `gateway_name` varchar(50) NOT NULL COMMENT '网关名称',
  `online` int(11) NOT NULL DEFAULT '0' COMMENT '在线标准 0 不在线  1  在线',
  `application_id` varchar(36) NOT NULL COMMENT '应用id',
  `application_place_id` varchar(36) NOT NULL DEFAULT '0' COMMENT '0代表未分区',
  `create_date` datetime NOT NULL,
  `create_user` varchar(36) NOT NULL,
  `update_date` datetime NOT NULL,
  `update_user` varchar(36) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='应用网关记录表';

-- ----------------------------
-- Records of application_gateway
-- ----------------------------

-- ----------------------------
-- Table structure for application_linkage
-- ----------------------------
DROP TABLE IF EXISTS `application_linkage`;
CREATE TABLE `application_linkage` (
  `id` varchar(36) NOT NULL COMMENT '应用联动id',
  `application_id` varchar(36) NOT NULL COMMENT '应用id',
  `linkage_name` varchar(80) NOT NULL COMMENT '联动名称',
  `linkage_picture` varchar(50) DEFAULT NULL,
  `order` int(11) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='应用联动记录表';

-- ----------------------------
-- Records of application_linkage
-- ----------------------------

-- ----------------------------
-- Table structure for application_node
-- ----------------------------
DROP TABLE IF EXISTS `application_node`;
CREATE TABLE `application_node` (
  `id` varchar(36) NOT NULL COMMENT '设备终端id',
  `uniq_id` varchar(16) NOT NULL,
  `hard_node_id` varchar(36) DEFAULT '0' COMMENT '节点对应intelligent_hardware的id',
  `application_id` varchar(36) NOT NULL,
  `application_gateway_id` varchar(36) DEFAULT '0' COMMENT '0代表没有网关,直接连接服务器',
  `type_id` int(11) NOT NULL COMMENT '设备类型id',
  `series_id` int(11) NOT NULL COMMENT '设备系列id',
  `max_num` int(11) NOT NULL DEFAULT '1' COMMENT '最大连接数',
  `node_name` varchar(50) NOT NULL COMMENT '终端名字',
  `is_flag` int(11) NOT NULL COMMENT '保留字段',
  `application_place_id` varchar(36) DEFAULT '0',
  `create_user` varchar(36) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_user` varchar(36) NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='应用节点记录表';

-- ----------------------------
-- Records of application_node
-- ----------------------------

-- ----------------------------
-- Table structure for application_place
-- ----------------------------
DROP TABLE IF EXISTS `application_place`;
CREATE TABLE `application_place` (
  `id` varchar(36) NOT NULL COMMENT '应用区域 id',
  `application_id` varchar(36) NOT NULL,
  `father_id` varchar(36) DEFAULT '0' COMMENT '位置父id,0代表顶级目录',
  `place_name` varchar(255) NOT NULL COMMENT '区域名称',
  `grade` int(11) NOT NULL DEFAULT '0' COMMENT '别级',
  `order` int(11) NOT NULL DEFAULT '0' COMMENT ' 排序号',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_user` varchar(36) NOT NULL,
  `create_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='应用区域记录表';

-- ----------------------------
-- Records of application_place
-- ----------------------------

-- ----------------------------
-- Table structure for application_scene
-- ----------------------------
DROP TABLE IF EXISTS `application_scene`;
CREATE TABLE `application_scene` (
  `id` varchar(36) NOT NULL,
  `application_id` varchar(36) NOT NULL,
  `scene_name` varchar(30) NOT NULL,
  `scene_picture` varchar(26) DEFAULT NULL COMMENT '情景图片',
  `order` int(11) NOT NULL DEFAULT '0' COMMENT '排序号',
  `create_user` varchar(36) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='应用情景记录表';

-- ----------------------------
-- Records of application_scene
-- ----------------------------

-- ----------------------------
-- Table structure for application_terminal
-- ----------------------------
DROP TABLE IF EXISTS `application_terminal`;
CREATE TABLE `application_terminal` (
  `id` varchar(36) NOT NULL,
  `application_node_id` varchar(36) NOT NULL COMMENT 'application_terminal的外键',
  `application_id` varchar(36) NOT NULL COMMENT 'application表id',
  `application_gateway_id` varchar(36) DEFAULT '0' COMMENT '对应网关',
  `no` int(11) NOT NULL DEFAULT '1' COMMENT '终端编号',
  `terminal_name` varchar(50) NOT NULL COMMENT '终端编号',
  `on_picture` varchar(26) NOT NULL,
  `off_picture` varchar(26) NOT NULL,
  `application_place_id` varchar(36) NOT NULL COMMENT '0未分区域',
  `state` int(11) NOT NULL COMMENT '0初始状态、1关闭、2开启',
  `percent` int(11) NOT NULL DEFAULT '0' COMMENT '百分比(调光灯)',
  `rgb` varchar(6) DEFAULT NULL,
  `is_flag` int(11) NOT NULL COMMENT '异常状态',
  `uid` varchar(36) NOT NULL COMMENT '用户id',
  `all_order` int(11) NOT NULL DEFAULT '0' COMMENT '所有排序号',
  `place_order` int(11) NOT NULL DEFAULT '0' COMMENT '区域排序号',
  `create_user` varchar(36) NOT NULL COMMENT '用户id',
  `create_date` datetime NOT NULL,
  `update_user` varchar(36) NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='应用终端记录表';

-- ----------------------------
-- Records of application_terminal
-- ----------------------------

-- ----------------------------
-- Table structure for app_version
-- ----------------------------
DROP TABLE IF EXISTS `app_version`;
CREATE TABLE `app_version` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `version_name` varchar(26) NOT NULL DEFAULT '',
  `version_number` varchar(26) NOT NULL DEFAULT '',
  `url` varchar(255) NOT NULL DEFAULT '',
  `publish_time` datetime NOT NULL,
  `remark` varchar(512) DEFAULT NULL,
  `channel_name` varchar(26) NOT NULL DEFAULT '',
  `latest` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='APP版本号';

-- ----------------------------
-- Records of app_version
-- ----------------------------

-- ----------------------------
-- Table structure for arc_code
-- ----------------------------
DROP TABLE IF EXISTS `arc_code`;
CREATE TABLE `arc_code` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `tid_id` int(11) NOT NULL,
  `terper` varchar(4) DEFAULT NULL,
  `wind` varchar(4) DEFAULT NULL,
  `hand_wind` varchar(4) DEFAULT NULL,
  `auto_wind` varchar(4) DEFAULT NULL,
  `on_off` varchar(4) DEFAULT NULL,
  `type` varchar(4) DEFAULT NULL,
  `model` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='空调码库1';

-- ----------------------------
-- Records of arc_code
-- ----------------------------

-- ----------------------------
-- Table structure for arc_library_table_name
-- ----------------------------
DROP TABLE IF EXISTS `arc_library_table_name`;
CREATE TABLE `arc_library_table_name` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `SERIAL` int(11) unsigned NOT NULL,
  `BRAND_CN` char(0) NOT NULL,
  `BRAND_EN` char(0) NOT NULL,
  `MODEL` char(0) NOT NULL,
  `PINYIN` char(0) NOT NULL,
  `CODE` varchar(172) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='空调码库2';

-- ----------------------------
-- Records of arc_library_table_name
-- ----------------------------

-- ----------------------------
-- Table structure for arc_match_table
-- ----------------------------
DROP TABLE IF EXISTS `arc_match_table`;
CREATE TABLE `arc_match_table` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `SERIAL` int(11) unsigned NOT NULL,
  `BRAND_CN` char(0) NOT NULL,
  `BRAND_EN` char(0) NOT NULL,
  `MODEL` char(0) NOT NULL,
  `PINYIN` char(0) NOT NULL,
  `CODE` varchar(470) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='空调码库3';

-- ----------------------------
-- Records of arc_match_table
-- ----------------------------

-- ----------------------------
-- Table structure for arc_table
-- ----------------------------
DROP TABLE IF EXISTS `arc_table`;
CREATE TABLE `arc_table` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `SERIAL` int(11) unsigned NOT NULL,
  `BRAND_CN` varchar(12) NOT NULL,
  `BRAND_EN` varchar(22) NOT NULL,
  `MODEL` varchar(47) NOT NULL,
  `PINYIN` varchar(16) NOT NULL,
  `CODE` varchar(172) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `arc_table_BRAND_CN` (`BRAND_CN`),
  KEY `arc_table_MODEL` (`MODEL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='空调码库4';

-- ----------------------------
-- Records of arc_table
-- ----------------------------

-- ----------------------------
-- Table structure for area_icon
-- ----------------------------
DROP TABLE IF EXISTS `area_icon`;
CREATE TABLE `area_icon` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(255) NOT NULL DEFAULT '',
  `picture_name` varchar(255) NOT NULL DEFAULT '',
  `url1` varchar(512) NOT NULL DEFAULT '',
  `url2` varchar(512) NOT NULL DEFAULT '',
  `height` int(11) NOT NULL DEFAULT '0',
  `width` int(11) NOT NULL DEFAULT '0',
  `ext` int(11) NOT NULL DEFAULT '0',
  `created` datetime NOT NULL,
  `state` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`picture_name`),
  KEY `icon_area_ext` (`ext`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='标准区域图标表';

-- ----------------------------
-- Records of area_icon
-- ----------------------------

-- ----------------------------
-- Table structure for camera
-- ----------------------------
DROP TABLE IF EXISTS `camera`;
CREATE TABLE `camera` (
  `id` varchar(36) NOT NULL,
  `application_id` varchar(36) NOT NULL DEFAULT '' COMMENT '情景id',
  `account` varchar(30) NOT NULL DEFAULT '' COMMENT '摄像头账号',
  `uuid` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `password` varchar(16) NOT NULL,
  `channel` varchar(255) DEFAULT NULL COMMENT '通道',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='摄像头记录表';

-- ----------------------------
-- Records of camera
-- ----------------------------

-- ----------------------------
-- Table structure for character
-- ----------------------------
DROP TABLE IF EXISTS `character`;
CREATE TABLE `character` (
  `char_id` int(11) NOT NULL,
  `chara` varchar(10) NOT NULL,
  PRIMARY KEY (`char_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='26个大写字母';

-- ----------------------------
-- Records of character
-- ----------------------------

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `city_id` int(11) NOT NULL COMMENT '主键',
  `key` varchar(64) NOT NULL DEFAULT '' COMMENT '编码',
  `city_name` varchar(32) NOT NULL DEFAULT '' COMMENT '城市名称',
  `zip_code` varchar(16) NOT NULL DEFAULT '' COMMENT '邮编',
  `province_id` int(11) NOT NULL COMMENT '省id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='城市资料表';

-- ----------------------------
-- Records of city
-- ----------------------------

-- ----------------------------
-- Table structure for deployment
-- ----------------------------
DROP TABLE IF EXISTS `deployment`;
CREATE TABLE `deployment` (
  `id` varchar(36) NOT NULL COMMENT '布防主表id',
  `application_id` varchar(36) NOT NULL COMMENT '应用id',
  `application_gateway_id` varchar(36) NOT NULL COMMENT '应用绑定网id',
  `uniq_id` varchar(16) NOT NULL COMMENT '关网唯一id',
  `name` varchar(26) NOT NULL COMMENT '布防名称',
  `type` int(11) DEFAULT '0' COMMENT '0回家布防,1离家布防,3警戒.',
  `state` int(11) DEFAULT '0' COMMENT '布防开启状态,0关闭;1开启',
  `create_user` varchar(36) NOT NULL COMMENT 'user表ID',
  `create_date` datetime DEFAULT NULL,
  `update_user` varchar(36) NOT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='布防记录表';

-- ----------------------------
-- Records of deployment
-- ----------------------------

-- ----------------------------
-- Table structure for deployment_alarm_log
-- ----------------------------
DROP TABLE IF EXISTS `deployment_alarm_log`;
CREATE TABLE `deployment_alarm_log` (
  `id` varchar(36) NOT NULL COMMENT '布防报警记录ID',
  `application_id` varchar(36) NOT NULL,
  `application_gateway_id` varchar(36) NOT NULL,
  `application_node_id` varchar(36) NOT NULL,
  `application_terminal_id` varchar(36) NOT NULL,
  `deployment_id` varchar(36) NOT NULL,
  `flag` int(11) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='布防报警日志表';

-- ----------------------------
-- Records of deployment_alarm_log
-- ----------------------------

-- ----------------------------
-- Table structure for deployment_terminal
-- ----------------------------
DROP TABLE IF EXISTS `deployment_terminal`;
CREATE TABLE `deployment_terminal` (
  `id` varchar(36) NOT NULL COMMENT '布防终端id',
  `application_terminal_id` varchar(36) NOT NULL,
  `application_id` varchar(36) DEFAULT NULL,
  `application_gateway_id` varchar(36) DEFAULT NULL,
  `deployment_id` varchar(36) DEFAULT NULL,
  `flag` int(11) DEFAULT NULL COMMENT '备注',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_date` datetime DEFAULT NULL COMMENT '发生日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='布防终端记录表';

-- ----------------------------
-- Records of deployment_terminal
-- ----------------------------

-- ----------------------------
-- Table structure for device_ icon
-- ----------------------------
DROP TABLE IF EXISTS `device_ icon`;
CREATE TABLE `device_ icon` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `device_name` varchar(255) NOT NULL DEFAULT '',
  `picture_name` varchar(255) NOT NULL DEFAULT '',
  `url1` varchar(512) NOT NULL DEFAULT '',
  `url2` varchar(512) NOT NULL DEFAULT '',
  `height` int(11) NOT NULL DEFAULT '0',
  `width` int(11) NOT NULL DEFAULT '0',
  `ext` int(11) NOT NULL DEFAULT '0',
  `created` datetime NOT NULL,
  `state` int(11) NOT NULL DEFAULT '0',
  `security` int(11) NOT NULL DEFAULT '0',
  `common` int(11) NOT NULL DEFAULT '0',
  `security_msg` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  KEY `icon_device_ext` (`ext`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='标准设备图标表';

-- ----------------------------
-- Records of device_ icon
-- ----------------------------

-- ----------------------------
-- Table structure for district
-- ----------------------------
DROP TABLE IF EXISTS `district`;
CREATE TABLE `district` (
  `distrct_id` int(11) NOT NULL,
  `district_name` varchar(32) NOT NULL DEFAULT '',
  `city_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='区域资料表';

-- ----------------------------
-- Records of district
-- ----------------------------

-- ----------------------------
-- Table structure for fan_table
-- ----------------------------
DROP TABLE IF EXISTS `fan_table`;
CREATE TABLE `fan_table` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `SERIAL` int(11) unsigned NOT NULL,
  `BRAND_CN` varchar(9) NOT NULL,
  `BRAND_EN` varchar(12) NOT NULL,
  `MODEL` varchar(11) NOT NULL,
  `PINYIN` varchar(12) NOT NULL,
  `CODE` char(98) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fan_table_BRAND_CN` (`BRAND_CN`),
  KEY `fan_table_MODEL` (`MODEL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='风扇码库';

-- ----------------------------
-- Records of fan_table
-- ----------------------------

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '级别ID',
  `grade_code` varchar(16) NOT NULL COMMENT '级别编码',
  `grade_name` varchar(36) NOT NULL COMMENT '等级名称',
  `level` int(11) NOT NULL COMMENT '级别',
  `remark` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='应用用户权限表';

-- ----------------------------
-- Records of grade
-- ----------------------------

-- ----------------------------
-- Table structure for hard_series
-- ----------------------------
DROP TABLE IF EXISTS `hard_series`;
CREATE TABLE `hard_series` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '硬件系列id',
  `type_id` int(11) NOT NULL COMMENT '硬件类型id',
  `series_code` varchar(25) NOT NULL COMMENT '硬件系列编码',
  `series_name` varchar(50) NOT NULL,
  `max_num` int(11) NOT NULL DEFAULT '0' COMMENT '大最连接数，0表示不限制连接数量',
  `series_num` int(11) NOT NULL DEFAULT '0' COMMENT '排序好',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='智能硬件系列表';

-- ----------------------------
-- Records of hard_series
-- ----------------------------

-- ----------------------------
-- Table structure for hard_type
-- ----------------------------
DROP TABLE IF EXISTS `hard_type`;
CREATE TABLE `hard_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '设备类型id',
  `type_code` varchar(25) NOT NULL COMMENT '设备类型code',
  `type_name` varchar(50) NOT NULL COMMENT '类型名称',
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='智能硬件类型表';

-- ----------------------------
-- Records of hard_type
-- ----------------------------

-- ----------------------------
-- Table structure for head_image
-- ----------------------------
DROP TABLE IF EXISTS `head_image`;
CREATE TABLE `head_image` (
  `image_id` varchar(36) NOT NULL,
  `uid` varchar(36) NOT NULL COMMENT '用户ID',
  `width` int(11) NOT NULL COMMENT '宽度',
  `height` int(11) NOT NULL COMMENT '高度',
  `ext` int(11) NOT NULL COMMENT '扩展类型：1 jpg ,2 png ,3 gif',
  `create_date` datetime NOT NULL COMMENT '添加日期',
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户头像图片记录表';

-- ----------------------------
-- Records of head_image
-- ----------------------------

-- ----------------------------
-- Table structure for intelligent_hardware
-- ----------------------------
DROP TABLE IF EXISTS `intelligent_hardware`;
CREATE TABLE `intelligent_hardware` (
  `id` varchar(36) NOT NULL COMMENT '智能硬件id',
  `type_id` int(11) NOT NULL COMMENT '设备类型id',
  `series_id` int(11) NOT NULL,
  `uniq_id` varchar(16) NOT NULL COMMENT '设备唯一编码',
  `produce_date` datetime NOT NULL COMMENT '产品日期',
  `hardware_ver` varchar(32) NOT NULL,
  `software_ver` varchar(32) NOT NULL COMMENT '软件版本',
  `supplier_id` int(11) DEFAULT NULL COMMENT '供应商id',
  `batch` varchar(32) DEFAULT NULL COMMENT '批次号',
  `net_falg` int(11) DEFAULT NULL COMMENT '入网标志',
  `online` tinyint(4) DEFAULT NULL COMMENT '在线标志',
  `intelligent_hardware_id` varchar(16) DEFAULT NULL COMMENT '二维码',
  `bind_times` int(11) DEFAULT NULL COMMENT '绑定次数',
  `end_date` datetime DEFAULT NULL COMMENT '最后绑定时间',
  `factory_date` date DEFAULT NULL COMMENT '出厂日期',
  `is_flag` int(11) DEFAULT '0' COMMENT '0非智能、1 zigbee 、2 wifi 、3 bluetooth 、 4 LoRa',
  `create_date` date DEFAULT NULL COMMENT '创建日期',
  `update_date` date DEFAULT NULL COMMENT '更新日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='硬件初始化表';

-- ----------------------------
-- Records of intelligent_hardware
-- ----------------------------

-- ----------------------------
-- Table structure for iptv_table
-- ----------------------------
DROP TABLE IF EXISTS `iptv_table`;
CREATE TABLE `iptv_table` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `SERIAL` int(11) unsigned NOT NULL,
  `BRAND_CN` varchar(12) NOT NULL,
  `BRAND_EN` varchar(23) NOT NULL,
  `MODEL` varchar(9) NOT NULL,
  `PINYIN` varchar(14) NOT NULL,
  `CODE` char(102) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `iptv_table_BRAND_CN` (`BRAND_CN`),
  KEY `iptv_table_MODEL` (`MODEL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Iptv码库';

-- ----------------------------
-- Records of iptv_table
-- ----------------------------

-- ----------------------------
-- Table structure for linkage_terminal
-- ----------------------------
DROP TABLE IF EXISTS `linkage_terminal`;
CREATE TABLE `linkage_terminal` (
  `id` varchar(36) NOT NULL COMMENT '联动终端id',
  `application_linkage_id` varchar(36) NOT NULL,
  `category` int(11) NOT NULL DEFAULT '0' COMMENT '0网关节点  1 WIFI节点',
  `gateway_uniq_id` varchar(16) DEFAULT NULL,
  `application_terminal_id` varchar(36) NOT NULL,
  `node_uniq_id` varchar(16) DEFAULT NULL,
  `no` int(11) DEFAULT '1',
  `command` varchar(500) DEFAULT NULL COMMENT '预设命令',
  `state` int(11) NOT NULL DEFAULT '0',
  `delayed` int(11) NOT NULL DEFAULT '0' COMMENT '延时用秒计算',
  `execute_time` varchar(8) NOT NULL,
  `update_date` datetime DEFAULT NULL,
  `create_user` varchar(36) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='联动终端表';

-- ----------------------------
-- Records of linkage_terminal
-- ----------------------------

-- ----------------------------
-- Table structure for nation
-- ----------------------------
DROP TABLE IF EXISTS `nation`;
CREATE TABLE `nation` (
  `nation_id` int(11) NOT NULL COMMENT '家国地区id  ',
  `nation_code` varchar(56) NOT NULL COMMENT '编号',
  `nation_name` varchar(100) NOT NULL COMMENT '国家地区名称',
  PRIMARY KEY (`nation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='国家地区表';

-- ----------------------------
-- Records of nation
-- ----------------------------

-- ----------------------------
-- Table structure for other_login
-- ----------------------------
DROP TABLE IF EXISTS `other_login`;
CREATE TABLE `other_login` (
  `id` varchar(36) NOT NULL COMMENT '第三方户用id GUID',
  `type_login` int(11) NOT NULL DEFAULT '0',
  `other_name` varchar(80) DEFAULT NULL,
  `uid` varchar(36) NOT NULL COMMENT '用户id',
  `other_account` varchar(80) NOT NULL DEFAULT '',
  `other_city` int(11) NOT NULL DEFAULT '0',
  `other_gender` varchar(2) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='第三方登陆';

-- ----------------------------
-- Records of other_login
-- ----------------------------

-- ----------------------------
-- Table structure for pjt_table
-- ----------------------------
DROP TABLE IF EXISTS `pjt_table`;
CREATE TABLE `pjt_table` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `SERIAL` int(11) unsigned NOT NULL,
  `BRAND_CN` varchar(12) NOT NULL,
  `BRAND_EN` varchar(17) NOT NULL,
  `MODEL` varchar(13) NOT NULL,
  `PINYIN` varchar(13) NOT NULL,
  `CODE` char(98) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `pjt_table_BRAND_CN` (`BRAND_CN`),
  KEY `pjt_table_MODEL` (`MODEL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='投影仪码库';

-- ----------------------------
-- Records of pjt_table
-- ----------------------------

-- ----------------------------
-- Table structure for provinces
-- ----------------------------
DROP TABLE IF EXISTS `provinces`;
CREATE TABLE `provinces` (
  `provinces_id` int(11) NOT NULL COMMENT '省id ',
  `nation_id` int(11) NOT NULL COMMENT '国家id',
  `provinces_code` varchar(25) NOT NULL,
  `provinces_name` varchar(100) DEFAULT NULL,
  `chara` varchar(10) DEFAULT NULL COMMENT '字母匹配',
  PRIMARY KEY (`provinces_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='省资料表';

-- ----------------------------
-- Records of provinces
-- ----------------------------

-- ----------------------------
-- Table structure for scene_icon
-- ----------------------------
DROP TABLE IF EXISTS `scene_icon`;
CREATE TABLE `scene_icon` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `scene_name` varchar(255) NOT NULL DEFAULT '',
  `picture_name` varchar(255) NOT NULL DEFAULT '',
  `url1` varchar(512) NOT NULL DEFAULT '',
  `url2` varchar(512) NOT NULL DEFAULT '',
  `height` int(11) NOT NULL DEFAULT '0',
  `width` int(11) NOT NULL DEFAULT '0',
  `ext` int(11) NOT NULL DEFAULT '0',
  `created` datetime NOT NULL,
  `state` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`picture_name`),
  KEY `icon_scene_ext` (`ext`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='标准情景图标表';

-- ----------------------------
-- Records of scene_icon
-- ----------------------------

-- ----------------------------
-- Table structure for scene_terminal
-- ----------------------------
DROP TABLE IF EXISTS `scene_terminal`;
CREATE TABLE `scene_terminal` (
  `id` varchar(36) NOT NULL,
  `application_scene_id` varchar(36) NOT NULL COMMENT '应用情景id',
  `category` int(11) NOT NULL DEFAULT '0' COMMENT '0网关节点  1 WIFI节点',
  `gateway_uniq_id` varchar(16) NOT NULL DEFAULT '0' COMMENT '0 WIFI节点',
  `application_terminal_id` varchar(36) NOT NULL,
  `node_uniq_id` varchar(16) NOT NULL COMMENT '关网或节点设备ID',
  `no` int(11) NOT NULL DEFAULT '1',
  `command` varchar(255) NOT NULL COMMENT '执行命令',
  `state` int(11) DEFAULT '0' COMMENT '行执状态',
  `execute_time` varchar(8) DEFAULT NULL COMMENT '执行时间',
  `update_date` time DEFAULT NULL,
  `create_user` varchar(36) DEFAULT NULL,
  `create_date` time DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='情景终端表';

-- ----------------------------
-- Records of scene_terminal
-- ----------------------------

-- ----------------------------
-- Table structure for scene_timer
-- ----------------------------
DROP TABLE IF EXISTS `scene_timer`;
CREATE TABLE `scene_timer` (
  `id` varchar(36) NOT NULL COMMENT '情景定时ID',
  `category` int(11) NOT NULL DEFAULT '0' COMMENT '定时类型，1仅执行一次、2重复执行，3周一到周五，4自定义',
  `bind_application` varchar(36) NOT NULL COMMENT '绑定应用',
  `bind_application_scene` varchar(36) NOT NULL,
  `bind_scene_terminal` varchar(36) NOT NULL,
  `time_name` varchar(50) NOT NULL COMMENT '定时名称',
  `repeat` int(11) DEFAULT '0' COMMENT '0不重复，1重复',
  `is_run` int(11) DEFAULT '0' COMMENT '是否执行,仅执行一次的更改该值 1已经执行过',
  `execution_time` varchar(8) NOT NULL COMMENT '执行时间',
  `state` int(11) DEFAULT '0' COMMENT '是否停用0启用，1停用',
  `create_user` varchar(36) DEFAULT NULL,
  `create_date` time DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='情景定时器主表';

-- ----------------------------
-- Records of scene_timer
-- ----------------------------

-- ----------------------------
-- Table structure for scene_timer_list
-- ----------------------------
DROP TABLE IF EXISTS `scene_timer_list`;
CREATE TABLE `scene_timer_list` (
  `id` varchar(36) NOT NULL,
  `scene_timer_id` varchar(36) NOT NULL COMMENT '情境定时Id',
  `is_run` int(11) NOT NULL DEFAULT '0' COMMENT '是否执行, 0未执行，仅执行一次的更改该值 1已经执行过',
  `week_id` int(11) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='情景定时器从表';

-- ----------------------------
-- Records of scene_timer_list
-- ----------------------------

-- ----------------------------
-- Table structure for security_alert_log
-- ----------------------------
DROP TABLE IF EXISTS `security_alert_log`;
CREATE TABLE `security_alert_log` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '安防设备报警日志表',
  `application_id` varchar(36) NOT NULL,
  `application_gateway_id` varchar(36) NOT NULL,
  `application_node_id` varchar(36) NOT NULL,
  `application_terminal_id` varchar(36) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL COMMENT '报警说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='安防终端报警日志';

-- ----------------------------
-- Records of security_alert_log
-- ----------------------------

-- ----------------------------
-- Table structure for slr_table
-- ----------------------------
DROP TABLE IF EXISTS `slr_table`;
CREATE TABLE `slr_table` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `SERIAL` int(11) unsigned NOT NULL,
  `BRAND_CN` varchar(12) NOT NULL,
  `BRAND_EN` varchar(9) NOT NULL,
  `MODEL` char(8) NOT NULL,
  `PINYIN` varchar(9) NOT NULL,
  `CODE` char(14) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `slr_table_BRAND_CN` (`BRAND_CN`),
  KEY `slr_table_MODEL` (`MODEL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='相机码库';

-- ----------------------------
-- Records of slr_table
-- ----------------------------

-- ----------------------------
-- Table structure for temp_rf
-- ----------------------------
DROP TABLE IF EXISTS `temp_rf`;
CREATE TABLE `temp_rf` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'rf临时表id',
  `application_id` varchar(36) NOT NULL,
  `application_gateway_id` varchar(36) NOT NULL,
  `application_node_id` varchar(36) NOT NULL,
  `dev_num` int(11) DEFAULT NULL COMMENT '设备序号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='RF设备临时表';

-- ----------------------------
-- Records of temp_rf
-- ----------------------------

-- ----------------------------
-- Table structure for tvbox_table
-- ----------------------------
DROP TABLE IF EXISTS `tvbox_table`;
CREATE TABLE `tvbox_table` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `SERIAL` int(11) unsigned NOT NULL,
  `BRAND_CN` varchar(21) NOT NULL,
  `BRAND_EN` varchar(33) NOT NULL,
  `MODEL` varchar(11) NOT NULL,
  `PINYIN` varchar(25) NOT NULL,
  `CODE` char(102) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `tvbox_table_BRAND_CN` (`BRAND_CN`),
  KEY `tvbox_table_MODEL` (`MODEL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Tv码库2';

-- ----------------------------
-- Records of tvbox_table
-- ----------------------------

-- ----------------------------
-- Table structure for tv_table
-- ----------------------------
DROP TABLE IF EXISTS `tv_table`;
CREATE TABLE `tv_table` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `SERIAL` int(11) unsigned NOT NULL,
  `BRAND_CN` varchar(18) NOT NULL,
  `BRAND_EN` varchar(44) NOT NULL,
  `MODEL` varchar(19) NOT NULL,
  `PINYIN` varchar(21) NOT NULL,
  `CODE` char(110) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `tv_table_BRAND_CN` (`BRAND_CN`),
  KEY `tv_table_MODEL` (`MODEL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Tv码库';

-- ----------------------------
-- Records of tv_table
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` varchar(36) NOT NULL COMMENT '户用id GUID',
  `region_code` varchar(6) DEFAULT NULL COMMENT '家国代码',
  `phone_num` varchar(20) NOT NULL COMMENT '话号码电',
  `email` varchar(80) DEFAULT NULL COMMENT '箱邮',
  `gender` varchar(2) DEFAULT NULL COMMENT '性别',
  `id_code` varchar(6) DEFAULT NULL COMMENT '邀请码',
  `invite_code` varchar(6) DEFAULT NULL COMMENT '被邀请码',
  `point` int(10) unsigned zerofill DEFAULT '0000000000' COMMENT '积分',
  `nick_name` varchar(100) DEFAULT NULL COMMENT '昵称',
  `ip` varchar(64) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `device_id` varchar(128) DEFAULT NULL,
  `device_ios` varchar(128) DEFAULT NULL,
  `avatar` varchar(80) DEFAULT NULL COMMENT '头像',
  `password` varchar(300) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `company` varchar(30) DEFAULT NULL,
  `location` varchar(30) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `weibo` varchar(30) DEFAULT NULL,
  `weixin` varchar(30) DEFAULT NULL,
  `qq` varchar(30) DEFAULT NULL,
  `is_active` int(2) DEFAULT '0' COMMENT '否在线',
  `rands` varchar(6) DEFAULT NULL COMMENT '密钥',
  `other_flag` int(11) DEFAULT NULL COMMENT '第三方登陆',
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='注册用户表';

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for user_application
-- ----------------------------
DROP TABLE IF EXISTS `user_application`;
CREATE TABLE `user_application` (
  `uid` varchar(36) NOT NULL,
  `application_id` varchar(36) NOT NULL,
  `create_user` varchar(36) NOT NULL,
  `create_date` datetime NOT NULL,
  PRIMARY KEY (`uid`,`application_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户应用对应表';

-- ----------------------------
-- Records of user_application
-- ----------------------------

-- ----------------------------
-- Table structure for user_gateway
-- ----------------------------
DROP TABLE IF EXISTS `user_gateway`;
CREATE TABLE `user_gateway` (
  `uid` varchar(36) NOT NULL,
  `application_place_id` varchar(36) NOT NULL,
  `application_id` varchar(36) NOT NULL,
  `application_gateway_id` varchar(36) NOT NULL,
  `create_user` varchar(36) NOT NULL,
  `create_date` datetime NOT NULL,
  PRIMARY KEY (`uid`,`application_id`,`application_gateway_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户网关对应表';

-- ----------------------------
-- Records of user_gateway
-- ----------------------------

-- ----------------------------
-- Table structure for user_node
-- ----------------------------
DROP TABLE IF EXISTS `user_node`;
CREATE TABLE `user_node` (
  `uid` varchar(36) NOT NULL,
  `application_id` varchar(36) NOT NULL,
  `application_gateway_id` varchar(36) DEFAULT '0',
  `application_place_id` varchar(36) DEFAULT '0' COMMENT '0未分区',
  `application_node_id` varchar(36) NOT NULL,
  `create_user` varchar(36) NOT NULL,
  `create_date` datetime NOT NULL,
  PRIMARY KEY (`uid`,`application_node_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户节点对应表';

-- ----------------------------
-- Records of user_node
-- ----------------------------

-- ----------------------------
-- Table structure for user_place
-- ----------------------------
DROP TABLE IF EXISTS `user_place`;
CREATE TABLE `user_place` (
  `uid` varchar(36) NOT NULL DEFAULT '',
  `application_id` varchar(36) NOT NULL,
  `application_place_id` varchar(36) NOT NULL,
  PRIMARY KEY (`uid`,`application_place_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户区域对应表';

-- ----------------------------
-- Records of user_place
-- ----------------------------

-- ----------------------------
-- Table structure for user_profile
-- ----------------------------
DROP TABLE IF EXISTS `user_profile`;
CREATE TABLE `user_profile` (
  `pid` varchar(36) NOT NULL COMMENT '用户介绍',
  `uid` varchar(36) NOT NULL COMMENT '用户id',
  `full_name` varchar(30) NOT NULL COMMENT '全名',
  `birthday` date DEFAULT NULL,
  `education` varchar(16) DEFAULT NULL COMMENT '教育程度',
  `vocation` varchar(50) DEFAULT NULL COMMENT '职业',
  `longitude` float(32,0) DEFAULT NULL COMMENT '经度',
  `latitude` float(32,0) DEFAULT NULL COMMENT '维度',
  `identity_type` varchar(16) DEFAULT NULL COMMENT '份身认证类型',
  `identity_code` varchar(128) DEFAULT NULL COMMENT '身份证号码',
  `identity_image_front` varchar(20) DEFAULT NULL COMMENT '身份证照片正面 外键',
  `identity_img_front_url` varchar(255) DEFAULT NULL,
  `identity_image_back` varchar(20) DEFAULT NULL COMMENT '身份证背面 外键',
  `identity_img_back_url` varchar(255) DEFAULT NULL,
  `check_state` int(11) DEFAULT '0' COMMENT '审批状态',
  `introduction` varchar(255) DEFAULT NULL COMMENT '个人介绍',
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`pid`),
  KEY `usrepk` (`uid`),
  CONSTRAINT `usrepk` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='个人信息表';

-- ----------------------------
-- Records of user_profile
-- ----------------------------

-- ----------------------------
-- Table structure for user_terminal_grade
-- ----------------------------
DROP TABLE IF EXISTS `user_terminal_grade`;
CREATE TABLE `user_terminal_grade` (
  `id` varchar(36) NOT NULL COMMENT '用户权限表id',
  `application_id` varchar(36) NOT NULL COMMENT '应用id',
  `application_gateway_id` varchar(36) DEFAULT '0' COMMENT '0无网关应用',
  `application_node_id` varchar(36) NOT NULL COMMENT '节点id',
  `application_terminal_id` varchar(36) NOT NULL,
  `application_place_id` varchar(36) DEFAULT NULL,
  `uid` varchar(36) NOT NULL COMMENT '用户id',
  `level` int(36) NOT NULL COMMENT '权限级别',
  `is_admin` int(11) NOT NULL DEFAULT '0' COMMENT '是否超级用户',
  `limit_time` int(11) NOT NULL DEFAULT '0' COMMENT '是否限时0不限时',
  `begin` datetime NOT NULL,
  `end` datetime NOT NULL,
  `create_user` varchar(36) NOT NULL,
  `create_date` varchar(36) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户设备权限表';

-- ----------------------------
-- Records of user_terminal_grade
-- ----------------------------

-- ----------------------------
-- Table structure for user_tokens
-- ----------------------------
DROP TABLE IF EXISTS `user_tokens`;
CREATE TABLE `user_tokens` (
  `uid` varchar(36) NOT NULL COMMENT '用户id',
  `token` varchar(32) NOT NULL,
  `expireTime` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户会话token表';

-- ----------------------------
-- Records of user_tokens
-- ----------------------------
