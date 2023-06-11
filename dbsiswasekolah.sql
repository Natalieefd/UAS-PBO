-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2023 at 09:30 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbsiswasekolah`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbguru`
--

CREATE TABLE `tbguru` (
  `nip` varchar(18) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `tempatlahir` varchar(30) NOT NULL,
  `tanggallahir` date NOT NULL,
  `jeniskelamin` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbguru`
--

INSERT INTO `tbguru` (`nip`, `nama`, `password`, `tempatlahir`, `tanggallahir`, `jeniskelamin`) VALUES
('199801012021042025', 'Natalie Fuad', '123', 'Samarinda', '1998-01-01', 'nataliefu'),
('200201012023032027', 'Salsa Abimayu', '123', 'Samarida', '2002-01-01', 'Perempuan');

-- --------------------------------------------------------

--
-- Table structure for table `tbjadwalkbm`
--

CREATE TABLE `tbjadwalkbm` (
  `kelas` varchar(6) NOT NULL,
  `hari` varchar(10) NOT NULL,
  `jam` varchar(30) NOT NULL,
  `matapelajaran` varchar(30) NOT NULL,
  `keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbjadwalkbm`
--

INSERT INTO `tbjadwalkbm` (`kelas`, `hari`, `jam`, `matapelajaran`, `keterangan`) VALUES
('VIII B', 'SENIN', '07.30 - 10.30', 'Bahasa Indonesia', '');

-- --------------------------------------------------------

--
-- Table structure for table `tbmatapelajaran`
--

CREATE TABLE `tbmatapelajaran` (
  `idmatapelajaran` varchar(3) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alokasiwaktu` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbmatapelajaran`
--

INSERT INTO `tbmatapelajaran` (`idmatapelajaran`, `nama`, `alokasiwaktu`) VALUES
('M01', 'Matematika', '3'),
('M02', 'Bahasa Indonesia', '3'),
('M03', 'Bahasa Inggris', '3'),
('M04', 'Prakarya', '2');

-- --------------------------------------------------------

--
-- Table structure for table `tbsiswa`
--

CREATE TABLE `tbsiswa` (
  `nisn` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `tanggallahir` date NOT NULL,
  `jeniskelamin` varchar(9) NOT NULL,
  `tempatlahir` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbsiswa`
--

INSERT INTO `tbsiswa` (`nisn`, `nama`, `password`, `tanggallahir`, `jeniskelamin`, `tempatlahir`) VALUES
('20030101', 'Alisya Putri', '123', '2003-01-01', 'Perempuan', 'Samarinda'),
('2003071717', 'Natalie Fuad', '123', '2023-05-17', 'Perempuan', 'Samarinda');

-- --------------------------------------------------------

--
-- Table structure for table `tbstaf`
--

CREATE TABLE `tbstaf` (
  `nip` varchar(18) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `tempatlahir` varchar(30) NOT NULL,
  `tanggallahir` date NOT NULL,
  `email` varchar(30) NOT NULL,
  `notelp` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbstaf`
--

INSERT INTO `tbstaf` (`nip`, `nama`, `password`, `tempatlahir`, `tanggallahir`, `email`, `notelp`) VALUES
('199901012021042025', 'Natalie Fuad', '123', 'Samarinda', '1990-01-01', 'nataliefuad@gmail.com', '+6282287165275');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbguru`
--
ALTER TABLE `tbguru`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `tbmatapelajaran`
--
ALTER TABLE `tbmatapelajaran`
  ADD PRIMARY KEY (`idmatapelajaran`);

--
-- Indexes for table `tbsiswa`
--
ALTER TABLE `tbsiswa`
  ADD PRIMARY KEY (`nisn`);

--
-- Indexes for table `tbstaf`
--
ALTER TABLE `tbstaf`
  ADD PRIMARY KEY (`nip`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
