--liquibase formatted sql

--changeset isembaert:2

USE petclinic_db;
CREATE TABLE IF NOT EXISTS pets (
    id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30),
    birth_date DATE,
    species VARCHAR(30),
    clients_id INT(4) UNSIGNED NOT NULL,
    INDEX(name),
    FOREIGN KEY (clients_id) REFERENCES clients(id)
)engine=InnoDB; 
