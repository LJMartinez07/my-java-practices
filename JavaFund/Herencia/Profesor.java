/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;
import javafundamentos.Persona;

/**
 *
 * @author Luis Martinez
 */
public class Profesor extends Persona{
    private int area;
    private double sueldo;
    
    public Profesor(String Nombre, int Edad, String Sexo, float Peso, String Nacionalidad) {
        super(Nombre, Edad, Sexo, Peso, Nacionalidad);
        }
}   