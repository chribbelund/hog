/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hog;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Christoffer
 */
public class adminKursChange extends javax.swing.JFrame {

    /**
     * Creates new form adminKursChange
     */
    private InfDB idb;
    UpdateCombobox updateCBox;
    private validering val;

    public adminKursChange() {
        initComponents();
        val = new validering();
        idb = Hog.idb; //Importerar databasen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTillbaka = new javax.swing.JButton();
        btnUppdateraKurs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNyKurs = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateStart = new org.jdesktop.swingx.JXDatePicker();
        dateEnd = new org.jdesktop.swingx.JXDatePicker();
        jSeparator1 = new javax.swing.JSeparator();
        txtOutput = new javax.swing.JTextField();
        cboxKurs = new javax.swing.JComboBox<>();
        updateCBox.cboxAddKurs(cboxKurs);
        cboxAmne = new javax.swing.JComboBox<>();
        updateCBox.cboxAddAmne(cboxAmne);
        cboxLarare = new javax.swing.JComboBox<>();
        updateCBox.cboxAddLarare(cboxLarare);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setText("Gå Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnUppdateraKurs.setText("Uppdatera Kurs");
        btnUppdateraKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraKursActionPerformed(evt);
            }
        });

        jLabel1.setText("Kursnamn");

        jLabel2.setText("Ny Kursinformation");

        jLabel3.setText("Kursnamn");

        jLabel5.setText("Lärare");

        jLabel6.setText("Ämne");

        txtOutput.setEditable(false);

        cboxKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxKursActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnUppdateraKurs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOutput))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnTillbaka)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(77, 77, 77)
                                                    .addComponent(jLabel5))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtNyKurs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cboxLarare, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(cboxAmne, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(121, 121, 121))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboxKurs, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxKurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyKurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxAmne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxLarare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUppdateraKurs)
                    .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new adminKurs().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnUppdateraKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraKursActionPerformed
        if (val.txtFieldEmpty(txtNyKurs)) { //Kontrollerar om fältet är tomt
            DateFormat formatDatum = new SimpleDateFormat("yyyy-MM-dd"); //Säger att jag senare vill formatera datumet till yyyy-MM-dd
            try {
                String startDatum = formatDatum.format(dateStart.getDate()); //Gör om datumet till en String med rätt format
                String slutDatum = formatDatum.format(dateEnd.getDate()); //Gör om datumet till en String med rätt format
                try {
                    String kursnamn = (String) cboxKurs.getSelectedItem(); //Tar det valda värdet ur comboxboxen och sätter det i en sträng   
                    String amne = (String) cboxAmne.getSelectedItem(); //Tar det valda värdet ur comboxboxen och sätter det i en sträng
                    String larare = (String) cboxLarare.getSelectedItem(); //Tar den valda läraren och sätter namnet i en string
                    String larareFornamn = larare.split(" ")[0]; //Delar upp namnet i två strings
                    String larareEfternamn = larare.split(" ")[1];
                    String nyKursnamn = txtNyKurs.getText();

                    //SQL fråga som hämtar ämnesID från databasen
                    String fraga = "SELECT AMNE_ID FROM AMNE WHERE AMNESNAMN = '" + amne + "';";
                    String svar = idb.fetchSingle(fraga);

                    //SQL fråga som hämtar ämnesID från databasen
                    fraga = "SELECT KURS_ID FROM KURS WHERE KURSNAMN = '" + kursnamn + "';";
                    String kursid = idb.fetchSingle(fraga);

                    //SQL fråga som hämtar ämnesID från databasen
                    fraga = "SELECT LARAR_ID FROM LARARE WHERE FORNAMN = '" + larareFornamn + "' AND EFTERNAMN = '" + larareEfternamn + "';";
                    String lararID = idb.fetchSingle(fraga);

                    //SQL fråga uppdaterar kurstabellen med givna värden
                    fraga = "UPDATE KURS SET KURS_ID = '" + kursid + "', KURSNAMN = '" + nyKursnamn + "', KURSSTART = '" + startDatum + "', KURSSLUT ='" + slutDatum + "', KURSLARARE = '" + lararID + "', AMNESTILLHORIGHET = '" + svar + "' WHERE KURSNAMN = '" + kursnamn + "';";
                    idb.update(fraga);
                    txtOutput.setText("Kursen " + kursnamn + " har uppdaterats");

                    updateCBox.cboxAddKurs(cboxKurs); //Uppdaterar comboboxen om kurser förändrats
                    updateCBox.cboxAddAmne(cboxAmne);

                } catch (InfException undantag) { //Fångar eventuella databasfel
                    JOptionPane.showMessageDialog(null, "Något gick fel");
                    System.out.println(" Internt felmeddelande" + undantag.getMessage());
                }
            } catch (NullPointerException e) { //Fångar fel om man anger icke korrekta datum
                JOptionPane.showMessageDialog(null, "Ange två korrekta datum");
                System.out.println("Ange två korrekta datum" + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnUppdateraKursActionPerformed

    private void cboxKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxKursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxKursActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnUppdateraKurs;
    private javax.swing.JComboBox<String> cboxAmne;
    public javax.swing.JComboBox<String> cboxKurs;
    private javax.swing.JComboBox<String> cboxLarare;
    private org.jdesktop.swingx.JXDatePicker dateEnd;
    private org.jdesktop.swingx.JXDatePicker dateStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtNyKurs;
    private javax.swing.JTextField txtOutput;
    // End of variables declaration//GEN-END:variables
}
