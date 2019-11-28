
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
        System.out.println(aux);
    }
}
