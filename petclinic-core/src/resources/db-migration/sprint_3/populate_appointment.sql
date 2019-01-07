--liquibase formatted sql

--changeset urbain:2

USE petclinic_db;
INSERT INTO appointment (pet_id,vet_id,visit_date,visit_duration,description) VALUES (2,2,current_date,10,'Soins dentaires');
INSERT INTO appointment (pet_id,vet_id,visit_date,visit_duration,description) VALUES (1,1,current_date,20,'Vaccins');
INSERT INTO appointment (pet_id,vet_id,visit_date,visit_duration,description) VALUES (3,3,current_date,15,'Visite de routine');
INSERT INTO appointment (pet_id,vet_id,visit_date,visit_duration,description) VALUES (4,4,current_date,30,'Stérilisation');