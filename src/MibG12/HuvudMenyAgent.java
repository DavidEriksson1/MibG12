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
        setHuvudText(nuvarandeAgent);
    }
    public void setHuvudText(String namn)
    {
    lblHuvudText.setText("Välkommen " + Validering.storForstaOchSistaBokstav(namn) + "!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHuvudText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAndraLosen = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnVisaOmradeschef = new javax.swing.JButton();
        cbUtrustning = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHuvudText.setText("Välkommen Agent!");

        jLabel1.setText("Vänligen välj någon av de operationer du vill utföra:");

        btnAndraLosen.setText("Ändra Lösenord");
        btnAndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj:", "Visa info om enskild alien", "Ändra information om enskild alien", "Visa alla alien på angiven plats", "Visa alla alien av angiven ras", "Visa alla aliens som registrerats mellan angivna datum", "Registrera ny alien" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Valmöjligheter om utomjordingar");

        jButton1.setText("Logga Ut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnVisaOmradeschef.setText("Visa områdeschef för enskilt område");
        btnVisaOmradeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaOmradeschefActionPerformed(evt);
            }
        });

        cbUtrustning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj:", "Visa min utkvitterade utrustning", "Kvittera ut ny utrustning", "Lämna tillbaka utrustning", "Lägg till ny utrustning" }));
        cbUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUtrustningActionPerformed(evt);
            }
        });

        jLabel3.setText("Valmöjligheter om utrustning");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAndraLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisaOmradeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(196, 196, 196)
                            .addComponent(lblHuvudText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(107, 107, 107)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(107, 107, 107)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(179, 179, 179)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHuvudText)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnAndraLosen)
                .addGap(18, 18, 18)
                .addComponent(btnVisaOmradeschef)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(cbUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setNuvarandeAgent(String agent)
    {
        nuvarandeAgent = agent;  
    }
    
    private void btnAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenActionPerformed
    AndraLosenord aL = new AndraLosenord(idb, false);
    aL.setVisible(true);
    aL.setNuvarandeAgent(nuvarandeAgent);
    dispose();
    }//GEN-LAST:event_btnAndraLosenActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       int i = jComboBox1.getSelectedIndex();
        
        if(i == 1){
            
            AgentValjAlienFromHuvudMeny vAFAHM = new AgentValjAlienFromHuvudMeny(idb, nuvarandeAgent, false);
            vAFAHM.setAgent();
            vAFAHM.setVisaInfoText();
            vAFAHM.visaBaraInfo();
            vAFAHM.setVisible(true);
            dispose();
        }
        if(i == 2){
            AgentValjAlienFromHuvudMeny vAFAHM = new AgentValjAlienFromHuvudMeny(idb, nuvarandeAgent, false);
            vAFAHM.setAgent();
            vAFAHM.setVisaAndraText();
            vAFAHM.setVisible(true);
            dispose();
        }
        if(i == 3){
            
            AgentVisaAllaUtomjordingarPaEnPlats vAUPEP = new AgentVisaAllaUtomjordingarPaEnPlats (idb, nuvarandeAgent);
            vAUPEP.setVisible(true);
            dispose();
        }
        if (i == 4){
            AgentVisaAllaUtomjordingarInomEnRas vAUIER = new AgentVisaAllaUtomjordingarInomEnRas (idb, nuvarandeAgent);
            vAUIER.setVisible(true);
            dispose();
        }
        if (i == 5){
            AgentVisaAllaUtomjordingarMellanTvaDatum vAUMTD = new AgentVisaAllaUtomjordingarMellanTvaDatum (idb, nuvarandeAgent);
            vAUMTD.setVisible(true);
            dispose();
            
        }
        if (i == 6){
            NyRegistreraAlien nRA = new NyRegistreraAlien(idb, nuvarandeAgent, false);
            nRA.setVisible(true);
            dispose();
            
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InloggningsTyp iT = new InloggningsTyp (idb);
        iT.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVisaOmradeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaOmradeschefActionPerformed
        VisaOmradesChef vOC = new VisaOmradesChef (idb, nuvarandeAgent);
        vOC.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVisaOmradeschefActionPerformed

    private void cbUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUtrustningActionPerformed
        
         int i = cbUtrustning.getSelectedIndex();    
         
         if (i == 1)
         {
            AgentVisaUtkviteradUtrustning aVUU = new AgentVisaUtkviteradUtrustning(idb, nuvarandeAgent);
            aVUU.setVisible(true);
            dispose();
             
         }
         
         if (i == 2)
         {
            AgentKvitteraUtrustning aKU = new AgentKvitteraUtrustning(idb, nuvarandeAgent);
            aKU.setVisible(true);
            dispose();
         }
         
         if (i == 3)
         {
            AgentLamnaTillbakaUtrustning aLTU = new AgentLamnaTillbakaUtrustning (idb, nuvarandeAgent);
            aLTU.setVisible(true);
            dispose();
         }
         
         if (i == 4)
         {
             AdminLaggTillUtrustning aLTU = new AdminLaggTillUtrustning(idb, nuvarandeAgent, false);
            aLTU.setVisible(true);
            aLTU.setAgent();
            dispose();
         }
                
    }//GEN-LAST:event_cbUtrustningActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JButton btnVisaOmradeschef;
    private javax.swing.JComboBox<String> cbUtrustning;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblHuvudText;
    // End of variables declaration//GEN-END:variables
}
