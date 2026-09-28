-- MySQL dump 10.13  Distrib 8.0.45, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quanlysuckhoecongdan
-- ------------------------------------------------------
-- Server version	9.6.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ 'a35a2d81-17c8-11f1-8870-6c2b59632347:1-536';

--
-- Table structure for table `cong_dan`
--

DROP TABLE IF EXISTS `cong_dan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cong_dan` (
  `soCCCD` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hoTen` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tuoi` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`soCCCD`),
  UNIQUE KEY `soCCCD` (`soCCCD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cong_dan`
--

LOCK TABLES `cong_dan` WRITE;
/*!40000 ALTER TABLE `cong_dan` DISABLE KEYS */;
INSERT INTO `cong_dan` VALUES ('052201001234','Nguyễn Văn A','17','nguyenvana@gmail.com'),('052201003456','Phạm Thị D','20','phamthid@gmail.com'),('052201005678','Trần Thị B','18','tranthib@gmail.com'),('052201007890','Hoàng Văn E','21','hoangvane@gmail.com'),('052201009012','Lê Văn C','19','levanc@gmail.com');
/*!40000 ALTER TABLE `cong_dan` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-09-29  4:25:19
