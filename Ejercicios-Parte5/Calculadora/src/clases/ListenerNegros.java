/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author depot
 */
public class ListenerNegros implements ActionListener{
    private Display pantallaDisp = new Display();
    private final CalculadoraLogica logica = new CalculadoraLogica();
    
    public ListenerNegros(Display d) {
        this.pantallaDisp = d;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       JButtonCalculadora aux = (JButtonCalculadora) e.getSource();
       
       switch(aux.getText()){
           case "+":
               pantallaDisp.setText("");
               logica.sumar(pantallaDisp.getNumero().getValue());
               break;
           case "=":
               pantallaDisp.setText(logica.getResultado()+"");
               break;
           case "-":
               pantallaDisp.setText("");
               logica.restar(pantallaDisp.getNumero().getValue());
               break;
           case "/":
               pantallaDisp.setText("");
               logica.dividir(pantallaDisp.getNumero().getValue());
               break;
           case "*":
               pantallaDisp.setText("");
               logica.multiplicar(pantallaDisp.getNumero().getValue());
               break;
       }
    }    
}
