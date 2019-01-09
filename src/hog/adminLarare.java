/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hog;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Jamie
 */
public class adminLarare extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form adminLarare
     */
    public adminLarare() {
        initComponents();
        try {
            idb = new InfDB("C:\\db\\HOGDB.FDB");
        } catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
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
        btnNyLarare = new javax.swing.JButton();
        btnGeAdmin = new javax.swing.JButton();
        btnLararInfo = new javax.swing.JButton();
        btnTaBortLarare = new javax.swing.JButton();
        btnLarareForestandare = new javax.swing.JButton();
        btnBetygLarare = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSvar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setText("Gå Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnNyLarare.setText("Registrera  lärare");
        btnNyLarare.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNyLarare.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNyLarare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyLarareActionPerformed(evt);
            }
        });

        btnGeAdmin.setText("Registrera administratör");
        btnGeAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGeAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGeAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeAdminActionPerformed(evt);
            }
        });

        btnLararInfo.setText("Ändra lärarinformation");
        btnLararInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLararInfo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLararInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLararInfoActionPerformed(evt);
            }
        });

        btnTaBortLarare.setText("Ta bort lärare");
        btnTaBortLarare.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTaBortLarare.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnTaBortLarare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortLarareActionPerformed(evt);
            }
        });

        btnLarareForestandare.setText("Ändra elevhemsföreståndare");
        btnLarareForestandare.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLarareForestandare.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLarareForestandare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLarareForestandareActionPerformed(evt);
            }
        });

        btnBetygLarare.setText("Visa betyg från lärare (LÅG)");
        btnBetygLarare.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBetygLarare.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });

        txtSvar.setColumns(20);
        txtSvar.setRows(5);
        jScrollPane1.setViewportView(txtSvar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(btnTillbaka)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLarareForestandare)
                    .addComponent(btnBetygLarare)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTaBortLarare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLararInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGeAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNyLarare, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGeAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTaBortLarare))
                            .addComponent(txtInput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNyLarare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLararInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLarareForestandare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBetygLarare))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new adminStart().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnNyLarareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyLarareActionPerformed
        new adminLarareReg().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNyLarareActionPerformed

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputActionPerformed

    private void btnGeAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeAdminActionPerformed
        // REGISTRERA NY ADMIN
        try {
            String namn = txtInput.getText(); //Hämtar det som skrivs in i textrutan.
            String fornamn = namn.split(" ")[0]; //Delar upp för och efternamn
            String efternamn = namn.split(" ")[1];

            String fraga = "Select LARAR_ID from LARARE where FORNAMN = '" + fornamn + "' AND EFTERNAMN = '" + efternamn + "';";
            String lararID = idb.fetchSingle(fraga);

            //Kontroll för att se om läraren redan är admin
            /*String kontrollFraga = "SELECT ADMINISTRATOR FROM LARARE WHERE LARAR_ID = '" + lararID + "'; ";
            String kontroll = idb.fetchSingle(kontrollFraga);
            System.out.println(kontroll);
            
            if(kontroll.equals("T")) {
                txtSvar.setText("Läraren är redan admin");
             */
            fraga = "Update LARARE set ADMINISTRATOR = 'T' WHERE LARAR_ID = '" + lararID + "'; ";
            System.out.println(fraga);
            idb.update(fraga);

            txtSvar.setText("Läraren är nu tillagd som admin");

        } catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }


    }//GEN-LAST:event_btnGeAdminActionPerformed

    //DEN HÄR ÄR INTE KLAR. Lärarna har FKs till andra tabeller och kan därför inte tas bort.
    //Måste kolla hur vi ska göra? Antar exempelvis att historik om att en lärare hållt en kurs ska sparas
    private void btnTaBortLarareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortLarareActionPerformed
        // TA BORT EN LÄRARE FRÅN DATABASEN

        try {
            String namn = txtInput.getText(); //Hämtar det som skrivs in i textrutan.
            String fornamn = namn.split(" ")[0]; //Delar upp för och efternamn
            String efternamn = namn.split(" ")[1];
            String fraga = "Delete from LARARE where FORNAMN = '" + fornamn + "' AND EFTERNAMN = '" + efternamn + "'; "; //Tar bort raden med givet för- och efternamn.
            idb.update(fraga); //Uppdaterar databasen.

        } catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }//GEN-LAST:event_btnTaBortLarareActionPerformed

    private void btnLararInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLararInfoActionPerformed
        new adminLarareInfo().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLararInfoActionPerformed

    private void btnLarareForestandareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLarareForestandareActionPerformed
        new adminLarareEHF().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLarareForestandareActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBetygLarare;
    private javax.swing.JButton btnGeAdmin;
    private javax.swing.JButton btnLararInfo;
    private javax.swing.JButton btnLarareForestandare;
    private javax.swing.JButton btnNyLarare;
    private javax.swing.JButton btnTaBortLarare;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextArea txtSvar;
    // End of variables declaration//GEN-END:variables

}
