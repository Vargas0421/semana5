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
       area();
    }
    
    
    
    public static void area (){
        double lado = 0;
        double total = 0;
        
        String a ="";
        int opcion = 0;
        a = JOptionPane.showInputDialog("ingresa la medida del lado"); 
        lado = (int) (double) Double.parseDouble(a);
        
        total = lado * lado;
        
        System.out.println("el area del cuadrado es: " + total);
 
          
    }
         
}
