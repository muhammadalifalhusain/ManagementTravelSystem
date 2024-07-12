-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 12, 2024 at 08:55 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `travelfinal`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin1', 'admin1'),
('admin2', 'admin2');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_details`
--

CREATE TABLE `transaksi_details` (
  `id` int(11) NOT NULL,
  `travel_no` varchar(100) NOT NULL,
  `keberangkatan` varchar(100) NOT NULL,
  `tujuan` varchar(100) NOT NULL,
  `waktu` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `harga` varchar(100) NOT NULL,
  `kursi` varchar(100) NOT NULL,
  `nama` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi_details`
--

INSERT INTO `transaksi_details` (`id`, `travel_no`, `keberangkatan`, `tujuan`, `waktu`, `harga`, `kursi`, `nama`) VALUES
(18, 'bh-12', 'Demak', 'Semarang', '2024-07-11 11:35:42', '12345', '1', 'TEST'),
(19, 'bh-12', 'Demak', 'Semarang', '2024-07-11 11:37:27', '24690', '2', 'test1'),
(20, 'bh-12', 'Demak', 'Semarang', '2024-07-11 11:46:45', '12345', '1', 'test2'),
(21, 'bh-12', 'Demak', 'Semarang', '2024-07-11 11:46:47', '12345', '1', 'test2'),
(22, 'bh-12', 'Demak', 'Semarang', '2024-07-11 11:54:14', '12345', '1', 'husain'),
(23, 'Kencana', 'Jepara', 'Semarang', '2024-07-11 12:00:59', '14600', '1', 'tiga'),
(25, 'Kencana', 'Jepara', 'Semarang', '2024-07-21 12:18:23', '14600', '1', 'enam'),
(27, 'Kencana', 'Jepara', 'Semarang', '2024-07-22 17:00:00', '14600', '1', 'tuju'),
(28, 'Kencana', 'Jepara', 'Semarang', '2024-07-26 12:36:46', '14600', '1', 'lapan'),
(29, 'Kencana', 'Jepara', 'Semarang', '2024-07-11 17:25:25', '29200', '2', 'tuju'),
(30, 'Kencana', 'Jepara', 'Semarang', '2024-07-11 18:58:56', '43800', '3', 'test'),
(31, 'Kencana', 'Jepara', 'Semarang', '2024-07-11 19:04:15', '29200', '2', 'test');

-- --------------------------------------------------------

--
-- Table structure for table `travel_details`
--

CREATE TABLE `travel_details` (
  `travel_no` varchar(100) NOT NULL,
  `keberangkatan` varchar(100) NOT NULL,
  `tujuan` varchar(100) NOT NULL,
  `tanggal` date NOT NULL,
  `waktu` varchar(100) NOT NULL,
  `harga` varchar(100) NOT NULL,
  `kursi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `travel_details`
--

INSERT INTO `travel_details` (`travel_no`, `keberangkatan`, `tujuan`, `tanggal`, `waktu`, `harga`, `kursi`) VALUES
('Kencana', 'Jepara', 'Semarang', '2024-07-14', '16.00', '14600', '69'),
('Rimba', 'Jepara', 'Demak', '2024-07-04', '12.00', '99000', '25'),
('Sumber', 'Jepara', 'Semarang', '2024-07-14', '16.00', '14500', '69'),
('bh-12', 'Demak', 'Semarang', '2024-07-18', '14.00', '12345', '60');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('user1', 'user1'),
('user2', 'user2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `transaksi_details`
--
ALTER TABLE `transaksi_details`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `transaksi_details`
--
ALTER TABLE `transaksi_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
