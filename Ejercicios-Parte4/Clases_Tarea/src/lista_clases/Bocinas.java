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
public class Bocinas {
    
    public String marca, potencia, frecuencia;
    public double peso;
    public Bocinas(){
        this.marca = "";
        this.potencia = "";
        this.frecuencia = "";
        this.peso = 0.0;
    }  
    public Bocinas(String marca, String potencia, String frecuencia,double peso){
        this.marca = marca;
        this.potencia = potencia;
        this.peso = peso;
        this.frecuencia = frecuencia;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPotencia() {
        return this.potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getFrecuencia() {
        return this.frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
