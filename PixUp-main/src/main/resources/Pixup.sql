-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Pixup
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Pixup` ;

-- -----------------------------------------------------
-- Schema Pixup
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Pixup` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `Pixup` ;

-- -----------------------------------------------------
-- Table `Pixup`.`Tbl_Estado`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Pixup`.`Tbl_Estado` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `Pixup`.`Tbl_Estado` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `NOMBRE` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
