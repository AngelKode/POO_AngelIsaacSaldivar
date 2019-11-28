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
public class Tuberculos extends Alimento{
    
    private double cantidad_almidon;
    private boolean crecimiento_Bajo_Tierra;
    private boolean brotes;

    public Tuberculos() {
        this.cantidad_almidon = 0.0;
        this.crecimiento_Bajo_Tierra = true;
        this.brotes = true; 
    }

    public Tuberculos(double peso, double calorias, String sabor, String color, String textura,
                      double cantidad_almidon, boolean crecimiento_Bajo_Tierra, boolean brotes) {
        super(peso, calorias, sabor, color, textura);
        this.cantidad_almidon = cantidad_almidon;
        this.crecimiento_Bajo_Tierra = crecimiento_Bajo_Tierra;
        this.brotes = brotes;
    }
    
    public double getCantidad_almidon() {
        return this.cantidad_almidon;
    }

    public void setCantidad_almidon(double cantidad_almidon) {
        this.cantidad_almidon = cantidad_almidon;
    }

    public boolean isCrecimiento_Bajo_Tierra() {
        return this.crecimiento_Bajo_Tierra;
    }

    public void setCrecimiento_Bajo_Tierra(boolean crecimiento_Bajo_Tierra) {
        this.crecimiento_Bajo_Tierra = crecimiento_Bajo_Tierra;
    }

    public boolean isBrotes() {
        return this.brotes;
    }

    public void setBrotes(boolean brotes) {
        this.brotes = brotes;
    }
    
    
}
