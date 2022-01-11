/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MibG12;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *  Klass för att kunna ändra lösenord 
 * @author 
 */
public class AndraLosenord extends javax.swing.JFrame {
    private InfDB idb;
    private String nuvarandeUtomjording;
    private String nuvarandeAgent;
    private VisaInfoOmAgent visaInfoOmAgent;
    private VisaInfoOmAlien visaInfoOmAlien;
    private boolean anvandareArUtomjording;
    /**
     * Konstruktor för ÄndraLösenordsklassen
     */
    public AndraLosenord(InfDB idb, boolean anvandareArUtomjording) {
        initComponents();
        this.idb = idb;
        this.nuvarandeUtomjording = nuvarandeUtomjording;
        this.nuvarandeAgent = nuvarandeAgent;
        this.anvandareArUtomjording = anvandareArUtomjording;
        visaInfoOmAgent = new VisaInfoOmAgent(idb, nuvarandeAgent, false, nuvarandeUtomjording, false);
        visaInfoOmAlien = new VisaInfoOmAlien(idb, nuvarandeUtomjording, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGammaltLosen1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gammaltLosenord1 = new javax.swing.JPasswordField();
        nyttLosenord = new javax.swing.JPasswordField();
        btnTillbaka = new javax.swing.JButton();
        btnAndraLosen = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblGammaltLosen1.setText("Nuvarande lösenord");

        jLabel3.setText("Nytt lösenord");

        nyttLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyttLosenordActionPerformed(evt);
            }
        });

        btnTillbaka.setText("TIllbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnAndraLosen.setText("Ändra lösenord");
        btnAndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Visa nytt lösenord");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnAndraLosen)
                        .addGap(80, 80, 80)
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(lblGammaltLosen1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gammaltLosenord1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblGammaltLosen1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gammaltLosenord1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbaka)
                    .addComponent(btnAndraLosen))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nyttLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyttLosenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nyttLosenordActionPerformed
// Tillbakaknapp som leder till utomjordingsmenyn eller agentmenyn beroende på vem som är inloggad 
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
       
       if (anvandareArUtomjording == true)
       { 
       HuvudMenyUtomjording hMU = new HuvudMenyUtomjording (idb, nuvarandeUtomjording);
       hMU.setVisible(true);
       hMU.setValkommenUtomjording();
       dispose();
       }
       else
       {
       HuvudMenyAgent hMA = new HuvudMenyAgent (idb, nuvarandeAgent);
       hMA.setVisible(true);
       dispose();
       }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    /**
     * Metod som ändrar lösenorden om det gamla lösenordet är korrekt samt
     * att dt nya lösenordet inte är samma som det gamla.
     */
    
    private void btnAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenActionPerformed
        
        char[] c1 = nyttLosenord.getPassword();
                String nyttLosen = new String(c1);
                
        char[] c = gammaltLosenord1.getPassword();
                String gammaltLosen = new String(c);

        boolean gammaltLosenKorrekt = losenordKorrekt();

        if (gammaltLosenKorrekt == true){
            
            if (!nyttLosen.equals(gammaltLosen)) {
            
                //Här valideringsmetod som kollar att lösenordet inte är för långt
                boolean losenordForLangt = Validering.kollaLosenordsLangd(nyttLosen);

                if (losenordForLangt == false) {
                    if (anvandareArUtomjording == true) {
                        setLosenordAlien(nyttLosen);
                        gammaltLosenord1.setText("");
                        nyttLosenord.setText("");
                        lblStatus.setText("");
                    } else {
                        setLosenordAgent(nyttLosen);
                        gammaltLosenord1.setText("");
                        nyttLosenord.setText("");
                        lblStatus.setText("");
                    }
                } 
            }
            else {
                    JOptionPane.showMessageDialog(null, "Det nya lösenordet är samma som det tidigate, vänligen välj ett annat lösenord!");
                    gammaltLosenord1.setText("");
                    nyttLosenord.setText("");
                }
        }
            else {
                JOptionPane.showMessageDialog(null, "Gamla lösenordet är fel, vänligen prova igen!");
                gammaltLosenord1.setText("");
                nyttLosenord.setText("");
            }
       
            
     
    }//GEN-LAST:event_btnAndraLosenActionPerformed
// Visar tecken på nya lösenords textfältet så användaren kan se vad den skrivit in för nytt lösen
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       
        if (jCheckBox1.isSelected()) 
        {
            nyttLosenord.setEchoChar((char)0);
        }
        else 
        {
            nyttLosenord.setEchoChar('*');
        }
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    //Sätter vem som är den nuvarande utomjordingen inloggad, förutsatt att det är en utomjording inloggad
    public void setNuvarandeUtomjording(String namn)
    {
        nuvarandeUtomjording = namn;
    }
    //Sätter vem som är den nuvarande agenten inloggad, förutsatt att det är en agent inloggad
    public void setNuvarandeAgent(String namn)
    {
        nuvarandeAgent = namn;
    }
    
 //Metod som kollar att båda de gamla lösenord textfälten matchar varandra   
    public boolean losenordKorrekt() {
        boolean losenordKorrekt = false;

        char[] c1 = gammaltLosenord1.getPassword();
        String losen1 = new String(c1);

        String gammaltLosenordAgent = visaInfoOmAgent.visaLosenord(nuvarandeAgent);
        String gammaltLosenordUtomjording = visaInfoOmAlien.visaLosenord(nuvarandeUtomjording);

        if (anvandareArUtomjording) {

            if (losen1.equals(gammaltLosenordUtomjording)) {
                lblStatus.setText("Lösenord korrekt");
                losenordKorrekt = true;
            } else {
                lblStatus.setText("Fel Lösenord");
            }
        }
        else {
            if (losen1.equals(gammaltLosenordAgent)) {
                lblStatus.setText("Lösenord korrekt");
                losenordKorrekt = true;
            } else {
                lblStatus.setText("Fel Lösenord");
            }
        }

        return losenordKorrekt;
    }
 // Metod som uppdaterar lösenordet för utomjordingar  
    public boolean setLosenordAlien (String losenord)
    {
        boolean losenAndrat = false;
        
        try {
            System.out.println(nuvarandeUtomjording);
            String fraga = "UPDATE Alien set Losenord = '" + losenord + "' where Namn = '" + nuvarandeUtomjording + "'";
            idb.fetchSingle(fraga);
            JOptionPane.showMessageDialog(null, "Lösenordet har ändrats!");
            losenAndrat = true;
        }
        catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println(ex + " har inträffat!");
        }
        return losenAndrat;
    }
  //MEtod som sätter nytt lösenord för agenter  
    public boolean setLosenordAgent (String losenord)
    {
        boolean losenAndrat = false;
        
        try {
            System.out.println(nuvarandeAgent);
            String fraga = "UPDATE Agent set Losenord = '" + losenord + "' where Namn = '" + nuvarandeAgent + "'";
            idb.fetchSingle(fraga);
            JOptionPane.showMessageDialog(null, "Lösenordet har ändrats!");
            losenAndrat = true;
        }
        catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println(ex + " har inträffat!");
        }
        return losenAndrat;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JPasswordField gammaltLosenord1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblGammaltLosen1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPasswordField nyttLosenord;
    // End of variables declaration//GEN-END:variables
}
