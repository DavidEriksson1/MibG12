/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MibG12;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

        if (anvNamn1.toLowerCase().equals(anvNamn2.toLowerCase()) && losenord1.equals(losenord2)) {
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
    
    public static boolean stringFinns (String namn1, String namn2)
    {
        boolean stringFinns = false;
        
        try {
        String namnet1 = namn1.toLowerCase();
        String namnet2 = namn2.toLowerCase();
        
        if (namnet1.equals(namnet2))
        {
            stringFinns = true;
        }
        }
        catch (NullPointerException ex) {
            
            stringFinns = false;
            System.out.println("Ett fel har uppstått: " + ex);
        }
        return stringFinns;
    }
    
    public static boolean kontrolleraUtrustning(String svar1, String utrustning)
    {
        boolean utrustningFinns = false;
        
       
        
        if(svar1.equals(utrustning)){

            
            utrustningFinns = true;

            utrustningFinns = true;
            JOptionPane.showMessageDialog(null,svar1 + " har tagits bort!");

        }
        else{
            JOptionPane.showMessageDialog(null, "Det finns ingen utrustning med det namnet, prova med ett annat namn");
        }
        
        return utrustningFinns;
    }
    
    public static boolean kontrolleraDatum(String datum)
    {
        boolean datumKorrekt = false;
        
        if (datum != null)
        {
            datumKorrekt = true;
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null, "Fel datumformat, vänligen ange enligt 'YYYY-MM-DDä'");
        }
        return datumKorrekt;
    }
    
    public static boolean textRutaArTom(String string)
    {
        boolean textRutaArTom = string.trim().isEmpty();
        
        if (textRutaArTom == true)
        {
            JOptionPane.showMessageDialog(null, "Vänligen skriv in ett värde i textrutan!");
            textRutaArTom = true;
        }
        
        return textRutaArTom;
    }
    
    public static boolean arStringEndastBokstaver(String str)
    {
        boolean stringEndastBokstaver = false;
                
        if (str.matches("^[a-öA-Ö][a-öA-Ö ]*$"))
            
        {
            stringEndastBokstaver = true;
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null, "Skriv ett värde med endast bokstäver!");
        }
        
        return stringEndastBokstaver;
    }
    
    public static boolean endastSiffror (String str)
    {
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);
 
        Matcher m = p.matcher(str);
        boolean endastSiffror = m.matches();
        
        if (endastSiffror == false)
        {
            JOptionPane.showMessageDialog(null, "Skriv in ett värde endast med siffror!");
        }
        
        return endastSiffror;
    
    }
    
    public static boolean kollaLosenordsLangd (String losen)
    {
        int langd = losen.length();
        boolean losenForLangt = false;
        
        if (langd>6)
        {
            losenForLangt = true;
        }
            
        return losenForLangt;    
    }
    
    public static boolean kollaDatumFormat (String datum)        
    {
        boolean datumFormatKorrekt = false;
        
            if (datum.matches("\\d{4}-\\d{2}-\\d{2}")) 
            {
                datumFormatKorrekt = true;
            } 
            
            else
            {
                JOptionPane.showMessageDialog(null, "Fel datumformat, prova igen enligt YYYY-MM-DD");
            }
            
            return datumFormatKorrekt;
    }

    
    
}

 
