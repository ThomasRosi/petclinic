DROP TABLE IF EXISTS vet;

CREATE TABLE vet (
    id int NOT NULL AUTO_INCREMENT,
    lastname varchar(45) NOT NULL,
    firsname varchar(45) NOT NULL,
    speciality char(45) NOT NULL,
    primary key (id)
  );
