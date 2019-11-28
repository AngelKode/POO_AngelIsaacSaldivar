/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author depot
 */
public class NuevoJFrame extends JFrame{
     
    public NuevoJFrame(String titulo, int width, int height){
        super(titulo);
        setSize(new Dimension(width, height));
        setVisible(true);
    }
}
