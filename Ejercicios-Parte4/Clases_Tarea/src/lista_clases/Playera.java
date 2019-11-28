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
public class Playera {
    
    private String material,talla,color;
    private double peso;
    
    public Playera(){
        this.material = "";
        this.talla = "";
        this.color = "";
        this.peso = 0.0;
    }
    
    public Playera(String material, String talla, String color, double peso){
        this.material = material;
        this.talla = talla;
        this.color = color;
        this.peso = peso;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTalla() {
        return this.talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
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
    
}
