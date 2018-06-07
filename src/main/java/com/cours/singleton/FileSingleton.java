/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.singleton;

import com.cours.utils.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author elhad
 */
public class FileSingleton {

    private static FileSingleton INSTANCE = null;
    final static String pathFile = null;
    final static String pathFileCsv = Constants.PERSONNES_CSV_PATH_FILE;
    final static String pathFileXml = Constants.PERSONNES_XML_PATH_FILE;
    final static String pathFileJson = Constants.PERSONNES_JSON_PATH_FILE;

    private File fileCsv = null;
    private File fileXml = null;
    private File fileJson = null;

    public static synchronized FileSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FileSingleton();
        }
        return INSTANCE;
    }

    public String[] getFileCsv() throws FileNotFoundException {
        String[] personnesArray = null;
        try {
            BufferedReader br = null;
            File file = null;
            String ligne = null;
            int lines = 0;
            int cpt = 0;
            
            file = new File(pathFileCsv);
            br = new BufferedReader(new FileReader(file));
            
            while (br.readLine() != null) {
                lines++;
            }
            personnesArray = new String[lines];
           
            br = new BufferedReader(new FileReader(file));
            while ((ligne = br.readLine()) != null) {
                personnesArray[cpt] = ligne; //
                cpt++;
            }
            /*for (String personne : personnesArray) {
                System.err.println(personne);
            }*/
        } 
        catch (IOException ex) {
            Logger.getLogger(FileSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return personnesArray;
    }

    public JSONObject getFileJson() {
        JSONParser parser = new JSONParser();
        JSONObject personnes = null;
        
        try {
            Object jsonParse = parser.parse(new FileReader(pathFileJson));
            JSONArray jsonArray = new JSONArray();
            jsonArray.add(jsonParse);
            for (Object jsonObjects : jsonArray){ // On parcour l'objet "personnes" qui contient tous les objets personne             
                personnes = (JSONObject) jsonObjects; // on crée un objet json pour toutes les personnes
                /*JSONArray perosnne = (JSONArray) personnes.get("personnes"); // on crée un tableau à partir de l'objet personnes
                for (Object jsonObject : perosnne) { // On parcours toutes les personnes
                    JSONObject personne = (JSONObject) jsonObject; // on crée un objet json pour chaque personne
                    System.out.println(personne.get("nom"));
                }*/
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileSingleton.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileSingleton.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(FileSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        return personnes;
    }

    public Element getFileXml() {
        Element docEle = null;

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            File file = new File(pathFileXml);
            if (file.exists()) {
                Document doc = db.parse(file);
                docEle = doc.getDocumentElement();

                /*NodeList personneList = docEle.getElementsByTagName("personne");
                 if (personneList != null && personneList.getLength() > 0) {
                 for (int i = 0; i < personneList.getLength(); i++) {

                 Node node = personneList.item(i);

                 if (node.getNodeType() == Node.ELEMENT_NODE) {

                 System.out
                 .println("=====================");

                 Element e = (Element) node;
                 NodeList nodeList = e.getElementsByTagName("prenom");
                 System.out.println("Name: "
                 + nodeList.item(0).getChildNodes().item(0)
                 .getNodeValue());

                 nodeList = e.getElementsByTagName("nom");
                 System.out.println("Grade: "
                 + nodeList.item(0).getChildNodes().item(0)
                 .getNodeValue());

                 nodeList = e.getElementsByTagName("poids");
                 System.out.println("Age: "
                 + nodeList.item(0).getChildNodes().item(0)
                 .getNodeValue());
                 }
                 }
                 } else {
                 System.exit(1);
                 }*/
            } 
            else {
                System.err.println("Le fichier " + pathFileXml + " est introuvable");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return docEle;
    }
}
