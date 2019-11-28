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
public class listenerBlancos implements ActionListener{
    private Display pantallaReferencia = new Display();

    public listenerBlancos(Display dis) {
        this.pantallaReferencia = dis;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonCalculadora aux = (JButtonCalculadora) e.getSource(); 

        if(aux.getText().equals("+/-")){
          if(pantallaReferencia.getNumero().isNegativo()){
             pantallaReferencia.getNumero().setNegativo(false);
          }else{
            pantallaReferencia.getNumero().setNegativo(true);
          }
          pantallaReferencia.setText(pantallaReferencia.getNumero().getValue() + "");
        }else{
          pantallaReferencia.concatenar(aux.getText());
          pantallaReferencia.setText(pantallaReferencia.getNumero().getValue() + "");  
        }
    }
}
