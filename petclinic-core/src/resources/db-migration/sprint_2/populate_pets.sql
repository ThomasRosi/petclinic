--liquibase formatted sql

--changeset isembaert:8

USE petclinic_db;
INSERT INTO pets VALUES (1,'Gouboy','2001-01-12','Chien',1);
INSERT INTO pets VALUES (2,'Touffe','2017-12-18','Chat',3);
INSERT INTO pets VALUES (3,'Godzila','2012-06-01','Lézard',1);
INSERT INTO pets VALUES (4,'Zut','2001-01-12','Cheval',2);
INSERT INTO pets VALUES (5,'Bugs','2016-12-21','Lapin',4);
