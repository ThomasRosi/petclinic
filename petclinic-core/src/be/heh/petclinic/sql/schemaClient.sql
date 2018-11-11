DROP TABLE IF EXISTS client;

CREATE TABLE client (
  id int NOT NULL AUTO_INCREMENT,
  lastname varchar(45) NOT NULL,
  firstname varchar(45) NOT NULL,
  address varchar(45) NOT NULL,
  email varchar(45) NOT NULL,
  phonenumber varchar(45) NOT NULL,
  primary key (id)
);
