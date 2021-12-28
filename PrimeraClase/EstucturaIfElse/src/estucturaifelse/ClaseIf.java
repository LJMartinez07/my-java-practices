/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estucturaifelse;

import java.util.Objects;

/**
 *
 * @author Luis Martinez
 */
public class ClaseIf {
    
    public ClaseIf(){ 
        
    }
    
    Integer num1=0, num2=0;
    
    public void serIgual(int x, int y){
        this.num1=x;
        this.num2=y;
        
        if(Objects.equals(num1, num2)){
            System.out.println("Cumple la condicion");
        }
        else{
            System.out.println("No cumple la condicion");
        }
        
    }
    
    public void serMayor(int x, int y){
        this.num1=x;
        this.num2=y;
        
        if(num1 > num2){
            System.out.println("El numero 1 es mayor");
        }
        else{
            System.out.println("El numero 1 es menor");
        }
    }
        
    public void serMenor(int x, int y){
        this.num1=x;
        this.num2=y;
        
        if(num1<num2){
            System.out.println("El numero 1 es menor");
        }
        else{
            System.out.println("El numero 1 es mayor");
        }
        
    }
    
}
  
