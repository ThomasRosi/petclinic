DROP TABLE IF EXISTS pet;

CREATE TABLE pet (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  owner varchar(45) NOT NULL,
  breed char(45) NOT NULL,
  primary key (id)
);
