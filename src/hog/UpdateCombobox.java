/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hog;

/**
 *
 * @author Christoffer
 */
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class UpdateCombobox {

    private static InfDB idb;

    /*
    Alla metoder i den här klassen fungerar på samma sätt.
    De importerar databasen, kallar den för idb. Sen hämtar den en hel kolumn och sätter det i en arraylist.
    Sen körs removeAllItems för att tömma comboboxen från alla tidigare inskrivna värden. Detta görs för att om databasen uppdateras så ska cboxen vara korrekt.
    Denna arraylist loopas sedan igenom och sätter in alla värden i den valda comboboxen.
     */
    public static void cboxAddKurs(JComboBox cboxKurs) {
        //Importerar databasen
        idb = Hog.idb;
        try {
            //Hämtar alla kursnamn och lägger dem i en arraylist
            String fraga = "SELECT KURSNAMN FROM KURS;";
            ArrayList<String> kurser = idb.fetchColumn(fraga);
            cboxKurs.removeAllItems();
            for (String currentKurs : kurser) {
                //Loopar igenom alla kursnamn och lägger till dem i den valda Comboboxen
                cboxKurs.addItem(currentKurs);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }

    }

    public static void cboxAddAmne(JComboBox cboxAmne) {
        //Importerar databasen
        idb = Hog.idb;

        try {
            String fraga = "SELECT AMNESNAMN FROM AMNE;";
            ArrayList<String> amnen = idb.fetchColumn(fraga);
            cboxAmne.removeAllItems();
            for (String currentAmne : amnen) {
                cboxAmne.addItem(currentAmne);
            }

        } catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }

    public static void cboxAddLarare(JComboBox cboxLarare) {
        //Importerar databasen
        idb = Hog.idb;

        try {
            String fornamn = "SELECT FORNAMN FROM LARARE;";
            String efternamn = "SELECT EFTERNAMN FROM LARARE;";
            ArrayList<String> fornamnArray = idb.fetchColumn(fornamn);
            ArrayList<String> efternamnArray = idb.fetchColumn(efternamn);

            cboxLarare.removeAllItems();
            for (int i = 0; i < fornamnArray.size(); i++) {
                String output = fornamnArray.get(i) + " " + efternamnArray.get(i);
                cboxLarare.addItem(output);
            }

        } catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }

    public static void cboxAddElev(JComboBox cboxElev) {
        //Importerar databasen
        idb = Hog.idb;

        try {
            String fornamn = "SELECT FORNAMN FROM ELEV;";
            String efternamn = "SELECT EFTERNAMN FROM ELEV;";
            ArrayList<String> fornamnArray = idb.fetchColumn(fornamn);
            ArrayList<String> efternamnArray = idb.fetchColumn(efternamn);

            cboxElev.removeAllItems();
            for (int i = 0; i < fornamnArray.size(); i++) {
                String output = fornamnArray.get(i) + " " + efternamnArray.get(i);
                cboxElev.addItem(output);
            }

        } catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }

    public static void cboxAddSovsal(JComboBox cboxSovsal) {
        //Importerar databasen
        idb = Hog.idb;

        try {
            String sovsal = "SELECT SOVSAL_ID FROM SOVSAL;";
            ArrayList<String> sovsalArray = idb.fetchColumn(sovsal);

            cboxSovsal.removeAllItems();
            for (int i = 0; i < sovsalArray.size(); i++) {
                String output = sovsalArray.get(i);
                cboxSovsal.addItem(output);
            }

        } catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }
}
