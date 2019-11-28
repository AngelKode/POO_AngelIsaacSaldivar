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
public class CalculadoraLogica {
   //atributos
    private double resultado;
    //metodos

    public CalculadoraLogica(){
       this.resultado = 0.0; 
    }
    
    public double getResultado(){
        return this.resultado;
    }
    public void setResultado(double dato){
      this.resultado = dato;  
    }
    public void sumar(double dato){
       this.resultado += dato; 
    }
    public void restar(double dato){
        this.resultado -= dato; 
    }
    public void dividir(double divisor){
      this.resultado /= divisor;
    }
    public void multiplicar(double multiplicador){
       this.resultado *= multiplicador;
    } 
}
