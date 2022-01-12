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
public class AdminLaggTillUtrustning extends javax.swing.JFrame {

    private static InfDB idb;
    private String agent;
    private boolean anvandareArAdmin;

    /**
     * Creates new form AdminLaggTillFordon
     */
    public AdminLaggTillUtrustning(InfDB idb, String agent, boolean anvandareArAdmin) {
        this.idb = idb;
        this.agent = agent;
        this.anvandareArAdmin = anvandareArAdmin;
        initComponents();

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
        btnLaggTillFordon = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtFieldUtrustningsNamn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboUtrustningsTyp = new javax.swing.JComboBox<>();
        lblUtrustning = new javax.swing.JLabel();
        txtFieldKaliber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vänligen mata in angivna uppgifter för att lägga till ny utrustning");

        btnLaggTillFordon.setText("Lägg till");
        btnLaggTillFordon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillFordonActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel6.setText("Utrustningsnamn");

        txtFieldUtrustningsNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUtrustningsNamnActionPerformed(evt);
            }
        });

        jLabel2.setText("Utrustningstyp");

        comboUtrustningsTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "Vapen", "Kommunikation", "Teknik" }));
        comboUtrustningsTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUtrustningsTypActionPerformed(evt);
            }
        });

        txtFieldKaliber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldKaliberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLaggTillFordon)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblUtrustning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboUtrustningsTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldKaliber)
                            .addComponent(txtFieldUtrustningsNamn))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtFieldUtrustningsNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboUtrustningsTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFieldKaliber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTillFordon)
                    .addComponent(btnTillbaka))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // Metod för att ta sig tillbaka till huvudmeny admin

        if (anvandareArAdmin == true) {

            HuvudMenyAdmin huvudMenyAdmin = new HuvudMenyAdmin(idb, agent);
            huvudMenyAdmin.setVisible(true);
            dispose();
        } else {
            HuvudMenyAgent hMA = new HuvudMenyAgent(idb, agent);
            hMA.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void txtFieldUtrustningsNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUtrustningsNamnActionPerformed
        // Textfält där utrustningens namn matas in så att det kan hämtas för andra metoder
    }//GEN-LAST:event_txtFieldUtrustningsNamnActionPerformed

    private void txtFieldKaliberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldKaliberActionPerformed
        // textfält där kaliber, bränsle och överföringsteknik matas in för användning i andra metoder
    }//GEN-LAST:event_txtFieldKaliberActionPerformed

    private void comboUtrustningsTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUtrustningsTypActionPerformed
        // Combobox för att välja vilken utrustning som skall läggas till och då visa olika textrutor
        int i = comboUtrustningsTyp.getSelectedIndex();

        if (i == 0) {
            lblUtrustning.setText("");
        }

        if (i == 1) {
            lblUtrustning.setText("Kaliber");
        }
        if (i == 2) {
            lblUtrustning.setText("Överföringsteknik");
        }
        if (i == 3) {
            lblUtrustning.setText("Kraftkälla");
        }

    }//GEN-LAST:event_comboUtrustningsTypActionPerformed

    private void btnLaggTillFordonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillFordonActionPerformed
        // Metod för att lägga till ny utrustning i systemet, kontrollerar att textfält är fyllda
        // och så att utrusting med samma namn inte kan läggas till i systemet

        boolean utrustningFinns = false;

        try {
            String utrustningsNamn = txtFieldUtrustningsNamn.getText();
            String utrustningAnvander = txtFieldKaliber.getText();

            boolean namnetFinns = existerandeUtrustning(utrustningsNamn);
            int utrustningsID = nyttID();

            boolean textRutaArTom1 = Validering.textRutaArTom(utrustningsNamn);

            String laggTillUtrustning = "insert into utrustning values (" + utrustningsID + ",'" + utrustningsNamn + "')";

            String utrustningsTyp = comboUtrustningsTyp.getSelectedItem().toString();

            String laggTillUtrustningsSort = "insert into " + utrustningsTyp + " values (" + utrustningsID + ",'" + utrustningAnvander + "')";

            if (utrustningsTyp.equals("Vapen")) {
                boolean endastSiffror = Validering.endastSiffror(utrustningAnvander);

                if (endastSiffror == true) {

                    if (textRutaArTom1 == false) {
                        boolean textRutaArTom2 = Validering.textRutaArTom(utrustningAnvander);

                        if (textRutaArTom2 == false) {

                            if (namnetFinns == false) {
                                idb.fetchSingle(laggTillUtrustning);
                                idb.fetchSingle(laggTillUtrustningsSort);
                                JOptionPane.showMessageDialog(null, "Utrustningen har lagts till!");

                            } else {
                                JOptionPane.showMessageDialog(null, "Utrustning med namnet " + utrustningsNamn + " finns redan!");
                            }
                        }
                    }
                }
            }
        } catch (InfException ie) {
            System.out.println(ie);

        }


    }//GEN-LAST:event_btnLaggTillFordonActionPerformed

    public Boolean existerandeUtrustning(String uNamn) //metod som kontrollerar om utrustningen redan finns i systemet
    {
        boolean namnetFinns = false;
        try {

            String existerandeUtrustning = "select benamning from utrustning";
            ArrayList<String> utrustning = idb.fetchColumn(existerandeUtrustning);

            for (String namn : utrustning) {
                if (namn.toLowerCase().equals(uNamn.toLowerCase())) {
                    namnetFinns = true;
                    break;
                }
            }

        } catch (InfException ie) {
            System.out.println(ie);
        }
        return namnetFinns;
    }

    public int nyttID() {
        //Metod som skapar ett nytt ID för varje ny utrustning som läggs till i systemet
        String maxID = "select max(Utrustnings_ID) from utrustning";
        int nyasteID = 0;
        try {
            String hogstaID = idb.fetchSingle(maxID);
            int nyID = Integer.parseInt(hogstaID);
            nyasteID = nyID + 1;
        } catch (InfException ie) {
            JOptionPane.showMessageDialog(null, ie);
        }
        return nyasteID;
    }

    public void setAgent() {
        anvandareArAdmin = false;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTillFordon;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> comboUtrustningsTyp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblUtrustning;
    private javax.swing.JTextField txtFieldKaliber;
    private javax.swing.JTextField txtFieldUtrustningsNamn;
    // End of variables declaration//GEN-END:variables
}
