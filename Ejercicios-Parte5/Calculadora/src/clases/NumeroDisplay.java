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
public class NumeroDisplay {
  private String texto;
  private boolean negativo;

    public NumeroDisplay() {
        this.texto = "";
        this.negativo = false;
    }

    public NumeroDisplay(String texto) {
        this.texto = texto;
        this.negativo = false;
    }
    
    public void concatenar(String texto){
       this.texto += texto; 
    }
    
    public double getValue(){
      double valor = new Double(this.texto); 
      if(this.negativo){ 
        return valor*-1; 
      }
     return valor;  
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isNegativo() {
        return negativo;
    }

    public void setNegativo(boolean negativo) {
        this.negativo = negativo;
    }   
}
