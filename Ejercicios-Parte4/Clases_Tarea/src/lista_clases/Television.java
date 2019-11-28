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
public class Television {
    
    private String marca, color;
    private double peso;
    private int cantidad_pixeles;
    
    public Television(){
        this.marca = "";
        this.color = "";
        this.peso = 0.0;
        this.cantidad_pixeles = 0;
    }
    
    public Television(String marca, String color, double peso, int cantidad_pixeles){
        this.marca = marca;
        this.color = color;
        this.peso = peso;
        this.cantidad_pixeles = cantidad_pixeles;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCantidad_pixeles() {
        return this.cantidad_pixeles;
    }

    public void setCantidad_pixeles(int cantidad_pixeles) {
        this.cantidad_pixeles = cantidad_pixeles;
    }
    
}
