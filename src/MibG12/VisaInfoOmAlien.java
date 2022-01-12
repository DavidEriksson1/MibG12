/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import java.util.ArrayList;
import oru.inf.InfException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfException;
import oru.inf.InfDB;

/**
 *
 * JFrame klass som visar information om vald utomjording.
 */
public class VisaInfoOmAlien extends javax.swing.JFrame {

    private InfDB idb;
    private String nuvarandeAgent;
    private String nuvarandeUtomjording;
    private boolean anvandareArAdmin;
    
    public VisaInfoOmAlien(InfDB idb, String nuvarandeAgent, boolean anvandareArAdmin) {
        initComponents();
        this.idb = idb;
        this.nuvarandeAgent = nuvarandeAgent;
        this.anvandareArAdmin = anvandareArAdmin;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHuvudText = new javax.swing.JLabel();
        lblNamnRubrik = new javax.swing.JLabel();
        lblRasRubrik = new javax.swing.JLabel();
        lblRegistreringsDatumRubrik = new javax.swing.JLabel();
        lblPlatsRubrik = new javax.swing.JLabel();
        lblTelefonRubrik = new javax.swing.JLabel();
        lblLosenordRubrik = new javax.swing.JLabel();
        lblIDRubrik = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblRas = new javax.swing.JLabel();
        lblRegDatum = new javax.swing.JLabel();
        lblPlats = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        btnTillbakaTillHuvudmeny = new javax.swing.JButton();
        lblAnsvarigAgentRubrik = new javax.swing.JLabel();
        lblAnsvarigAgent = new javax.swing.JLabel();
        lblRasExtraRubrik = new javax.swing.JLabel();
        lblRasExtra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHuvudText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHuvudText.setText("Information om Utomjording");

        lblNamnRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNamnRubrik.setText("Namn: ");

        lblRasRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRasRubrik.setText("Ras:");

        lblRegistreringsDatumRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRegistreringsDatumRubrik.setText("Registreringsdatum:");

        lblPlatsRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPlatsRubrik.setText("Plats:");

        lblTelefonRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefonRubrik.setText("Telefon:");

        lblLosenordRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLosenordRubrik.setText("Lösenord:");

        lblIDRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIDRubrik.setText("ID-nummer:");

        lblNamn.setText("Namn");

        lblRas.setText("Ras");

        lblRegDatum.setText("RegDatum");

        lblPlats.setText("Plats");

        lblTelefon.setText("Telefon");

        lblLosenord.setText("HejHej");

        lblID.setText("ID");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnTillbakaTillHuvudmeny.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnTillbakaTillHuvudmeny.setText("Tillbaka Till Huvudmeny");
        btnTillbakaTillHuvudmeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaTillHuvudmenyActionPerformed(evt);
            }
        });

        lblAnsvarigAgentRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAnsvarigAgentRubrik.setText("Ansvarig agent:");

        lblAnsvarigAgent.setText("ID");

        lblRasExtraRubrik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRasExtraRubrik.setText("Antal Boogies:");

        lblRasExtra.setText("3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbakaTillHuvudmeny)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRegistreringsDatumRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLosenordRubrik)
                                .addGap(18, 18, 18)
                                .addComponent(lblLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRasRubrik)
                            .addComponent(lblNamnRubrik)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefonRubrik)
                                    .addComponent(lblPlatsRubrik))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblAnsvarigAgentRubrik)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblAnsvarigAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblIDRubrik)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRasExtraRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblRasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblHuvudText, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHuvudText)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamnRubrik)
                    .addComponent(lblNamn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRasRubrik)
                    .addComponent(lblRas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRasExtraRubrik)
                    .addComponent(lblRasExtra))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistreringsDatumRubrik)
                    .addComponent(lblRegDatum))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlatsRubrik)
                    .addComponent(lblPlats))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonRubrik)
                    .addComponent(lblTelefon))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosenordRubrik)
                    .addComponent(lblLosenord))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDRubrik)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnsvarigAgentRubrik)
                    .addComponent(lblAnsvarigAgent))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbakaTillHuvudmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metod som går tillbaka till föregående JFrame Klass.
     *  
     */
    
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        
        if (anvandareArAdmin == true)
        {
            AgentValjAlienFromHuvudMeny vAFAHM = new AgentValjAlienFromHuvudMeny(idb, nuvarandeAgent, true);
            vAFAHM.setVisible(true);
            vAFAHM.setVisaAndraText();
            dispose(); 
        }
        else
        {
            AgentValjAlienFromHuvudMeny vAFAHM = new AgentValjAlienFromHuvudMeny(idb, nuvarandeAgent, false);
            vAFAHM.setVisible(true);
            vAFAHM.visaBaraInfo();
            dispose();
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    /**
     * Metod som går tillbaka till huvudMenyAgent JFrame Klass.
     *  
     */
    
    private void btnTillbakaTillHuvudmenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaTillHuvudmenyActionPerformed
        
        if (anvandareArAdmin == true)
        {
            AgentValjAlienFromHuvudMeny vAFAHM = new AgentValjAlienFromHuvudMeny(idb, nuvarandeAgent, true);
            vAFAHM.setVisible(true);
            vAFAHM.setVisaAndraText();
            dispose(); 
        }
        else
        {
        
        HuvudMenyAgent hMA = new HuvudMenyAgent (idb, nuvarandeAgent);
        hMA.setHuvudText(nuvarandeAgent);
        hMA.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_btnTillbakaTillHuvudmenyActionPerformed

    /**
     * Metod ändrar all info om vald alien.
     *  
     */
    
    public void setInfo (String namn)
    {
       lblNamn.setText(visaNamn(namn));
       lblRas.setText(visaRas(namn));
       lblRegDatum.setText(visaRegDatum(namn));
       lblPlats.setText(visaPlats(namn));
       lblTelefon.setText(visaTelefon(namn));
       lblLosenord.setText(visaLosenord(namn));
       lblID.setText(visaID(namn));
       lblAnsvarigAgent.setText(visaAnsvarigAgent(namn));
    }
    
    /**
     * Metod ändrar värde på fältet nuvarandeUtomjording.
     *  
     */
    
    public void setNuvarandeUtomjording(String namn)
    {
        this.nuvarandeUtomjording = namn;
    }
    
    /**
     * Metod som visar namnet på vald utomjording.
     * Returnerar en sträng. 
     */
    
    public String visaNamn (String namn)
    {
        String namnet = "";
        
        try {
        String fraga = "Select namn from alien where namn = '" + namn + "'";
        String svar = idb.fetchSingle(fraga);
        namnet = svar;
        }
        
        catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
        
        return namnet;
    }
    
    /**
     * Metod som visar Registreringsdatum för vald utomjording.
     * Returnerar en sträng. 
     */
    
    public String visaRegDatum (String namn)
    {
        String regDatum = "";
        
        try {
        String fraga = "Select Registreringsdatum from alien where namn = '" + namn + "'";
        String svar = idb.fetchSingle(fraga);
        regDatum = svar;
        }
        
        catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
        
        return regDatum;
    }
    
    /**
     * Metod som visar platsen för vald utomjording.
     * Returnerar en sträng. 
     */
    
    public String visaPlats (String namn)
    {
        String plats = "";
        
        try {
        String fraga = "Select benamning from plats where plats_id = (Select Plats from alien where namn = '" + namn + "')";
        String svar = idb.fetchSingle(fraga);
        //plats = Validering.storForstaBokstav(svar);
        plats = svar;
        }
        
        catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
        
        return plats;
    }
    
    /**
     * Metod som visar telefonnumret för vald utomjording.
     * Returnerar en sträng. 
     */
    
    public String visaTelefon (String namn)
    {
        String telefon = "";
        
        try {
        String fraga = "Select telefon from alien where namn = '" + namn + "'";
        String svar = idb.fetchSingle(fraga);
        telefon = svar;
        }
        
        catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
        
        return telefon;
    }
    
    /**
     * Metod som visar lösenordet för vald utomjording.
     * Returnerar en sträng. 
     */
    
    public String visaLosenord (String namn)
    {
        String losenord = "";
        
        try {
        String fraga = "Select losenord from alien where namn = '" + namn + "'";
        String svar = idb.fetchSingle(fraga);
        losenord = svar;
        }
        
        catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
        
        return losenord;
    }
    
    /**
     * Metod som visar idNummer för för vald utomjording.
     * Returnerar en sträng. 
     */
    
    public String visaID (String namn)
    {
        String iD = "";
        
        try {
        String fraga = "Select alien_id from alien where namn = '" + namn + "'";
        String svar = idb.fetchSingle(fraga);
        iD = svar;
        }
        
        catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
        
        return iD;
    }
    
    /**
     * Metod som visar ansvarigAgent för vald utomjording.
     * Returnerar en sträng.
     */
    
    public String visaAnsvarigAgent (String namn)
    {
        String agent = "";
        
        try {
        String fraga = "Select namn from agent where agent_id = (Select Ansvarig_Agent from alien where namn = '" + namn + "')";
        String svar = idb.fetchSingle(fraga);
        //agent = Validering.storForstaOchSistaBokstav(svar);
        agent = svar;
        }
        
        catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
        
        return agent;
    }
    
    /**
     * Metod som visar rasen för vald utomjording.
     * Returnerar en sträng.
     *  
     */
    
    public String visaRas (String utomjording)
    {
        boolean isBoglodite = false;
        boolean isWorm = false;
        boolean isSquid = false;
        String ras = "";

        try {
            String fraga = "Select alien_id from alien where namn = '" + utomjording + "'";
            String svarID = idb.fetchSingle(fraga);

            String fragaBoglodite = "Select alien_id from boglodite";
            ArrayList<String> boglodite = idb.fetchColumn(fragaBoglodite);

            String fragaWorm = "Select alien_id from worm";
            ArrayList<String> worm = idb.fetchColumn(fragaWorm);

            String fragaSquid = "Select alien_id from squid";
            ArrayList<String> squid = idb.fetchColumn(fragaSquid);

            for (String id : boglodite) {
                if (id.equals(svarID)) {
                    isBoglodite = true;
                    break;
                }
            }

            if (isBoglodite == false) {
                for (String id : worm) {
                    if (id.equals(svarID)) {
                        isWorm = true;
                        break;
                    }
                }
            }

            if (isWorm == false && isBoglodite == false) {
                for (String id : squid) {
                    if (id.equals(svarID)) {
                        isSquid = true;
                        break;

                    }
                }
            }
            
            if (isBoglodite == true) {
            ras = "Boglodite";
            String fraga1 = "Select antal_boogies from boglodite where alien_id = " + svarID;
            String svar1 = idb.fetchSingle(fraga1);
            System.out.println(svar1);
            lblRasExtra.setText(svar1);
            lblRasExtraRubrik.setText("Antal boogies:");
            
        } else if (isWorm == true) {
            ras = "Worm";
            lblRasExtra.setText("");
            lblRasExtraRubrik.setText("");
        } else if (isSquid == true) {
            ras = "Squid";
            String fraga1 = "Select Antal_Armar from squid where alien_id = " + svarID;
            String svar1 = idb.fetchSingle(fraga1);
            System.out.println(svar1);
            lblRasExtra.setText(svar1);
            lblRasExtraRubrik.setText("Antal armar:");
        } else {
            System.out.println("Ingen ras hittad");
        }
        } catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }

        
        return ras;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnTillbakaTillHuvudmeny;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblAnsvarigAgentRubrik;
    private javax.swing.JLabel lblHuvudText;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDRubrik;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblLosenordRubrik;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblNamnRubrik;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblPlatsRubrik;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRasExtra;
    private javax.swing.JLabel lblRasExtraRubrik;
    private javax.swing.JLabel lblRasRubrik;
    private javax.swing.JLabel lblRegDatum;
    private javax.swing.JLabel lblRegistreringsDatumRubrik;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblTelefonRubrik;
    // End of variables declaration//GEN-END:variables
}
