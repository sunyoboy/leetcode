/*
Navicat MySQL Data Transfer

Source Server         : shiro
Source Server Version : 50623
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50623
File Encoding         : 65001

Date: 2016-11-24 20:07:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for amq_subscriber
-- ----------------------------
DROP TABLE IF EXISTS `amq_subscriber`;
CREATE TABLE `amq_subscriber` (
  `No` bigint(20) NOT NULL AUTO_INCREMENT,
  `ClientID` varchar(80) NOT NULL,
  `SubscriberName` varchar(80) NOT NULL,
  `Destination` bigint(20) NOT NULL,
  `PendingQueueSize` int(11) NOT NULL DEFAULT '0',
  `DispathchedQueueSize` int(11) NOT NULL DEFAULT '0',
  `DispatchedCounter` int(11) NOT NULL DEFAULT '0',
  `EnqueueCounter` int(11) NOT NULL DEFAULT '0',
  `DequeueCounter` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of amq_subscriber
-- ----------------------------

-- ----------------------------
-- Table structure for amq_topic
-- ----------------------------
DROP TABLE IF EXISTS `amq_topic`;
CREATE TABLE `amq_topic` (
  `No` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(80) NOT NULL,
  `ConsumerNum` int(11) NOT NULL DEFAULT '0',
  `EnqueuedMsgNum` int(11) NOT NULL DEFAULT '0',
  `DequeueMsgNum` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of amq_topic
-- ----------------------------

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `content` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('1', '2', 'test_title', 'test_content');
INSERT INTO `article` VALUES ('2', '2', 'test_title_2', 'test_content_2');
INSERT INTO `article` VALUES ('3', '2', 'test_title_3', 'test_content_3');
INSERT INTO `article` VALUES ('4', '2', 'test_title_4', 'test_content_4');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Salary` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '100');
INSERT INTO `employee` VALUES ('2', '200');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `Id` int(11) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'john@example.com');
INSERT INTO `person` VALUES ('2', 'bob@example.com');
INSERT INTO `person` VALUES ('3', 'john@example.com');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `amount` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '100');
INSERT INTO `product` VALUES ('2', '200');
INSERT INTO `product` VALUES ('3', '300');
INSERT INTO `product` VALUES ('4', '400');

-- ----------------------------
-- Table structure for product_details
-- ----------------------------
DROP TABLE IF EXISTS `product_details`;
CREATE TABLE `product_details` (
  `id` int(10) unsigned NOT NULL,
  `weight` int(10) unsigned DEFAULT NULL,
  `exist` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_details
-- ----------------------------
INSERT INTO `product_details` VALUES ('2', '22', '0');
INSERT INTO `product_details` VALUES ('4', '44', '1');
INSERT INTO `product_details` VALUES ('5', '55', '0');
INSERT INTO `product_details` VALUES ('6', '66', '1');

-- ----------------------------
-- Table structure for t_char
-- ----------------------------
DROP TABLE IF EXISTS `t_char`;
CREATE TABLE `t_char` (
  `title` char(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_char
-- ----------------------------
INSERT INTO `t_char` VALUES ('你');
INSERT INTO `t_char` VALUES ('你好');
INSERT INTO `t_char` VALUES ('你好吗');
INSERT INTO `t_char` VALUES ('a');
INSERT INTO `t_char` VALUES ('abc');
INSERT INTO `t_char` VALUES ('abc');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', 'username2', '40');
INSERT INTO `user` VALUES ('3', 'hello', '23');
INSERT INTO `user` VALUES ('4', 'hello', '23');
INSERT INTO `user` VALUES ('5', 'hello', '23');
INSERT INTO `user` VALUES ('6', 'hello', '23');
INSERT INTO `user` VALUES ('7', 'hello', '23');
INSERT INTO `user` VALUES ('8', 'hello', '23');
INSERT INTO `user` VALUES ('9', 'hello', '23');
INSERT INTO `user` VALUES ('10', 'hello', '23');
INSERT INTO `user` VALUES ('11', 'hello', '23');
INSERT INTO `user` VALUES ('12', 'hello', '23');
INSERT INTO `user` VALUES ('13', 'hello', '23');
INSERT INTO `user` VALUES ('14', 'hello', '23');

-- ----------------------------
-- Table structure for weather
-- ----------------------------
DROP TABLE IF EXISTS `weather`;
CREATE TABLE `weather` (
  `Id` int(11) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Temperature` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of weather
-- ----------------------------
INSERT INTO `weather` VALUES ('1', '2016-01-01', '10');
INSERT INTO `weather` VALUES ('2', '2016-01-02', '25');
INSERT INTO `weather` VALUES ('3', '2016-01-03', '20');
INSERT INTO `weather` VALUES ('4', '2016-01-04', '30');
