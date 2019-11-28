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
public class Casa {
    
    private String propietario,lugarEstablecido;
    private int cantidadPisos;
    private double precio;
    
    public Casa(){
       this.propietario = "";
       this.lugarEstablecido = "";
       this.cantidadPisos = 0;
       this.precio = 0.0;
    }
    public Casa(String propietario, String lugarEstablecido, int cantidadPisos, double precio){
        this.propietario = propietario;
        this.lugarEstablecido = lugarEstablecido;
        this.cantidadPisos = cantidadPisos;
        this.precio = precio;
    }

    public String getPropietario() {
        return this.propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getLugarEstablecido() {
        return this.lugarEstablecido;
    }

    public void setLugarEstablecido(String lugarEstablecido) {
        this.lugarEstablecido = lugarEstablecido;
    }

    public int getCantidadPisos() {
        return this.cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }   
}
