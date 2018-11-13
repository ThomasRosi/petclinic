--liquibase formatted sql

--changeset isembaert:4

USE petclinic_db;
CREATE TABLE IF NOT EXISTS specialties (
 id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 name VARCHAR(80),
 INDEX(name)
)engine=InnoDB;