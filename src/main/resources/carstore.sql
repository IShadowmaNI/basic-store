create schema carstore;
USE carstore;

CREATE TABLE carstore.manufacturer (
                                  ManufacturerID INT NOT NULL AUTO_INCREMENT primary key,
                                  ManufacturerName VARCHAR(45) NOT NULL
                                  );

CREATE TABLE carstore.model (
                                  ModelID INT NOT NULL AUTO_INCREMENT primary key,
                                  ManufacturerID INT NOT NULL,
                                  ModelName VARCHAR(45) NOT NULL,
                                  constraint FOREIGN KEY (ManufacturerID) REFERENCES carstore.manufacturer(ManufacturerID)
                                  );

CREATE TABLE carstore.car (
                                    CarID INT NOT NULL AUTO_INCREMENT primary key,
                                    ModelID INT NOT NULL,
                                    CarName VARCHAR(45) NULL,
                                    constraint foreign key (ModelID) references carstore.model(ModelID)
                                    );


/* create unique index medii_idMedie_uindex
    on medii (idMedie);
 */

insert into carstore.manufacturer (ManufacturerName) values
('BMW'),
('Ford'),
('Nissan');

insert into carstore.model (ManufacturerID, ModelName) values
(1, 'M8'),
(1, 'X6'),
(2, 'Mustang 2019'),
(3, 'GT-R 2019');

insert into carstore.car (ModelID, CarName) values
(1, 'maxinaLuiGeo'),
(3, 'maxinaLuiMarian'),
(4, 'maxinaLuiIonica');