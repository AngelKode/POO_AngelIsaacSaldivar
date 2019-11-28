/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicakeylisten;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author depot
 */
public class JButtonNumeros extends JButton{

    public JButtonNumeros(String texto,Dimension dim, Color color) {
       super(texto);
        setBackground(color);
        setSize(dim);
    }  
}
