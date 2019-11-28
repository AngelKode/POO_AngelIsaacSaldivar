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

public class Almohada {
    
    private String marca,material, suavidad;
    private int peso;
    
    public Almohada(){
        this.marca = "Sin marca";
        this.material = "Sin material";
        this.suavidad = "Sin suavidad";
        this.peso = 0;
    }
    
    public Almohada(String marca,String material, String suavidad,int peso){
        this.marca = marca;
        this.material = material;
        this.suavidad = suavidad;
        this.peso = peso;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getMaterial(){
        return this.material;
    }
    public String getSuavidad(){
        return this.suavidad;
    }
    public int getPeso(){
        return this.peso;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public void setSuavidad(String suavidad){
        this.suavidad = suavidad;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    
}
