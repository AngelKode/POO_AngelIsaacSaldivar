/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author depot
 */
public class Camote extends Tuberculos{
    
    private String tipo_tallo;
    private String tipo_raiz;
    private String nivel_amarillento_raiz;

    public Camote() {
        this.tipo_tallo = "";
        this.tipo_raiz = "";
        this.nivel_amarillento_raiz = ""; 
    }

    public Camote(double peso, double calorias, String sabor, String color, String textura,
                 double cantidad_almidon, boolean crecimiento_Bajo_Tierra, boolean brotes,
                 String tipo_tallo, String tipo_raiz, String nivel_amarillento_raiz) {
        super(peso, calorias, sabor, color, textura, cantidad_almidon, crecimiento_Bajo_Tierra, brotes);
        this.tipo_tallo = tipo_tallo;
        this.tipo_raiz = tipo_raiz;
        this.nivel_amarillento_raiz = nivel_amarillento_raiz;
    }

    public String getTipo_tallo() {
        return this.tipo_tallo;
    }

    public void setTipo_tallo(String tipo_tallo) {
        this.tipo_tallo = tipo_tallo;
    }

    public String getTipo_raiz() {
        return this.tipo_raiz;
    }

    public void setTipo_raiz(String tipo_raiz) {
        this.tipo_raiz = tipo_raiz;
    }

    public String getNivel_amarillento_raiz() {
        return this.nivel_amarillento_raiz;
    }

    public void setNivel_amarillento_raiz(String nivel_amarillento_raiz) {
        this.nivel_amarillento_raiz = nivel_amarillento_raiz;
    }
    
}
