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
public class Persona {
    public String Nombre;
    public int Edad;
    private String Nacionalidad;
    public float Peso;
    public String Sexo;

    public Persona(String nombre, int edad, String nacionalidad, float peso, String sexo) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.Nacionalidad = nacionalidad;
        this.Peso = peso;
        this.Sexo = sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
}
