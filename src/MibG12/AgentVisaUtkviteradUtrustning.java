/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author Victo
 * 
 * JFrame klass för att visa utomjordingar som finns inom en viss plats.
 * Klassen tar in ett parametervärde som den plats man vill använda.
 */
public class AgentVisaUtkviteradUtrustning extends javax.swing.JFrame {

    InfDB idb;
    String nuvarandeAgent;
    public AgentVisaUtkviteradUtrustning(InfDB idb, String nuvarandeAgent) {
        initComponents();
        this.idb = idb;
        this.nuvarandeAgent = nuvarandeAgent;  
        visaUtrustning();
        txtAreaVisaInfo.setEditable(false);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaVisaInfo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaVisaInfo.setColumns(20);
        txtAreaVisaInfo.setRows(5);
        jScrollPane1.setViewportView(txtAreaVisaInfo);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Utkvitterad utrustning just nu:");

        jButton1.setText("Tillbaka");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HuvudMenyAgent hMA = new HuvudMenyAgent (idb, nuvarandeAgent);
        hMA.setHuvudText(nuvarandeAgent);
        hMA.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /**
     * Metod som kollar att inkommande plats finns i databasen.
     * Retunerar true eller false beroende på om platsen finns eller inte.
     * @param plats
     * @return platsFinns
     */
    
    public boolean kollaPlats (String plats)
    {
        boolean platsFinns = false;
        
        try {
        
        String fraga = "Select benamning from plats";
        ArrayList<String> platser = idb.fetchColumn(fraga);
        
        for (String platsen : platser)
        {
            platsFinns = Validering.stringFinns(platsen,plats);
            
            if (platsFinns == true)
            {
                break;
            }
        }
        }
        catch (InfException ex)
        {
           JOptionPane.showMessageDialog(null, "Något gick fel"); 
        }
        return platsFinns;
        
    }
    
    public void visaUtrustning ()
    {
        try {
        ArrayList<HashMap<String, String>> utrustning;
        String fraga1 = "Select * from innehar_utrustning where agent_id in (Select agent_id from agent where namn = '" + nuvarandeAgent + "')";
        utrustning = idb.fetchRows(fraga1);
        txtAreaVisaInfo.append("Utrustningsnamn:" + "\t");
        txtAreaVisaInfo.append("Utkvitteringsdatum:" + "\t");
        
        for (HashMap<String, String> saker : utrustning)
        {
            txtAreaVisaInfo.append("\n");
            String fragaVapenNamn = "Select benamning from utrustning where Utrustnings_ID =" + saker.get("Utrustnings_ID");
            System.out.println(saker.get("Utrustnings_ID"));
            String svar = idb.fetchSingle(fragaVapenNamn);
            txtAreaVisaInfo.append(svar + "\t");
            txtAreaVisaInfo.append("\t" + saker.get("Utkvitteringsdatum") + "\t");
        }
        
        if (utrustning.isEmpty())
        {
            txtAreaVisaInfo.setText("");
            txtAreaVisaInfo.append("Denna agent har ingen utrustning utkvitterad.");
              
            
        }
        
        
        }
        catch (InfException ie) 
                {
                    System.out.print(ie);
                }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaVisaInfo;
    // End of variables declaration//GEN-END:variables
}



    
    
