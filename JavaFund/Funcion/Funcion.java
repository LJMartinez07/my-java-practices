/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcion;

import java.util.Scanner;

/**
 *
 * @author Luis Martinez
 */
public class Funcion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese su segundo numero: ");
        int b = sc.nextInt();
        int Sumar=Sum(a,b);
        int Restar=Rest(a,b);
        int Multiplicar=Multi(a,b);
        double Divicion=Divi(a,b);
        System.out.println("resultado en suma es: "+Sumar);
        System.out.println("resultado en resta es: "+Restar);
        System.out.println("resultado en multiplicacion es: "+Multiplicar);
        System.out.println("resultado en divicion es: "+Divicion);
        
    }
    public static int Sum(int num1, int num2){
        int resultado = num1+num2;
    return resultado;
    }
    public static int Rest(int num1, int num2){
        int resultado = num1-num2;
    return resultado;
    }
    public static int Multi(int num1, int num2){
        int resultado = num1*num2;
    return resultado;
    }
    public static double Divi(int num1, int num2){
        double resultado = num1/num2;
    return resultado;
    }
    
}
