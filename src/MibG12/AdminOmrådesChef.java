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
public class AdminOmrådesChef extends javax.swing.JFrame {

    private static InfDB idb;
    private static String agent;

    /**
     * Creates new form AdminOmrådesChef
     */
    public AdminOmrådesChef(InfDB idb, String agent) {
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

        jButton1 = new javax.swing.JButton();
        TextFieldAgent = new javax.swing.JTextField();
        TextFieldOmrade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonTillbaka = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TextFieldAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAgentActionPerformed(evt);
            }
        });

        TextFieldOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldOmradeActionPerformed(evt);
            }
        });

        jLabel1.setText("Agent");

        jLabel2.setText("Område");

        ButtonTillbaka.setText("Tillbaka");
        ButtonTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTillbakaActionPerformed(evt);
            }
        });

        jLabel4.setText("Mata in den agent du vill göra till områdeschef");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonTillbaka)
                        .addGap(120, 120, 120)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldOmrade, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(TextFieldAgent))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonTillbaka)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Metod för att verkställa valet av områdeschef

        try {

            String agentNamn = TextFieldAgent.getText();
            String omrade = TextFieldOmrade.getText();

            boolean namnFinns = kontrolleraNamn(agentNamn);
            boolean omradeFinns = kontrolleraOmrade(omrade);

            String namnID = "select Agent_ID from Agent where namn = '" + agentNamn + "'";
            String omradesID = "select Omrades_ID from Omrade where Benamning = '" + omrade + "'";
            String svar1 = idb.fetchSingle(namnID);
            String svar2 = idb.fetchSingle(omradesID);
            String taBort = "delete from omradeschef where Agent_ID = '" + svar1 + "'";
            String nyChef = "insert into omradeschef values (" + svar1 + "," + svar2 + ")";

            boolean tomTextRuta1 = Validering.textRutaArTom(agentNamn);

            if (tomTextRuta1 == false) {
                boolean tomTextRuta2 = Validering.textRutaArTom(omrade);

                if (tomTextRuta2 == false) {

                    if (omradeFinns == true) {

                    } else {
                        JOptionPane.showMessageDialog(null, "Det finns inget område med det namnet!");
                    }

                    if (namnFinns == true) {
                        idb.fetchSingle(taBort);
                        idb.fetchSingle(nyChef);
                        jLabel3.setText("Områdeschefen har ändrats!");
                        TextFieldAgent.setText("");
                        TextFieldOmrade.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Det finns ingen agent med det namnet!");
                    }
                }
            }
        }
    


catch (InfException ie) {

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean kontrolleraOmrade(String omrade) {
        //Metod som kontrollerar så att inmatat område existerar i systemet
        boolean omradeFinns = false;

        try {
            String omradesNamn = "select benamning from Omrade";
            ArrayList<String> omraden = idb.fetchColumn(omradesNamn);
            for (String kollaOmrade : omraden) {
                if (kollaOmrade.toLowerCase().equals(omrade.toLowerCase())) {
                    omradeFinns = true;
                    break;
                }
            }
        } catch (InfException ie) {

        }

        return omradeFinns;
    }

    public boolean kontrolleraNamn(String agentNamn) {
        //metod som kontrollerar så att agent med visst namn inte redan är områdeschef
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
    }


    private void TextFieldAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAgentActionPerformed
        // Textfält där agent som skall bli områdeschef matas in

    }//GEN-LAST:event_TextFieldAgentActionPerformed

    private void TextFieldOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldOmradeActionPerformed
        // Textfält för området som vald agent ska bli chef över
    }//GEN-LAST:event_TextFieldOmradeActionPerformed

    private void ButtonTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTillbakaActionPerformed
        // Tillbaka till huvudmeny admin

        HuvudMenyAdmin huvudMenyAdmin = new HuvudMenyAdmin(idb, agent);
        huvudMenyAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonTillbakaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonTillbaka;
    private javax.swing.JTextField TextFieldAgent;
    private javax.swing.JTextField TextFieldOmrade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
