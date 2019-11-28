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
public class X {
    
   public static int cantidadInstancias = 0;
   private int numero;

    public X(int numero) {
        this.numero = numero;
        cantidadInstancias++;
    }
    public X() {
      cantidadInstancias++;  
    }
    
}
