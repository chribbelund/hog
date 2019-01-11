/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hog;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author Christoffer
 */
public class validering { //försöker importera databasen

    private InfDB idb;

    public validering() {
        try { //försöker importera databasen
            idb = new InfDB("C:\\db\\hogdb.FDB");
        } catch (InfException undantag) { //om databasen inte hittas så kommer ett felmeddelande upp
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
        //Validera textfält så det inte är tomt.
    }

    public static boolean txtFieldEmpty(JTextField aktuelltFalt) {
        boolean result = true;

        if (aktuelltFalt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rutan är tom");
            aktuelltFalt.requestFocus();
            result = false;
        }

        return result;
    }

    public boolean isNameFormatCorrect(String namn) {
        boolean correctFormat = true;
        try {
            String fornamn = namn.split(" ")[0]; //Delar upp för och efternamn
            String efternamn = namn.split(" ")[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Ange ett korrekt namn");
            System.out.println("Internt felmeddelande " + e.getMessage());
            System.out.println("Du måste ange ett förnamnnamn och ett efternamn");
            correctFormat = false;
        }
        return correctFormat;
    }

    public boolean isUsernameCorrect(JTextField txtUsername) {
        boolean correctUsername = false;
        try {
            String name = "SELECT LARARE.EFTERNAMN FROM LARARE";
            ArrayList<String> nameArray = idb.fetchColumn(name);

            for (String currentName : nameArray) {
                if (currentName.equals(txtUsername.getText())) {
                    correctUsername = true;
                }
            }

            if (!correctUsername) {
                JOptionPane.showMessageDialog(null, "Fel användarnamn!");
                txtUsername.requestFocus();
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
        return correctUsername;
    }

    public boolean isPasswordCorrect(JTextField txtUsername, char[] txtPassword) {
        boolean passwordIsCorrect = true;

        try {
            String username = txtUsername.getText();
            String correctPassword = "SELECT LARARE.LOSENORD FROM LARARE WHERE EFTERNAMN = '" + username + "';";
            String password = idb.fetchSingle(correctPassword);
            char[] passwordArray = password.toCharArray();

            if (txtPassword.length != passwordArray.length) {
                passwordIsCorrect = false;
            } else {
                passwordIsCorrect = Arrays.equals(txtPassword, passwordArray);
            }
            Arrays.fill(passwordArray, '0');

            if (!passwordIsCorrect) {
                JOptionPane.showMessageDialog(null, "Fel lösen. Försök igen");
                txtUsername.requestFocus();
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
        return passwordIsCorrect;
    }

    public boolean isAdminCorrect(JTextField txtUsername) {
        boolean isAdmin = false;
        try {
            String username = txtUsername.getText();
            String fraga = "SELECT LARARE.ADMINISTRATOR FROM LARARE WHERE EFTERNAMN = '" + username + "';";
            ArrayList<String> admin = idb.fetchColumn(fraga);
            String svar = "";

            for (int i = 0; i < admin.size(); i++) {
                svar += admin.get(i);
            }
            if (svar.equals("T")) {
                isAdmin = true;
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
        return isAdmin;
    }

    //Metoden kollar om en det som skrivits i fältet är en String.
    public static boolean isString(JTextField txtNamn) {
        boolean isString = false;

        if (txtNamn.getText().matches("[a-zA-Z]+")) {
            isString = true;
        } else {
            JOptionPane.showMessageDialog(null, "Ange endast bokstäver");
        }
        return isString;
    }

    //Metoden kollar om det som skrivits i fältet är en Integer
    public static boolean isInt(JTextField aktuelltFalt) {
        boolean searching = true;

        try {
            String enString = aktuelltFalt.getText();
            Integer.parseInt(enString);
            aktuelltFalt.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ange ett heltal");
            System.out.println("Internt felmeddelande" + e.getMessage());
            searching = false;
        }
        return searching;
    }

    //Metoden kollar om värdet i fältet är positivt
    public static boolean positivtTal(JTextField aktuelltFalt) {
        boolean searching = true;
        if (aktuelltFalt.getText().substring(0, 1).equals("-")) {
            searching = false;
            JOptionPane.showMessageDialog(null, "Endast positiva värden");
            //aktuelltFalt.requestFocus();
        }
        return searching;
    }

    //Metoden kollar om värdet i fältet är positivt
    //Funkar ej atm
    public static boolean negativtTal(JTextField aktuelltFalt) {
        boolean searching = true;
        if (!aktuelltFalt.getText().substring(0).equals("-")) {
            searching = false;
            aktuelltFalt.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Endast negativa värden");
        }
        return searching;
    }

    public boolean isNameCorrect(String fornamn, String efternamn) {
        boolean ratt = false;
        System.out.println("test1");
        try {
            String elevidFraga = "SELECT ELEV_ID FROM ELEV WHERE ELEV.FORNAMN = '" + fornamn + "' AND ELEV.EFTERNAMN = '" + efternamn + "';";
            System.out.println(elevidFraga);
            String id = idb.fetchSingle(elevidFraga);
            System.out.println(id);
            if (id != null) {
                ratt = true;
            } else {
                JOptionPane.showMessageDialog(null, "Ange ett korrekt namn");
            }

        } catch (InfException undantag) { //om databasen inte hittas så kommer ett felmeddelande upp
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
        return ratt;

    }
    
    public static boolean kollaStringVarde(String enstring){
        boolean searching = true;
        if(enstring == null){
           searching = false;
        }
        return searching;
    }
    
}
