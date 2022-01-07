/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import oru.inf.InfDB;

/**
 *
 * @author 46737
 */
public class HuvudMenyAdmin extends javax.swing.JFrame {

    private static InfDB idb;
    private String agent;
    /**
     * Creates new form HuvudMenyAdmin
     */
    public HuvudMenyAdmin(InfDB idb, String agent) {
        initComponents();
        this.idb = idb;
        this.agent = agent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboAlien = new javax.swing.JComboBox<>();
        jComboAgent = new javax.swing.JComboBox<>();
        ComboHanteraUtrustning = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Välkommen Administratör!");

        jLabel2.setText("Hantera Aliens");

        jLabel3.setText("Hantera Agenter");

        jLabel4.setText("Hantera utrustning");

        jComboAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nyregistrera", "Ändra info", "Ta bort" }));
        jComboAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAlienActionPerformed(evt);
            }
        });

        jComboAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj:", "Nyregistrera", "Visa info", "Ge Adminstatus", "Ändra info", "Ta bort", "Områdeschef", "Kontorschef" }));
        jComboAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAgentActionPerformed(evt);
            }
        });

        ComboHanteraUtrustning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lägg till utrustning", "Ta bort utrustning" }));
        ComboHanteraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboHanteraUtrustningActionPerformed(evt);
            }
        });

        jButton1.setText("Logga Ut");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboAlien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboHanteraUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboHanteraUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAlienActionPerformed
        // Combobox med alternativ över vad admin kan göra med alien-tabellen
        int i = jComboAlien.getSelectedIndex();
        
        if(i == 0){
            new NyRegistreraAlien(idb, agent, true).setVisible(true);
            dispose();
        }
        else if(i == 2){
             new AdminTaBortAlien(idb, agent).setVisible(true); 
             dispose();
                    
        }
        
    }//GEN-LAST:event_jComboAlienActionPerformed

    private void jComboAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAgentActionPerformed
 // Combobox för att visa alternativ för hantering gällande agenter
        int i = jComboAgent.getSelectedIndex();
        
        if(i == 5){
            new AdminTaBortAgent(idb, agent).setVisible(true);
            dispose();
        }
        if(i == 1){
            new NyRegistreraAgent(idb, agent).setVisible(true);
            dispose();
        }
        
        if (i == 2)
        {
           ValjAgentFromAdminHuvudMeny valjAgentFromAdminHuvudMeny = new ValjAgentFromAdminHuvudMeny(idb);
           valjAgentFromAdminHuvudMeny.setVisible(true);
           valjAgentFromAdminHuvudMeny.visaBaraInfo();
           valjAgentFromAdminHuvudMeny.setVisaInfoText();
           dispose();
        }
        
        if (i == 4)
        {
           ValjAgentFromAdminHuvudMeny valjAgentFromAdminHuvudMeny = new ValjAgentFromAdminHuvudMeny(idb);
           valjAgentFromAdminHuvudMeny.setVisible(true);
           valjAgentFromAdminHuvudMeny.setVisaAndraText();
           dispose();
        }
        
        if(i == 3){
            AdminGeAdminStatus adminGeAdminStatus = new AdminGeAdminStatus(idb, agent);
            adminGeAdminStatus.setVisible(true);
            dispose();
        }
        
        if(i == 6){
            AdminOmrådesChef adminOmrådesChef = new AdminOmrådesChef(idb, agent);
            adminOmrådesChef.setVisible(true);
            dispose();
        }
        if(i == 7){
            AdminKontorsChef adminKontorsChef = new AdminKontorsChef(idb, agent);
            adminKontorsChef.setVisible(true);
            dispose();
        }
        

    }//GEN-LAST:event_jComboAgentActionPerformed

    private void ComboHanteraUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboHanteraUtrustningActionPerformed
        // TODO add your handling code here:
        int i = ComboHanteraUtrustning.getSelectedIndex();
        
        if(i == 0){
            new AdminLaggTillUtrustning(idb, agent, true).setVisible(true);
            dispose();
        }
        if(i == 1){
            new AdminUtrustningsHantering(idb, agent).setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_ComboHanteraUtrustningActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InloggningsTyp iT = new InloggningsTyp(idb);
        iT.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboHanteraUtrustning;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboAgent;
    private javax.swing.JComboBox<String> jComboAlien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
