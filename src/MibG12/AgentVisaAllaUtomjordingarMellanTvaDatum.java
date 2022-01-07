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
public class AgentVisaAllaUtomjordingarMellanTvaDatum extends javax.swing.JFrame {

    InfDB idb;
    String nuvarandeAgent;
    Validering validering;
    public AgentVisaAllaUtomjordingarMellanTvaDatum(InfDB idb, String nuvarandeAgent) {
        initComponents();
        this.idb = idb;
        this.nuvarandeAgent = nuvarandeAgent;  
        validering = new Validering();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVisaAlienPaPlats = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaVisaInfo = new javax.swing.JTextArea();
        txtDatum1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtDatum2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVisaAlienPaPlats.setText("Visa");
        btnVisaAlienPaPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaAlienPaPlatsActionPerformed(evt);
            }
        });

        txtAreaVisaInfo.setColumns(20);
        txtAreaVisaInfo.setRows(5);
        jScrollPane1.setViewportView(txtAreaVisaInfo);

        txtDatum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatum1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Visa utomjordingar som registrerats mellan två datum:");

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtDatum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatum2ActionPerformed(evt);
            }
        });

        jLabel2.setText("YYYY-MM-DD");

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
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnVisaAlienPaPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisaAlienPaPlats)
                    .addComponent(txtDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisaAlienPaPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaAlienPaPlatsActionPerformed
        
        /**
         * Metod för att visa alla utomjordingar som blivit registrerade mellan två angivna datum.
         * Metoden validerar så att det finns värden i båda textrutorna samt att datumformaten som
         * matas in är korrekta datumformat.
         * 
         * Returnerar om det finns några utomjordingar registrerade mellan angivna datum.
         */
        
        txtAreaVisaInfo.setText("");
        ArrayList<String> utomjordingar;
        String datum1 = txtDatum1.getText();
        String datum2 = txtDatum2.getText();

        boolean textRuta1ArTom = Validering.textRutaArTom(datum1);

        if (textRuta1ArTom == false) {

            boolean textRuta2ArTom = Validering.textRutaArTom(datum2);

            if (textRuta2ArTom == false) {
                boolean datum1Korrekt = Validering.kollaDatumFormat(datum1);

                if (datum1Korrekt == true) {
                    boolean datum2Korrekt = Validering.kollaDatumFormat(datum2);

                    if (datum2Korrekt == true) {

                        try {
                            String fraga = "SELECT namn FROM alien WHERE Registreringsdatum between '" + datum1 + "' AND '" + datum2 + "'";
                            utomjordingar = idb.fetchColumn(fraga);

                            if (utomjordingar.isEmpty()) {
                                txtAreaVisaInfo.append("Det finns ingen utomjording som är registrerad mellan valda datum! :(");
                            } else {
                                    txtAreaVisaInfo.append("Registrerade utomjordingar mellan " + datum1 + " - " + datum2 + ":" + "\n");
                                    txtAreaVisaInfo.append("\n");
                                for (String namn : utomjordingar) {
                                    txtAreaVisaInfo.append(namn + "\n");
                                }
                                txtDatum1.setText("");
                                txtDatum2.setText("");

                            }
                        } catch (InfException ex) {
                            JOptionPane.showMessageDialog(null, "Ett fel har uppstått " + ex);
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Ett fel har uppstått¨" + ex);
                        }
                    } else {

                        txtDatum2.setText("");
                    }
                } else {
                    txtDatum1.setText("");
                }
            }

        }

    }//GEN-LAST:event_btnVisaAlienPaPlatsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HuvudMenyAgent hMA = new HuvudMenyAgent (idb, nuvarandeAgent);
        hMA.setHuvudText(nuvarandeAgent);
        hMA.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDatum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatum2ActionPerformed

    private void txtDatum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatum1ActionPerformed

    public boolean kollaPlats (String plats)
    {
        boolean platsFinns = false;
        
        try {
        
        String fraga = "Select benamning from plats";
        ArrayList<String> platser = idb.fetchColumn(fraga);
        
        for (String platsen : platser)
        {
            platsFinns = Validering.stringFinns(platsen,plats);
            
            if (platsFinns == true)
            {
                break;
            }
        }
        }
        catch (InfException ex)
        {
           JOptionPane.showMessageDialog(null, "Något gick fel"); 
        }
        return platsFinns;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVisaAlienPaPlats;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaVisaInfo;
    private javax.swing.JTextField txtDatum1;
    private javax.swing.JTextField txtDatum2;
    // End of variables declaration//GEN-END:variables
}



    
    
