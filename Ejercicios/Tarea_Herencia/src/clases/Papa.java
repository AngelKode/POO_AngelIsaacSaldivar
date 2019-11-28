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
public class Papa extends Tuberculos{
    
    private boolean gluten;
    private int cantidad_minerales;
    private String antioxidantes;

    public Papa() {
        this.gluten = true;
        this.cantidad_minerales = 0;
        this.antioxidantes = "Desconocido"; 
    }

    public Papa(double peso, double calorias, String sabor, String color, String textura,
                double cantidad_almidon, boolean crecimiento_Bajo_Tierra, boolean brotes,
                boolean gluten, int cantidad_minerales, String antioxidantes) {
        super(peso, calorias, sabor, color, textura, cantidad_almidon, crecimiento_Bajo_Tierra, brotes);
        this.gluten = gluten;
        this.cantidad_minerales = cantidad_minerales;
        this.antioxidantes = antioxidantes;
    }

    public boolean isGluten() {
        return this.gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public int getCantidad_minerales() {
        return this.cantidad_minerales;
    }

    public void setCantidad_minerales(int cantidad_minerales) {
        this.cantidad_minerales = cantidad_minerales;
    }

    public String getAntioxidantes() {
        return antioxidantes;
    }

    public void setAntioxidantes(String antioxidantes) {
        this.antioxidantes = antioxidantes;
    }
    
}
