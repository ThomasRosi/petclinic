--liquibase formatted sql

--changeset isembaert:8

USE petclinic_db;
INSERT INTO pets (name, birth_date, species, clients_id) VALUES ('Gouboy','2001-01-12','Chien',1);
INSERT INTO pets (name, birth_date, species, clients_id) VALUES ('Touffe','2017-12-18','Chat',3);
INSERT INTO pets (name, birth_date, species, clients_id) VALUES ('Godzila','2012-06-01','Lézard',1);
INSERT INTO pets (name, birth_date, species, clients_id) VALUES ('Zut','2001-01-12','Cheval',2);
INSERT INTO pets (name, birth_date, species, clients_id) VALUES ('Bugs','2016-12-21','Lapin',4);
