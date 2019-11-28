/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicakeylistener;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author depot
 */
public class JFramePractica extends JFrame{
   private JPanel panelNumeros = new JPanel(new GridLayout(1, 10));
   private JPanel panelLetras = new JPanel(new FlowLayout(5));
   private JPanel panelFlechas = new JPanel(new BorderLayout());
   
    public JFramePractica(){
       initComponentes(); 
    }

    private void initComponentes() {
        
        add(panelNumeros,BorderLayout.NORTH);
        add(panelLetras,BorderLayout.WEST);
        add(panelFlechas,BorderLayout.EAST);
        setVisible(true);
    }
    
    
}
