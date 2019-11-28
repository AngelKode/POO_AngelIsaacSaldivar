/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicakeylisten;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author depot
 */
public class JButtonFlechas extends JButton{

    public JButtonFlechas(String nombreFoto, Dimension dim ,Color color) {
        setSize(dim);
        setBackground(color);
        
        Font auxFont = getFont();
        String textoBoton = auxFont.getName();
        Font aux = new Font(textoBoton,Font.BOLD,35);
        setFont(aux);
    }
    
}
