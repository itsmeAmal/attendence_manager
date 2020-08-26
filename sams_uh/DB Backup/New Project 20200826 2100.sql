-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.30-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema sams_uh
--

CREATE DATABASE IF NOT EXISTS sams_uh;
USE sams_uh;

--
-- Definition of table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
  `attendance_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `attendance_student_id` int(10) unsigned DEFAULT NULL,
  `attendance_date_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `attendance_module_id` int(10) unsigned DEFAULT NULL,
  `attendance_lecture_room_id` int(10) unsigned DEFAULT NULL,
  `attendance_lecturer_id` int(10) unsigned DEFAULT NULL,
  `attendance_status` tinyint(1) unsigned DEFAULT NULL,
  `attendance_detail` varchar(450) DEFAULT NULL,
  PRIMARY KEY (`attendance_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;


--
-- Definition of table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `student_full_name` varchar(450) DEFAULT NULL,
  `student_name_with_initials` varchar(450) DEFAULT NULL,
  `student_nic` varchar(45) DEFAULT NULL,
  `student_dob` date DEFAULT NULL,
  `student_gender` varchar(45) DEFAULT NULL,
  `student_address` varchar(450) DEFAULT NULL,
  `student_contact_mobile` varchar(45) DEFAULT NULL,
  `student_contact_email` varchar(45) DEFAULT NULL,
  `student_contact_home` varchar(45) DEFAULT NULL,
  `student_remark_1` varchar(450) DEFAULT NULL,
  `student_remark_2` varchar(450) DEFAULT NULL,
  `student_status` tinyint(1) unsigned NOT NULL DEFAULT '1',
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`student_id`,`student_full_name`,`student_name_with_initials`,`student_nic`,`student_dob`,`student_gender`,`student_address`,`student_contact_mobile`,`student_contact_email`,`student_contact_home`,`student_remark_1`,`student_remark_2`,`student_status`) VALUES 
 (1,'test user','t. user','654987321v','2020-08-09','Male','test address','0777123456','test@gmail.com','','','',1),
 (2,'full name 2','f name 2','910550292v','2020-08-27','Male','test address 2','0777712345','test2@gmail.com','0117100100','test remark','',1);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `user_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
