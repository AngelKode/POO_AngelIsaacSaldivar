/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_clases;
/**
 *
 * @author depot
 */
public class Estudiante {
    
    private String nombre,sexo;
    private int edad;
    private double altura;
    
    public Estudiante(){
       this.nombre = "";
       this.sexo = "";
       this.edad = 0;
       this.altura = 0.0;
    }
    
    public Estudiante(String nombre, String sexo, int edad, double altura){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}