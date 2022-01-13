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
 * JFrame Klass som ändrar information om enskilda utomjordingar.
 * 
 */
public class AndraInfoOmAlien extends javax.swing.JFrame {

    private InfDB idb;
    private String nuvarandeAgent;
    private String nuvarandeUtomjording;
    private VisaInfoOmAlien visaInfoOmAlien;
    private boolean anvandareArAdmin;
    private FyllaComboBox fCB;
    
    /**
     * Creates new form AndraInfoOmAlien
     */
    public AndraInfoOmAlien(InfDB idb, String nuvarandeAgent, String nuvarandeUtomjording, boolean anvandareArAdmin) {
        initComponents();
        this.idb = idb;
        this.nuvarandeAgent = nuvarandeAgent;
        this.nuvarandeUtomjording = nuvarandeUtomjording;
        this.anvandareArAdmin = anvandareArAdmin;        
        visaInfoOmAlien = new VisaInfoOmAlien (idb, nuvarandeAgent, true);
        visaInfoOmAlien.setInfo(nuvarandeAgent);
        fCB = new FyllaComboBox(idb);
        txtRasExtra.setVisible(false);
        fCB.laggTillPlats(jComboBoxPlats);
        fCB.laggTillAgent(jComboBoxAnsvAgent);
        
        
    }

   
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
        lblRas = new javax.swing.JLabel();
        lblRegDatum = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblLosen = new javax.swing.JLabel();
        lblPlats = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtRegDatum = new javax.swing.JTextField();
        lblRasRubrik = new javax.swing.JLabel();
        btnAndraRas = new javax.swing.JButton();
        btnAndraNamn = new javax.swing.JButton();
        btnAndraRegDatum = new javax.swing.JButton();
        btnAndraPlats = new javax.swing.JButton();
        btnAndraTelefon = new javax.swing.JButton();
        btnAndraLosenord = new javax.swing.JButton();
        lblInfoRubrik = new javax.swing.JLabel();
        btnTillbakaTillHM = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        iblAnsvarigAgentRubrik = new javax.swing.JLabel();
        lblAnsvarigAgent = new javax.swing.JLabel();
        btnAndraAnsvarigAgent = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtRasExtra = new javax.swing.JTextField();
        lblRasExtraAndra = new javax.swing.JLabel();
        lblRasExtraRubrik = new javax.swing.JLabel();
        lblRasExtra = new javax.swing.JLabel();
        txtLosenord = new javax.swing.JTextField();
        jComboBoxAnsvAgent = new javax.swing.JComboBox<>();
        jComboBoxPlats = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HuvudText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HuvudText.setText("Information om Alien");

        lblNamnRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNamnRubrik.setText("Namn: ");

        lblRegDatumRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRegDatumRubrik.setText("Registreringsdatum: ");

        lblTelefonRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefonRubrik.setText("Telefon: ");

        lblLosenordRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLosenordRubrik.setText("Lösenord:");

        lblPlatsRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPlatsRubrik.setText("Plats:");

        lblNamn.setText("Hehe");

        lblRas.setText("Drake");

        lblRegDatum.setText("1995-03-05");

        lblTelefon.setText("07000000");

        lblLosen.setText("hej");

        lblPlats.setText("Örebro");

        txtNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnActionPerformed(evt);
            }
        });

        lblRasRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRasRubrik.setText("Ras");

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

        iblAnsvarigAgentRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iblAnsvarigAgentRubrik.setText("Ansvarig Agent:");

        lblAnsvarigAgent.setText("Agent V");

        btnAndraAnsvarigAgent.setText("Ändra");
        btnAndraAnsvarigAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAnsvarigAgentActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj:", "Boglodite", "Worm", "Squid" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        txtRasExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRasExtraActionPerformed(evt);
            }
        });

        lblRasExtraRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRasExtraRubrik.setText("Antal:");

        lblRasExtra.setText("3");

        txtLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLosenordActionPerformed(evt);
            }
        });

        jComboBoxAnsvAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj:" }));

        jComboBoxPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj:" }));

        jLabel1.setText("YYYY-MM-DD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTelefonRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPlatsRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLosenordRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblRasRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(57, 57, 57))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblRegDatumRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(HuvudText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(lblInfoRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(178, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(btnTillbakaTillHM)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNamnRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblRasExtraRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblRasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtRasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(lblRasExtraAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jComboBoxAnsvAgent, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtLosenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBoxPlats, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                                        .addGap(3, 3, 3)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAndraRegDatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAndraPlats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAndraTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAndraLosenord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAndraRas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAndraNamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iblAnsvarigAgentRubrik)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAndraAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRasRubrik)
                    .addComponent(lblRas)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraRas))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRasExtraAndra)
                            .addComponent(txtRasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRasExtraRubrik)
                            .addComponent(lblRasExtra))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegDatumRubrik)
                    .addComponent(lblRegDatum)
                    .addComponent(txtRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraRegDatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonRubrik)
                    .addComponent(lblTelefon)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraTelefon))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlatsRubrik)
                    .addComponent(lblPlats)
                    .addComponent(btnAndraPlats)
                    .addComponent(jComboBoxPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosenordRubrik)
                    .addComponent(lblLosen)
                    .addComponent(btnAndraLosenord)
                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(iblAnsvarigAgentRubrik)
                        .addComponent(lblAnsvarigAgent)
                        .addComponent(jComboBoxAnsvAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAndraAnsvarigAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnTillbakaTillHM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTillbaka, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamnActionPerformed

    /**
 * Metod som går tillbaka till föregående Jframeklass.
 * 
 */
    
    private void btnTillbakaTillHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaTillHMActionPerformed
        
        if (anvandareArAdmin == true)
        {
            HuvudMenyAdmin hMA = new HuvudMenyAdmin(idb, nuvarandeAgent);
            hMA.setVisible(true);
            dispose();
        }
        else
        {
        
            HuvudMenyAgent hMA = new HuvudMenyAgent (idb, nuvarandeAgent);
            hMA.setHuvudText(nuvarandeAgent);
            hMA.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnTillbakaTillHMActionPerformed

 /**
 * Metod som ändrar värdet på anvandareArAdmin till true.
 * 
 */
    
    public void setAdmin()
    {
        anvandareArAdmin = true;
    }
    
 /**
 * Metod som ändrar värdet på anvandareArAdmin till false.
 * 
 */
    
    public void setAgent()
    {
        anvandareArAdmin = false;
    }
    
 /**
 * Metod som går tillbaka till föregående jframe klass.
 * 
 */
    
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        
        if (anvandareArAdmin == true)
        {
            AgentValjAlienFromHuvudMeny vAFAHM = new AgentValjAlienFromHuvudMeny(idb, nuvarandeAgent, true);
            vAFAHM.setAdmin();
            vAFAHM.setVisible(true);
            vAFAHM.setVisaAndraText();
            dispose(); 
        }
        
        else 
        {
            AgentValjAlienFromHuvudMeny vAFAHM = new AgentValjAlienFromHuvudMeny(idb, nuvarandeAgent, false);
            vAFAHM.setAgent();
            vAFAHM.setVisible(true);
            vAFAHM.setVisaAndraText();
            dispose();
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

 /**
 * Metod som går ändrar namnet på vald utomjording.
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
                        String fraga = "Update Alien set namn = '" + nyttNamn + "' where namn = '" + nuvarandeUtomjording + "'";
                        String svar = idb.fetchSingle(fraga);
                        JOptionPane.showMessageDialog(null, "Namnet har ändrats!");
                        setNuvarandeUtomjording(nyttNamn);
                        setInfo(nuvarandeUtomjording);
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
                JOptionPane.showMessageDialog(null, "Namnet används redan av en annan utomjording. Vänligen skriv ett annat namn!");
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
 * Metod som ändrar registreringsdatum på vald utomjording.
 * 
 */
    
    private void btnAndraRegDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraRegDatumActionPerformed

        String gammaltDatum = lblRegDatum.getText();
        String nyttDatum = txtRegDatum.getText();
        boolean textRutaArTom = Validering.textRutaArTom(gammaltDatum);

        if (textRutaArTom == false)
        {
            boolean datumKorrekt = Validering.stringFinns(gammaltDatum, nyttDatum);
        
        if (datumKorrekt == false) {

            try {
                String fraga = "Update Alien set registreringsdatum = '" + nyttDatum + "' where namn = '" + nuvarandeUtomjording + "'";
                String svar = idb.fetchSingle(fraga);
                JOptionPane.showMessageDialog(null, "Registreingsdatumet har ändrats!");
                txtRegDatum.setText("");
                setInfo(nuvarandeUtomjording);
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Fel datumformat, vänligen ange ett nytt datum enligt 'YYYY-MM-DD'");
                txtRegDatum.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vänligen skriv ett annat datum!");
            txtRegDatum.setText("");
        }
        }
    }//GEN-LAST:event_btnAndraRegDatumActionPerformed

       /**
 * Metod som ändrar lösenord på vald utomjording.
 * 
 */
    
    private void btnAndraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenordActionPerformed
        
        String nyttLosenord = txtLosenord.getText();
        String gammaltLosenord = lblLosen.getText();
        boolean textRutaArTom = Validering.textRutaArTom(nyttLosenord);

        if (textRutaArTom == false)
        {
        
            boolean losenFinns = Validering.stringFinns(nyttLosenord, gammaltLosenord);
            
        if (losenFinns == false) {

            try {
                String fraga = "Update Alien set losenord = '" + nyttLosenord + "' where namn = '" + nuvarandeUtomjording + "'";
                String svar = idb.fetchSingle(fraga);
                JOptionPane.showMessageDialog(null, "Lösenordet har ändrats!");
                txtLosenord.setText("");
                setInfo(nuvarandeUtomjording);
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Det nya lösenordet är för långt, vänligen skriv ett nytt med max 6 tecken!");
                txtLosenord.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lösenordet har inte ändrats, Vänligen skriv in ett annat löseord!");
            txtLosenord.setText("");
        } 
        }
    }//GEN-LAST:event_btnAndraLosenordActionPerformed

       /**
 * Metod som ändrar telefon på vald utomjording.
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
                        String fraga = "Update Alien set telefon = '" + nyttTelefonNummer + "' where namn = '" + nuvarandeUtomjording + "'";
                        String svar = idb.fetchSingle(fraga);
                        JOptionPane.showMessageDialog(null, "Telefonnumret har ändrats!");
                        txtTelefon.setText("");
                        setInfo(nuvarandeUtomjording);
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
 * Metod som ändrar plats på vald utomjording.
 * 
 */
    
    private void btnAndraPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraPlatsActionPerformed
        
        String nyPlats = jComboBoxPlats.getSelectedItem().toString();
        String gammalPlats = lblPlats.getText();
        boolean platsFinns = Validering.stringFinns(nyPlats, gammalPlats);

            if (platsFinns == false) {

                try {
                        String fraga = "Select benamning from omrade where omrades_id = (Select Plats from alien where namn = '" + nuvarandeUtomjording + "')";
                        String svar = idb.fetchSingle(fraga);

                        String fraga1 = "select plats_ID from plats where Benamning = '" + nyPlats + "'";
                        String svar1 = idb.fetchSingle(fraga1);
                    
                        String fraga2 = "update alien set plats = '" + svar1 + "' where namn = '" + nuvarandeUtomjording + "'";
                        String svar2 = idb.fetchSingle(fraga2);
                        JOptionPane.showMessageDialog(null, "Platsen har ändrats!");
                        jComboBoxPlats.setSelectedIndex(0);
                        setInfo(nuvarandeUtomjording);
                    } 
                 catch (InfException ex) {
                    JOptionPane.showMessageDialog(null, "Något har gått fel, vänligen prova igen.");
                    jComboBoxPlats.setSelectedIndex(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Den nya platsen är samma som den gamla. Vänligen välj en ny plats!");
                jComboBoxPlats.setSelectedIndex(0);
            }

            
    }//GEN-LAST:event_btnAndraPlatsActionPerformed

    /**
 * Metod som ändrar ras på vald utomjording.
 * 
 */
    
    private void btnAndraRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraRasActionPerformed
        
        String boglodite = "boglodite";
        String squid = "squid";
        String worm = "worm";
        
        String nyRas = jComboBox1.getSelectedItem().toString().toLowerCase();
        String gammalRas = lblRas.getText();
        boolean textRutaArTom = Validering.textRutaArTom(nyRas);
        String alienID = visaInfoOmAlien.visaID(nuvarandeUtomjording);
        String antalExtra = txtRasExtra.getText();
        
        if (textRutaArTom == false)
        {
        
            boolean rasAnvands = Validering.stringFinns(nyRas, gammalRas);
            
        if (rasAnvands == false )
        {
        try {
        if (nyRas.equals(boglodite))
        {
            
            String fraga1 = "insert into boglodite values (" + alienID + "," + antalExtra +")";
            idb.fetchSingle(fraga1);
            JOptionPane.showMessageDialog(null, "Rasen har ändrats!");
            
            if (!gammalRas.isEmpty())
            {
                String fraga2 = "delete from " + gammalRas + " where alien_id = " + alienID;
                idb.fetchSingle(fraga2);
            }
        
            setInfo(nuvarandeUtomjording);
            txtRasExtra.setVisible(false);
            lblRasExtraAndra.setText("");
            jComboBox1.setSelectedIndex(0);
        }
            
            
        else if (nyRas.equals(worm))
        {
            String fraga1 = "insert into worm values (" + alienID + ")";
            idb.fetchSingle(fraga1);
            JOptionPane.showMessageDialog(null, "Rasen har ändrats!");
            if (!gammalRas.isEmpty())
            {
                String fraga2 = "delete from " + gammalRas + " where alien_id = " + alienID;
                idb.fetchSingle(fraga2);
            }
            setInfo(nuvarandeUtomjording);
            txtRasExtra.setVisible(false);
            lblRasExtraAndra.setText("");
            jComboBox1.setSelectedIndex(0);
            
        }
        else if (nyRas.equals(squid))
        {
            String fraga1 = "insert into squid values (" + alienID + "," + antalExtra +")";
            idb.fetchSingle(fraga1);
            JOptionPane.showMessageDialog(null, "Rasen har ändrats!");
            if (!gammalRas.isEmpty())
            
            {
                String fraga2 = "delete from " + gammalRas + " where alien_id = " + alienID;
                idb.fetchSingle(fraga2);
            }
            
            setInfo(nuvarandeUtomjording);
            txtRasExtra.setVisible(false);
            lblRasExtraAndra.setText("");
            jComboBox1.setSelectedIndex(0);
            
            
        }
        
        }
         catch (InfException ex) {
                    JOptionPane.showMessageDialog(null, "Något har gått fel, vänligen prova igen.");
                    System.out.println(ex);
                    txtRasExtra.setVisible(false);
                    lblRasExtraAndra.setText("");
                    jComboBox1.setSelectedIndex(0);
                }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Den nya rasen är samma som den nuvarande, vänligen skriv en annan ras!");
            txtRasExtra.setVisible(false);
            lblRasExtraAndra.setText("");
            jComboBox1.setSelectedIndex(0);
        }
        
        }
        
        
    }//GEN-LAST:event_btnAndraRasActionPerformed

    /**
 * Metod som ändrar ansvarig agent på vald utomjording.
 * 
 */
    
    private void btnAndraAnsvarigAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAnsvarigAgentActionPerformed
        
        String nyAnsvarigAgent = jComboBoxAnsvAgent.getSelectedItem().toString();
        String gammalAnsvarigAgent = lblAnsvarigAgent.getText();
        
        boolean agentAnvands = Validering.stringFinns(nyAnsvarigAgent, gammalAnsvarigAgent);

            if (agentAnvands == false) {

                    try {
                        String fraga1 = "select agent_id from agent where namn = '" + nyAnsvarigAgent + "'";
                        String svar1 = idb.fetchSingle(fraga1);
                        String fraga2 = "update alien set ansvarig_Agent = '" + svar1 + "' where namn = '" + nuvarandeUtomjording + "'";
                        String svar2 = idb.fetchSingle(fraga2);
                        JOptionPane.showMessageDialog(null, "Ansvarig agent har ändrats!");
                        jComboBoxAnsvAgent.setSelectedIndex(0);
                        setInfo(nuvarandeUtomjording);
                    } catch (InfException ex) {
                    JOptionPane.showMessageDialog(null, "Något har gått fel, vänligen prova igen.");
                    jComboBoxAnsvAgent.setSelectedIndex(0);
                }
            }
             else {
                JOptionPane.showMessageDialog(null, "Den nya agenten är samma som den gamla. Vänligen välj en ny agent!");
                jComboBoxAnsvAgent.setSelectedIndex(0);
            }
     
    }//GEN-LAST:event_btnAndraAnsvarigAgentActionPerformed

    /**
 * Metod väljer värde på comboboxen.
 * 
 */
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int i = jComboBox1.getSelectedIndex();
        
        if(i == 0){
            lblRasExtraAndra.setText("");
            txtRasExtra.setVisible(false);
            
        }
        if(i == 1){
            lblRasExtraAndra.setText("Antal boogies:");
            txtRasExtra.setVisible(true);
            txtRasExtra.setText("");
        }
        if(i == 2){
            lblRasExtraAndra.setText("");
            txtRasExtra.setVisible(false);
            
            
        }
        if (i == 3){
            lblRasExtraAndra.setText("Antal armar:");
            txtRasExtra.setVisible(true);
            txtRasExtra.setText("");
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtRasExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRasExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRasExtraActionPerformed

    private void txtLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLosenordActionPerformed

    /**
 * Metod som ändrar nuvarandeAgent.
 * 
 */
    
    public void setNuvarandeAgent (String nuvarandeAgent)
    {
        this.nuvarandeAgent = nuvarandeAgent;
    }
    
    /**
 * Metod som ändrar nuvarandeAgent.
 * 
 */
    
    public void setNuvarandeUtomjording (String utomjording)
    {
        nuvarandeUtomjording = utomjording;
    }
    
    /**
 * Metod som ändrar nuvarandeAgent.
 * 
 */
    
    public String visaNuvarandeUtomjording()
    {
        return nuvarandeUtomjording;
    }
    
    /**
 * Metod som informationen som visas för vald utomjording.
 * 
 */
    
    
    public void setInfo (String namn)
    {
       lblNamn.setText(visaInfoOmAlien.visaNamn(namn));
       lblRas.setText(visaInfoOmAlien.visaRas(namn));
       lblRegDatum.setText(visaInfoOmAlien.visaRegDatum(namn));
       lblPlats.setText(visaInfoOmAlien.visaPlats(namn));
       lblTelefon.setText(visaInfoOmAlien.visaTelefon(namn));
       lblLosen.setText(visaInfoOmAlien.visaLosenord(namn));
       lblAnsvarigAgent.setText(visaInfoOmAlien.visaAnsvarigAgent(namn));
       
       try{
       
           if (lblRas.getText().toLowerCase().equals("boglodite"))
       {
           String fraga1 = "Select Antal_boogies from boglodite where alien_id = " + visaInfoOmAlien.visaID(namn);
           String svar1 = idb.fetchSingle(fraga1);
           lblRasExtra.setText(svar1);
           lblRasExtraRubrik.setText("Antal boogies:");
       }
       
       else if (lblRas.getText().toLowerCase().equals("squid"))
       {
           String fraga1 = "Select Antal_armar from squid where alien_id = " + visaInfoOmAlien.visaID(namn);
           String svar1 = idb.fetchSingle(fraga1);
           lblRasExtra.setText(svar1);
           lblRasExtraRubrik.setText("Antal armar:");
       }
       else 
       {
           lblRasExtra.setText("");
           lblRasExtraRubrik.setText("");
       }
       }
       catch (InfException ex)
       {
           JOptionPane.showMessageDialog(null, "Något Har gått fel");
       }
       
       
    }
    
    /**
 * Metod som kollar att namnet inte redan används för vald utomjording.
 * 
 */
    
    public boolean kollaNamn(String namn)
    {
        boolean namnetFinns = false;

        try {
            String fraga = "Select namn from alien";
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
    private javax.swing.JButton btnAndraAnsvarigAgent;
    private javax.swing.JButton btnAndraLosenord;
    private javax.swing.JButton btnAndraNamn;
    private javax.swing.JButton btnAndraPlats;
    private javax.swing.JButton btnAndraRas;
    private javax.swing.JButton btnAndraRegDatum;
    private javax.swing.JButton btnAndraTelefon;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnTillbakaTillHM;
    private javax.swing.JLabel iblAnsvarigAgentRubrik;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxAnsvAgent;
    private javax.swing.JComboBox<String> jComboBoxPlats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblInfoRubrik;
    private javax.swing.JLabel lblLosen;
    private javax.swing.JLabel lblLosenordRubrik;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblNamnRubrik;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblPlatsRubrik;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRasExtra;
    private javax.swing.JLabel lblRasExtraAndra;
    private javax.swing.JLabel lblRasExtraRubrik;
    private javax.swing.JLabel lblRasRubrik;
    private javax.swing.JLabel lblRegDatum;
    private javax.swing.JLabel lblRegDatumRubrik;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblTelefonRubrik;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtRasExtra;
    private javax.swing.JTextField txtRegDatum;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
