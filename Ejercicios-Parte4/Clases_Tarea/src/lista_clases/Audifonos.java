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
public class Audifonos {
    
    private String marca, calidad_sonido, nombre;
    private double peso, longitud;
    
    
    public Audifonos(){
        this.marca = "";
        this.calidad_sonido = "";
        this.nombre = "";
        this.peso = 0;
        this.longitud = 0;
    }
    
    public Audifonos(String marca, String calidad_sonido, String nombre, double peso, double longitud){
        this.marca = marca;
        this.calidad_sonido = calidad_sonido;
        this.nombre = nombre;
        this.peso = peso;
        this.longitud = longitud;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getCalidadSonido(){
        return this.calidad_sonido;
    }
    public double getPeso(){
        return this.peso;
    }
    public double getLongitud(){
        return this.longitud;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCalidadSonido(String calidadSonido){
        this.calidad_sonido = calidadSonido;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setLongitud(double longitud){
        this.longitud = longitud;
    }
}
