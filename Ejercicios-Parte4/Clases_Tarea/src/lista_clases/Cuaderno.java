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
public class Cuaderno {
    
    private double peso;
    private String material, marca;
    private int cantidadHojas;
    
    public Cuaderno(){
       this.peso = 0.0;
       this.material = "";
       this.marca = "";
       this.cantidadHojas = 0;
    }
    public Cuaderno(double peso, String material, String marca, int cantidadHojas){
        this.peso = peso;
        this.material = material;
        this.marca = marca;
        this.cantidadHojas = cantidadHojas;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadHojas() {
        return this.cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }
    
}
