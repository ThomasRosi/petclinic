--liquibase formatted sql

--changeset isembaert:5

USE petclinic_db;
CREATE TABLE IF NOT EXISTS vet_specialties (
 vet_id INT(4) UNSIGNED NOT NULL,
 specialty_id INT(4) UNSIGNED NOT NULL,
 FOREIGN KEY (vet_id) REFERENCES vets(id),
 FOREIGN KEY (specialty_id) REFERENCES specialties(id),
 UNIQUE (vet_id,specialty_id)
 ) engine=InnoDB;