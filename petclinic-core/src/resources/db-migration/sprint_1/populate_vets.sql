--liquibase formatted sql

--changeset rosi:3

USE petclinic_db;
INSERT INTO vets (first_name,last_name) VALUES ('James','Carter');
INSERT INTO vets (first_name,last_name) VALUES ('Helen','Leary');
INSERT INTO vets (first_name,last_name) VALUES ('Linda','Douglas');
INSERT INTO vets (first_name,last_name) VALUES ('Rafael','Ortega');
