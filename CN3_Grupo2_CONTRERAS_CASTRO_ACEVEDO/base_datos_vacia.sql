-- --------------------------------------------------------
-- Host:                         theacpinnovacion.com
-- Server version:               10.5.8-MariaDB-1:10.5.8+maria~focal - mariadb.org binary distribution
-- Server OS:                    debian-linux-gnu
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for ClinicaVeterinariaBD
DROP DATABASE IF EXISTS `ClinicaVeterinariaBD`;
CREATE DATABASE IF NOT EXISTS `ClinicaVeterinariaBD` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `ClinicaVeterinariaBD`;

-- Dumping structure for table ClinicaVeterinariaBD.DuenoMascota
DROP TABLE IF EXISTS `DuenoMascota`;
CREATE TABLE IF NOT EXISTS `DuenoMascota` (
  `idDuenoMascota` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `edad` smallint(6) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `nombreMascota` varchar(100) DEFAULT NULL,
  `sexoMascota` char(1) DEFAULT NULL,
  PRIMARY KEY (`idDuenoMascota`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
