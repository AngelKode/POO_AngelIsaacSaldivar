/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_herencia;
import clases.Alimento;

/**
 *
 * @author depot
 */
public class Tarea_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alimento alimento = new Alimento(45.6, 143.7, "Naranja", "Naranja", "Rugosa");
        System.out.println(alimento.toString());
        Object aux = (Object) alimento;
        System.out.println(aux.toString());
        
    }
    
}
