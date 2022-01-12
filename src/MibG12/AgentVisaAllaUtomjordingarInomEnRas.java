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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author Victo
 */
public class AgentVisaAllaUtomjordingarInomEnRas extends javax.swing.JFrame {

    InfDB idb;
    String nuvarandeAgent;
    VisaInfoOmAlien visaInfoOmAlien;
    
    public AgentVisaAllaUtomjordingarInomEnRas(InfDB idb, String nuvarandeAgent) {
        initComponents();
        this.idb = idb;
        this.nuvarandeAgent = nuvarandeAgent;
        visaInfoOmAlien = new VisaInfoOmAlien(idb, nuvarandeAgent, false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVisaAlienInomRas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaVisaInfo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBoxRas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVisaAlienInomRas.setText("Visa");
        btnVisaAlienInomRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaAlienInomRasActionPerformed(evt);
            }
        });

        txtAreaVisaInfo.setColumns(20);
        txtAreaVisaInfo.setRows(5);
        jScrollPane1.setViewportView(txtAreaVisaInfo);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Visa utomjordingar inom en ras:");

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj:", "Boglodite", "Worm", "Squid" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jComboBoxRas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(btnVisaAlienInomRas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jButton1)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisaAlienInomRas)
                    .addComponent(jComboBoxRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisaAlienInomRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaAlienInomRasActionPerformed
        
        txtAreaVisaInfo.setText("");
        ArrayList<String> utomjordingar;
        String ras = jComboBoxRas.getSelectedItem().toString();
        boolean textRutaArTom = Validering.textRutaArTom(ras); 

        if (textRutaArTom == false) {
            
            boolean endastBokstaver = Validering.arStringEndastBokstaver(ras);

            if (endastBokstaver == true) {
                
                boolean rasFinns = kollaRas(ras);

                if (rasFinns == true) {
                    try {
                        String fraga = "Select alien_id from " + ras;
                        utomjordingar = idb.fetchColumn(fraga);
                        
                        if (utomjordingar.isEmpty())
                        {
                            txtAreaVisaInfo.append("Det finns ingen utomjording av vald ras! :(");
                            
                        }
                        else
                        {
                        for (String id : utomjordingar) {
                            
                            String fraga2 = "Select namn from alien where alien_id = " + id;
                            String svar = idb.fetchSingle(fraga2);
                            txtAreaVisaInfo.append(Validering.storForstaBokstav(svar) + "\n");
                        }
                        }
                    } catch (InfException ex) {
                        JOptionPane.showMessageDialog(null, "Ett fel har uppstått " + ex);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Ett fel har uppstått¨" + ex);
                    }
                } 

            }
            

        }
        
        
    }//GEN-LAST:event_btnVisaAlienInomRasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HuvudMenyAgent hMA = new HuvudMenyAgent (idb, nuvarandeAgent);
        hMA.setHuvudText(nuvarandeAgent);
        hMA.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public boolean kollaRas (String ras)
    {
        boolean rasFinns = false;
        
        if (ras.toLowerCase().equals("boglodite"))
        {
            rasFinns = true;
        }
        
        else if (ras.toLowerCase().equals("worm"))
        {
            rasFinns = true;
        }
        
        else if (ras.toLowerCase().equals("squid"))
        {
            rasFinns = true;
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null, "Det finns ingen ras med namnet: " + ras);
        }
            
            return rasFinns;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVisaAlienInomRas;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxRas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaVisaInfo;
    // End of variables declaration//GEN-END:variables
}



    
    
