/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author depot
 * @param <T>
 */
//SON CLASES DONDE LE ESPECIFICAMOS EL DATO CON EL QUE VA A TRABAJAR
//UNICAMENTE SE PUEDEN TRABAJAR CON CLASES(Integer,Double,String), no se puede con (int,double)

public class GenericClass<T>{
   T objetoCreado;

    public GenericClass(T dato) {
      this.objetoCreado = dato;  
    }
    
    public void tipoClase(){
        JOptionPane.showMessageDialog(null,"El tipo T es: " + this.objetoCreado.toString());  
    }
}
