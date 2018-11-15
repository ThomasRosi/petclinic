--liquibase formatted sql

--changeset isembaert:3

USE petclinic_db;
CREATE TABLE IF NOT EXISTS visits (
    id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    pet_id INT(4) UNSIGNED NOT NULL,
    visit_date DATETIME,
    description VARCHAR(255),
    FOREIGN KEY (pet_id) REFERENCES pets(id)
) engine=InnoDB;