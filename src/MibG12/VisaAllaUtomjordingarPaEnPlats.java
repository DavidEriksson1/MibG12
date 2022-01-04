/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author Victo
 */
public class VisaAllaUtomjordingarPaEnPlats extends javax.swing.JFrame {

    InfDB idb;
    String nuvarandeAgent;
    
    public VisaAllaUtomjordingarPaEnPlats(InfDB idb, String nuvarandeAgent) {
        initComponents();
        this.idb = idb;
        this.nuvarandeAgent = nuvarandeAgent;  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVisaAlienPaPlats = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVisaInfo = new javax.swing.JTextArea();
        txtValdPlats = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVisaAlienPaPlats.setText("Visa");
        btnVisaAlienPaPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaAlienPaPlatsActionPerformed(evt);
            }
        });

        txtVisaInfo.setColumns(20);
        txtVisaInfo.setRows(5);
        jScrollPane1.setViewportView(txtVisaInfo);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Visa utomjordingar på angiven plats");

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(txtValdPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnVisaAlienPaPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValdPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisaAlienPaPlats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisaAlienPaPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaAlienPaPlatsActionPerformed
        
        ArrayList<HashMap<String, String>> utomjordingar;
        
        try {
        String plats = txtValdPlats.getText();
        String fraga = "Select * from alien where plats = (Select plats_id from plats where benamning = '" + plats + "') order by alien_id";
        System.out.println(fraga);
        utomjordingar = idb.fetchRows(fraga);
        
        for (HashMap<String, String> aliens : utomjordingar)
        {
            txtVisaInfo.append(aliens.get("ALIEN_ID") + "\t");
            txtVisaInfo.append(" " + aliens.get("REGISTRERINGSDATUM") + "\t");
            txtVisaInfo.append(" " + aliens.get("LOSENORD") + "\t");
            txtVisaInfo.append(" " + aliens.get("NAMN") + "\t");
            txtVisaInfo.append(" " + aliens.get("TELEFON") + "\t");
            txtVisaInfo.append(" " + aliens.get("PLATS") + "\t");
            txtVisaInfo.append(" " + aliens.get("ANSVARIG_AGENT") + "\n");
            System.out.println(aliens.get("namn"));
            
        }
        }
        
       catch (InfException ex)
       {
           JOptionPane.showMessageDialog(null, "Ett fel har uppstått " + ex);
       }
       catch (Exception ex)
       {
           JOptionPane.showMessageDialog(null, "Ett fel har uppstått¨" + ex);
       }
        
        
    }//GEN-LAST:event_btnVisaAlienPaPlatsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HuvudMenyAgent hMA = new HuvudMenyAgent (idb, nuvarandeAgent);
        hMA.setHuvudText(nuvarandeAgent);
        hMA.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVisaAlienPaPlats;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtValdPlats;
    private javax.swing.JTextArea txtVisaInfo;
    // End of variables declaration//GEN-END:variables
}



    
    
