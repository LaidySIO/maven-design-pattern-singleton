/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.main;

import com.cours.singleton.FileSingleton;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author elhad
 */
public class MainSingleton {

    private static final Log log = LogFactory.getLog(MainSingleton.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            FileSingleton.getInstance().getFileCsv();
            FileSingleton.getInstance().getFileJson();
            FileSingleton.getInstance().getFileXml();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
