-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 04, 2020 at 03:31 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `list`
--

-- --------------------------------------------------------

--
-- Table structure for table `lista`
--

CREATE TABLE `lista` (
  `id` int(11) NOT NULL,
  `nenshkrimi` varchar(50) NOT NULL,
  `orari_mesimore` varchar(50) NOT NULL,
  `profa` varchar(50) NOT NULL,
  `data` varchar(40) NOT NULL,
  `lenda` varchar(50) NOT NULL,
  `grupi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lista`
--

INSERT INTO `lista` (`id`, `nenshkrimi`, `orari_mesimore`, `profa`, `data`, `lenda`, `grupi`) VALUES
(171841112, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 03:49:31', 'SHKI', ' Mbiemri'),
(171841114, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 03:49:31', 'SHKI', ' Mbiemri'),
(171841111, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 03:50:30', 'SHKI', ' Mbiemri'),
(171841112, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 03:50:30', 'SHKI', ' Mbiemri'),
(171841115, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 03:50:30', 'SHKI', ' Mbiemri'),
(171841115, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:00:20', 'SHKI', ' Mbiemri'),
(161731110, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:00:20', 'SHKI', ' Mbiemri'),
(171842003, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:00:20', 'SHKI', ' Mbiemri'),
(161732007, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:00:20', 'SHKI', ' Mbiemri'),
(171843103, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:00:20', 'SHKI', ' Mbiemri'),
(171841115, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:04:57', 'SHKI', ' Mbiemri'),
(161731110, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:04:57', 'SHKI', ' Mbiemri'),
(171842003, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:04:57', 'SHKI', ' Mbiemri'),
(161732007, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:04:57', 'SHKI', ' Mbiemri'),
(171843103, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:04:57', 'SHKI', ' Mbiemri'),
(171841112, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:05:22', 'SHKI', ' Mbiemri'),
(171841114, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:05:22', 'SHKI', ' Mbiemri'),
(161732007, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:05:22', 'SHKI', ' Mbiemri'),
(171841115, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:14:49', 'SHKI', '####'),
(161731110, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:14:49', 'SHKI', '####'),
(171842003, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:14:49', 'SHKI', '####'),
(161732007, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:14:49', 'SHKI', '####'),
(171843103, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:14:49', 'SHKI', '####'),
(171841115, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:16:14', 'SHKI', '####'),
(161731110, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:16:14', 'SHKI', '####'),
(171842003, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:16:14', 'SHKI', '####'),
(161732007, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:16:14', 'SHKI', '####'),
(171843103, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:16:14', 'SHKI', '####'),
(171841115, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:18:48', 'SHKI', '####'),
(161731110, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:18:48', 'SHKI', '####'),
(171842003, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:18:48', 'SHKI', '####'),
(161732007, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:18:48', 'SHKI', '####'),
(171843103, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:18:48', 'SHKI', '####'),
(171841112, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:20:01', 'SHKI', '####'),
(171841114, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:20:01', 'SHKI', '####'),
(161732007, 'I nenshkruar', ' 9:30', 'Fatos Maxhuni', '02-11-2020 04:20:01', 'SHKI', '####');

-- --------------------------------------------------------

--
-- Table structure for table `listapanenshkruar`
--

CREATE TABLE `listapanenshkruar` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `listapanenshkruar`
--

INSERT INTO `listapanenshkruar` (`id`) VALUES
(171841111),
(171841112),
(171841113),
(171841114),
(171841116),
(171841117),
(171841118),
(171841119),
(171842000),
(161732001),
(161732002),
(171842004),
(141532005),
(171842006),
(171842008),
(171842009),
(171843101),
(161743102),
(171841111),
(171841112),
(171841113),
(171841114),
(171841116),
(171841117),
(171841118),
(171841119),
(171842000),
(161732001),
(161732002),
(171842004),
(141532005),
(171842006),
(171842008),
(171842009),
(171843101),
(161743102),
(171841111),
(171841113),
(171841115),
(171841116),
(171841117),
(171841118),
(171841119),
(161731110),
(171842000),
(161732001),
(161732002),
(171843101),
(171842004),
(141532005),
(171842006),
(161743102),
(171842009),
(171843101),
(161743102),
(171843103),
(171841111),
(171841112),
(171841113),
(171841114),
(171841116),
(171841117),
(171841118),
(171841119),
(171842000),
(161732001),
(161732002),
(171842004),
(141532005),
(171842006),
(171842008),
(171842009),
(171843101),
(161743102),
(171841111),
(171841112),
(171841113),
(171841114),
(171841116),
(171841117),
(171841118),
(171841119),
(171842000),
(161732001),
(161732002),
(171842004),
(141532005),
(171842006),
(171842008),
(171842009),
(171843101),
(161743102),
(171841111),
(171841112),
(171841113),
(171841114),
(171841116),
(171841117),
(171841118),
(171841119),
(171842000),
(161732001),
(161732002),
(171842004),
(141532005),
(171842006),
(171842008),
(171842009),
(171843101),
(161743102),
(171841111),
(171841113),
(171841115),
(171841116),
(171841117),
(171841118),
(171841119),
(161731110),
(171842000),
(161732001),
(161732002),
(171843101),
(171842004),
(141532005),
(171842006),
(161743102),
(171842009),
(171843101),
(161743102),
(171843103);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `emri_mbiemri` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `emri_mbiemri`) VALUES
(171841111, 'Amir Rrahmani'),
(171841111, 'Amir Rrahmani  '),
(171841112, 'Leart Paqarada'),
(171841113, 'Mërgim Vojvoda'),
(171841114, 'Ardin Dallku'),
(171841115, 'Fidan Aliti'),
(171841116, 'Hekuran Kryeziu'),
(171841117, 'Idriz Voca'),
(171841118, 'Herolind Shala'),
(171841119, 'Gjelbrim Taipi'),
(161731110, 'Edon Zhegrova'),
(171842010, 'Arbër Zeneli'),
(161732001, 'Bernard Berisha'),
(161732002, 'Bersant Celina'),
(171842003, 'Milot Rashica'),
(171842004, 'Elbasan Rashani'),
(141532005, 'Atdhe Nuhiu'),
(171842006, 'Vedat Muriqi'),
(161732007, 'Donis Avdijaj'),
(171842008, 'Erton Fejzullahu'),
(171842009, 'Lirim Kastrati'),
(171843101, 'Benjamin Kololli'),
(161743102, 'Alban Pnishi'),
(171843103, 'Besar Musolli');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `ID` int(11) NOT NULL,
  `full_name` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `option` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `full_name`, `username`, `password`, `phone`, `gender`, `option`) VALUES
(1, 'user', 'user', '12dea96fec20593566ab75692c9949596833adc9', '123123', 'dope', 'User');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
