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
public class AdminKontorsChef extends javax.swing.JFrame {

    private static InfDB idb;
    private String agent;

    /**
     * Creates new form AdminKontorsChef
     */
    public AdminKontorsChef(InfDB idb, String agent) {
        this.idb = idb;
        this.agent = agent;
        initComponents();
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
        btnTillbaka = new javax.swing.JButton();
        txtFieldAgent = new javax.swing.JTextField();
        jLabelAgent = new javax.swing.JLabel();
        jLabelOmrade = new javax.swing.JLabel();
        jLabelHarAndrats = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        txtFieldAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAgentActionPerformed(evt);
            }
        });

        jLabelAgent.setText("Namn");

        jLabelOmrade.setText("Kontorsbeteckning:");

        jLabel1.setText("Örebrokontoret");

        jLabel2.setText("Vänligen mata in namnet på den nya kontorschefen nedan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelOmrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(btnTillbaka))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFieldAgent)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabelHarAndrats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAgent)
                    .addComponent(txtFieldAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOmrade)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelHarAndrats, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbaka)
                    .addComponent(btnOk))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // Metod för att validera och fastställa val av ny kontorschef

        try {

            String agentNamn = txtFieldAgent.getText();
          
            String namnID = "select Agent_ID from agent where Namn = '" + agentNamn + "'";
            String agentAttTaBort = "select Agent_ID from kontorschef";
            
            String svar1 = idb.fetchSingle(namnID);
            String svar2 = idb.fetchSingle(agentAttTaBort);
                        
            String taBort = "delete from kontorschef where Agent_ID = '" + svar2 + "'";
            String nyChef = "insert into kontorschef values(" + svar1 + "," + "'Örebrokontoret')";

            boolean tomTextRuta = Validering.textRutaArTom(agentNamn);

            if (tomTextRuta == false) {
                boolean namnFinns = kontrolleraNamn(agentNamn);
            
            
            

            if (namnFinns == true) {

            }
            
            else {
                JOptionPane.showMessageDialog(null, "Det finns ingen agent med det namnet!");
            }

            if (!svar2.isEmpty()) {
                idb.fetchSingle(nyChef);
                jLabelHarAndrats.setText("Kontorschefen har ändrats till " + agentNamn + "!");
                txtFieldAgent.setText("");
                idb.fetchSingle(taBort);
            } 
            else{
                txtFieldAgent.setText("");
            }
            }  
        } catch (InfException ie) {

        }
        
        
    }

    private boolean kontrolleraNamn(String agentNamn) {
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

            return namnFinns;

        } catch (InfException ie) {

        }
        return namnFinns;


    }//GEN-LAST:event_btnOkActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // Tillbaka till huvudmeny admin
        HuvudMenyAdmin huvudMenyAdmin = new HuvudMenyAdmin(idb, agent);
        huvudMenyAdmin.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void txtFieldAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAgentActionPerformed
        // Textfält där agent som skall bli kontorschef matas in
    }//GEN-LAST:event_txtFieldAgentActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAgent;
    private javax.swing.JLabel jLabelHarAndrats;
    private javax.swing.JLabel jLabelOmrade;
    private javax.swing.JTextField txtFieldAgent;
    // End of variables declaration//GEN-END:variables
}
