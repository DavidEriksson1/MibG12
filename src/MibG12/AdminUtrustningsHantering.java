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
public class AdminUtrustningsHantering extends javax.swing.JFrame {

    private static InfDB idb;
    private String agent;

    /**
     * Creates new form AdminUtrustningsHantering
     */
    public AdminUtrustningsHantering(InfDB idb, String agent) {
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
        txtTaBortUtrustning = new javax.swing.JTextField();
        btnTaBortUtrustning = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboUtrustningsTyp = new javax.swing.JComboBox<>();
        btnTillbaka = new javax.swing.JButton();
        lblHarTagitsBort = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Välkommen till utrustningshanteraren! Här kan du ta bort utrustning från systemet");

        btnTaBortUtrustning.setText("Ta bort");
        btnTaBortUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortUtrustningActionPerformed(evt);
            }
        });

        jLabel2.setText("Utrustningsnamn");

        jLabel3.setText("Utrustningstyp");

        ComboUtrustningsTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vapen", "Kommunikation", "Teknik" }));
        ComboUtrustningsTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboUtrustningsTypActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(btnTillbaka))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTaBortUtrustning))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboUtrustningsTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTaBortUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(lblHarTagitsBort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTaBortUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboUtrustningsTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHarTagitsBort, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbaka)
                    .addComponent(btnTaBortUtrustning))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaBortUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortUtrustningActionPerformed
        // Kontrollera att utrustningen finns och så att textrutan inte är tom
        boolean utrustningFinns = false;

        try {
            String utrustning = txtTaBortUtrustning.getText();
            String hittaTyp = visaTyp(utrustning).toLowerCase();
            

            boolean textRutaArTom = Validering.textRutaArTom(utrustning);

            //SQL frågor för att hämta utrustningsnamn och ID för att ta bort dem ur systemet
            String namn = "select Benamning from utrustning where Benamning ='" + utrustning + "'";

            String svarUtrustningsNamn = idb.fetchSingle(namn);

            String utrustningsID = "select Utrustnings_ID from Utrustning where Benamning = '" + svarUtrustningsNamn + "'";

            String svarUtrustningsID = idb.fetchSingle(utrustningsID);

            String taBortUtrustning = "delete from utrustning where Benamning ='" + svarUtrustningsNamn + "'";

            String taBortUtrustningsID = "delete from innehar_utrustning where Utrustnings_ID = " + svarUtrustningsID;
            String taBortKommunikationsID = "delete from kommunikation where Utrustnings_ID = " + svarUtrustningsID;
            String taBortTeknikID = " delete from teknik where Utrustnings_ID = " + svarUtrustningsID;
            String taBortVapenID = " delete from vapen where Utrustnings_ID = " + svarUtrustningsID;

            String valdTyp = ComboUtrustningsTyp.getSelectedItem().toString().toLowerCase();
            
            String taBortFraga = "delete from " + valdTyp + " where Utrustnings_ID = " + svarUtrustningsID;

            utrustningFinns = Validering.stringFinns(svarUtrustningsNamn, utrustning);

            if (textRutaArTom == false) {
                

                if (utrustningFinns == true) {
                    

                    if (valdTyp.equals(hittaTyp)) {
                        idb.fetchSingle(taBortFraga);            
                        idb.fetchSingle(taBortUtrustningsID);
                        idb.fetchSingle(taBortUtrustning);
                        lblHarTagitsBort.setText(utrustning + " har tagits bort!");

                    }
                    }
                else {
                        JOptionPane.showMessageDialog(null, "Det finns ingen utrustning med namnet " + utrustning);
                }
            }
        } catch (InfException ie) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, "Det finns ingen utrustning med namnet det namnet");
        }


    }//GEN-LAST:event_btnTaBortUtrustningActionPerformed

    public String visaTyp(String utrustningsTyp) {
        boolean isVapen = false;
        boolean isKommunikation = false;
        boolean isTeknik = false;
        String typ = "";

        try {
            String utrustningsID = "select Utrustnings_ID from utrustning where Benamning ='" + utrustningsTyp + "'";
            String svarID = idb.fetchSingle(utrustningsID);

            String fragaVapen = "select Utrustnings_ID from vapen";
            ArrayList<String> vapen = idb.fetchColumn(fragaVapen);

            String fragaKommunikation = "select Utrustnings_ID from kommunikation";
            ArrayList<String> kommunikation = idb.fetchColumn(fragaKommunikation);

            String fragaTeknik = "select Utrustnings_ID from teknik";
            ArrayList<String> teknik = idb.fetchColumn(fragaTeknik);

            for (String id : vapen) {
                if (id.equals(svarID)) {
                    isVapen = true;
                    break;
                }
            }
            if (isVapen == false) {
                for (String id : kommunikation) {
                    if (id.equals(svarID)) {
                        isKommunikation = true;
                        break;
                    }
                }
            }
            if (isVapen == false && isKommunikation == false) {
                for (String id : teknik) {
                    if (id.equals(svarID)) {
                        isTeknik = true;
                        break;
                    }
                }
            }
            if (isVapen == true) {
                typ = "Vapen";
            }
            else if (isKommunikation == true) {
                typ = "Kommunikation";
            }
            else if (isTeknik == true) {
                typ = "Teknik";
            }

        } catch (InfException ie) {

        }
        return typ;
    }


    private void ComboUtrustningsTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboUtrustningsTypActionPerformed
        // Combobox för att välja utrustningstyp
        int i = ComboUtrustningsTyp.getSelectedIndex();


    }//GEN-LAST:event_ComboUtrustningsTypActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // Knapp för att komma tillbaka till huvudmeny admin

        HuvudMenyAdmin huvudMenyAdmin = new HuvudMenyAdmin(idb, agent);
        huvudMenyAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboUtrustningsTyp;
    private javax.swing.JButton btnTaBortUtrustning;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblHarTagitsBort;
    private javax.swing.JTextField txtTaBortUtrustning;
    // End of variables declaration//GEN-END:variables
}
