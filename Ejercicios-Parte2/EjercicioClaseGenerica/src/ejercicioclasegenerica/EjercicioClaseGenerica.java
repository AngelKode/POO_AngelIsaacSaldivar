/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclasegenerica;

import clases.GenericClass;

/**
 *
 * @author depot
 */
public class EjercicioClaseGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        GenericClass<Double> doubleObjeto = new GenericClass<>(45.5);
        doubleObjeto.tipoClase();
        
        GenericClass<Integer> intObjeto = new GenericClass<>(5);
        intObjeto.tipoClase();
        
        GenericClass<String> stringObjeto = new GenericClass<>("Hola");
        stringObjeto.tipoClase();
    }  
}
