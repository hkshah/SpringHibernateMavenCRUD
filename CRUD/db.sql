CREATE DATABASE `crud` /*!40100 DEFAULT CHARACTER SET latin1 */;

CREATE TABLE crud.`Login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE crud.`User` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(45) NOT NULL,
    `name` VARCHAR(20) NOT NULL DEFAULT '',
    `phone` VARCHAR(20) NOT NULL,
    `email` VARCHAR(45) NOT NULL,
    `address` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id` , `username`)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8;
