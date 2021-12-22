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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa info om enskild alien", "Ändra information om enskild alien", "Visa alla alien på angiven plats", "Visa alla alien av angiven ras", "Visa alla aliens som registrerats mellan angivna datum", "Registrera ny alien" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Valmöjligheter om utomjordingar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAndraLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblHuvudText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblHuvudText)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgentInfo)
                .addGap(28, 28, 28)
                .addComponent(btnAndraLosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
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
        aI.setHuvudMenyAgent();
        dispose();
    }//GEN-LAST:event_btnAgentInfoActionPerformed

    private void btnAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenActionPerformed
    AndraLosenord aL = new AndraLosenord(idb, nuvarandeAgent);
    aL.setVisible(true);
    aL.setNuvarandeAgent(nuvarandeAgent);
    dispose();
    }//GEN-LAST:event_btnAndraLosenActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       int i = jComboBox1.getSelectedIndex();
        
        if(i == 0){
            
            
        }
        if(i == 1){
            AndraInfoOmAlien aLA = new AndraInfoOmAlien();
            aLA.setVisible(true);
        }
        if(i == 2){
            
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgentInfo;
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblHuvudText;
    // End of variables declaration//GEN-END:variables
}
