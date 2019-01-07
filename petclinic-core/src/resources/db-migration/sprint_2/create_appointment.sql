--liquibase formatted sql

--changeset isembaert:3

USE petclinic_db;
CREATE TABLE IF NOT EXISTS appointment (
    id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    pet_id INT(4) UNSIGNED NOT NULL,
    vet_id INT(4) UNSIGNED NOT NULL,
    visit_date DATETIME,
    visit_duration INT(4) NOT NULL,
    description VARCHAR(255),
    FOREIGN KEY (pet_id) REFERENCES pets(id),
    FOREIGN KEY (vet_id) REFERENCES vets(id)
) engine=InnoDB;