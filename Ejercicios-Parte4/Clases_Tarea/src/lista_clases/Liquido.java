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
public class Liquido {
   
    private String sabor;
    private double cantidad,temperatura,densidad;
    
    public Liquido(){
       this.sabor = "";
       this.cantidad = 0.0;
       this.temperatura = 0.0;
       this.densidad = 0.0;
    }
    public Liquido(String sabor, double cantidad,double temperatura,double densidad){
       this.sabor = sabor;
       this.cantidad = cantidad;
       this.temperatura = temperatura;
       this.densidad = densidad;
    }

    public String getSabor() {
        return this.sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getDensidad() {
        return this.densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }
    
    
}
