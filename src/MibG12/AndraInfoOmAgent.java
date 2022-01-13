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
 *JFrame som visar information och har möjlighet att ändra information om enskild agent.
 * 
 */
public class AndraInfoOmAgent extends javax.swing.JFrame {

    private InfDB idb;
    private String nuvarandeAgent;
    private String nuvarandeUtomjording;
    private VisaInfoOmAgent visaInfoOmAgent;
    private FyllaComboBox fCB;
    /**
     * Creates new form AndraInfoOmAlien
     */
    public AndraInfoOmAgent(InfDB idb, String nuvarandeAgent) {
        initComponents();
        this.idb = idb;
        this.nuvarandeAgent = nuvarandeAgent;
        this.visaInfoOmAgent = new VisaInfoOmAgent (idb, nuvarandeAgent, true, nuvarandeUtomjording, false);
        visaInfoOmAgent.setNuvarandeAgent(nuvarandeAgent);
        visaInfoOmAgent.setInfo(nuvarandeAgent);
        fCB = new FyllaComboBox(idb);
        fCB.laggTillOmrade(jComboBoxOmrade);
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
        lblNamnRubrik = new javax.swing.JLabel();
        lblRegDatumRubrik = new javax.swing.JLabel();
        lblTelefonRubrik = new javax.swing.JLabel();
        lblLosenordRubrik = new javax.swing.JLabel();
        lblPlatsRubrik = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblRegDatum = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblLosen = new javax.swing.JLabel();
        lblPlats = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtRegDatum = new javax.swing.JTextField();
        btnAndraNamn = new javax.swing.JButton();
        btnAndraRegDatum = new javax.swing.JButton();
        btnAndraPlats = new javax.swing.JButton();
        btnAndraTelefon = new javax.swing.JButton();
        btnAndraLosenord = new javax.swing.JButton();
        lblInfoRubrik = new javax.swing.JLabel();
        lblIdAdminStatusRubrik = new javax.swing.JLabel();
        lblAdminStatus = new javax.swing.JLabel();
        btnTillbakaTillHM = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        lblRasExtraAndra = new javax.swing.JLabel();
        txtLosenord = new javax.swing.JTextField();
        btnAndraAdminStatus = new javax.swing.JButton();
        jComboBoxAndraAdmin = new javax.swing.JComboBox<>();
        jComboBoxOmrade = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HuvudText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HuvudText.setText("Information om Agent:");

        lblNamnRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNamnRubrik.setText("Namn: ");

        lblRegDatumRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRegDatumRubrik.setText("Anstallningsdatum:");

        lblTelefonRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefonRubrik.setText("Telefon: ");

        lblLosenordRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLosenordRubrik.setText("Lösenord:");

        lblPlatsRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPlatsRubrik.setText("Område:");

        lblNamn.setText("Hehe");

        lblRegDatum.setText("1995-03-05");

        lblTelefon.setText("07000000");

        lblLosen.setText("hej");

        lblPlats.setText("Örebro");

        txtNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnActionPerformed(evt);
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

        lblIdAdminStatusRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdAdminStatusRubrik.setText("Adminstatus:");

        lblAdminStatus.setText("Ja");

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

        txtLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLosenordActionPerformed(evt);
            }
        });

        btnAndraAdminStatus.setText("Ändra");
        btnAndraAdminStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAdminStatusActionPerformed(evt);
            }
        });

        jComboBoxAndraAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj:", "Ja", "Nej" }));
        jComboBoxAndraAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAndraAdminActionPerformed(evt);
            }
        });

        jComboBoxOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj:" }));

        jLabel1.setText("YYYY-MM-DD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(HuvudText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(lblInfoRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(132, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNamnRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPlatsRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLosenordRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblRasExtraAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                                    .addComponent(jComboBoxOmrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxAndraAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblIdAdminStatusRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(lblAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTelefonRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRegDatumRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(btnTillbakaTillHM)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAndraPlats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAndraTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAndraLosenord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAndraAdminStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAndraNamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAndraRegDatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HuvudText)
                    .addComponent(lblInfoRubrik))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamnRubrik)
                    .addComponent(lblNamn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraNamn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRegDatumRubrik)
                            .addComponent(lblRegDatum)
                            .addComponent(btnAndraRegDatum)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblRasExtraAndra)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonRubrik)
                    .addComponent(lblTelefon)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraTelefon))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlatsRubrik)
                    .addComponent(lblPlats)
                    .addComponent(btnAndraPlats)
                    .addComponent(jComboBoxOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraLosenord)
                    .addComponent(lblLosenordRubrik)
                    .addComponent(lblLosen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdAdminStatusRubrik)
                    .addComponent(lblAdminStatus)
                    .addComponent(jComboBoxAndraAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraAdminStatus))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnTillbakaTillHM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamnActionPerformed

    private void btnTillbakaTillHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaTillHMActionPerformed
        HuvudMenyAdmin hMA = new HuvudMenyAdmin (idb, nuvarandeAgent);
        hMA.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaTillHMActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        AdminValjAgentFromHuvudMeny vAFAHM = new AdminValjAgentFromHuvudMeny(idb);
        vAFAHM.setVisible(true);
        vAFAHM.setVisaAndraText();
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    /**
     * Metod som ändrar namnet på vald agent.
     * 
     */
    
    private void btnAndraNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraNamnActionPerformed
        
        String nyttNamn = txtNamn.getText();
        String gammaltNamn = lblNamn.getText();
        
        boolean textRutaArTom = Validering.textRutaArTom(nyttNamn);
        
        if (textRutaArTom == false) {
            
            boolean endastBokstaver = Validering.arStringEndastBokstaver(nyttNamn);
            
            if (endastBokstaver == true)
            {
                boolean namnetEjAnvant = kollaNamn(nyttNamn);
            
            if (namnetEjAnvant == false) {
                
                boolean namnetSamma = Validering.stringFinns(nyttNamn, gammaltNamn);
                
                if (namnetSamma == false) {
                    
                    try {
                        String fraga = "Update Agent set namn = '" + nyttNamn + "' where namn = '" + nuvarandeAgent + "'";
                        idb.fetchSingle(fraga);
                        JOptionPane.showMessageDialog(null, "Namnet har ändrats!");
                        setNuvarandeUtomjording(nyttNamn);
                        setNuvarandeAgent(nyttNamn);
                        setInfo(nuvarandeAgent);
                        txtNamn.setText("");
                    } catch (InfException ex) {
                        JOptionPane.showMessageDialog(null, "Någonting gick fel, vänligen prova igen");
                        txtNamn.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Namnet har inte ändrats, Vänligen skriv in ett annat namn!");
                    txtNamn.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Namnet används redan av en annan agent. Vänligen skriv ett annat namn!");
                txtNamn.setText("");
            }
            }
            else
            {
                txtNamn.setText("");
            }
            
        } else {
            txtNamn.setText("");
        }


    }//GEN-LAST:event_btnAndraNamnActionPerformed

    /**
     * Metod som ändrar anställningsdatum på vald agent.
     * 
     */
    
    private void btnAndraRegDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraRegDatumActionPerformed

        String gammaltDatum = lblRegDatum.getText();
        String nyttDatum = txtRegDatum.getText();
        boolean textRutaArTom = Validering.textRutaArTom(gammaltDatum);

        if (textRutaArTom == false)
        {
            boolean datumFormatKorrekt = Validering.kollaDatumFormat(nyttDatum);
            if (datumFormatKorrekt == true)
            {
            boolean datumKorrekt = Validering.stringFinns(gammaltDatum, nyttDatum);
        
        if (datumKorrekt == false) {

            try {
                String fraga = "Update agent set anstallningsdatum = '" + nyttDatum + "' where namn = '" + nuvarandeAgent + "'";
                idb.fetchSingle(fraga);
                JOptionPane.showMessageDialog(null, "Registreingsdatumet har ändrats!");
                txtRegDatum.setText("");
                setInfo(nuvarandeAgent);
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Databasfel");
                txtRegDatum.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vänligen skriv ett annat datum!");
            txtRegDatum.setText("");
        }
        }
        }
    }//GEN-LAST:event_btnAndraRegDatumActionPerformed

    /**
     * Metod som ändrar lösenord på vald agent.
     * 
     */
    
    private void btnAndraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenordActionPerformed
        
        String nyttLosenord = txtLosenord.getText();
        String gammaltLosenord = lblLosen.getText();
        boolean textRutaArTom = Validering.textRutaArTom(nyttLosenord);

        if (textRutaArTom == false)
        {
            boolean losenordsFormatKorrekt = Validering.kollaLosenordsLangd(nyttLosenord);
            
            if (losenordsFormatKorrekt == true)
                    {
        
            boolean losenFinns = Validering.stringFinns(nyttLosenord, gammaltLosenord);
            
        if (losenFinns == false) {

            try {
                String fraga = "Update agent set losenord = '" + nyttLosenord + "' where namn = '" + nuvarandeAgent + "'";
                idb.fetchSingle(fraga);
                JOptionPane.showMessageDialog(null, "Lösenordet har ändrats!");
                txtLosenord.setText("");
                setInfo(nuvarandeAgent);
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
                txtLosenord.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lösenordet har inte ändrats, Vänligen skriv in ett annat löseord!");
            txtLosenord.setText("");
        } 
        }
            else {
                JOptionPane.showMessageDialog(null, "Det nya lösenordet är för långt, vänligen skriv ett nytt med max 6 tecken!");
                txtLosenord.setText("");
            }
        }
    }//GEN-LAST:event_btnAndraLosenordActionPerformed

    /**
     * Metod som ändrar telefonnummer på vald agent.
     * 
     */
    
    private void btnAndraTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraTelefonActionPerformed
        
        String nyttTelefonNummer = txtTelefon.getText();
        String gammaltTelefonNummer = lblTelefon.getText();
        boolean textRutaArTom = Validering.textRutaArTom(nyttTelefonNummer);
        
        if (textRutaArTom == false) {

            boolean endastSiffror = Validering.endastSiffror(nyttTelefonNummer);
            
            if (endastSiffror == true) {
                
                boolean TelefonFinns = Validering.stringFinns(nyttTelefonNummer, gammaltTelefonNummer);
                
                if (TelefonFinns == false) {

                    try {
                        String fraga = "Update Agent set telefon = '" + nyttTelefonNummer + "' where namn = '" + nuvarandeAgent + "'";
                        String svar = idb.fetchSingle(fraga);
                        JOptionPane.showMessageDialog(null, "Telefonnumret har ändrats!");
                        txtTelefon.setText("");
                        setInfo(nuvarandeAgent);
                    } catch (InfException ex) {
                        JOptionPane.showMessageDialog(null, "Något har gått fel, vänligen prova igen.");
                        txtTelefon.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Telefonnumret har inte ändrats, Vänligen skriv in ett annat nummer!");
                    txtTelefon.setText("");
                }
            }
            else
            {
                txtTelefon.setText("");
            }

        }

          
    }//GEN-LAST:event_btnAndraTelefonActionPerformed

    /**
     * Metod som ändrar plats på vald agent.
     * 
     */
    
    private void btnAndraPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraPlatsActionPerformed
        
        String nyPlats = jComboBoxOmrade.getSelectedItem().toString();
        String gammalPlats = lblPlats.getText();
        boolean platsFinns = Validering.stringFinns(nyPlats, gammalPlats);

            if (platsFinns == false) {

                try {
                        String fraga = "Select benamning from omrade where omrades_id = (Select omrade from agent where namn = '" + nuvarandeAgent + "')";
                        String svar = idb.fetchSingle(fraga);

                        String fraga1 = "select omrades_id from omrade where Benamning = '" + nyPlats + "'";
                        String svar1 = idb.fetchSingle(fraga1);

                        String fraga2 = "update agent set omrade = '" + svar1 + "' where namn = '" + nuvarandeAgent + "'";
                        idb.fetchSingle(fraga2);
                        JOptionPane.showMessageDialog(null, "Platsen har ändrats!");
                        jComboBoxOmrade.setSelectedIndex(0);
                        setInfo(nuvarandeAgent);
                    } 
                 catch (InfException ex) {
                    JOptionPane.showMessageDialog(null, "Något har gått fel, vänligen prova igen.");
                    jComboBoxOmrade.setSelectedIndex(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Den nya platsen är samma som den gamla. Vänligen välj en ny plats!");
                jComboBoxOmrade.setSelectedItem(0);
            }
    
    }//GEN-LAST:event_btnAndraPlatsActionPerformed

    private void txtLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLosenordActionPerformed

    /**
     * Metod som ändrar adminstatus på vald agent.
     * 
     */
    
    private void btnAndraAdminStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAdminStatusActionPerformed
        
        String nyAdmin = jComboBoxAndraAdmin.getSelectedItem().toString().substring(0,1);
        String gammalAdmin = lblAdminStatus.getText();
        System.out.println(nyAdmin);
        System.out.println(gammalAdmin);

        if (!nyAdmin.equals(gammalAdmin.substring(0, 1)))
        {

            try {
                String fraga2 = "update agent set administrator = '" + nyAdmin + "' where namn = '" + nuvarandeAgent + "'";
                String svar2 = idb.fetchSingle(fraga2);
                JOptionPane.showMessageDialog(null, "Adminstatusen har ändrats!");
                jComboBoxAndraAdmin.setSelectedIndex(0);
                setInfo(nuvarandeAgent);
            }
            catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Något har gått fel, vänligen prova igen.");
            }

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Denna agent har redan vald adminstatus");
            jComboBoxAndraAdmin.setSelectedIndex(0);
        }

       
        
    }//GEN-LAST:event_btnAndraAdminStatusActionPerformed

    private void jComboBoxAndraAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAndraAdminActionPerformed
        
    }//GEN-LAST:event_jComboBoxAndraAdminActionPerformed

    /**
     * Metod som ändrar nuvarandeAgent fältet till valt parametervärde på vald agent.
     * 
     */
    
    public void setNuvarandeAgent (String nuvarandeAgent)
    {
        this.nuvarandeAgent = nuvarandeAgent;
    }
    
    /**
     * Metod som ändrar nuvarandeUtomjording fältet till valt parametervärde på vald agent.
     * 
     */
    
    public void setNuvarandeUtomjording (String utomjording)
    {
        nuvarandeUtomjording = utomjording;
    }
    
    /**
     * Metod som returnerar värdet på nuvarandeAgent fältet.
     * 
     */
    
    public String visaNuvarandeUtomjording()
    {
        return nuvarandeUtomjording;
    }
    
    /**
     * Metod som ändrar värdet på samtligalabels hos vald agent fältet.
     * 
     */
    
    public void setInfo (String namn)
    {
       lblNamn.setText(visaInfoOmAgent.visaNamn(namn));
       lblRegDatum.setText(visaInfoOmAgent.visaAnstallningsDatum(namn));
       lblPlats.setText(visaInfoOmAgent.visaPlats(namn));
       lblTelefon.setText(visaInfoOmAgent.visaTelefon(namn));
       lblLosen.setText(visaInfoOmAgent.visaLosenord(namn));
       lblAdminStatus.setText(visaInfoOmAgent.visaAdminStatus(namn));
       
    }
    
    /**
     * Metod som kollar så att värdet på inkommande parametervärdet inte är detsamma som mågot annat värde i agent databastabellen.
     * 
     */
    
    public boolean kollaNamn(String namn)
    {
        boolean namnetFinns = false;

        try {
            String fraga = "Select namn from agent";
            ArrayList<String> alienNamnlista = idb.fetchColumn(fraga);

            for (String alienNamn : alienNamnlista) {
                if (alienNamn.toLowerCase().equals(namn.toLowerCase())) {
                    namnetFinns = true;
                    break;
                }
            }

        } catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
        return namnetFinns;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HuvudText;
    private javax.swing.JButton btnAndraAdminStatus;
    private javax.swing.JButton btnAndraLosenord;
    private javax.swing.JButton btnAndraNamn;
    private javax.swing.JButton btnAndraPlats;
    private javax.swing.JButton btnAndraRegDatum;
    private javax.swing.JButton btnAndraTelefon;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnTillbakaTillHM;
    private javax.swing.JComboBox<String> jComboBoxAndraAdmin;
    private javax.swing.JComboBox<String> jComboBoxOmrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAdminStatus;
    private javax.swing.JLabel lblIdAdminStatusRubrik;
    private javax.swing.JLabel lblInfoRubrik;
    private javax.swing.JLabel lblLosen;
    private javax.swing.JLabel lblLosenordRubrik;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblNamnRubrik;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblPlatsRubrik;
    private javax.swing.JLabel lblRasExtraAndra;
    private javax.swing.JLabel lblRegDatum;
    private javax.swing.JLabel lblRegDatumRubrik;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblTelefonRubrik;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtRegDatum;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
