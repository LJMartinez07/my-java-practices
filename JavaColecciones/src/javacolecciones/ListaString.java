/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Taller de INF
 */
public class ListaString {
    
     public static void main(String[] args) {
            
            List<String> lista = new ArrayList<>();
            
            lista.add("Edificio");
            lista.add("Casa");
            lista.add("Escuela");
            lista.add("Apartamento");
            lista.add("Carro");
            lista.add("Tienda");
            lista.add("Farmacia");
            lista.add ("Supermercado");
            lista.add("Cine");
            lista.add("Plaza");
            
            lista.add("Hotel");
            
            
              
             
     
  
         
         for (int i = 0; i < lista.size(); i++) {
             
             
             int  lin=lista.get(i).length();
             
             if (lin%2==0){
                 Set<String> Palabras= new HashSet<>();
                    Palabras.add(lista.get(i));
                for (String Impresion: Palabras){
                    System.out.println(Impresion);
             }
             
             
            
             
         }
             
         }
    
}
}
