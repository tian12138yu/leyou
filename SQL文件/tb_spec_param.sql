/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50644
 Source Host           : localhost:3306
 Source Schema         : yun6

 Target Server Type    : MySQL
 Target Server Version : 50644
 File Encoding         : 65001

 Date: 02/07/2019 20:43:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_spec_param
-- ----------------------------
DROP TABLE IF EXISTS `tb_spec_param`;
CREATE TABLE `tb_spec_param`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `cid` bigint(20) NOT NULL COMMENT '商品分类id',
  `group_id` bigint(20) NOT NULL,
  `name` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '参数名',
  `numeric` tinyint(1) NOT NULL COMMENT '是否是数字类型参数，true或false',
  `unit` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '数字类型参数的单位，非数字类型可以为空',
  `generic` tinyint(1) NOT NULL COMMENT '是否是sku通用属性参数，true或false',
  `searching` tinyint(1) NOT NULL COMMENT '是否用于搜索过滤，true或false',
  `segments` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '数值类型参数，如果需要搜索，则添加分段间隔',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `key_group`(`group_id`) USING BTREE,
  INDEX `key_category`(`cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 54 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '规格参数组下的参数名' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_spec_param
-- ----------------------------
INSERT INTO `tb_spec_param` VALUES (1, 76, 65, '品牌', 0, '', 1, 0, '');
INSERT INTO `tb_spec_param` VALUES (2, 76, 65, '型号', 0, '', 1, 0, '');
INSERT INTO `tb_spec_param` VALUES (3, 76, 65, '上市年份', 1, '年', 1, 0, '');
INSERT INTO `tb_spec_param` VALUES (4, 76, 66, '机身颜色', 0, '', 0, 0, '');
INSERT INTO `tb_spec_param` VALUES (5, 76, 66, '机身重量（g）', 1, 'g', 1, 0, '');
INSERT INTO `tb_spec_param` VALUES (6, 76, 66, '机身材质工艺', 0, '', 1, 0, '');
INSERT INTO `tb_spec_param` VALUES (7, 76, 67, '操作系统', 0, '', 1, 1, '');
INSERT INTO `tb_spec_param` VALUES (8, 76, 68, 'CPU品牌', 0, '', 1, 1, '');
INSERT INTO `tb_spec_param` VALUES (9, 76, 68, 'CPU型号', 0, '', 1, 0, '');
INSERT INTO `tb_spec_param` VALUES (10, 76, 68, 'CPU核数', 0, '', 1, 1, '');
INSERT INTO `tb_spec_param` VALUES (11, 76, 68, 'CPU频率', 1, 'GHz', 1, 1, '0-1.0,1.0-1.5,1.5-2.0,2.0-2.5,2.5-');
INSERT INTO `tb_spec_param` VALUES (12, 76, 69, '内存', 0, '', 0, 1, '');
INSERT INTO `tb_spec_param` VALUES (13, 76, 69, '机身存储', 0, '', 0, 1, '');
INSERT INTO `tb_spec_param` VALUES (14, 76, 70, '主屏幕尺寸（英寸）', 1, '英寸', 1, 1, '0-4.0,4.0-5.0,5.0-5.5,5.5-6.0,6.0-');
INSERT INTO `tb_spec_param` VALUES (15, 76, 70, '分辨率', 0, '', 1, 0, '');
INSERT INTO `tb_spec_param` VALUES (16, 76, 71, '前置摄像头', 1, '万', 1, 1, '0-500,500-1000,1000-1500,1500-2000,2500-');
INSERT INTO `tb_spec_param` VALUES (17, 76, 71, '后置摄像头', 1, '万', 1, 1, '0-500,500-1000,1000-1500,1500-2000,2500-');
INSERT INTO `tb_spec_param` VALUES (18, 76, 72, '电池容量（mAh）', 1, 'mAh', 1, 1, '0-2000,2000-3000,3000-4000,4000-');
INSERT INTO `tb_spec_param` VALUES (21, 90, 73, '品牌', 0, '', 1, 0, '');
INSERT INTO `tb_spec_param` VALUES (22, 90, 73, '适用机型', 0, '', 0, 0, '');
INSERT INTO `tb_spec_param` VALUES (23, 90, 74, '贴膜尺寸', 1, '英寸', 1, 1, '0-4.0,4.0-5.0,5.0-5.5,5.5-6.0,6.0-');
INSERT INTO `tb_spec_param` VALUES (24, 90, 74, '材质', 0, '', 1, 1, '');
INSERT INTO `tb_spec_param` VALUES (25, 90, 74, '类型', 0, '', 1, 1, '');
INSERT INTO `tb_spec_param` VALUES (31, 105, 75, '品牌', 0, '', 1, 0, '');
INSERT INTO `tb_spec_param` VALUES (32, 105, 75, '型号', 0, '', 0, 0, '');
INSERT INTO `tb_spec_param` VALUES (33, 105, 75, '产品颜色', 0, '', 1, 0, '');
INSERT INTO `tb_spec_param` VALUES (34, 105, 75, '上市日期', 0, '', 1, 0, '');
INSERT INTO `tb_spec_param` VALUES (35, 105, 75, '能效等级', 0, '', 1, 1, '');
INSERT INTO `tb_spec_param` VALUES (36, 105, 76, '屏幕尺寸', 1, '英寸', 0, 1, '0-4.0,4.0-5.0,5.0-5.5,5.5-6.0,6.0-');
INSERT INTO `tb_spec_param` VALUES (37, 105, 76, '屏幕分辨率', 0, '', 1, 1, '');

SET FOREIGN_KEY_CHECKS = 1;
