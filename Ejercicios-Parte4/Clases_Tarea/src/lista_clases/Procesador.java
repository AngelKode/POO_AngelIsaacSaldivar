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
public class Procesador {
    
    private int cantidad_nucleos, cantidad_hilos;
    private double frecuencia;
    private String marca;
    
    public Procesador(){
        this.cantidad_nucleos = 0;
        this.cantidad_hilos = 0;
        this.frecuencia = 0.0;
        this.marca = "";
    }
    
    public Procesador(int cantidad_nucleos, int cantidad_hilos, double frecuencia, String marca){
        this.cantidad_nucleos = cantidad_nucleos;
        this.cantidad_hilos = cantidad_hilos;
        this.frecuencia = frecuencia;
        this.marca = marca;
    }

    public int getCantidad_nucleos() {
        return this.cantidad_nucleos;
    }

    public void setCantidad_nucleos(int cantidad_nucleos) {
        this.cantidad_nucleos = cantidad_nucleos;
    }

    public int getCantidad_hilos() {
        return this.cantidad_hilos;
    }

    public void setCantidad_hilos(int cantidad_hilos) {
        this.cantidad_hilos = cantidad_hilos;
    }

    public double getFrecuencia() {
        return this.frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
