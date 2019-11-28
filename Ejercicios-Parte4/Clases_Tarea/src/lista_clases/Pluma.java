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
public class Pluma {
    
    private double largo;
    private String color_tinta,marca,material;
    
    public Pluma(){
        this.largo = 0.0;
        this.color_tinta = "";
        this.marca = "";
        this.material = "";
    }
    
    public Pluma(double largo, String color_tinta, String marca, String material){
        this.largo = largo;
        this.color_tinta = color_tinta;
        this.marca = marca;
        this.material = material;
    }

    public double getLargo() {
        return this.largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getColor_tinta() {
        return this.color_tinta;
    }

    public void setColor_tinta(String color_tinta) {
        this.color_tinta = color_tinta;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
            
}
