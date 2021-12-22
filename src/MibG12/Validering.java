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

        try {
            String fraga1 = "Select administrator from agent where namn = '" + anvNamn + "'";
            ArrayList<String> svar1 = idb.fetchColumn(fraga1);
            String svar = svar1.toString();
            String admin = svar.replaceAll("[\\p{Ps}\\p{Pe}]", "");
            String J = "J";
            

            
            if (admin.equals(J)) {
                adminStatus = true;
                System.out.println("Denna Agent är admin");
                System.out.println(admin);
            } else {
                JOptionPane.showMessageDialog(null, "Denna Agent är inte admin");
                System.out.println(admin);
            }

        } catch (InfException ex) {
            Logger.getLogger(InloggningsTyp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ett fel har uppstått " + ex);
        }
        return adminStatus;
        
    }

    public static boolean kollaInloggningAgent(String anvNamn1, String anvNamn2, String losenord1, String losenord2)
    {
        boolean inloggningKorrekt = false;
          
              
              if(anvNamn1.equals(anvNamn2) && losenord1.equals(losenord2)){
              inloggningKorrekt = true;
                    
              }
              else{
                  JOptionPane.showMessageDialog(null, "Användarnamn eller lösenord är fel");
              }
          
          return inloggningKorrekt;
    }
}
