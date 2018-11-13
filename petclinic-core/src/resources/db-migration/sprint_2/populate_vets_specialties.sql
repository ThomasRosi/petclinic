--liquibase formatted sql

--changeset isembaert:6

USE petclinic_db;
INSERT INTO specialties VALUES (1, 'radiology');
INSERT INTO specialties VALUES (2, 'dentistry');
INSERT INTO specialties VALUES (3, 'surgery');

INSERT INTO vet_specialties VALUES (1,3);
INSERT INTO vet_specialties VALUES (2,2);
INSERT INTO vet_specialties VALUES (3,1);
INSERT INTO vet_specialties VALUES (4,3);