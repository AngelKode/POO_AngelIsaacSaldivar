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
public class Gato {
    
    private String raza,nombre;
    private double peso,longitud;
    
    public Gato(){
        this.raza = "";
        this.nombre = "";
        this.peso = 0.0;
        this.longitud = 0.0;
    }
    public Gato(String raza, String nombre, double peso, double longitud){
        this.raza = raza;
        this.nombre = nombre;
        this.peso = peso;
        this.longitud = longitud;
        
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLongitud() {
        return this.longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
}
