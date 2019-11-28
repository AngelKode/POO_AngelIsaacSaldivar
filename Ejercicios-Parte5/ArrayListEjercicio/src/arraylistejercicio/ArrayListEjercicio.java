/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistejercicio;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author depot
 */
public class ArrayListEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Object> aux = new ArrayList<>();
        
        aux.add(2);
        aux.add(3);
        aux.add(4);
        aux.add("Hola");
        aux.add("Pedro");
        aux.add(3.1);
        aux.add(4.1);
        aux.add(new JButton("Hola"));
        
        
        for(Object aux2:aux){
            if(aux2 instanceof Integer){
                Integer aux3 = (Integer)aux2;
                System.out.println(aux3.toString());
            }else if(aux2 instanceof String){
                String aux3 = (String) aux2;
                System.out.println(aux3);
            }else if(aux2 instanceof Double){
                Double aux3 = (Double) aux2;
                System.out.println(aux3.toString());
            }else{
                JButton aux3 = (JButton) aux2;
                System.out.println(aux3.toString());     
            }
        }
    }
}
