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
public class Sombrero {
    
    private String color, tamanio,material;
    private double diametro;
    
    public Sombrero(){
        this.color = "";
        this.tamanio = "";
        this.material = "";
        this.diametro = 0.0;
   }
    
    public Sombrero(String color, String tamanio, String material, double diametro){
        this.color = color;
        this.tamanio = tamanio;
        this.material = material;
        this.diametro = diametro;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getDiametro() {
        return this.diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
}
