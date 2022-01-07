/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author Victo
 */
public class AdminValjAgentFromHuvudMeny extends javax.swing.JFrame {

    InfDB idb;
    
    private String nuvarandeUtomjording;
    private String nuvarandeAgent;
    private boolean visaBaraInfo; 
    
    public AdminValjAgentFromHuvudMeny(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.nuvarandeAgent = nuvarandeAgent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHuvudText = new javax.swing.JLabel();
        txtValjAgent = new javax.swing.JTextField();
        btnValj = new javax.swing.JButton();
        lblFelAlienNamn = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHuvudText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHuvudText.setText("Välj agent att visa info om:");

        txtValjAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValjAgentActionPerformed(evt);
            }
        });

        btnValj.setText("Välj");
        btnValj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValjActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHuvudText, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtValjAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnValj, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFelAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblHuvudText)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValjAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValj))
                .addGap(32, 32, 32)
                .addComponent(lblFelAlienNamn)
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValjAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValjAgentActionPerformed
        
        
    }//GEN-LAST:event_txtValjAgentActionPerformed

    private void btnValjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValjActionPerformed
        
        try {
            String namn = txtValjAgent.getText();

            String fraga1 = "SELECT namn FROM agent where namn = '" + namn + "'";
            String svar1 = idb.fetchSingle(fraga1);
            System.out.println(namn);

            boolean namnKorrekt = Validering.stringFinns(namn, svar1);
            boolean textRutaArTom = Validering.textRutaArTom(namn);

            if (textRutaArTom == false) {

                if (namnKorrekt == true) {

                    if (visaBaraInfo == false) {
                        AndraInfoOmAgent aIOA = new AndraInfoOmAgent(idb, namn);
                        aIOA.setInfo(namn);
                        aIOA.setVisible(true);
                        dispose();
                    } else {
                        VisaInfoOmAgent vIOA = new VisaInfoOmAgent(idb, namn, true,nuvarandeUtomjording,false);
                        vIOA.visaTillbakaTillHMknapp();
                        vIOA.setNuvarandeAgent(namn);
                        vIOA.setInfo(namn);
                        vIOA.setVisible(true);
                        dispose();

                    }
                } else {
                    lblFelAlienNamn.setText("Det finns ingen agent med namnet: " + namn);
                }
            }

        } catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
        
    }//GEN-LAST:event_btnValjActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HuvudMenyAdmin hMA = new HuvudMenyAdmin (idb, nuvarandeAgent);
        hMA.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void setUtomjording (String namn)
    {
        nuvarandeUtomjording = namn;
    }
    
    public void setagent (String namn)
    {
        nuvarandeAgent = namn;
    }
    
    public void setVisaInfoText()
    {
        lblHuvudText.setText("Välj agent att visa information om:");
    }

    public void setVisaAndraText()
    {
        lblHuvudText.setText("Välj agent att ändra information om:");
    }
    
    public void visaBaraInfo()
    {
        visaBaraInfo = true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValj;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblFelAlienNamn;
    private javax.swing.JLabel lblHuvudText;
    private javax.swing.JTextField txtValjAgent;
    // End of variables declaration//GEN-END:variables
}
