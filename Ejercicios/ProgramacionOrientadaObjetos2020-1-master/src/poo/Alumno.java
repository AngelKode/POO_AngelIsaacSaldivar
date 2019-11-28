/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
/**
 *
 * @author depot
 */
public class Alumno extends Persona{
    
    private int boleta;
    private boolean regular;
    private double promedioGral;
    private String carrera;
    
    public Alumno() {
        super();
        this.boleta = 0;
        this.regular = false;
        this.promedioGral = 0.0;
        this.carrera ="";
    }
    
    public Alumno(String nombre, int boleta, boolean regular, double promedioGral, String carrera) {
        this.boleta = boleta;
        this.regular = regular;
        this.promedioGral = promedioGral;
        this.carrera = carrera;
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public double getPromedioGral() {
        return promedioGral;
    }

    public void setPromedioGral(double promedioGral) {
        this.promedioGral = promedioGral;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
