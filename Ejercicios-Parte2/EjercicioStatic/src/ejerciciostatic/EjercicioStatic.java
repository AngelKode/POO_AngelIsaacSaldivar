/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostatic;

import clases.X;

/**
 *
 * @author depot
 */
public class EjercicioStatic {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        X aux = new X(23);
        X aux2 = new X();
        X aux3 = new X(14);
        System.out.println("Se generaron " + X.cantidadInstancias + " instancias"); 
    }
    
}
