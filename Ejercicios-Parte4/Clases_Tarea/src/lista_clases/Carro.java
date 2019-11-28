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
public class Carro {
    
    private String marca, material;
    private double peso;
    private int capacidadPasajeros;
    
    public Carro(){
        this.marca = "";
        this.material = "";
        this.capacidadPasajeros = 0;
        this.peso = 0.0;
    }
      
    
    public Carro(String marca, String material, double peso, int capacidadPasajeros){
        this.marca = marca;
        this.material = material;
        this.peso = peso;
        this.capacidadPasajeros = capacidadPasajeros;
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

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCapacidadPasajeros() {
        return this.capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    
 }
