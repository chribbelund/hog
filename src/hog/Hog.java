/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hog;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Christoffer
 */
public class Hog {

    /**
     * @param args the command line arguments
     */
    public static String userDir;
    public static InfDB idb;

    public static void main(String[] args) {
        
        userDir = System.getProperty("user.dir"); //Hämtar vart programmet körs ifrån
        userDir += "/lib/HOGDB.FDB"; //Pekar på vart databasen ligger lagrad
        try {
            //Importerar databasen
            idb = new InfDB(Hog.userDir);
            new valElevLarare().setVisible(true);//Startar programmet genom att köra valElevLarare.java
            System.out.println(userDir);
        } catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Programmet kan ej ansluta till databasen");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
            System.out.println(userDir);
        }
    }

}
