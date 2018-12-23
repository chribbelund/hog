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
        }
        catch(InfException undantag) { //om databasen inte hittas så kommer ett felmeddelande upp
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
        //Validera textfält så det inte är tomt.
    }
    
    //Tetsa om denna metod fungerar (istället för att skriva samma kod i varje annnan metod)
    private void databasfel(InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());        
    }    
    
    public static boolean txtFieldEmpty(JTextField aktuelltFalt) {
        boolean result = true;
        
        if(aktuelltFalt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rutan är tom");
            aktuelltFalt.requestFocus();
            result = false;
        }
        
        return result;
    }
    
    public boolean isUsernameCorrect (JTextField txtUsername) {
        boolean correctUsername = false;
        try {
            String name = "SELECT LARARE.EFTERNAMN FROM LARARE";
            ArrayList<String> nameArray = idb.fetchColumn(name);
            
            for (String currentName:nameArray) {
                if(currentName.equals(txtUsername.getText())) {
                    correctUsername = true;
                }
            }
            
            if(!correctUsername) {
                JOptionPane.showMessageDialog(null, "Fel användarnamn!");
                txtUsername.requestFocus();            
            }
        }
        catch (InfException e) {
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
            }
            else {
                passwordIsCorrect = Arrays.equals(txtPassword, passwordArray);
            }
            Arrays.fill(passwordArray, '0');
        
        
        if (!passwordIsCorrect) {
                JOptionPane.showMessageDialog(null, "Fel lösen. Försök igen");
                txtUsername.requestFocus();            
        }
        }
        catch (InfException e) {
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
        }
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
        return isAdmin;
    }
}
    

    

