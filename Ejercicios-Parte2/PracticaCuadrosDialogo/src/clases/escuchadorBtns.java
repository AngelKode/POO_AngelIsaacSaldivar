/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author depot
 */
public class escuchadorBtns implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botonAux = (JButton)e.getSource();
        
        switch(botonAux.getActionCommand()){
            case "BtnCD":
                switch(JOptionPane.showConfirmDialog(null, "Eliga cualquier opcion")){
                    case 0:
                        botonAux.setText("Si");
                        break;
                    case 1:
                        botonAux.setText("No");
                        break;
                    case 2:
                        botonAux.setText("Cancelar");
                        break;
                }
                break;
            case "BtnID":
                 botonAux.setText(JOptionPane.showInputDialog("Escriba algo: "));
                 break;
            case "BtnInternalD":
                JOptionPane.showInternalInputDialog(null, "HOLA");
                break;
            case "BtnMD":
                JOptionPane.showMessageDialog(null, "HOLA PROFE!");
                break;
            case "BtnOD":{
                Integer[] opciones = {1,2,3};
                int botonApretado = JOptionPane.showOptionDialog(null, "Escoga una opcion: ", "Option Dialog",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]); 
                botonAux.setText(botonApretado + "");
            }    
        }
        
    }
     
}
