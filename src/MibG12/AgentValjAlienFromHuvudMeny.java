/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author Victo
 */
public class AgentValjAlienFromHuvudMeny extends javax.swing.JFrame {

    private static InfDB idb;
    private String nuvarandeUtomjording;
    private String nuvarandeAgent;
    private boolean visaBaraInfo;
    private boolean anvandareArAdmin;
    
    public AgentValjAlienFromHuvudMeny(InfDB idb, String nuvarandeAgent, boolean anvandareArAdmin) {
        initComponents();
        this.idb = idb;
        this.nuvarandeAgent = nuvarandeAgent;
        this.anvandareArAdmin = anvandareArAdmin;
        FyllaComboBox.laggTillAlien(cbAliens);
        cbAliens.setSelectedIndex(0);
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
        btnValj = new javax.swing.JButton();
        lblFelAlienNamn = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbAliens = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHuvudText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHuvudText.setText("Välj utomjording att visa info om:");

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

        cbAliens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj:" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHuvudText, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnValj, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFelAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblHuvudText)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValj)
                    .addComponent(cbAliens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(lblFelAlienNamn)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setAdmin()
    {
        anvandareArAdmin = true;
    }
    
    public void setAgent()
    {
        anvandareArAdmin = false;
    }
    
    private void btnValjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValjActionPerformed
        
        try {
            String namn = cbAliens.getSelectedItem().toString();

            String fraga1 = "SELECT namn FROM alien where namn =  '" + namn + "'";
            String svar1 = idb.fetchSingle(fraga1);

            boolean namnKorrekt = Validering.stringFinns(namn, svar1);
            boolean textRutaArTom = Validering.textRutaArTom(namn);

            if (textRutaArTom == false) {

                if (namnKorrekt == true) {

                    if (visaBaraInfo == false && anvandareArAdmin == true) 
                    {
                        AndraInfoOmAlien aIOA = new AndraInfoOmAlien(idb, nuvarandeAgent, namn, true);
                        aIOA.setInfo(namn);
                        aIOA.setVisible(true);
                        dispose();
                    }
                    else if (visaBaraInfo == true && anvandareArAdmin == true)
                        {
                            VisaInfoOmAlien vIOA = new VisaInfoOmAlien(idb, nuvarandeAgent, true);
                            vIOA.setNuvarandeUtomjording(namn);
                            vIOA.setInfo(namn);
                            vIOA.setVisible(true);
                            dispose();
                        }
                    else if (visaBaraInfo == false && anvandareArAdmin == false)
                        {
                            AndraInfoOmAlien aIOA = new AndraInfoOmAlien(idb, nuvarandeAgent, namn, false);
                            aIOA.setInfo(namn);
                            aIOA.setVisible(true);
                            dispose();
                        }
                    else if (visaBaraInfo == true && anvandareArAdmin == false)
                    {
                        VisaInfoOmAlien vIOA = new VisaInfoOmAlien(idb, nuvarandeAgent, false);
                        vIOA.setNuvarandeUtomjording(namn);
                        vIOA.setInfo(namn);
                        vIOA.setVisible(true);
                        dispose();
                    }
                    
            }
                else {
                    lblFelAlienNamn.setText("Det finns ingen utomjording med namnet: " + namn);
                }

        } 
        }
            catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
        
    }//GEN-LAST:event_btnValjActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (anvandareArAdmin == true) {
            HuvudMenyAdmin hMA = new HuvudMenyAdmin(idb, nuvarandeAgent);
            hMA.setVisible(true);
            dispose();
        } else {
            HuvudMenyAgent hMA = new HuvudMenyAgent(idb, nuvarandeAgent);
            hMA.setVisible(true);
            dispose();
        }
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
        lblHuvudText.setText("Välj utomjording att visa information om:");
    }

    public void setVisaAndraText()
    {
        lblHuvudText.setText("Välj utomjording att ändra information om:");
    }
    
    public void visaBaraInfo()
    {
        visaBaraInfo = true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValj;
    private javax.swing.JComboBox<String> cbAliens;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblFelAlienNamn;
    private javax.swing.JLabel lblHuvudText;
    // End of variables declaration//GEN-END:variables
}
