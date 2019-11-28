package clases;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author depot
 */
public class JButtonCalculadora extends JButton{
    
    public JButtonCalculadora(String etiqueta, Dimension dim, Color color){
      super(etiqueta);
        setSize(dim);
        Font aux = getFont();
        setBackground(color);
        setForeground(Color.white);
        String fuente = aux.getName();
        int estilo = aux.getStyle();
        Font aux2 = new Font(fuente, estilo, 30);
        setFont(aux2);
    }

    JButtonCalculadora(String c, Dimension dim, int TRANSLUCENT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
