/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicakeylisten;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 *
 * @author depot
 */
public class EscuchadorNumeros implements KeyListener{
    private final ArrayList<JButtonNumeros> listaBotones = new ArrayList<>();

    @Override
    public void keyTyped(KeyEvent e){  
    }

    @Override
    public void keyPressed(KeyEvent e){
      
       char letraPresionada = e.getKeyChar();
       String letra = "" + letraPresionada;

       for(int i=0;i<10;i++){
           JButtonNumeros aux = listaBotones.get(i);
           if(aux.getText().equals(letra)){
               aux.setBackground(Color.red);
           }
       }
    }

    @Override
    public void keyReleased(KeyEvent e) {
         char letraPresionada = e.getKeyChar();
         String letra = "" + letraPresionada;
        
         for(int i=0;i<10;i++){
           JButtonNumeros aux = listaBotones.get(i);
           if(aux.getText().equals(letra)){
               aux.setBackground(Color.yellow);
           }
       }
    }
    public void obtenerNumeros(JButtonNumeros v){
        this.listaBotones.add(v);
    }
    
}
