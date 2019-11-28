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
public class Mochila {
    
    private double peso;
    private String marca, color,material_construccion;
    
    public Mochila(){
       this.peso = 0.0;
       this.marca = "";
       this.color = "";
       this.material_construccion = "";
    }
    public Mochila(double peso, String marca, String color, String material_construccion){
        this.peso = peso;
        this.marca = marca;
        this.color = color;
        this.material_construccion = material_construccion;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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

    public String getMaterial_construccion() {
        return this.material_construccion;
    }

    public void setMaterial_construccion(String material_construccion) {
        this.material_construccion = material_construccion;
    }
    
}
