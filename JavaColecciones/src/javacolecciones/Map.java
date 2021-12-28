/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Taller de INF
 */
public class Map  {
    
   
   public static void main(String[] args) {
    List <Persona> personas= new ArrayList<>();

personas.add(new Persona("Rita","Perez",Genero.FEMENINO,15));

personas.add(new Persona("Maria","Rosa",Genero.FEMENINO,25));

personas.add(new Persona("Luz","Santos",Genero.FEMENINO,30));

personas.add(new Persona("Juan","Perez",Genero.MASCULINO,55));

personas.add(new Persona("Victor","Martinez",Genero.MASCULINO,32));

personas.add(new Persona("Rafael","Santos",Genero.MASCULINO,47));

personas.add(new Persona("Manuel","Cabral",Genero.MASCULINO,0));

personas.add(new Persona("Marta","Rodriguez",Genero.FEMENINO,18));

personas.add(new Persona("Andres","Jimenez",Genero.MASCULINO,52));

personas.add(new Persona("Hector","Perez", Genero.MASCULINO,51));


 java.util.Map<String,String> impresion = new HashMap<String,String>();
 
 for( Persona L : personas ){
     
     
    int Indice= personas.indexOf(L);
     
    String nombree=L.getNombre();
    String apellidoo=L.getApellido();
    
    String g= Indice+nombree+apellidoo;
    
     
    String valor= "\nEl nombre es  "+ nombree + "\nEl apellido es " + apellidoo+ "\nLa edad es " + L.getEdad () + "\n";
    impresion.put(g, valor);
    
     for(java.util.Map.Entry cal : impresion.entrySet()){
            System.out.println(cal.getKey()+"  "+cal.getValue());            
            
        }

    
    
 }
 
    }
   
    
     
    
}
