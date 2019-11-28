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
public class Pantalon {
    
    private String material_construccion,marca,color;
    private double largo,peso;
    
    public Pantalon(){
        this.material_construccion = "";
        this.marca = "";
        this.color = "";
        this.largo = 0.0;
        this.peso = 0.0;
    }
    
    public Pantalon(String material_construccion, String marca, String color, double largo, double peso){
        this.material_construccion = material_construccion;
        this.marca = marca;
        this.color = color;
        this.largo = largo;
        this.peso = peso;
    }

    public String getMaterial_construccion() {
        return this.material_construccion;
    }

    public void setMaterial_construccion(String material_construccion) {
        this.material_construccion = material_construccion;
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

    public double getLargo() {
        return this.largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
