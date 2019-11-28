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
public class JButtonLetras extends JButton{

    public JButtonLetras(String texto, Dimension dim, Color color,String comando) {
        super(texto);
        setSize(dim);
        setBackground(color);
       
        setBackground(color);
        setForeground(Color.black);
        Font auxFont = getFont();
        String textoBoton = auxFont.getName();
        Font aux = new Font(textoBoton,Font.ITALIC ,25);
        setFont(aux);
        setActionCommand(comando);
    }
}
