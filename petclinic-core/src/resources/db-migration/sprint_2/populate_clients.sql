--liquibase formatted sql

--changeset isembaert:7

USE petclinic_db;
INSERT INTO clients (first_name, last_name, address, city, telephone) VALUES ('George','Pompidou','13 Rue de jean','Eugies','0480/886644');
INSERT INTO clients (first_name, last_name, address, city, telephone) VALUES ('Gérard','Menfroid','42 Rue du frigo','Gele','0478/876747');
INSERT INTO clients (first_name, last_name, address, city, telephone) VALUES ('Jetombe','Delachaise','1 Avenue de la chute','Fossé','0466/852140');
INSERT INTO clients (first_name, last_name, address, city, telephone) VALUES ('Adrien','Alaflemme','42 Centre des bronzes','Tiers Monde','0420/360720');
