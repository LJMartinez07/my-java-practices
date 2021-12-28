/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CambioDeDatos;

/**
 *
 * @author Luis Martinez
 */
public class ConvertidorDeDatos {
    public static void main(String[] args) {
    Integer a = Integer.valueOf("900");
        System.out.println(a);
        
    String importe = Integer.toString(900);
        System.out.println(importe);
        
    char codigo = 'A';
    String cadena = Character.toString(codigo);
        System.out.println(cadena);
        
    double doble = Double.parseDouble("900.1");
        //System.out.println(doble);
        
    double totalDoble = 900.5;
    String totalString = String.valueOf(doble);
        System.out.println(doble);

    }
}
