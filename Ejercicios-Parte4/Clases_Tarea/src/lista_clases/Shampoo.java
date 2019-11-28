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
public class Shampoo {
    
    private String color, olor, marca;
    private double cantidad;
    
    public Shampoo(){
        this.color = "";
        this.olor = "";
        this.marca = "";
        this.cantidad = 0.0;
    }
    
    public Shampoo(String color,String olor, String marca, double cantidad){
        this.color = color;
        this.olor = olor;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOlor() {
        return this.olor;
    }

    public void setOlor(String olor) {
        this.olor = olor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
}
