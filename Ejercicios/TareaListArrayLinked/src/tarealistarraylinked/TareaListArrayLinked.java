/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealistarraylinked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author depot
 */
public class TareaListArrayLinked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //LINKEDLIST
        LinkedList<String> ejemplo1 = new LinkedList<>();
        ejemplo1.clear();
        ejemplo1.addFirst("Alex");
        ejemplo1.addLast("Pepe");
        ejemplo1.add("Lalo");
        
        boolean estaONo = ejemplo1.contains("Alex");
        if(estaONo){
            System.out.println("El nombre se encuentra");
        }else{
            System.out.println("El nombre no esta");
        }
        
        String nombrePrimero = ejemplo1.getFirst();
        System.out.println(nombrePrimero);
        
        ejemplo1.push("Pedro");
        ejemplo1.pop();
        
        int posicionDatos = ejemplo1.indexOf("Lalo");
        System.out.println(posicionDatos);
        
        String datoPosicion =  ejemplo1.get(1);
        System.out.println(datoPosicion);
        
        boolean vacio = ejemplo1.isEmpty();
        if(vacio){
            System.out.println("La lista enlazada esta vacia");
        }else{
            System.out.println("La lista enlazada NO esta vacia");
        }
        System.out.println(ejemplo1);
        ejemplo1.clear();
        
        //ARRAYLIST
        ArrayList<String> ejemplo2 = new ArrayList<>();
        ejemplo2.add(0, "Pedro");
        
        String datoArray = ejemplo2.get(0);
        System.out.println(datoArray);
        
        ejemplo2.add("Alex");
        
        System.out.println(ejemplo2);
        
        //LIST
        List<String> ejemplo3 = new ArrayList<>();
        
        ejemplo3.add("Alex");
        ejemplo3.add("Pedro");
        ejemplo3.add(2, "Alonso");
       
        ejemplo3.set(2, "Lola");
        
        System.out.println(ejemplo3.get(2));
        
        ejemplo3.remove(2);
        System.out.println(ejemplo3);     
    }
    
}
