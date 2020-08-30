-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.31-log


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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`student_id`,`student_full_name`,`student_name_with_initials`,`student_nic`,`student_dob`,`student_gender`,`student_address`,`student_contact_mobile`,`student_contact_email`,`student_contact_home`,`student_remark_1`,`student_remark_2`,`student_status`) VALUES 
 (1,'Aluthwatte Baron Denuka Ariyasinghe','A,B.D.C Ariyasinghe','950552476V','1995-02-24','Male','Hinguruwewa, Andiyagala','0715678862','ddenukaariyasinghe@gmail.com','0252250320','','',1),
 (2,'wickrama karulage sithum sanjula','W k s sanjula','12365','2020-08-18','Male','kaduwela','4695556','ahsggahsgh','456985','','',1),
 (3,'nethmi dananjana dissanayke','N D dissanayake','88888888','1996-03-27','Male','gampaha','4444444444','ssssssssssss','89652','','',1),
 (4,'wanasinghe arachchilage chrishan sanjeewa','W. A. C Sanjeewa','789632586','1999-05-21','Female','pamunugama','478569325','ahahgqgsysuqhgs','143333987','','',1),
 (5,'wijesinghe arachchilage shanika amarasena','W.A.S.Amarasena','74223695569','1998-02-24','Female','Kurunegala','0718888888888','dddddddddddddddddd','0375559332','','',1),
 (6,'Nishadi Heshani Dias','N.K.Dias','1111144485569','1998-05-25','Female','Kandana','7896552333','wahskajhldkhsdshdu','78523696644','','',1),
 (7,'Kankanamlage Thinuri Nanayakkara','K.T.Nanayakkara','12333965857','2000-12-15','Male','Homagama','46548486323','78659505659','0117883325','','',1),
 (8,'Sachith Deminda Kularathne','S.D.Kularathne','498+982356','1997-03-21','Male','Kadawatha','0719935755','sasdhgdahdgjdjahdj','223685015','','',1),
 (9,'Gihan Madushanka Hewage','G.M.Hewage','111233985666','1996-10-09','Male','Ganemulla','1112369857','adsjkddjd;jdiodjweio','0885963325','','',1),
 (10,'Kasun Shrimal Wijethilake','K.S.Wijethilake','22325699779','1996-06-13','Male','Kandy','11154646652','ygkygoluihyyhihihkj','8983206622','','',1);
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
