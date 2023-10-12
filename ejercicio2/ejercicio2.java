/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author LABORATORIO 04
 */
import javax.swing.JOptionPane;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       promedio();
    }
    
    
    
    public static void promedio (){
        double total = 0;
        double opcion = 0;
    
        for (int contador = 0; contador <= 3; contador++){
          
            String x ="";
            x = JOptionPane.showInputDialog("ingrese un digito"); 
            opcion = (int) (double) Double.parseDouble(x);
            total = total + opcion;
        }
        System.out.println("el promedio de los 4 digitos es: "+ (total/4));
 
          
    }
         
}
