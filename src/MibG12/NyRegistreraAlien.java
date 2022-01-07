/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author 46737
 */
public class NyRegistreraAlien extends javax.swing.JFrame {

    private static InfDB idb;
    private static String nuvarandeAgent;
    private boolean anvandareArAdmin;
    /**
     * Creates new form NyRegistreraAlien
     */
    public NyRegistreraAlien(InfDB idb, String nuvarandeAgent, boolean anvandareArAdmin) {
        initComponents();
        this.idb = idb;
        this.nuvarandeAgent = nuvarandeAgent;
        this.anvandareArAdmin = anvandareArAdmin;
        laggTillAgent(cbAgent);
        laggTillPlats(cbPlats);
        txtRasVal.setVisible(false);
        slumpId();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtAlienDatum = new javax.swing.JTextField();
        txtAlienLosenord = new javax.swing.JTextField();
        txtAlienNamn = new javax.swing.JTextField();
        txtAlienTelefon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnLaggTillAlien = new javax.swing.JButton();
        lblNyRegistrera = new javax.swing.JLabel();
        cbAgent = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbRas = new javax.swing.JComboBox<>();
        btnTillbaka = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        cbPlats = new javax.swing.JComboBox<>();
        lblRasVal = new javax.swing.JLabel();
        txtRasVal = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAlienLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlienLosenordActionPerformed(evt);
            }
        });

        jLabel2.setText("RegDatum");

        jLabel3.setText("Lösenord");

        jLabel5.setText("Namn");

        jLabel6.setText("Telefon");

        jLabel8.setText("Ansvarig Agent");

        btnLaggTillAlien.setText("OK");
        btnLaggTillAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillAlienActionPerformed(evt);
            }
        });

        lblNyRegistrera.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        lblNyRegistrera.setText("Nyregistrera Alien");

        cbAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------" }));

        jLabel9.setText("Ras");

        jLabel10.setText("Plats");

        cbRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------", "Boglodite", "Squid", "Worm" }));
        cbRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRasActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        cbPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAlienLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(txtAlienNamn))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRasVal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(36, 36, 36)
                                .addComponent(txtAlienTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnTillbaka)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLaggTillAlien, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbAgent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPlats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtRasVal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(lblNyRegistrera))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtAlienDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNyRegistrera)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(txtAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRasVal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRasVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtAlienLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAlienDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAlienTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTillAlien)
                    .addComponent(btnTillbaka))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   
            
    private void btnLaggTillAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillAlienActionPerformed
        // Lägg till ny alien med inmatad information
        ArrayList<String> utomjordingar;

        int i = cbRas.getSelectedIndex();

        String regDatum = txtAlienDatum.getText();
        String losenord = txtAlienLosenord.getText();
        String namn = txtAlienNamn.getText();
        String telefon = txtAlienTelefon.getText();

        String id = lblID.getText();
        String armar = txtRasVal.getText();

        
        boolean textRutaTom2 = Validering.textRutaArTom(regDatum);
        boolean namnetAnvands = false;

        if (textRutaTom2 == false) {
            boolean textRutaTom3 = Validering.textRutaArTom(losenord);
            if (textRutaTom3 == false) {
                boolean textRutaTom4 = Validering.textRutaArTom(namn);
                if (textRutaTom4 == false) {
                    boolean textRutaTom5 = Validering.textRutaArTom(telefon);
                    if (textRutaTom5 == false) {
                        boolean datumKorrekt = Validering.kollaDatumFormat(regDatum);
                        if (datumKorrekt == true) {
                            boolean telefonKorrekt = Validering.endastSiffror(telefon);
                            if (telefonKorrekt == true) {
                                boolean namnKorrekt = Validering.arStringEndastBokstaver(namn);
                                if (namnKorrekt == true) {

                                    String agenten = cbAgent.getSelectedItem().toString().toLowerCase();
                                    String platsen = cbPlats.getSelectedItem().toString().toLowerCase();

                                    String jamforNamn = "select namn from alien";
                                    String ansAgent = "Select Agent_id from agent where namn ='" + agenten + "'";
                                    String platsId = "Select plats_id from plats where benamning='" + platsen + "'";

                                    try {

                                        utomjordingar = idb.fetchColumn(jamforNamn);
                                        String agentID = idb.fetchSingle(ansAgent);
                                        String platsID = idb.fetchSingle(platsId);

                                        String insertAlien = "insert into alien values (" + id + ",'" + regDatum + "','" + losenord + "','" + namn + "','" + telefon + "'," + platsID + "," + agentID + ")";
                                        String insertBog = "insert into Boglodite values(" + id + "," + armar + ")";
                                        String insertSquid = "insert into Squid values(" + id + "," + armar + ")";
                                        String insertWorm = "insert into Worm values(" + id + ")";

                                        for (String namnet : utomjordingar) {

                                            if (namnet.toLowerCase().equals(namn.toLowerCase())) {
                                                namnetAnvands = true;
                                                JOptionPane.showMessageDialog(null, "Namnet finns redan registrerat vänligen ange ett annat!");
                                                break;
                                            }
                                        }

                                        if (namnetAnvands == false) {

                                            if (i == 1) {
                                                idb.fetchSingle(insertAlien);
                                                idb.fetchSingle(insertBog);
                                                JOptionPane.showMessageDialog(null, namn + " registrerades!");
                                                txtAlienDatum.setText("");
                                                txtAlienLosenord.setText("");
                                                txtAlienNamn.setText("");
                                                txtAlienTelefon.setText("");
                                                cbAgent.setSelectedIndex(0);
                                                cbPlats.setSelectedIndex(0);
                                                cbRas.setSelectedIndex(0);
                                                slumpId();

                                            }
                                            if (i == 2) {
                                                idb.fetchSingle(insertAlien);
                                                idb.fetchSingle(insertSquid);
                                                JOptionPane.showMessageDialog(null, namn + " registrerades!");
                                                txtAlienDatum.setText("");
                                                txtAlienLosenord.setText("");
                                                txtAlienNamn.setText("");
                                                txtAlienTelefon.setText("");
                                                cbAgent.setSelectedIndex(0);
                                                cbPlats.setSelectedIndex(0);
                                                cbRas.setSelectedIndex(0);
                                                slumpId();

                                            }
                                            if (i == 3) {
                                                idb.fetchSingle(insertAlien);
                                                idb.fetchSingle(insertWorm);
                                                JOptionPane.showMessageDialog(null, namn + " registrerades!");
                                                txtAlienDatum.setText("");
                                                txtAlienLosenord.setText("");
                                                txtAlienNamn.setText("");
                                                txtAlienTelefon.setText("");
                                                cbAgent.setSelectedIndex(0);
                                                cbPlats.setSelectedIndex(0);
                                                cbRas.setSelectedIndex(0);
                                                slumpId();
                                            }

                                        }
                                    } catch (InfException ie) {
                                        System.out.println("Något gick fel " + ie);
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
                          
    }//GEN-LAST:event_btnLaggTillAlienActionPerformed

 //Ger ett id till alien som är ett högre än det nuvarande max som finns   
    public void slumpId() {
        String maxID = "Select max(alien_ID) from alien";
        try {
            String hogstaID = idb.fetchSingle(maxID);
            int nyID = Integer.parseInt(hogstaID);
            int nyasteId = nyID + 1;
            lblID.setText("" + nyasteId + "");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
//Fyller "Agent" comboboxen med de agenter man kan ha som kontaktperson.

    public static void laggTillAgent(JComboBox cb) {
        String agentFraga = "SELECT namn FROM agent";

        ArrayList<String> allaAgenter;

        try {
            allaAgenter = idb.fetchColumn(agentFraga);
            for (String a : allaAgenter) {
                cb.addItem(a);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println(ex);

        }

    }
// Fyller "Plats"comboboxen med de platser som finns.

    public static void laggTillPlats(JComboBox cb) {
        String platsFraga = "SELECT benamning FROM plats";

        ArrayList<String> platser;

        try {
            platser = idb.fetchColumn(platsFraga);
            for (String a : platser) {
                cb.addItem(a);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println(ex);

        }

    }

    private void txtAlienLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlienLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlienLosenordActionPerformed
 // Går tillbaka till huvudmeny för admin.
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        
        if (anvandareArAdmin == true)
        {
            HuvudMenyAdmin hMA = new HuvudMenyAdmin(idb, nuvarandeAgent);
            hMA.setVisible(true);
            dispose();
        }
        else
        {
            HuvudMenyAgent hMA = new HuvudMenyAgent(idb, nuvarandeAgent);
            hMA.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_btnTillbakaActionPerformed
///Metod som gör så antal armar/boogies bara syns för respektive ras när den ska registreras
    private void cbRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRasActionPerformed
        int i = cbRas.getSelectedIndex();

        if (i == 0) {
            lblRasVal.setText("");
            txtRasVal.setVisible(false);
            txtRasVal.setText("");
        }
        if (i == 1) {
            lblRasVal.setText("Antal Boogies");
            txtRasVal.setVisible(true);
            txtRasVal.setText("");

        }
        if (i == 2) {
            lblRasVal.setText("Antal Armar");
            txtRasVal.setVisible(true);
            txtRasVal.setText("");
        }
        if (i == 3) {

            txtRasVal.setVisible(false);

        }
    }//GEN-LAST:event_cbRasActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTillAlien;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbAgent;
    private javax.swing.JComboBox<String> cbPlats;
    private javax.swing.JComboBox<String> cbRas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNyRegistrera;
    private javax.swing.JLabel lblRasVal;
    private javax.swing.JTextField txtAlienDatum;
    private javax.swing.JTextField txtAlienLosenord;
    private javax.swing.JTextField txtAlienNamn;
    private javax.swing.JTextField txtAlienTelefon;
    private javax.swing.JTextField txtRasVal;
    // End of variables declaration//GEN-END:variables
}
