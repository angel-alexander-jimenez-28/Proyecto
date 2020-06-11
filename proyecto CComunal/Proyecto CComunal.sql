-- MySQL Script generated by MySQL Workbench
-- 05/27/20 13:02:09
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema consejo_comunal_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema consejo_comunal_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `consejo_comunal_db` DEFAULT CHARACTER SET utf8 ;
USE `consejo_comunal_db` ;

-- -----------------------------------------------------
-- Table `consejo_comunal_db`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `consejo_comunal_db`.`usuario` (
  `id_Usuario` VARCHAR(10) NOT NULL,
  `Primer_Nombre` VARCHAR(15) NOT NULL,
  `Segundo_Nombre` VARCHAR(15) NOT NULL,
  `Primer_Apellido` VARCHAR(15) NOT NULL,
  `Nombre_Acceso` VARCHAR(15) NOT NULL,
  `Clave_Acceso` VARCHAR(16) NOT NULL,
  PRIMARY KEY (`id_Usuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `consejo_comunal_db`.`habitante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `consejo_comunal_db`.`habitante` (
  `id_Habitante` VARCHAR(10) NOT NULL,
  `id_Usuario_fk` VARCHAR(10) NOT NULL,
  `id_Hogar_fk` VARCHAR(10) NOT NULL,
  `Cedula_Jefe` TEXT(8) NOT NULL,
  `Primer_Nombre_Jefe` VARCHAR(15) NOT NULL,
  `Segundo_Nombre_Jefe` VARCHAR(15) NOT NULL,
  `Primer_Apellido_Jefe` VARCHAR(15) NOT NULL,
  `Segundo_Apellido_Jefe` VARCHAR(15) NOT NULL,
  `Cedula_H` TEXT(8) NOT NULL,
  `Primer_Nombre_H` VARCHAR(15) NOT NULL,
  `Segundo_Nombre_H` VARCHAR(15) NOT NULL,
  `Primer_Apellido_H` VARCHAR(15) NOT NULL,
  `SegundoApellido_H` VARCHAR(15) NOT NULL,
  `Parentesco` CHAR(1) NOT NULL,
  `Fecha_Nacimiento` DATE NOT NULL,
  `Sexo` CHAR(1) NOT NULL,
  `Telefono` TEXT(11) NOT NULL,
  `Direccion` VARCHAR(80) NOT NULL,
  `Enfermedad` CHAR(1) NOT NULL,
  `Discapacidad` CHAR(1) NOT NULL,
  `Grado_Estudio` CHAR(1) NOT NULL,
  `Profesion` VARCHAR(30) NOT NULL,
  `Carnet_Patria` VARCHAR(12) NOT NULL,
  `Carnet_PSUV` VARCHAR(12) NOT NULL,
  `Pensionado` CHAR(1) NOT NULL,
  `Centro_Electoral` VARCHAR(80) NOT NULL,
  `Talla_Zapato` FLOAT NOT NULL,
  `Talla_Camisa` FLOAT NOT NULL,
  `Talla_Pantalon` FLOAT NOT NULL,
  PRIMARY KEY (`id_Habitante`),
  INDEX `id_Usuario_fk_idx` (`id_Usuario_fk` ASC),
  CONSTRAINT `id_Usuario_fk`
    FOREIGN KEY (`id_Usuario_fk`)
    REFERENCES `consejo_comunal_db`.`usuario` (`id_Usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `consejo_comunal_db`.`constancias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `consejo_comunal_db`.`constancias` (
  `id_Constancias` VARCHAR(10) NOT NULL,
  `Primer_Nombre` VARCHAR(15) NOT NULL,
  `Segundo_Nombre` VARCHAR(15) NOT NULL,
  `Primer_Apellido` VARCHAR(15) NOT NULL,
  `Segundo_Apellido` VARCHAR(15) NOT NULL,
  `id_Habitante_fk` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id_Constancias`),
  INDEX `id_Habitante_fk_idx` (`id_Habitante_fk` ASC),
  CONSTRAINT `id_Habitante_fk`
    FOREIGN KEY (`id_Habitante_fk`)
    REFERENCES `consejo_comunal_db`.`habitante` (`id_Habitante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `consejo_comunal_db`.`Familia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `consejo_comunal_db`.`Familia` (
  `id_Familiar` VARCHAR(10) NOT NULL,
  `id_Hogar` VARCHAR(10) NOT NULL,
  `Nro_Manzana` VARCHAR(10) NOT NULL,
  `1er_Nombre_Manzanera` VARCHAR(15) NOT NULL,
  `2do_Nombre_Manzanera` VARCHAR(15) NOT NULL,
  `1er_Apellido_Manzanera` VARCHAR(15) NOT NULL,
  `2do_Apellido_Manzanera` VARCHAR(15) NOT NULL,
  `Tipo_Vivienda` CHAR(1) NOT NULL,
  `Vulnerabilidad_Familiar` VARCHAR(100) NOT NULL,
  `Proteccion_Alimenticia` CHAR(1) NOT NULL,
  `Tipo_Mascota` CHAR(1) NOT NULL,
  `TIpo_Gas` CHAR(1) NOT NULL,
  `Nro_Bombonas` INT NOT NULL,
  `Nro_Carga_Familiar` INT NOT NULL,
  PRIMARY KEY (`id_Familiar`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `consejo_comunal_db`.`beneficios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `consejo_comunal_db`.`beneficios` (
  `id_Beneficios` VARCHAR(10) NOT NULL,
  `id_Habitantes_fk` VARCHAR(10) NOT NULL,
  `Amor_Mayor` CHAR(1) NOT NULL,
  `Parto_Humanizado` CHAR(1) NOT NULL,
  `Lactancia` CHAR(1) NOT NULL,
  `Jose Gregorio` CHAR(1) NOT NULL,
  `Chamba_Juvenil` CHAR(1) NOT NULL,
  `Economia_Popular` CHAR(1) NOT NULL,
  `Brigadista` CHAR(1) NOT NULL,
  `Hogares_Patria` CHAR(1) NOT NULL,
  `Fecha` DATE NOT NULL,
  PRIMARY KEY (`id_Beneficios`),
  INDEX `id_Habitante_fk_idx` (`id_Habitantes_fk` ASC),
  CONSTRAINT `id_Habitante_fk`
    FOREIGN KEY (`id_Habitantes_fk`)
    REFERENCES `consejo_comunal_db`.`habitante` (`id_Habitante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `consejo_comunal_db`.`Habitante-Por-Familia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `consejo_comunal_db`.`Habitante-Por-Familia` (
  `id_habitante_fk` VARCHAR(10) NOT NULL,
  `id_familia_fk` VARCHAR(10) NOT NULL,
  `Nro_Casa` INT NOT NULL,
  INDEX `id_Habitante_fk_idx` (`id_habitante_fk` ASC),
  INDEX `id_Familia_fk_idx` (`id_familia_fk` ASC),
  CONSTRAINT `id_Familia_fk`
    FOREIGN KEY (`id_familia_fk`)
    REFERENCES `consejo_comunal_db`.`Familia` (`id_Familiar`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_Habitante_fk`
    FOREIGN KEY (`id_habitante_fk`)
    REFERENCES `consejo_comunal_db`.`habitante` (`id_Habitante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
