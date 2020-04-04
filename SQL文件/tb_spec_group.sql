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

 Date: 02/07/2019 03:29:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_spec_group
-- ----------------------------
DROP TABLE IF EXISTS `tb_spec_group`;
CREATE TABLE `tb_spec_group`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `cid` bigint(20) NOT NULL COMMENT '商品分类id，一个分类下有多个规格组',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '规格组的名称',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `key_category`(`cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 77 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '规格参数组' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_spec_group
-- ----------------------------
INSERT INTO `tb_spec_group` VALUES (65, 76, '主体');
INSERT INTO `tb_spec_group` VALUES (66, 76, '基本信息');
INSERT INTO `tb_spec_group` VALUES (67, 76, '操作系统');
INSERT INTO `tb_spec_group` VALUES (68, 76, '主芯片');
INSERT INTO `tb_spec_group` VALUES (69, 76, '存储');
INSERT INTO `tb_spec_group` VALUES (70, 76, '屏幕');
INSERT INTO `tb_spec_group` VALUES (71, 76, '摄像头');
INSERT INTO `tb_spec_group` VALUES (72, 76, '电池信息');
INSERT INTO `tb_spec_group` VALUES (73, 90, '主体');
INSERT INTO `tb_spec_group` VALUES (74, 90, '规格尺寸');
INSERT INTO `tb_spec_group` VALUES (75, 105, '主体参数');
INSERT INTO `tb_spec_group` VALUES (76, 105, '显示参数');

SET FOREIGN_KEY_CHECKS = 1;
