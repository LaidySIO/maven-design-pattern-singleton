/* Base de données: base_personnes */
DROP DATABASE IF EXISTS base_personnes;
DROP USER IF EXISTS 'application'@'localhost';
CREATE DATABASE base_personnes DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE USER 'application'@'localhost' IDENTIFIED BY 'passw0rd';
GRANT ALL ON base_personnes.* TO 'application'@'localhost' IDENTIFIED BY 'passw0rd';
USE base_personnes;

SET FOREIGN_KEY_CHECKS = 0; 
DROP TABLE IF EXISTS Personne;

 CREATE TABLE Personne (
	IdPersonne INTEGER PRIMARY KEY AUTO_INCREMENT,
	Prenom VARCHAR(100),
	Nom VARCHAR(100),
	Poids double,
	Taille double,
	Rue VARCHAR(100),
	Ville VARCHAR(100),
	CodePostal VARCHAR(100)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 


 
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Julien', 'Marshall',55,160,'rue de Nantes','Laval','53000');
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Julien', 'Claire',85,175,'rue du Paradis','Paris','75000');
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Jacques', 'Dupont',62,145,'rue des Passeurs','Paris','75000');
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Dupont', 'Dupont',62,155,'rue des Passeurs','Paris','75000');
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Dupond', 'Dupond',62,169,'rue des Passeurs','Paris','75000');
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Charles', 'Hallyday',100,189,'rue des Feugrais','Rouen','76000');
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Serge', 'Lama',87,200,'rue des Heureux','Nantes','44000');
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Vincent', 'Thomas',64,178,'rue de Paris','Rennes','35000');
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Eric', 'Dummat',78,195,'rue de Versaille','Paris','75000');
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Nicolas', 'Samuel',112,199,'rue de Saint Louis','Laval','53000');
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Rémy', 'Guerry',96,186,'rue des Sages','Lyon','69000');
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Nicolas', 'Drapeau',87,165,'rue Mitterrand','Limoges','87000');
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Gaelle', 'Letourneau',75,179,'rue Jean François','Rouen','76000');
 INSERT INTO Personne(Prenom,Nom,Poids,Taille,Rue,Ville,CodePostal) VALUES ('Anne', 'Claire',85,194,'rue du Paradis','Paris','75000');

