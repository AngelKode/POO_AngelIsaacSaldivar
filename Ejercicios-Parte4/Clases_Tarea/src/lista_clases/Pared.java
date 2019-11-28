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
public class Pared {
    
    private double grueso,altura;
    private String material;
    
    public Pared(){
       this.grueso = 0.0;
       this.altura = 0.0;
       this.material = "";
    }
    
    public Pared(double grueso, double altura, String material){
        this.grueso = grueso;
        this.altura = altura;
        this.material = material;
    }

    public double getGrueso() {
        return this.grueso;
    }

    public void setGrueso(double grueso) {
        this.grueso = grueso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
