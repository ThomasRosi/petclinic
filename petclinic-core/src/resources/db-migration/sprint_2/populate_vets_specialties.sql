--liquibase formatted sql

--changeset isembaert:6

USE petclinic_db;
INSERT INTO specialties (name) VALUES ('radiology');
INSERT INTO specialties (name) VALUES ('dentistry');
INSERT INTO specialties (name) VALUES ('surgery');

INSERT INTO vet_specialties VALUES (1,3);
INSERT INTO vet_specialties VALUES (2,2);
INSERT INTO vet_specialties VALUES (3,1);
INSERT INTO vet_specialties VALUES (4,3);
