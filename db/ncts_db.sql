-- MySQL dump 10.10
--
-- Host: localhost    Database: ncts_db
-- ------------------------------------------------------
-- Server version	5.0.15-nt

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ncts_application`
--

DROP TABLE IF EXISTS `ncts_application`;
CREATE TABLE `ncts_application` (
  `ApplyID` varchar(32) NOT NULL default '',
  `UserID` varchar(32) NOT NULL COMMENT '用户ID',
  `SiteName` varchar(100) NOT NULL COMMENT '网站名',
  `SiteDomains` varchar(200) NOT NULL COMMENT '网站域名',
  `SiteType` char(1) NOT NULL COMMENT '网站类型',
  `SiteICPNo` varchar(50) NOT NULL COMMENT '网站ICP许可证号',
  `SiteIP` varchar(15) NOT NULL,
  `SiteISP` varchar(100) NOT NULL,
  `SiteOpenDay` date NOT NULL,
  `SiteMail` varchar(100) NOT NULL,
  `SiteAddress` varchar(100) NOT NULL,
  `SiteInfo` varchar(200) default NULL,
  `SNBXH` varchar(30) NOT NULL,
  `OperID` varchar(32) default NULL COMMENT '注册：置空\r\n变更：将要变更的标识ID\r\n注销：将要注销的标识ID',
  `ApplyType` char(1) NOT NULL COMMENT '1:注册申请\r\n2:注销申请\r\n3:变更申请\r\n4.吊销申请',
  `AuditStatus` char(1) NOT NULL COMMENT '0:未受理\r\n1:受理\r\n2:审核通过\r\n3:审核驳回',
  `AuditComment` varchar(200) default NULL COMMENT '审核意见',
  `CurrHandleDept` varchar(32) default NULL,
  `CurrHandler` varchar(32) default NULL,
  `HandleTime` date default NULL,
  `NextHandleDept` varchar(32) default NULL,
  `IsValid` char(1) NOT NULL COMMENT '0: 无效\r\n1：有效',
  `CreateDate` date NOT NULL,
  `DestroyDate` date NOT NULL,
  PRIMARY KEY  (`ApplyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ncts_application`
--


/*!40000 ALTER TABLE `ncts_application` DISABLE KEYS */;
LOCK TABLES `ncts_application` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `ncts_application` ENABLE KEYS */;

--
-- Table structure for table `ncts_elecidentify`
--

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
  `DestroyDate` date default NULL,
  PRIMARY KEY  (`IdentifyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ncts_elecidentify`
--


/*!40000 ALTER TABLE `ncts_elecidentify` DISABLE KEYS */;
LOCK TABLES `ncts_elecidentify` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `ncts_elecidentify` ENABLE KEYS */;

--
-- Table structure for table `ncts_user`
--

DROP TABLE IF EXISTS `ncts_user`;
CREATE TABLE `ncts_user` (
  `UserID` varchar(32) NOT NULL default '',
  `UserName` varchar(20) NOT NULL COMMENT '用户名',
  `Password` varchar(32) NOT NULL COMMENT '密码',
  `SZCH` varchar(40) NOT NULL COMMENT '企业注册号',
  `SQYMC` varchar(100) NOT NULL COMMENT '企业名称',
  `SFZRXM` varchar(500) NOT NULL COMMENT '企业法人',
  `SNBXH` varchar(30) default NULL COMMENT '企业内部流水号',
  `IsOpened` char(1) NOT NULL COMMENT '1：开通；0：未开通',
  `IsRepeat` char(1) NOT NULL COMMENT '1:有重复；0：无重复',
  `IsSCan` char(1) NOT NULL COMMENT '1:已扫描；0：未扫描',
  `IsValid` char(1) NOT NULL COMMENT '1:有效 0:无效',
  PRIMARY KEY  (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ncts_user`
--


/*!40000 ALTER TABLE `ncts_user` DISABLE KEYS */;
LOCK TABLES `ncts_user` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `ncts_user` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

