/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodedatos;

/**
 *
 * @author Luis Martinez
 */
public class TipoDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte bite = 12;
        short corto = 2;
        int entero = 5;
        long largo = 8;
        
        // Decimal
        float otro = 9;
        double doble = 7.8;
        
        //binario
        boolean estado = true; // false
        
        //cadenas caracteres
        char op = 'h';
        String cadena = "Hola soy Luis";
        
        System.out.println("El valor del dato byte = " +bite);
        System.out.println("El valor de short = " +corto);
        System.out.println("El valor de int = " +entero);
        System.out.println("El valor de float = " +otro);
        System.out.println("El valor de double = " +doble);
        System.out.println("El valor de boolean = " +estado);
        System.out.println("El valor de char = " +op);
        System.out.println("El valor de String = " +cadena);
        System.out.println("El valor de long = " +largo);
        
        
        
        
    }
    
}
