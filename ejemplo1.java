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
        
        String a ="";
        int opcion = 0;
        a = JOptionPane.showInputDialog("Elija la opcion 1= suma, 2=resta, 3=multiplicacion, 4=divisino"); 
        opcion = (int) Double.parseDouble(a);
        
        String b ="";
        int opcion2 = 0;
        b = JOptionPane.showInputDialog("ingrese el primer digito"); 
        opcion2 = (int) (double) Double.parseDouble(b);
        
        String c ="";
        double opcion3 = 0;
        c = JOptionPane.showInputDialog("ingrese el segundo digito"); 
        opcion3 = (int) (double) Double.parseDouble(c);

    
        double respuesta = 0;
        respuesta = analizaProlema(opcion, opcion2,opcion3);
        System.out.println(respuesta);

    }
    public static double analizaProlema(int a, double b, double c){
        double respuesta = 0;
        respuesta = switch (a) {
            case 1 -> b + c;
            case 2 -> b - c;
            case 3 ->  b * c;
            case 4 -> b / c;
            default -> 0;
        };
        return JOptionPane.showMessageDialog(null, respuesta      );
    }
}
