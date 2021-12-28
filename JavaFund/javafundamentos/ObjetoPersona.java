/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafundamentos;

/**
 *
 * @author Luis Martinez
 */
public class ObjetoPersona {
     public static void main(String[] args) {
        Persona alumno = new Persona("Enmanuel",18,"Dominicano",130,"Masculino");
        System.out.println("Tu peso es de: "+ alumno.getPeso());
        //alumno.setedad(15);
        if (alumno.getEdad()>=18){
            System.out.println("Eres Mayor tienes: "+ alumno.getEdad());
        }else 
        {
            System.out.println("Eres Menor tienes: "+ alumno.getEdad());
        }
    }
}        