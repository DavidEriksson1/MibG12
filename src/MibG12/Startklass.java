/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MibG12;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

public class Startklass {

    private static InfDB idb;

    public static void main(String[] args) throws InfException {
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");

        } catch (InfException ex) {
            Logger.getLogger(Startklass.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        new InloggningsTyp(idb).setVisible(true);
               
    }
    
   
}

