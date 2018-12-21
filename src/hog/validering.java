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
    
    public static boolean txtFieldEmpty(JTextField aktuelltFalt) {
        boolean result = true;
        
        if(aktuelltFalt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rutan är tom");
            aktuelltFalt.requestFocus();
            result = false;
        }
        
        return result;
    }
}
    

    

