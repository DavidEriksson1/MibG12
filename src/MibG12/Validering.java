/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MibG12;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Victo
 */
public class Validering {

    private static InfDB idb;

    public static boolean checkAdminStatus(String anvNamn) {
        
        boolean adminStatus = false;
        
        if (anvNamn.equals("J")) {
            adminStatus = true;
            System.out.println("Denna Agent är admin");
            
        } else {
            JOptionPane.showMessageDialog(null, "Denna Agent är inte admin");
            
        }
        return adminStatus;

    }

    public static boolean kollaInloggningAgent(String anvNamn1, String anvNamn2, String losenord1, String losenord2) {
        boolean inloggningKorrekt = false;

        if (anvNamn1.equals(anvNamn2) && losenord1.equals(losenord2)) {
            inloggningKorrekt = true;

        } else {
            JOptionPane.showMessageDialog(null, "Användarnamn eller lösenord är fel");
        }

        return inloggningKorrekt;
    }
}
