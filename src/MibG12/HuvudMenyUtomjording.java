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
public class HuvudMenyUtomjording extends javax.swing.JFrame {
        private static InfDB idb;
        private String nuvarandeUtomjording;
    /**
     * Creates new form HuvudMenyUtomjording
     */
    public HuvudMenyUtomjording(InfDB idb, String nuvarandeUtomjording) {
        initComponents();
        this.idb = idb;
        this.nuvarandeUtomjording = nuvarandeUtomjording;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValkommen = new javax.swing.JLabel();
        btnAndraLosen = new javax.swing.JButton();
        btnVisaChef = new javax.swing.JButton();
        lblVisaChef = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValkommen.setText("jLabel1");

        btnAndraLosen.setText("Ändra mitt lösenord");
        btnAndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenActionPerformed(evt);
            }
        });

        btnVisaChef.setText("Visa områdeschef");
        btnVisaChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaChefActionPerformed(evt);
            }
        });

        lblVisaChef.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
                .addGap(23, 23, 23)
                .addComponent(btnAndraLosen)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblVisaChef, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVisaChef, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(lblValkommen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblValkommen)
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAndraLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVisaChef, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVisaChef, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InloggningUtomjording iU = new InloggningUtomjording(idb);
        iU.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed
    public void setValkommenUtomjording()
    {
        
        lblValkommen.setText("Välkommen " + nuvarandeUtomjording +"!");
    
    
}
    public void setNuvarandeUtomjording(String namn){
        nuvarandeUtomjording = namn;
    }
    private void btnVisaChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaChefActionPerformed
        // TODO add your handling code here:
        
        try{  
          String fraga = "select Namn from Agent where Agent_ID=(select Agent_ID from Omradeschef where Omradeschef.Omrade =(select Omrades_ID from Omrade where Omrades_ID=(select Plats from Alien where Alien.Namn='" + nuvarandeUtomjording + "')))";
      
        String svar = idb.fetchSingle(fraga);        
        
        VisaInfoOmAgent aI = new VisaInfoOmAgent (idb, svar, false);
        aI.setVisible(true);
        aI.setInfo(svar);
        aI.setNuvarandeUtomjording(nuvarandeUtomjording);
        dispose();
        
      }
      catch(InfException e){
          JOptionPane.showMessageDialog(null, "Något gick fel");
          System.out.println(e);
      }
    }//GEN-LAST:event_btnVisaChefActionPerformed

    private void btnAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenActionPerformed
        
        AndraLosenAlien aLA = new AndraLosenAlien(idb);
        aLA.setVisible(true);
        aLA.setNuvarandeUtomjording(nuvarandeUtomjording);
        dispose();
    }//GEN-LAST:event_btnAndraLosenActionPerformed

    
      


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JButton btnVisaChef;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JLabel lblVisaChef;
    // End of variables declaration//GEN-END:variables
}
