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
 * 
 * JFrame klass för att visa utomjordingar som finns inom en viss plats.
 * Klassen tar in ett parametervärde som den plats man vill använda.
 */
public class AgentVisaAllaUtomjordingarPaEnPlats extends javax.swing.JFrame {

    InfDB idb;
    String nuvarandeAgent;
    Validering validering;
    public AgentVisaAllaUtomjordingarPaEnPlats(InfDB idb, String nuvarandeAgent) {
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

        txtAreaVisaInfo.setColumns(20);
        txtAreaVisaInfo.setRows(5);
        jScrollPane1.setViewportView(txtAreaVisaInfo);

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

    /**
     * Actionperfomedmetod som visar alla utomjordingar inom vald plats. 
     * Validerar så att textrutan har ett värde, är endast av bokstäver samt att platsen finns i databasen.
     */
    
    
    private void btnVisaAlienPaPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaAlienPaPlatsActionPerformed
        
        txtAreaVisaInfo.setText("");
        ArrayList<String> utomjordingar;
        String plats = txtValdPlats.getText();
        boolean textRutaArTom = Validering.textRutaArTom(plats);

        if (textRutaArTom == false) {
            boolean endastBokstaver = Validering.arStringEndastBokstaver(plats);

            if (endastBokstaver == true) {
                boolean platsFinns = kollaPlats(plats);

                if (platsFinns == true) {
                    try {
                        /**
                         * Sql fråga för att visa alla utomjordingar på vald
                         * plats.
                         */
                        String fraga = "Select namn from alien where plats = (Select plats_id from plats where benamning = '" + Validering.storForstaBokstav(plats) + "')";
                        System.out.println(fraga);
                        utomjordingar = idb.fetchColumn(fraga);

                        if (utomjordingar.isEmpty()) {
                            txtAreaVisaInfo.append("Det finns ingen utomjording i " + Validering.storForstaBokstav(plats) + "! :(");
                            txtValdPlats.setText("");
                        } else {
                            txtAreaVisaInfo.append("Utomjordingar i " + Validering.storForstaBokstav(plats) + "\n");
                            txtAreaVisaInfo.append("\n");
                            for (String namn : utomjordingar) {
                                txtAreaVisaInfo.append(Validering.storForstaBokstav(namn) + "\n");
                            }
                            txtValdPlats.setText("");
                        }
                    } catch (InfException ex) {
                        JOptionPane.showMessageDialog(null, "Ett fel har uppstått " + ex);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Ett fel har uppstått¨" + ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Det finns ingen plats med namnet " + Validering.storForstaBokstav(plats) + ".");
                    txtValdPlats.setText("");
                }

            } else {
                txtValdPlats.setText("");
            }

        }
   
    }//GEN-LAST:event_btnVisaAlienPaPlatsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HuvudMenyAgent hMA = new HuvudMenyAgent (idb, nuvarandeAgent);
        hMA.setHuvudText(nuvarandeAgent);
        hMA.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /**
     * Metod som kollar att inkommande plats finns i databasen.
     * Retunerar true eller false beroende på om platsen finns eller inte.
     * @param plats
     * @return platsFinns
     */
    
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaVisaInfo;
    private javax.swing.JTextField txtValdPlats;
    // End of variables declaration//GEN-END:variables
}



    
    
