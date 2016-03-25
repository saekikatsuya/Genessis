-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2016 年 03 月 25 日 15:46
-- 服务器版本: 5.6.12-log
-- PHP 版本: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `first`
--
CREATE DATABASE IF NOT EXISTS `first` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `first`;

-- --------------------------------------------------------

--
-- 表的结构 `administrator`
--

CREATE TABLE IF NOT EXISTS `administrator` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `administrator`
--

INSERT INTO `administrator` (`username`, `password`) VALUES
('', 'd41d8cd98f00b204e9800998ecf8427e');

-- --------------------------------------------------------

--
-- 表的结构 `thefirst`
--

CREATE TABLE IF NOT EXISTS `thefirst` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name1` varchar(255) CHARACTER SET gb2312 NOT NULL,
  `sex1` varchar(255) CHARACTER SET gb2312 NOT NULL,
  `academy1` varchar(255) CHARACTER SET gb2312 NOT NULL,
  `grade1` int(255) NOT NULL,
  `tel1` int(11) NOT NULL,
  `name2` varchar(255) CHARACTER SET gb2312 NOT NULL,
  `sex2` varchar(255) CHARACTER SET gb2312 NOT NULL,
  `academy2` varchar(255) CHARACTER SET gb2312 NOT NULL,
  `grade2` int(255) NOT NULL,
  `tel2` int(11) NOT NULL,
  `score` int(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=12 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
