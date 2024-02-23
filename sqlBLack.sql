CREATE DATABASE black;
drop table black.carte ;

DELETE FROM black.carte;
TRUNCATE black.carte;
CREATE TABLE black.Joueur (
    id_joueur INT PRIMARY KEY,
    username_joueur VARCHAR(255),
    solde_joueur INT,
    id_main INT,
    CONSTRAINT fk_main FOREIGN KEY (id_main) REFERENCES black.Main(id_main)
);

CREATE TABLE black.Croupier (
    id_croupier INT AUTO_INCREMENT PRIMARY KEY,
    valeurTotalLimit VARCHAR(255),
    id_main INT,
    CONSTRAINT fk_main_croupier FOREIGN KEY (id_main) REFERENCES black.Main(id_main)
);

CREATE TABLE black.carte (
    id_carte INT AUTO_INCREMENT PRIMARY KEY,
    couleur_carte VARCHAR(255),
    valeur_carte INT
);

CREATE TABLE black.Main (
    id_main INT AUTO_INCREMENT PRIMARY KEY,
    valeurTotal_main INT,
    nbCartes_main INT
);

CREATE TABLE black.PaquetCarte (
    id_paquetCarte INT AUTO_INCREMENT PRIMARY KEY,
    taille_paquetCartes INT
);


DROP TABLE black.category;

SELECT * FROM black.carte;