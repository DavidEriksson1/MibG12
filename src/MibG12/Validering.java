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

    public static boolean kollaInloggningsUppgifter(String anvNamn1, String anvNamn2, String losenord1, String losenord2) {
        boolean inloggningKorrekt = false;

        if (anvNamn1.toLowerCase().equals(anvNamn2.toLowerCase()) && losenord1.toLowerCase().equals(losenord2.toLowerCase())) {
            inloggningKorrekt = true;

        } else {
            JOptionPane.showMessageDialog(null, "Användarnamn eller lösenord är fel");
        }

        return inloggningKorrekt;
    }
    
    public static boolean losenordKorrekt (String losen1, String losen2)
    {
        boolean losenordKorrekt = false;
        
        if (losen1.equals(losen2))
        {
            losenordKorrekt = true;
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null, "Lösenordet är fel");
        }
        
        return losenordKorrekt;
        
               
    }
    
    public static String setAdminStatus (String svar)
    {
        String svar1 = svar;
        String ja = "Ja";
        String nej = "Nej";
        
        if (svar1.toLowerCase().equals("j"))
        {
            svar1 = ja;
        }
        
        else if (svar1.toLowerCase().equals("n"))
        {
            svar1 = nej;
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
        
        return svar1;
    }
    
    public static boolean namnFinns (String namn1, String namn2)
    {
        boolean namnetFinns = false;
        
        try {
        String namnet1 = namn1.toLowerCase();
        String namnet2 = namn2.toLowerCase();
        
        if (namnet1.equals(namnet2))
        {
            namnetFinns = true;
        }
        }
        catch (NullPointerException ex) {
            
            namnetFinns = false;
            System.out.println("Ett fel har uppstått: " + ex);
        }
        return namnetFinns;
    }
}
