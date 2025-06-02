-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 02, 2025 at 05:05 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `deiparine`
--

-- --------------------------------------------------------

--
-- Table structure for table `area_tbl`
--

CREATE TABLE `area_tbl` (
  `a_id` int(11) NOT NULL,
  `a_name` varchar(250) NOT NULL,
  `a_rate` float NOT NULL,
  `a_location` varchar(250) NOT NULL,
  `a_status` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `area_tbl`
--

INSERT INTO `area_tbl` (`a_id`, `a_name`, `a_rate`, `a_location`, `a_status`) VALUES
(5, 'A1', 100, 'Lower Ground', 'Occupied'),
(6, 'A2', 100, 'Lower Ground', 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_logs`
--

CREATE TABLE `tbl_logs` (
  `log_id` int(11) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `action` text NOT NULL,
  `log_time` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_logs`
--

INSERT INTO `tbl_logs` (`log_id`, `user_name`, `action`, `log_time`) VALUES
(15, 'nicodeiparine14@gmail.com', 'Failed login attempt', '2025-05-26 11:04:19'),
(16, 'nicodeiparine14@gmail.com', 'Employee logged in', '2025-05-26 11:04:23'),
(17, 'nicodeiparine14@gmail.com', 'Employee logged in', '2025-05-26 11:12:23'),
(18, 'nicodeiparine14@gmail.com', 'Employee logged in', '2025-05-26 11:12:47'),
(19, 'nicodeiparine17@gmail.com', 'Failed login attempt', '2025-05-27 04:52:52'),
(20, 'nicodeiparine14@gmail.com', 'Employee logged in', '2025-05-27 04:53:02'),
(21, 'deiparinenico17@gmail.com', 'Failed login attempt', '2025-05-27 04:54:22'),
(22, 'nicodeiparine14@gmail.com', 'Employee logged in', '2025-05-27 04:54:47'),
(23, 'nicodeiparine14@gmail.com', 'Employee logged in', '2025-05-27 05:32:33'),
(24, 'nicodeiparine14@gmail.com', 'Employee logged in', '2025-05-27 05:34:07'),
(25, 'deiparinenico17@gmail.com', 'Inactive account login attempt', '2025-05-27 05:36:56'),
(26, 'deiparinenico17@gmail.com', 'Inactive account login attempt', '2025-05-27 05:37:20'),
(27, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-27 05:38:09'),
(28, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-27 06:03:25'),
(29, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-28 11:11:01'),
(30, 'nicodeiparine14@gmail.com', 'Employee logged in', '2025-05-28 11:11:41'),
(31, 'nicodeiparine14@gmail.com', 'Employee logged in', '2025-05-28 11:19:43'),
(32, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-28 16:21:29'),
(33, 'nicodeiparine14@gmail.com', 'Employee logged in', '2025-05-30 13:11:10'),
(34, 'nicodeiparine14@gmail.com', 'Employee logged in', '2025-05-30 15:53:16'),
(35, 'nicodeiparine14@gmail.com', 'Tollier logged in', '2025-05-30 15:57:13'),
(36, 'nicodeiparine14@gmail.com', 'Tollier logged in', '2025-05-30 17:40:48'),
(37, 'nicodeiparine14@gmail.com', 'Tollier logged in', '2025-05-31 03:32:00'),
(38, 'deiparinenico14@gmail.com', 'Failed login attempt', '2025-05-31 03:54:43'),
(39, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 03:54:49'),
(40, 'nicodeiparin14@gmail.com', 'Failed login attempt', '2025-05-31 03:56:32'),
(41, 'nicodeiparine14@gmail.com', 'Tollier logged in', '2025-05-31 03:56:40'),
(42, 'nicodeiparine14@gmail.com', 'Tollier logged in', '2025-05-31 04:10:28'),
(43, 'deiparinenico14@gmail.com', 'Failed login attempt', '2025-05-31 04:11:04'),
(44, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 04:11:16'),
(45, 'nicodieparine14@gmail.com', 'Failed login attempt', '2025-05-31 04:23:08'),
(46, 'nicodieparine14@gmail.com', 'Failed login attempt', '2025-05-31 04:23:17'),
(47, 'nicodeiparine14@gmail.com', 'Tollier logged in', '2025-05-31 04:23:24'),
(48, 'deiparinenico14@gmail.com', 'Failed login attempt', '2025-05-31 04:31:56'),
(49, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 04:32:02'),
(50, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 04:34:01'),
(51, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 04:41:39'),
(52, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 04:46:25'),
(53, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 04:47:18'),
(54, 'deiparine14@gmail.com', 'Failed login attempt', '2025-05-31 05:00:08'),
(55, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 05:00:16'),
(56, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 05:14:50'),
(57, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 05:16:54'),
(58, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 05:18:05'),
(59, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 05:23:29'),
(60, 'nicodeiparine14@gmail.com', 'Tollier logged in', '2025-05-31 05:37:17'),
(61, 'nicodeiparine14@gmail.com', 'Changed password for User ID: 31', '2025-05-31 05:37:46'),
(62, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 05:41:02'),
(63, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 05:45:38'),
(64, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 05:53:35'),
(65, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 05:55:09'),
(66, 'deiparinenico17@gmail.com', 'Changed password for User ID: 32', '2025-05-31 05:55:27'),
(67, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 05:57:24'),
(68, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 05:58:25'),
(69, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 06:00:50'),
(70, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 06:02:26'),
(71, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 06:09:48'),
(72, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 08:25:43'),
(73, 'deiparinenico17@gmail.com', 'Activated user with ID: 21', '2025-05-31 08:26:28'),
(74, 'deiparinenico17@gmail.com', 'Updated user account with email: joharddeiparine@gmail.com', '2025-05-31 08:27:59'),
(75, 'joharddeiparine@gmail.com', 'Tollier logged in', '2025-05-31 08:30:15'),
(76, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 08:32:17'),
(77, 'deiparinenico17@gmail.com', 'Admin logged in', '2025-05-31 08:58:51'),
(78, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 09:01:53'),
(79, 'deiparine@gmail.com', 'Added a new account with email: janley@gmail.com', '2025-05-31 09:03:04'),
(80, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 09:08:27'),
(81, 'deiparine@gmail.com', 'Added a new account with email: janley@gmail.com', '2025-05-31 09:09:25'),
(82, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 09:12:09'),
(83, 'deiparine@gmail.com', 'Activated user with ID: 33', '2025-05-31 09:12:25'),
(84, 'deiparine@gmail.com', 'Activated user with ID: 34', '2025-05-31 09:12:32'),
(85, 'deiparine@gmail.com', 'Deleted user with ID: 33', '2025-05-31 09:12:37'),
(86, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 09:18:07'),
(87, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 09:38:01'),
(88, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 09:54:27'),
(89, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 09:56:49'),
(90, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 09:58:26'),
(91, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 09:59:41'),
(92, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 10:00:46'),
(93, 'janley@gmail.com', 'Changed password for User ID: 34', '2025-05-31 10:01:38'),
(94, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 10:02:50'),
(95, 'janley@gmail.com', 'Changed password for User ID: 34', '2025-05-31 10:03:00'),
(96, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 10:23:45'),
(97, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 10:24:57'),
(98, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 10:28:47'),
(99, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 10:47:41'),
(100, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 10:49:11'),
(101, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 10:53:16'),
(102, 'deiparinenico17@gmail.com', 'Failed login attempt', '2025-05-31 11:03:50'),
(103, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 11:03:56'),
(104, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 11:05:46'),
(105, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 11:22:28'),
(106, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 11:28:27'),
(107, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 11:32:51'),
(108, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 11:36:46'),
(109, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 11:54:18'),
(110, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 11:56:00'),
(111, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 12:09:21'),
(112, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 12:13:43'),
(113, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 12:14:27'),
(114, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 12:52:30'),
(115, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 13:31:02'),
(116, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 13:52:58'),
(117, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 14:04:34'),
(118, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 14:16:59'),
(119, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 14:17:22'),
(120, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 14:21:21'),
(121, 'dieparine@gmail.com', 'Failed login attempt', '2025-05-31 14:32:17'),
(122, 'dieparine@gmail.com', 'Failed login attempt', '2025-05-31 14:32:25'),
(123, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 14:32:38'),
(124, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 14:34:02'),
(125, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 14:44:50'),
(126, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 14:54:06'),
(127, 'deiparinenico@gmail.com', 'Failed login attempt', '2025-05-31 14:55:57'),
(128, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 14:56:04'),
(129, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 14:56:33'),
(130, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 15:06:09'),
(131, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 15:30:19'),
(132, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 15:34:14'),
(133, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 15:36:13'),
(134, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 15:40:15'),
(135, 'janley@gmail.com', 'Tollier logged in', '2025-05-31 15:41:23'),
(136, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 16:26:35'),
(137, 'deiparine@gmail.com', 'Admin logged in', '2025-05-31 16:43:07'),
(138, 'deiparine@gmail.com', 'Admin logged in', '2025-06-01 01:32:40'),
(139, 'janley@gmail.com', 'Tollier logged in', '2025-06-01 01:36:53'),
(140, 'janley@gmail.com', 'Tollier logged in', '2025-06-01 01:40:38'),
(141, 'janley@gmail.com', 'Tollier logged in', '2025-06-01 04:10:29'),
(142, 'deiparine@gmail.com', 'Admin logged in', '2025-06-01 08:50:11'),
(143, 'janley@gmail.com', 'Tollier logged in', '2025-06-01 08:50:33'),
(144, 'janley@gmailc.om', 'Failed login attempt', '2025-06-01 08:52:58'),
(145, 'janley@gmail.com', 'Tollier logged in', '2025-06-01 08:53:06'),
(146, 'nicodeiparine@gmail.com', 'Failed login attempt', '2025-06-01 08:54:42'),
(147, 'janley@gmail.com', 'Tollier logged in', '2025-06-01 08:54:51'),
(148, 'deiparine@gmail.com', 'Admin logged in', '2025-06-01 09:00:57'),
(149, 'deiparine@gmail.com', 'Admin logged in', '2025-06-01 10:07:04'),
(150, 'janley@gmail.com', 'Tollier logged in', '2025-06-01 10:08:23'),
(151, 'deiparine@gmail.com', 'Admin logged in', '2025-06-01 10:10:05'),
(152, 'janley@gmail.com', 'Tollier logged in', '2025-06-01 10:13:04'),
(153, 'janley@gmail.com', 'Tollier logged in', '2025-06-01 10:13:34'),
(154, 'deiparine@gmail.com', 'Admin logged in', '2025-06-01 10:14:50'),
(155, 'deiparine@gmail.com', 'Added a new account with email: angel@gmail.com', '2025-06-01 10:16:12');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(20) NOT NULL,
  `u_firstname` varchar(50) NOT NULL,
  `u_lastname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_contactnumber` varchar(50) NOT NULL,
  `u_password` varchar(50) DEFAULT NULL,
  `u_hashpw` varchar(100) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL,
  `u_question` varchar(100) NOT NULL,
  `u_answer` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_firstname`, `u_lastname`, `u_email`, `u_contactnumber`, `u_password`, `u_hashpw`, `u_type`, `u_status`, `u_question`, `u_answer`) VALUES
(21, 'admin', 'admin', 'admin@gmail.com', '09123456789', 'admin12345', '41e5653fc7aeb894026d6bb7b2db7f65902b454945fa8fd65a6327047b5277fb', 'Admin', 'Active', '', ''),
(31, 'Nico', 'Deiparine', 'johard@gmail.com', '09665214786', NULL, '42531e41e1d87d4187f55ba5e0144039012ec2daa8a99297140a56175eccd589', 'Tollier', 'Active', 'What is your favorite color?', 'Red'),
(32, 'James', 'Deiparine', 'deiparine@gmail.com', '09665214786', NULL, '42531e41e1d87d4187f55ba5e0144039012ec2daa8a99297140a56175eccd589', 'Admin', 'Active', 'What is your favorite color?', 'Blue'),
(34, 'Janley', 'Deiparine', 'janley@gmail.com', '09665214786', NULL, '42531e41e1d87d4187f55ba5e0144039012ec2daa8a99297140a56175eccd589', 'Tollier', 'Active', 'What is your favorite color?', 'red');

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE `transactions` (
  `t_id` int(11) NOT NULL,
  `a_id` int(11) NOT NULL,
  `customer_name` varchar(100) NOT NULL,
  `car_plate` varchar(20) NOT NULL,
  `contact_number` varchar(20) NOT NULL,
  `hours` int(11) NOT NULL,
  `total_due` int(11) NOT NULL,
  `transaction_time` timestamp NOT NULL DEFAULT current_timestamp(),
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transactions`
--

INSERT INTO `transactions` (`t_id`, `a_id`, `customer_name`, `car_plate`, `contact_number`, `hours`, `total_due`, `transaction_time`, `status`) VALUES
(5, 5, 'Nico Deiparine', 'SH2WK', '09665214786', 4, 400, '2025-06-01 10:09:30', 'pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `area_tbl`
--
ALTER TABLE `area_tbl`
  ADD PRIMARY KEY (`a_id`);

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`log_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- Indexes for table `transactions`
--
ALTER TABLE `transactions`
  ADD PRIMARY KEY (`t_id`),
  ADD KEY `a_id` (`a_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `area_tbl`
--
ALTER TABLE `area_tbl`
  MODIFY `a_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=156;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `transactions`
--
ALTER TABLE `transactions`
  MODIFY `t_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transactions`
--
ALTER TABLE `transactions`
  ADD CONSTRAINT `transactions_ibfk_1` FOREIGN KEY (`a_id`) REFERENCES `area_tbl` (`a_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
