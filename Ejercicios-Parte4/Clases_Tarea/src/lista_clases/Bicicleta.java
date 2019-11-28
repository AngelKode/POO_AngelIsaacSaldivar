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
public class Bicicleta {
    
    public String marca, frenos, material;
    public double peso;
    
    public Bicicleta(){
        this.marca = "";
        this.frenos = "";
        this.material = "";
        this.peso = 0.0;
    } 
    public Bicicleta(String marca, String frenos, String material, double peso){
        this.marca = marca;
        this.frenos = frenos;
        this.material = material;
        this.peso = peso;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFrenos() {
        return this.frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
