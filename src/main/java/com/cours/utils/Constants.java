/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.utils;

/**
 *
 * @author ElHadji
 */
public class Constants {

    public static String PERSONNES_CSV_PATH_FILE = "personnesCsv.csv";
    public static String PERSONNES_XML_PATH_FILE = "personnesXml.xml";
    public static String PERSONNES_JSON_PATH_FILE = "personnesJson.json";
    public static String IMPLEMENTATION_METIER_FACADE = "metier.MetierFacade";
    public static String CSV_SEPARATOR = ";";
    public static String CSV_HEADER = "idPersonne;Prenom;Nom;Poids;Taille;Rue;Ville;Code Postal";
    // Url de connexion en base de donnée
    public static String DATABASE_URL = "jdbc:mysql://localhost:3306/base_personnes";
    // Utilisateur de la base de données
    public static String DATABASE_USER = "application";
    // Mot de passe de la base de données
    public static String DATABASE_PASSWORD = "passw0rd";

    // Drivers Jdbc
    public static String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    // Cle Url base de donnees
    public static String DATABASE_URL_KEY = "DATABASE_URL_KEY";
    // Cle utilisateur
    public static String DATABASE_USER_KEY = "DATABASE_USER_KEY";
    // Cle mot passe
    public static String DATABASE_PASSWORD_KEY = "DATABASE_PASSWORD_KEY";

    // Drivers Jdbc key
    public static String JDBC_DRIVER_KEY = "JDBC_DRIVER_KEY";
    
    // Constante IMC
    public static double LIMITE_INF_MAIGRE = 16.5;
    public static double LIMITE_SUP_MAIGRE = 18.5;

    public static double LIMITE_INF_SURPOIDS = 25;
    public static double LIMITE_SUP_SURPOIDS = 30;
}
