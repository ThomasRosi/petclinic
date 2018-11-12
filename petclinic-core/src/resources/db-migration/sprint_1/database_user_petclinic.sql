--liquibase formatted sql

--changeset rosi:1

CREATE DATABASE IF NOT EXISTS petclinic_db CHARACTER SET utf8 COLLATE utf8_general_ci;
GRANT SELECT, INSERT, UPDATE, DELETE ON petclinic_db.* to 'petclinic'@'%' IDENTIFIED BY 'petclinic';
