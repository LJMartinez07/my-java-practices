/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Taller de INF
 */
public class ArregloEnteros {
    public static void main(String[] args) {
        
        List list1 = new ArrayList();
        List<Integer> enteros = Arrays.asList(101,20,50,100,75,35,67,1);
       
        Collections.sort(enteros);   
        Collections.reverse(enteros);   
        
        for (Integer numero : enteros) {
            System.out.println(enteros);
        }
    }
   
    
    
}


