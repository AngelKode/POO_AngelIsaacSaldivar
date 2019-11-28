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
public class Aves {
    
    private double peso, altura;
    private String color, raza;
    
    public Aves(){
        this.peso = 0.0;
        this.color = "";
        this.raza = "";
        this.altura = 0.0;
    }
    public Aves(double peso,double altura, String color, String raza){
       this.peso = peso;
       this.altura = altura;
       this.color = color;
       this.raza = raza;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
