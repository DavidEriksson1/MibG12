/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author 46737
 */
public class InloggningAdmin extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form InloggningAdmin
     */
    public InloggningAdmin(InfDB idb) {
        initComponents();
        this.idb = idb;
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
        btnLoggaIn = new javax.swing.JButton();
        lblAnvNamnAdmin = new javax.swing.JTextField();
        lblLosenAdmin = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Välkommen admin! Vänligen ange användarnamn och lösenord.");

        btnLoggaIn.setText("Logga In");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });
        btnLoggaIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoggaInKeyPressed(evt);
            }
        });

        jLabel2.setText("Användarnamn");

        jLabel3.setText("Lösenord");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Visa Lösenord");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLoggaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAnvNamnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(lblLosenAdmin))
                                .addGap(44, 44, 44)))
                        .addComponent(btnTillbaka)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnvNamnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLosenAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoggaIn)
                    .addComponent(btnTillbaka)
                    .addComponent(jCheckBox1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        // Kontrollera adminstatus för att ta sig till huvudmeny admin
     
        boolean inloggningKorrekt = false;
     
          
     try{
              String aNamn = lblAnvNamnAdmin.getText();
              char[] c = lblLosenAdmin.getPassword();
              String losen = new String (c);
              
              boolean adminStatus = checkAdmin(aNamn);
              
              String fraga1 = "SELECT Namn from agent where Namn='" + aNamn + "'";
              String fraga2 = "SELECT Losenord from Agent where Namn='" + aNamn + "'";
              
              ArrayList<String> svar1 = idb.fetchColumn(fraga1);
              String aSvar = svar1.toString();
              String anvNamn = aSvar.replaceAll("[\\p{Ps}\\p{Pe}]","");
              
              ArrayList<String> svar2 = idb.fetchColumn(fraga2);
              String lSvar = svar2.toString();
              String losOrd = lSvar.replaceAll("[\\p{Ps}\\p{Pe}]","");
              
              inloggningKorrekt = Validering.kollaInloggningAgent(aNamn, anvNamn, losen, losOrd);
              
              if (adminStatus == true)
              {
                  
              if(inloggningKorrekt == true){
                  HuvudMenyAdmin hMA = new HuvudMenyAdmin(idb, aNamn);
                    hMA.setVisible(true);
                    dispose();
                    
              }
              else if (inloggningKorrekt == false)
              {
                  JOptionPane.showMessageDialog(null, "Användarnamn eller lösenord är fel");
              }
              }
          }   
          catch(InfException e){
              JOptionPane.showMessageDialog(null, "Något gick fel");
          }
          
    


    }//GEN-LAST:event_btnLoggaInActionPerformed

    public boolean checkAdmin(String anvNamn) {
        
        boolean adminStatus = false;

        

        try {
            String fraga1 = "Select administrator from agent where namn = '" + anvNamn + "'";
            ArrayList<String> svar1 = idb.fetchColumn(fraga1);
            String svar = svar1.toString();
            String admin = svar.replaceAll("[\\p{Ps}\\p{Pe}]", "");
            String J = "J";
            
            adminStatus = Validering.checkAdminStatus(admin);

        } catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
        return adminStatus;
    }
    
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // Tillbaka till inloggningstyp
        new InloggningsTyp(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) 
        {
            lblLosenAdmin.setEchoChar((char)0);
        }
        else 
        {
            lblLosenAdmin.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnLoggaInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoggaInKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoggaInKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField lblAnvNamnAdmin;
    private javax.swing.JPasswordField lblLosenAdmin;
    // End of variables declaration//GEN-END:variables
}
