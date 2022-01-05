/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author eriknilsson
 */
public class AdminTaBortAgent extends javax.swing.JFrame {
    private static InfDB idb;
    private static String nuvarandeAgent;
    /**
     * Creates new form AdminTaBortAgent
     */
    public AdminTaBortAgent(InfDB idb,String nuvarandeAgent) {
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

        lblTaBort = new javax.swing.JLabel();
        txtAgentNamn = new javax.swing.JTextField();
        btnRadera = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        lblRaderaAgent = new javax.swing.JLabel();
        lblNyAgent = new javax.swing.JLabel();
        txtNyAgent = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTaBort.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTaBort.setText("Ta bort en agent ur systemet");

        txtAgentNamn.setColumns(4);

        btnRadera.setText("Radera");
        btnRadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaderaActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        lblRaderaAgent.setText("Agent Namn");

        lblNyAgent.setText("Ny Agent");

        txtNyAgent.setColumns(5);
        txtNyAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNyAgentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(btnRadera)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTillbaka))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(lblTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(lblRaderaAgent))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(lblNyAgent)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAgentNamn)
                            .addComponent(txtNyAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTaBort)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRaderaAgent))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyAgent)
                    .addComponent(txtNyAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRadera)
                    .addComponent(btnTillbaka))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // TODO add your handling code here:
        HuvudMenyAdmin hMA = new HuvudMenyAdmin(idb, nuvarandeAgent);
        hMA.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaActionPerformed
        // TODO add your handling code here:
       
        
        String agentAttRadera = txtAgentNamn.getText();
        String nyAgent = txtNyAgent.getText();
        
        try{
            
            String fraga1 = "Select Namn from Agent where Namn ='" + agentAttRadera + "'";
            System.out.println(fraga1);
            
            String fraga2 = "Select Namn from Agent where Namn ='" + nyAgent + "'";
            
            String idRadera = "Select Agent_ID from Agent where Namn ='" + agentAttRadera + "'";
            System.out.println(idRadera);
            
            String nyaAgenten = "Select agent_id from agent where namn='" + nyAgent + "'";
            System.out.println(nyaAgenten);
            
            String svarId = idb.fetchSingle(idRadera);
            String nyId = idb.fetchSingle(nyaAgenten);
            
            int raderatId = Integer.parseInt(svarId);
            int nyttId = Integer.parseInt(nyId);
            
            String radera1 = "Delete from Agent where Agent_ID=" + raderatId;
            System.out.println(radera1);
            
            String radera2 = "Delete from Faltagent where Agent_ID =" + raderatId; 
            System.out.println(radera2);
            
            String radera3 = "Delete from Kontorschef where Agent_ID =" + raderatId;
            System.out.println(radera3);
            
            String radera4 = "Delete from Omradeschef where Agent_ID =" + raderatId;
            System.out.println(radera4);
            
            String radera5 = "Delete from Innehar_Fordon where Agent_ID =" + raderatId;
            System.out.println(radera5);
            
            String radera6 = "Delete from Innehar_Utrustning where Agent_ID =" + raderatId;
            System.out.println(radera6);
            
            String update1 = "Update Alien set Ansvarig_agent = " + nyttId +  "where ansvarig_agent =" + raderatId;
            System.out.println(update1);
            
            String svar1 = idb.fetchSingle(fraga1);
            String svar2 = idb.fetchSingle(fraga2);
            
            
           boolean agentFinns = Validering.stringFinns(svar1, agentAttRadera);
           boolean agentFinns2 = Validering.stringFinns(svar2, nyAgent);
            
            
            boolean textRutaTom = Validering.textRutaArTom(agentAttRadera);
            boolean textRutaTom2 = Validering.textRutaArTom(nyAgent);
            
            
            if(textRutaTom == false){
                if(textRutaTom2 == false){
                
            if(agentFinns == false ){
                if (agentFinns2 == false){
                idb.fetchSingle(radera2);
                idb.fetchSingle(radera4);
                idb.fetchSingle(radera3);
                idb.fetchSingle(radera6);
                idb.fetchSingle(radera5);
                idb.fetchSingle(update1);
                idb.fetchSingle(radera1);
                
                JOptionPane.showMessageDialog(null, agentAttRadera +" raderades ur systemet!");
                txtAgentNamn.setText("");
                txtNyAgent.setText("");
            }
                
             else{
                JOptionPane.showMessageDialog(null, "Det fanns ingen agent att radera med det namnet!");
                txtAgentNamn.setText("");
                    txtNyAgent.setText("");
            }   
             }
            else{
                JOptionPane.showMessageDialog(null, "Det fanns ingen agent att ersätta med det namnet");
                txtAgentNamn.setText("");
                txtNyAgent.setText("");
            }
            }
            }
        
        }
        
        catch(InfException e)
        {
            JOptionPane.showMessageDialog(null,"Något gick fel");
            System.out.println(e);
            txtAgentNamn.setText("");
        }
    
    }//GEN-LAST:event_btnRaderaActionPerformed

    private void txtNyAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNyAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNyAgentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTaBortAgent(idb, nuvarandeAgent).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRadera;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel lblNyAgent;
    private javax.swing.JLabel lblRaderaAgent;
    private javax.swing.JLabel lblTaBort;
    private javax.swing.JTextField txtAgentNamn;
    private javax.swing.JTextField txtNyAgent;
    // End of variables declaration//GEN-END:variables
}
