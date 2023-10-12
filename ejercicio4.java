/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_5;

/**
 *
 * @author LABORATORIO 04
 */
import javax.swing.JOptionPane;
public class Semana_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona();
    }
    
    public static String persona(){
        
        String respuesta = "";
        
        String a ="";
        a = JOptionPane.showInputDialog("ingrese el nombre de la persona"); 
        
        String b ="";
        b = JOptionPane.showInputDialog("ingrese el id de la persona");
        double id = (int) (double) Double.parseDouble(b);

        
        String c ="";
        c = JOptionPane.showInputDialog("ingrese el telefono de la persona"); 
        double telefono = (int) (double) Double.parseDouble(c);
        
        respuesta = "el nombre de la persona es:" + a + " con el ID #" + id + " y el telefono es: " + telefono;
        
        return respuesta;
    }
    
}
