-- MySQL dump 10.13  Distrib 8.0.12, for macos10.13 (x86_64)
--
-- Host: localhost    Database: blog
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `posts`
--

DROP TABLE IF EXISTS `posts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `posts` (
  `title` varchar(120) DEFAULT NULL,
  `text` varchar(1000) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  `date_of_publish` date DEFAULT NULL,
  `ID` int(11) NOT NULL,
  `tags` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `posts`
--

LOCK TABLES `posts` WRITE;
/*!40000 ALTER TABLE `posts` DISABLE KEYS */;
INSERT INTO `posts` VALUES ('How we can be happy?','The first step, however, is to make a conscious choice to boost your happiness. Counteract Negative Thoughts and Feelings. Remember, Money Can’t Buy Happiness. #happy #life #newlife #ilovemylife','inkognito','2018-12-12',1,'family, development, improvments'),('Family, yes or no??','[Family] Money Can’t Buy family. #happy #life #newlife #ilovemylife','melovin','2018-12-15',2,'family, developments'),('Our environment','I like a nature','melovin','2018-12-14',3,NULL),('Music','I like a music','melovin','2018-12-14',4,NULL),('Seriously!','I like a nature','melovin','2018-10-12',5,'favorite'),('Sport,it is mine?','I like a footbal','melovin','2018-11-12',6,NULL),('What you had for breakfast?','it is a very tasty','someone','2018-11-12',7,NULL),('I need a rest','I want a vacation','someone','2018-10-12',8,NULL),('I need help','I can find a things to prevent a very bored moon','someone','2018-10-12',9,NULL),('Do you like a photo?','I can make a phone for you!','someone','2018-12-12',10,NULL),('Use popular hashtags','A simple Google search will tell you all you need to know.','someone','2018-12-12',11,NULL),('Share teasers','Teaser photos are great for catching users interest and for driving photo likes!','someone','2018-10-12',12,NULL),('Ask your users for help','If it is a goal of your brands to get on Instagrams most popular page, and you have enough followers to do!','melovin','2018-12-21',13,'instagram, improvments'),('Welcome a guest Instagrammer','Fellow fashion blogger Chriselle Lim of The Chriselle Factor also took over Nordstrom Instagram account recently!','melovin','2018-12-25',14,NULL),('Discover new people and brands to follow','Instagram will suggest  “Videos you might like” and will show you accounts from other users you might want to check out.!','melovin','2018-12-05',15,'instagram');
/*!40000 ALTER TABLE `posts` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-05  9:59:05
