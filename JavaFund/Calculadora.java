
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Martinez
 */
public class Calculadora {
    
    public static void main(String[] args) {
        System.out.println("Elije la siguiente"
                + "1-) Sumar \n"
                + "2-) restar \n"
                + "3-) Multiplicar \n"
                + "4-) Dividir \n");
         Scanner sc = new Scanner(System.in);
         int decision = sc.nextInt();
         if (decision==1){
             System.out.println("Esta es la suma");
             System.out.println("Ingrese el primer numero a sumar: ");
             int num1 = sc.nextInt();
             System.out.println("Ingrese el segundo numero a sumar:" );
             int num2 = sc.nextInt();
             int sum;
             sum=num1+num2;
             System.out.println("Su suma es: "+sum);
         }
         if (decision==2){
             System.out.println("Esta es la Resta");
             System.out.println("Ingrese el primer numero a resta: ");
             int num3 = sc.nextInt();
             System.out.println("Ingrese el segundo numero a resta:" );
             int num4 = sc.nextInt();
             int res;
             res=num3-num4;
             System.out.println("Su resta es: "+res);
         }
         if (decision==3){
             System.out.println("Esta es la multiplicacion");
             System.out.println("Ingrese el primer numero a multiplicar: ");
             int num5 = sc.nextInt();
             System.out.println("Ingrese el segundo numero a multiplicar:" );
             int num6 = sc.nextInt();
             int mul;
             mul=num5*num6;
             System.out.println("Su multiplicar es: "+mul);
         }
         if (decision==4){
             System.out.println("Esta es la divicion");
             System.out.println("Ingrese el primer numero a dividir: ");
             int num7 = sc.nextInt();
             System.out.println("Ingrese el segundo numero a dividir:" );
             int num8 = sc.nextInt();
             int div;
             div=num7/num8;
             System.out.println("Su dividir es: "+div);
            
         }
      
    }
    
}
