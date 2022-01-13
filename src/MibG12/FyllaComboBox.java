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
public class FyllaComboBox {
    private static InfDB idb;
    


public FyllaComboBox(InfDB idb){
    this.idb = idb;
}

//Metod för att fylla combobox med namn på olika platser som finns i systemet
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
//MEtod för att fylla combobox med namn på alla agenter
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
//Metod för att fylla combobox med namn på aliens
public static void laggTillAlien(JComboBox cb) {
        String alienFraga = "SELECT namn FROM alien";

        ArrayList<String> aliens;

        try {
            aliens = idb.fetchColumn(alienFraga);
            for (String a : aliens) {
                cb.addItem(a);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println(ex);

        }

    }
//Metod för att fylla combobox med de områden som finns
public static void laggTillOmrade(JComboBox cb) {
        String omradeFraga = "SELECT benamning FROM omrade";

        ArrayList<String> omraden;

        try {
            omraden = idb.fetchColumn(omradeFraga);
            for (String a : omraden) {
                cb.addItem(a);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println(ex);

        }

    }
//Metod för att fylla combobox med den utrustning som redan finns registrerat
public static void laggTillUtrustning(JComboBox cb) {
        String utrFraga = "SELECT benamning FROM utrustning";

        ArrayList<String> utrustning;

        try {
            utrustning = idb.fetchColumn(utrFraga);
            for (String a : utrustning) {
                cb.addItem(a);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println(ex);

        }

    }
}

