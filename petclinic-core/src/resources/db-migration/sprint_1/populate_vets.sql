--liquibase formatted sql

--changeset rosi:3

USE petclinic_db;
INSERT INTO vets (first_name,last_name,speciality) VALUES ('James','Carter','radiology');
INSERT INTO vets (first_name,last_name,speciality) VALUES ('Helen','Leary','surgery');
INSERT INTO vets (first_name,last_name,speciality) VALUES ('Linda','Douglas','radiology');
INSERT INTO vets (first_name,last_name,speciality) VALUES ('Rafael','Ortega','dentistry');
