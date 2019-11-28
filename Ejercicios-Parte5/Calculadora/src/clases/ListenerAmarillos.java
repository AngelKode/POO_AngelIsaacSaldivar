/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author depot
 */
public class ListenerAmarillos implements ActionListener{
    private Display pantallaRef = new Display();
    private final CalculadoraLogica logica = new CalculadoraLogica();

    public ListenerAmarillos(Display d) {
        this.pantallaRef = d;
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("BtnAcercaDe")){
           JOptionPane.showMessageDialog(null, "Calculadora creada por Angel Isaac", "Acerca De", JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getActionCommand().equals("BtnCE")){
          pantallaRef.setText((pantallaRef.getNumero().getValue() / 10) + "");
        }
        if(e.getActionCommand().equals("BtnC")){
           logica.setResultado(0.0);
           pantallaRef.setText("");
        }
    }
}
