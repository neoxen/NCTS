/*
MySQL Backup
Source Server Version: 3.21.0
Source Database: ncts
Date: 2011-3-16 15:06:30
*/


-- ----------------------------
--  Table structure for `ncts_application`
-- ----------------------------
DROP TABLE IF EXISTS `ncts_application`;
CREATE TABLE `ncts_application` (
  `ApplyID` varchar(32) NOT NULL DEFAULT '',
  `UserID` varchar(32) NOT NULL COMMENT '用户ID',
  `SiteName` varchar(100) NOT NULL COMMENT '网站名',
  `SiteDomains` varchar(200) NOT NULL COMMENT '网站域名',
  `SiteType` char(1) NOT NULL COMMENT '网站类型',
  `SiteICPNo` varchar(50) NOT NULL COMMENT '网站ICP许可证号',
  `SiteIP` varchar(15) NOT NULL,
  `SiteISP` varchar(100) NOT NULL,
  `SiteOpenDay` varchar(10) NOT NULL,
  `SiteMail` varchar(100) NOT NULL,
  `SiteAddress` varchar(100) NOT NULL,
  `SiteInfo` varchar(200) DEFAULT NULL,
  `SNBXH` varchar(30) NOT NULL,
  `OperID` varchar(32) DEFAULT NULL COMMENT '注册：置空\r\n变更：将要变更的标识ID\r\n注销：将要注销的标识ID',
  `ApplyType` char(1) NOT NULL COMMENT '1:注册申请\r\n2:注销申请\r\n3:变更申请\r\n4.吊销申请',
  `AuditStatus` char(1) NOT NULL COMMENT '0:未受理\r\n1:受理\r\n2:审核通过\r\n3:审核驳回',
  `AuditComment` varchar(200) DEFAULT NULL COMMENT '审核意见',
  `CurrHandleDept` varchar(32) DEFAULT NULL,
  `CurrHandler` varchar(32) DEFAULT NULL,
  `HandleTime` date DEFAULT NULL,
  `NextHandleDept` varchar(32) DEFAULT NULL,
  `IsValid` char(1) NOT NULL COMMENT '0: 无效\r\n1：有效',
  `CreateDate` varchar(10) NOT NULL,
  `DestroyDate` varchar(10) NOT NULL,
  PRIMARY KEY (`ApplyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ncts_elecidentify`
-- ----------------------------
DROP TABLE IF EXISTS `ncts_elecidentify`;
CREATE TABLE `ncts_elecidentify` (
  `IdentifyID` varchar(32) NOT NULL,
  `ApplyID` varchar(32) NOT NULL,
  `Version` int(11) NOT NULL,
  `SNBXH` varchar(30) NOT NULL,
  `SiteDomains` varchar(200) NOT NULL,
  `IdentifyCode` varchar(50) NOT NULL,
  `IsValid` char(1) NOT NULL,
  `CreateDate` date NOT NULL,
  `DestroyDate` date DEFAULT NULL,
  PRIMARY KEY (`IdentifyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ncts_user`
-- ----------------------------
DROP TABLE IF EXISTS `ncts_user`;
CREATE TABLE `ncts_user` (
  `UserID` varchar(32) NOT NULL DEFAULT '1',
  `UserName` varchar(20) NOT NULL COMMENT '用户名',
  `Password` varchar(32) NOT NULL COMMENT '密码',
  `SZCH` varchar(40) NOT NULL COMMENT '企业注册号',
  `SQYMC` varchar(100) NOT NULL COMMENT '企业名称',
  `SFZRXM` varchar(500) NOT NULL COMMENT '企业法人',
  `SNBXH` varchar(30) DEFAULT NULL COMMENT '企业内部流水号',
  `IsOpened` char(1) NOT NULL COMMENT '1：开通；0：未开通',
  `IsRepeat` char(1) NOT NULL COMMENT '1:有重复；0：无重复',
  `IsSCan` char(1) NOT NULL COMMENT '1:已扫描；0：未扫描',
  `IsValid` char(1) NOT NULL COMMENT '1:有效 0:无效',
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `Name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `Password` varchar(6) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records 
-- ----------------------------
INSERT INTO `ncts_application` VALUES ('','1','网站名','域名','1','许可证号','IP地址','提供商','2011-03-15','电子邮箱','地址',NULL,'',NULL,'1','0',NULL,NULL,NULL,NULL,NULL,'1','2011-03-15','2011-03-15'),  ('402881c12eb8fb82012eb8fc0ccc0001','1','网站名','域名','0','许可证号','IP地址','提供商','2011-03-15','电子邮箱','地址',NULL,'',NULL,'1','0',NULL,NULL,NULL,NULL,NULL,'1','2011-03-15','2011-03-15'),  ('402881c12eb908bb012eb9090cfc0001','1','11','11','0','11','11','11','2011-03-15','11','11',NULL,'',NULL,'1','0',NULL,NULL,NULL,NULL,NULL,'1','2011-03-15','2011-03-15');
INSERT INTO `ncts_elecidentify` VALUES ('1','1','10','aa','aa','cc','1','2011-03-16','2011-03-16'),  ('2','2','20','bb','bb','bb','1','2011-03-16','2011-03-16'),  ('3','3','10','cc','cc','cc','1','2011-03-16','2011-03-16'),  ('4','4','40','dd','dd','dd','1','2011-03-16','2011-03-16');
INSERT INTO `ncts_user` VALUES ('1','admin','123','aa','aa','aa','aa','1','1','1','1'),  ('2','user','123','bb','bb','bb','bb','2','0','0','1'),  ('3','aa','123','cc','cc','cc','cc','1','0','0','0'),  ('402881c12eb82480012eb824adf80001','aa','aa','aa','aa','aa','','0','0','0','1');
INSERT INTO `user` VALUES ('1','张三','aa'),  ('2','李四','bb'),  ('22','aaaa','aa'),  ('23','?? ','11'),  ('24','?','aa'),  ('25','??','cc'),  ('26','王','啊啊');
