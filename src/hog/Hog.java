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
    //Startar programmet genom att köra valElevLarare.java
    public static void main(String[] args) {
        new valElevLarare().setVisible(true);
        userDir = System.getProperty("user.dir");
        userDir += "\\lib\\HOGDB.FDB";
        System.out.println(userDir);
        try {
            //Importerar databasen
            idb = new InfDB(Hog.userDir);
        } catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }

}
