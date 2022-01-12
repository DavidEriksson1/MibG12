/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author 46737
 */
public class AdminGeAdminStatus extends javax.swing.JFrame {

    private static InfDB idb;
    private String agent;
    private NyRegistreraAlien nRA;

    /**
     * Creates new form AdminGeAdminStatus
     */
    public AdminGeAdminStatus(InfDB idb, String agent) {
        initComponents();
        this.idb = idb;
        this.agent = agent;
        nRA = new NyRegistreraAlien(idb, agent, true);
        nRA.laggTillAgent(cbGeAdmin);
        nRA.laggTillAgent(cbTaBort);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        jLabelAndradStatus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTaBortAdmin = new javax.swing.JButton();
        cbGeAdmin = new javax.swing.JComboBox<>();
        cbTaBort = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOk.setText("Verkställ");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel1.setText("Vänligen ange beteckning på den agent du vill ändra administratörsstatus på");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel3.setText("Ge adminstatus");

        jLabel4.setText("Ta bort adminstatus");

        btnTaBortAdmin.setText("Verkställ");
        btnTaBortAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAdminActionPerformed(evt);
            }
        });

        cbGeAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj:" }));

        cbTaBort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj:" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAndradStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbTaBort, 0, 127, Short.MAX_VALUE)
                            .addComponent(cbGeAdmin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTaBortAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTillbaka)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnOk)
                    .addComponent(cbGeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnTaBortAdmin)
                    .addComponent(cbTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabelAndradStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // Metod för att ge eller ta bort adminstatus från en agent, vi har valt att ge användaren
        // möjlighet att ta bort adminstatus då vi anser att det kan vara användbart

        try {
            String agentNamn = cbGeAdmin.getSelectedItem().toString();

            boolean namnFinns = kontrolleraNamn(agentNamn);

            String adminStatus = "select Administrator from Agent where namn = '" + agentNamn + "'";

            String svar1 = idb.fetchSingle(adminStatus);

            String AdminStatusJa = "update agent set administrator = 'J' where namn = '" + agentNamn + "'";

            boolean tomTextRuta = Validering.textRutaArTom(agentNamn);

            if (tomTextRuta == false) {

                if (namnFinns == true) {

                    if (svar1.toUpperCase().equals("N")) {
                        idb.fetchSingle(AdminStatusJa);
                        jLabelAndradStatus.setText(agentNamn + " är nu administratör!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Denna agent är redan administratör!");
                    }
                }
            }

        } catch (InfException ie) {

        }
    }

    public boolean kontrolleraNamn(String agentNamn) {
        //metod som kontrollerar om namnet redan finns i systemet som administratör
        boolean namnFinns = false;

        try {
            String namn = "select namn from Agent";
            ArrayList<String> agenter = idb.fetchColumn(namn);

            for (String agent : agenter) {
                if (agent.toLowerCase().equals(agentNamn.toLowerCase())) {
                    namnFinns = true;
                    break;
                }
            }
        } catch (InfException ie) {

        }
        if (namnFinns == false) {
            JOptionPane.showMessageDialog(null, "Det finns ingen agent med det namnet!");
        }

        return namnFinns;
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // Tillbaka till huvudmeny admin
        HuvudMenyAdmin huvudMenyAdmin = new HuvudMenyAdmin(idb, agent);
        huvudMenyAdmin.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnTaBortAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAdminActionPerformed
        // Knapp för att ta bort adminstatus från en agent
        try {

            String agentNamnInteAdmin = cbTaBort.getSelectedItem().toString();

            String adminStatus = "select Administrator from Agent where namn = '" + agentNamnInteAdmin + "'";

            String svar1 = idb.fetchSingle(adminStatus);

            String AdminStatusNej = "update agent set administrator = 'N' where namn = '" + agentNamnInteAdmin + "'";

            
                boolean namnFinns = kontrolleraNamn(agentNamnInteAdmin);

                if (namnFinns == true) {

                    if (svar1.toUpperCase().equals("J")) {
                        idb.fetchSingle(AdminStatusNej);
                        jLabelAndradStatus.setText(agentNamnInteAdmin + " är inte längre administratör!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Denna agent är inte administratör!");
                    }
                }
            }
         catch (InfException ie) {
             JOptionPane.showMessageDialog(null,"Databasfel");
        }


    }//GEN-LAST:event_btnTaBortAdminActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnTaBortAdmin;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbGeAdmin;
    private javax.swing.JComboBox<String> cbTaBort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAndradStatus;
    // End of variables declaration//GEN-END:variables
}
