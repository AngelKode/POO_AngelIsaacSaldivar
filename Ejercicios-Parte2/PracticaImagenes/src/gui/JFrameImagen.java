package gui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author depot
 */
public class JFrameImagen extends JFrame{

    public JFrameImagen(Image imagen){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        JLabel etiqueta = new JLabel();
        etiqueta.setIcon(new ImageIcon(imagen));
        add(etiqueta);
        setSize(imagen.getWidth(this),imagen.getHeight(this));
        setVisible(true);
    }
    
    
}
