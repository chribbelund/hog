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
import java.util.ArrayList;

/**
 *
 * @author Christoffer
 */
public class validering { //försöker importera databasen

    private InfDB idb;

    public validering() {
        try { //försöker importera databasen
            idb = new InfDB(Hog.userDir);
        } catch (InfException undantag) { //om databasen inte hittas så kommer ett felmeddelande upp
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }

    public static boolean txtFieldEmpty(JTextField aktuelltFalt) { //Validera textfält så det inte är tomt.
        boolean result = true;

        if (aktuelltFalt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rutan är tom");
            aktuelltFalt.requestFocus();
            result = false;
        }

        return result;
    }

    //Denna metod kollar om namnet är skrivet som två ord
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

    /*
    Denna metod kontrollerar om det angivna användarnamnet finns i databasen, om användarnamnet finns så returneras true, annars false
     */
    public boolean isUsernameCorrect(JTextField txtUsername) {
        boolean correctUsername = false;
        try {
            String svar = null;
            String fraga = "SELECT EFTERNAMN FROM LARARE WHERE EFTERNAMN = '" + txtUsername.getText() + "';";
            System.out.println(fraga);
            svar = idb.fetchSingle(fraga);
            if (svar == null) {
                JOptionPane.showMessageDialog(null, "Fel användarnamn!");
                txtUsername.requestFocus();
            } else {
                correctUsername = true;
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }

        return correctUsername;
    }

    //Kontrollerar så att lösenordet matchar användarnamnet
    public boolean isPasswordCorrect(JTextField txtUsername, String txtPassword) {
        boolean passwordIsCorrect = true;

        try {
            String username = txtUsername.getText();
            String password = txtPassword;
            String correctPassword = "SELECT LARARE.LOSENORD FROM LARARE WHERE EFTERNAMN = '" + username + "';";
            correctPassword = idb.fetchSingle(correctPassword);

            if (!(password.equals(correctPassword))) {
                passwordIsCorrect = false;
                JOptionPane.showMessageDialog(null, "Fel lösen. Försök igen");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
        return passwordIsCorrect;
    }

    //Kontrollerar om användaren är registrerad i databasen som admin
    public boolean isAdminCorrect(JTextField txtUsername) {
        boolean isAdmin = false;
        try {
            String username = txtUsername.getText();
            String fraga = "SELECT LARARE.ADMINISTRATOR FROM LARARE WHERE EFTERNAMN = '" + username + "';";
            String admin = idb.fetchSingle(fraga);
            if (admin.equals("T")) {
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

    public boolean isNameCorrect(String fornamn, String efternamn) {
        boolean ratt = false;
        try {
            String elevidFraga = "SELECT ELEV_ID FROM ELEV WHERE ELEV.FORNAMN = '" + fornamn + "' AND ELEV.EFTERNAMN = '" + efternamn + "';";
            String id = idb.fetchSingle(elevidFraga);
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

    //Kollar om en string är null
    public static boolean kollaStringVarde(String enstring) {
        boolean searching = true;
        if (enstring == null) {
            searching = false;
        }
        return searching;
    }

    //Tar en String och gör om den så att första bokstaven är versal och att resten är gemener
    public static String formatName(String input) {
        String output = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
        return output;
    }
    
    //Gammal metod
//    public boolean isUsernameCorrect2(JTextField txtUsername) {
//        boolean correctUsername = false;
//        try {
//            String name = "SELECT LARARE.EFTERNAMN FROM LARARE";
//            ArrayList<String> nameArray = idb.fetchColumn(name);
//
//            for (String currentName : nameArray) {
//                if (currentName.equals(txtUsername.getText())) {
//                    correctUsername = true;
//                }
//            }
//
//            if (!correctUsername) {
//                JOptionPane.showMessageDialog(null, "Fel användarnamn!");
//                txtUsername.requestFocus();
//            }
//        } catch (InfException e) {
//            JOptionPane.showMessageDialog(null, "Något gick fel");
//            System.out.println("Internt felmeddelande" + e.getMessage());
//        }
//        return correctUsername;
//    }

}
