-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2018 at 04:13 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.1.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `heal&cure`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `dname` varchar(80) NOT NULL,
  `dinfo` varchar(200) NOT NULL,
  `dpassword` varchar(50) NOT NULL,
  `demail` varchar(85) NOT NULL,
  `dcontact` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`dname`, `dinfo`, `dpassword`, `demail`, `dcontact`) VALUES
('b1', 'neurologist, MBBS', '12', 'b1@yahoo.com', '019729864'),
('Nafisa Israt', 'MBBS', 'nafisa', 'nafisa@gmail.com', '0871261313'),
('Nahin Islam', 'FCFS', 'nahin', 'nahin@yahoo.com', '019976585'),
('Norin Islam', 'phsycologist', 'norin', 'norin@yahoo.com', '09766534244'),
('Hafizur Rahman', 'Cardiologist, MBBS', 'hafiz', 'hafiz@gmail.com', '0823972896'),
('Navid Rahman', 'Cardiologist', 'navid', 'nr@yahoo.com', '0928438572'),
('Samia Akter', 'MBBS', 'Samia', 'samia@gmail.com', '097766443267'),
('nafis', 'mbbs,fcfs', 'n', 'nafis@', '088544');

-- --------------------------------------------------------

--
-- Table structure for table `drug`
--

CREATE TABLE `drug` (
  `drugname` varchar(80) NOT NULL,
  `drugdose` varchar(10) NOT NULL,
  `drugadvice` varchar(50) NOT NULL,
  `duration` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `drug`
--

INSERT INTO `drug` (`drugname`, `drugdose`, `drugadvice`, `duration`) VALUES
('napa', '1+0+1', 'before meal', '7 days'),
('napa', '0+0+1', '3 days', 'after meal'),
('Napa', '1+1+1', '7 days', 'after meal');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `docname` varchar(100) NOT NULL,
  `pid` int(20) NOT NULL,
  `pname` varchar(80) NOT NULL,
  `page` int(3) NOT NULL,
  `psex` varchar(10) NOT NULL,
  `pcontact` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`docname`, `pid`, `pname`, `page`, `psex`, `pcontact`) VALUES
('Nafisa Israt', 1, 'Lamia', 24, 'Female', '0190891237'),
('Nafisa Israt', 2, 'Nabila', 21, 'Female', '0176249294'),
('b1', 0, 'Rahima Begum', 25, 'female', '01877824677'),
('b1', 3, 'Annoor', 23, 'Male', '013123456700'),
('Nafisa Israt', 11, 'Hafiz', 45, 'Male', '098209734'),
('Nafisa Israt', 10, 'Talha', 10, 'Male', '56736482'),
('Samia Akter', 122, 'Karim', 12, 'Male', '09182091466'),
('Samia Akter', 123, 'Karima', 12, 'Female', '09182098038'),
('nafis', 125, 'b2', 35, 'male', '865');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
