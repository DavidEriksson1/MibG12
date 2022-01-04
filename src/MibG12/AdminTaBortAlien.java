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
 * @author 46737
 */
public class AdminTaBortAlien extends javax.swing.JFrame {
    
    private static InfDB idb;
    private String nuvarandeAgent;
    

    /**
     * Creates new form AdminAlienHantering
     * @param idb
     */
    public AdminTaBortAlien(InfDB idb, String nuvarandeAgent) {
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
        txtAlienNamn = new javax.swing.JTextField();
        btnRadera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTaBort.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTaBort.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaBort.setText("Ta bort en alien ur systemet");

        btnRadera.setText("Radera");
        btnRadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaderaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRadera, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(lblTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTaBort)
                .addGap(33, 33, 33)
                .addComponent(txtAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnRadera)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaActionPerformed
        // TODO add your handling code here:
        boolean alienFinns = false;
        try{
            String alienAttRadera = txtAlienNamn.getText();
            
            
            String namn = "Select namn from Alien where namn ='" + alienAttRadera + "'";
            String radera = "delete from Alien where namn = '" + alienAttRadera + "'";
            
            String svar1 = idb.fetchSingle(namn);
            System.out.println(namn);
            
            alienFinns = Validering.stringFinns(svar1, alienAttRadera);
            
            if(alienFinns == true){
                String svar2 = idb.fetchSingle(radera);
                JOptionPane.showMessageDialog(null, alienAttRadera + " raderades ur systemet!");
                txtAlienNamn.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null,"Det finns ingen Alien med det namnet");
                txtAlienNamn.setText("");
            }
        }
        
        catch (InfException e){
            JOptionPane.showMessageDialog(null, "Något fick fel");
            System.out.println(e);
        }
    }//GEN-LAST:event_btnRaderaActionPerformed

    /**
     * @param args the command line arguments
     */

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRadera;
    private javax.swing.JLabel lblTaBort;
    private javax.swing.JTextField txtAlienNamn;
    // End of variables declaration//GEN-END:variables
}