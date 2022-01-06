/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MibG12;


import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author eriknilsson
 */
public class MetoderFyllaComboBox {
    private static InfDB idb;
 
     public static void databas(InfDB idb) {
        MetoderFyllaComboBox.idb = idb;
    }
     public static void laggTillAgent(JComboBox cb) {
        String agentFraga = "SELECT namn FROM agent";

        ArrayList<String> allaAgenter;

        try {
            allaAgenter = idb.fetchColumn(agentFraga);
             for (String a : allaAgenter) {
            cb.addItem(a);
        }
        } 
        catch (InfException ex) {
           JOptionPane.showMessageDialog(null, "Något gick fel");
           System.out.println(ex);
        }

       
    }

    

    public static void laggTillOmrade(JComboBox cb1) {
        String omradesFraga = "Select benamning from omrade";

        ArrayList<String> allaOmraden;

        try {
            allaOmraden = idb.fetchColumn(omradesFraga);
            for (String o : allaOmraden) {
                cb1.addItem(o);
            }

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null,"Något gick fel");
            System.out.println(ex);
        }
    }
}

