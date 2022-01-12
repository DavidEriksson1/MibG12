/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * Klass för att ta bort en agent som administratör
 *
 * @author
 */
public class AdminTaBortAgent extends javax.swing.JFrame {

    private InfDB idb;
    private String nuvarandeAgent;
    private NyRegistreraAlien nRA;

    /**
     * Konstruktior för att ta bort agent
     */
    public AdminTaBortAgent(InfDB idb, String nuvarandeAgent) {
        initComponents();
        this.idb = idb;
        this.nuvarandeAgent = nuvarandeAgent;
        nRA = new NyRegistreraAlien (idb, nuvarandeAgent, true);
        nRA.laggTillAgent(jComboBox1);
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
        jComboBox1 = new javax.swing.JComboBox<>();

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

        lblRaderaAgent.setText("Beteckning");

        lblNyAgent.setText("Ny Kontaktperson");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj:" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRaderaAgent)
                            .addComponent(lblNyAgent)
                            .addComponent(btnTillbaka))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAgentNamn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(btnRadera)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbaka)
                    .addComponent(btnRadera))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Metod för tillbaka knappen som går tillbaka till HuvudMenyAdmin
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        HuvudMenyAdmin hMA = new HuvudMenyAdmin(idb, nuvarandeAgent);
        hMA.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnTillbakaActionPerformed
// Metoden för att radera en agent ur systemet
    private void btnRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaActionPerformed

        String agentAttRadera = txtAgentNamn.getText();
        String nyAgent = jComboBox1.getSelectedItem().toString();

        try {

            String fraga1 = "Select Namn from Agent where Namn ='" + agentAttRadera + "'";
            String fraga2 = "Select Namn from Agent where Namn ='" + nyAgent + "'";
            String idRadera = "Select Agent_ID from Agent where Namn ='" + agentAttRadera + "'";
            String nyaAgenten = "Select agent_id from agent where namn='" + nyAgent + "'";

            String svarId = idb.fetchSingle(idRadera);
            String nyId = idb.fetchSingle(nyaAgenten);

            String radera1 = "Delete from Agent where Agent_ID= " + svarId;
            String radera2 = "Delete from Faltagent where Agent_ID = " + svarId;
            String radera3 = "Delete from Kontorschef where Agent_ID = " + svarId;
            String radera4 = "Delete from Omradeschef where Agent_ID = " + svarId;
            String radera5 = "Delete from Innehar_Fordon where Agent_ID = " + svarId;
            String radera6 = "Delete from Innehar_Utrustning where Agent_ID = " + svarId;
            String update1 = "Update Alien set Ansvarig_agent = " + nyId + " where ansvarig_agent = " + svarId;

            String svar1 = idb.fetchSingle(fraga1);
            String svar2 = idb.fetchSingle(fraga2);
            //Validering som kollar så radera agentrutan inte är tom
            boolean textRutaTom = Validering.textRutaArTom(agentAttRadera);
            
            if (textRutaTom == false) {    
                    //Validering som kollar så agenten man vill radera faktiskt finns i systemet 
                    boolean agentFinns = Validering.stringFinns(svar1, agentAttRadera);

                    if (agentFinns == true) {
                        
                        //Validering som kollar så den ny kontakt agenten finns i systemet
                         boolean agentFinns2 = Validering.stringFinns(svar2, nyAgent);
                            
                        if (agentFinns2 == true) {
                            idb.fetchSingle(radera2);
                            idb.fetchSingle(radera4);
                            idb.fetchSingle(radera3);
                            idb.fetchSingle(radera6);
                            idb.fetchSingle(radera5);
                            idb.fetchSingle(update1);
                            idb.fetchSingle(radera1);
                            JOptionPane.showMessageDialog(null, agentAttRadera + " raderades ur systemet!");
                            txtAgentNamn.setText("");
                            jComboBox1.setSelectedIndex(0);
                        } else {
                            JOptionPane.showMessageDialog(null, "Det fanns ingen agent att radera med namnet " + nyAgent + "!");
                            txtAgentNamn.setText("");
                            jComboBox1.setSelectedIndex(0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Det fanns ingen agent att ersätta med namnet " + agentAttRadera + "!");
                        txtAgentNamn.setText("");
                        jComboBox1.setSelectedIndex(0);
                    }
                }
            

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println(e);
            txtAgentNamn.setText("");
        }

    }//GEN-LAST:event_btnRaderaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRadera;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblNyAgent;
    private javax.swing.JLabel lblRaderaAgent;
    private javax.swing.JLabel lblTaBort;
    private javax.swing.JTextField txtAgentNamn;
    // End of variables declaration//GEN-END:variables
}
