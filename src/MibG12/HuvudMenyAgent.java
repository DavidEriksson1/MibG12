/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import oru.inf.InfDB;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author Victo
 */
public class HuvudMenyAgent extends javax.swing.JFrame {
    
    private InfDB idb;
    String nuvarandeAgent;

    /**
     * Creates new form HuvudMenyAgent
     */
    public HuvudMenyAgent(InfDB idb, String nuvarandeAgent) {
        initComponents();
        this.idb = idb;
        this.nuvarandeAgent = nuvarandeAgent;
    }
    public void setHuvudText(String namn)
    {
     lblHuvudText.setText("Välkommen " + namn + "!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHuvudText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAgentInfo = new javax.swing.JButton();
        btnAndraLosen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHuvudText.setText("Välkommen Agent!");

        jLabel1.setText("Vänligen välj någon av de operationer du vill utföra:");

        btnAgentInfo.setText("Agent Information");
        btnAgentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentInfoActionPerformed(evt);
            }
        });

        btnAndraLosen.setText("Ändra Lösenord");
        btnAndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHuvudText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgentInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(btnAndraLosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblHuvudText)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnAgentInfo)
                .addGap(18, 18, 18)
                .addComponent(btnAndraLosen)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setNuvarandeAgent(String agent)
    {
        nuvarandeAgent = agent;  
    }
    
    private void btnAgentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentInfoActionPerformed
        AgentInfo aI = new AgentInfo(idb);
        aI.setVisible(true);
        aI.showInfo(nuvarandeAgent);
        aI.setNuvarandeAgent(nuvarandeAgent);
        dispose();
    }//GEN-LAST:event_btnAgentInfoActionPerformed

    private void btnAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenActionPerformed
    AndraLosenord aL = new AndraLosenord(idb, nuvarandeAgent);
    aL.setVisible(true);
    aL.setNuvarandeAgent(nuvarandeAgent);
    dispose();
    }//GEN-LAST:event_btnAndraLosenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgentInfo;
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHuvudText;
    // End of variables declaration//GEN-END:variables
}
