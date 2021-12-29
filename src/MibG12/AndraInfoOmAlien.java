/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author Victo
 */
public class AndraInfoOmAlien extends javax.swing.JFrame {

    InfDB idb;
    String nuvarandeAgent;
    String nuvarandeUtomjording;
    /**
     * Creates new form AndraInfoOmAlien
     */
    public AndraInfoOmAlien(InfDB idb, String nuvarandeAgent) {
        initComponents();
        this.idb = idb;
        this.nuvarandeAgent = nuvarandeAgent;
        nuvarandeUtomjording ="";
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HuvudText = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblRegDatum = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        lblPlats = new javax.swing.JLabel();
        lblAlienNamn = new javax.swing.JLabel();
        lblAlienRas = new javax.swing.JLabel();
        lblRegDatumAlien = new javax.swing.JLabel();
        lblAlienTelefon = new javax.swing.JLabel();
        lblAlienLosen = new javax.swing.JLabel();
        lblAlienPlats = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtRas = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtRegDatum = new javax.swing.JTextField();
        txtPlats = new javax.swing.JTextField();
        lblRas = new javax.swing.JLabel();
        txtLosenord = new javax.swing.JTextField();
        btnAndraRas = new javax.swing.JButton();
        btnAndraNamn = new javax.swing.JButton();
        btnAndraRegDatum = new javax.swing.JButton();
        btnAndraPlats = new javax.swing.JButton();
        btnAndraTelefon = new javax.swing.JButton();
        btnAndraLosenord = new javax.swing.JButton();
        lblInfoRubrik = new javax.swing.JLabel();
        lblIdNummer = new javax.swing.JLabel();
        lblAlienIdNummer = new javax.swing.JLabel();
        btnTillbakaTillHM = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        cmbValjRas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HuvudText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HuvudText.setText("Information om Alien");

        lblNamn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNamn.setText("Namn: ");

        lblRegDatum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRegDatum.setText("Registreringsdatum: ");

        lblTelefon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefon.setText("Telefon: ");

        lblLosenord.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLosenord.setText("Lösenord:");

        lblPlats.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPlats.setText("Plats:");

        lblAlienNamn.setText("Hehe");

        lblAlienRas.setText("Nörd");

        lblRegDatumAlien.setText("2021-00-00");

        lblAlienTelefon.setText("020-000200");

        lblAlienLosen.setText("Hejsan");

        lblAlienPlats.setText("Örebro");

        txtNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnActionPerformed(evt);
            }
        });

        txtRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRasActionPerformed(evt);
            }
        });

        lblRas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRas.setText("Ras");

        txtLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLosenordActionPerformed(evt);
            }
        });

        btnAndraRas.setText("Ändra");
        btnAndraRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraRasActionPerformed(evt);
            }
        });

        btnAndraNamn.setText("Ändra");
        btnAndraNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraNamnActionPerformed(evt);
            }
        });

        btnAndraRegDatum.setText("Ändra");
        btnAndraRegDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraRegDatumActionPerformed(evt);
            }
        });

        btnAndraPlats.setText("Ändra");
        btnAndraPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraPlatsActionPerformed(evt);
            }
        });

        btnAndraTelefon.setText("Ändra");
        btnAndraTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraTelefonActionPerformed(evt);
            }
        });

        btnAndraLosenord.setText("Ändra");
        btnAndraLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenordActionPerformed(evt);
            }
        });

        lblInfoRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblInfoRubrik.setText("Ny Information");

        lblIdNummer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdNummer.setText("ID-Nummer:");

        lblAlienIdNummer.setText("5");

        btnTillbakaTillHM.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnTillbakaTillHM.setText("Tillbaka till huvudmeny");
        btnTillbakaTillHM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaTillHMActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        cmbValjRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Worm", "Booglodite", "Squid" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAlienTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAlienLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(HuvudText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblRas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblAlienNamn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                        .addComponent(lblAlienRas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addComponent(lblAlienIdNummer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblIdNummer, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)))
                    .addComponent(lblPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAlienPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegDatumAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblInfoRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbValjRas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLosenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAndraPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraRas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnTillbakaTillHM)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInfoRubrik)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAndraNamn)
                                .addGap(201, 201, 201)
                                .addComponent(btnAndraLosenord))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAlienRas)
                                    .addComponent(lblRas)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAndraRas)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblRegDatum)
                                        .addComponent(lblRegDatumAlien))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAndraRegDatum)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPlats)
                                        .addComponent(lblAlienPlats))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAndraPlats)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTelefon)
                                        .addComponent(lblAlienTelefon))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAndraTelefon)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblLosenord)
                                        .addComponent(lblAlienLosen))
                                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblIdNummer)
                                        .addComponent(lblAlienIdNummer))
                                    .addComponent(cmbValjRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HuvudText)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamn)
                            .addComponent(lblAlienNamn))))
                .addGap(18, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTillbaka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTillbakaTillHM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamnActionPerformed

    private void txtRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRasActionPerformed

    private void txtLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLosenordActionPerformed
        
        
    }//GEN-LAST:event_txtLosenordActionPerformed

    private void btnTillbakaTillHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaTillHMActionPerformed
        HuvudMenyAgent hMA = new HuvudMenyAgent (idb, nuvarandeAgent);
        hMA.setHuvudText(nuvarandeAgent);
        hMA.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaTillHMActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        ValjAlienFromAgentHuvudMeny vAFAHM = new ValjAlienFromAgentHuvudMeny(idb, nuvarandeAgent);
        vAFAHM.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnAndraNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraNamnActionPerformed
        
        String nyttNamn = txtNamn.getText();
        String gammaltNamn = lblAlienNamn.getText();
<<<<<<< HEAD
        boolean namnetFinns = Validering.namnFinns(nyttNamn, gammaltNamn);
        boolean textRutaArTom = Validering.textRutaArTom(nyttNamn);
=======
        boolean namnetKorrekt = Validering.stringFinns(nyttNamn, gammaltNamn);
>>>>>>> c0f197bfadd8df4bd59ea0d90744c0bad45f8ce8
        
        if (textRutaArTom == false)
        {
        
        if (namnetFinns == false)
        {
        
        try {
        String fraga = "Update Alien set namn = '" + nyttNamn +"' where namn = '" + nuvarandeUtomjording + "'";
        String svar = idb.fetchSingle(fraga);
        JOptionPane.showMessageDialog(null, "Namnet har ändrats!");
        setNuvarandeUtomjording(nyttNamn);
        showInfo(nuvarandeUtomjording);
        txtNamn.setText("");
        }
        
        catch (InfException ex)
        {
            JOptionPane.showMessageDialog(null, "Någonting gick fel, vänligen prova igen");
            txtNamn.setText("");
        }
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Namnet har inte ändrats, Vänligen skriv in ett annat namn!");
            txtNamn.setText("");
        }
        }
        else
        {
           txtNamn.setText(""); 
        }
        
        
    }//GEN-LAST:event_btnAndraNamnActionPerformed

    private void btnAndraRegDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraRegDatumActionPerformed
<<<<<<< HEAD
        String gammaltDatum = lblRegDatumAlien.getText();
        String nyttDatum = txtRegDatum.getText();
        boolean datumKorrekt = Validering.namnFinns(gammaltDatum, nyttDatum);
        boolean textRutaArTom = Validering.textRutaArTom(gammaltDatum);
=======
        String gammaltDatum = txtRegDatum.getText();
        String nyttDatum = lblRegDatumAlien.getText();
        boolean datumKorrekt = Validering.stringFinns(gammaltDatum, nyttDatum);
>>>>>>> c0f197bfadd8df4bd59ea0d90744c0bad45f8ce8
        
        if (datumKorrekt == false && textRutaArTom == false)
        {
        
        try {
        String fraga = "Update Alien set registreringsdatum = '" + nyttDatum +"' where namn = '" + nuvarandeUtomjording + "'";
        String svar = idb.fetchSingle(fraga);
        JOptionPane.showMessageDialog(null, "Registreingsdatumet har ändrats!");
        txtRegDatum.setText("");
        showInfo(nuvarandeUtomjording);
        }
        
        catch (InfException ex)
        {
            JOptionPane.showMessageDialog(null, "Fel datumformat, vänligen ange ett nytt datum enligt 'YYYY-MM-DD'");
            txtRegDatum.setText("");
        }
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Vänligen skriv ett annat datum!");
            txtRegDatum.setText("");
        }
    }//GEN-LAST:event_btnAndraRegDatumActionPerformed

    private void btnAndraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenordActionPerformed
        
        String nyttLosenord = txtLosenord.getText();
        String gammaltLosenord = lblAlienLosen.getText();
        boolean losenFinns = Validering.namnFinns(nyttLosenord, gammaltLosenord);
        boolean textRutaArTom = Validering.textRutaArTom(nyttLosenord);
        
        if (losenFinns == false && textRutaArTom == false)
        {
        
        try {
        String fraga = "Update Alien set losenord = '" + nyttLosenord +"' where namn = '" + nuvarandeUtomjording + "'";
        String svar = idb.fetchSingle(fraga);
        JOptionPane.showMessageDialog(null, "Lösenordet har ändrats!");
        txtLosenord.setText("");
        showInfo(nuvarandeUtomjording);
        }
        
        catch (InfException ex)
        {
            JOptionPane.showMessageDialog(null, "Det nya lösenordet är för långt, vänligen skriv ett nytt med max 6 tecken!");
            txtLosenord.setText("");
        }
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Lösenordet har inte ändrats, Vänligen skriv in ett annat löseord!");
            txtLosenord.setText("");
        }   
    }//GEN-LAST:event_btnAndraLosenordActionPerformed

    private void btnAndraTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraTelefonActionPerformed
        
        String nyttTelefonNummer = txtTelefon.getText();
        String gammaltTelefonNummer = lblAlienTelefon.getText();
        boolean TelefonFinns = Validering.namnFinns(nyttTelefonNummer, gammaltTelefonNummer);
        boolean textRutaArTom = Validering.textRutaArTom(nyttTelefonNummer);
        
        if (TelefonFinns == false && textRutaArTom == false)
        {
        
        try {
        String fraga = "Update Alien set telefon = '" + nyttTelefonNummer +"' where namn = '" + nuvarandeUtomjording + "'";
        String svar = idb.fetchSingle(fraga);
        JOptionPane.showMessageDialog(null, "Telefonnumret har ändrats!");
        txtTelefon.setText("");
        showInfo(nuvarandeUtomjording);
        }
        
        catch (InfException ex)
        {
            JOptionPane.showMessageDialog(null, "Något har gått fel, vänligen prova igen.");
            txtTelefon.setText("");
        }
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Telefonnumret har inte ändrats, Vänligen skriv in ett annat nummer!");
            txtTelefon.setText("");
        }   
          
    }//GEN-LAST:event_btnAndraTelefonActionPerformed

    private void btnAndraPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraPlatsActionPerformed
        
        String nyPlats = txtPlats.getText();
        String gammalPlats = lblAlienPlats.getText();
        boolean platsFinns = Validering.namnFinns(nyPlats, gammalPlats);
        boolean textRutaArTom = Validering.textRutaArTom(nyPlats);
        
        if (platsFinns == false && textRutaArTom == false)
        {
        
        try {
        String fraga = "Select benamning from omrade where omrades_id = (Select Plats from alien where namn = '" + nuvarandeUtomjording + "')";
        String svar = idb.fetchSingle(fraga);
        JOptionPane.showMessageDialog(null, "Telefonnumret har ändrats!");
        txtTelefon.setText("");
        showInfo(nuvarandeUtomjording);
        }
        
        catch (InfException ex)
        {
            JOptionPane.showMessageDialog(null, "Något har gått fel, vänligen prova igen.");
            txtTelefon.setText("");
        }
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Telefonnumret har inte ändrats, Vänligen skriv in ett annat nummer!");
            txtTelefon.setText("");
        }    
    }//GEN-LAST:event_btnAndraPlatsActionPerformed

    private void btnAndraRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraRasActionPerformed
        
        
        
        
    }//GEN-LAST:event_btnAndraRasActionPerformed

    public void setNuvarandeAgent (String nuvarandeAgent)
    {
        this.nuvarandeAgent = nuvarandeAgent;
    }
    
    public void setNuvarandeUtomjording (String utomjording)
    {
        nuvarandeUtomjording = utomjording;
    }
    
    public String visaNuvarandeUtomjording()
    {
        return nuvarandeUtomjording;
    }
    
    public void showInfo (String namn)
    {
        try {
       String fraga1 = "SELECT namn FROM alien where namn = '" + namn + "'";
       String fraga2 = "Select telefon from alien where namn = '" + namn + "'";
       String fraga3 = "Select Registreringsdatum from alien where namn = '" + namn + "'";
       String fraga4 = "Select benamning from plats where plats_id = (Select Plats from alien where namn = '" + namn + "')";
       String fraga5 = "Select telefon from alien where namn = '" + namn + "'";
       String fraga6 = "Select losenord from alien where namn = '" + namn + "'";
       String fraga7 = "Select alien_id from alien where namn = '" + namn + "'";
        
       String svar1 = idb.fetchSingle(fraga1);
       String svar2 = idb.fetchSingle(fraga2);
       String svar3 = idb.fetchSingle(fraga3);
       String svar4 = idb.fetchSingle(fraga4);
       String svar5 = idb.fetchSingle(fraga5);
       String svar6 = idb.fetchSingle(fraga6);
       String svar7 = idb.fetchSingle(fraga7);
       
       lblAlienNamn.setText(svar1);
       lblAlienRas.setText(svar2);
       lblRegDatumAlien.setText(svar3);
       lblAlienPlats.setText(svar4);
       lblAlienTelefon.setText(svar5);
       lblAlienLosen.setText(svar6);
       lblAlienIdNummer.setText(svar7);
       
        }
        catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
    }
    
    public void visaRas (String namn)
    {
        
        try {
            String fraga = "Select Alien_ID from alien where namn = '" + namn + "'";
            String svar1 = idb.fetchSingle(fraga);
            String fragaBog = "Select alien_id from boglodite";
            ArrayList<String> boglodite = idb.fetchColumn(fragaBog);
        }
        catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HuvudText;
    private javax.swing.JButton btnAndraLosenord;
    private javax.swing.JButton btnAndraNamn;
    private javax.swing.JButton btnAndraPlats;
    private javax.swing.JButton btnAndraRas;
    private javax.swing.JButton btnAndraRegDatum;
    private javax.swing.JButton btnAndraTelefon;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnTillbakaTillHM;
    private javax.swing.JComboBox<String> cmbValjRas;
    private javax.swing.JLabel lblAlienIdNummer;
    private javax.swing.JLabel lblAlienLosen;
    private javax.swing.JLabel lblAlienNamn;
    private javax.swing.JLabel lblAlienPlats;
    private javax.swing.JLabel lblAlienRas;
    private javax.swing.JLabel lblAlienTelefon;
    private javax.swing.JLabel lblIdNummer;
    private javax.swing.JLabel lblInfoRubrik;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRegDatum;
    private javax.swing.JLabel lblRegDatumAlien;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtPlats;
    private javax.swing.JTextField txtRas;
    private javax.swing.JTextField txtRegDatum;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}