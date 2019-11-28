/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author depot
 */
public class JFrameDialogo extends JFrame{
    private final JPanel panelPrincipal = new JPanel(new GridLayout(5, 1));
    private final escuchadorBtns oido = new escuchadorBtns();

    public JFrameDialogo() {
        initComponentes();
    }

    private void initComponentes() {
       Dimension dim = new Dimension(45,45);
        JButton btnConfirmDialog = new JButton("Confirm Dialog");
         btnConfirmDialog.setSize(dim);
         btnConfirmDialog.setActionCommand("BtnCD");
         btnConfirmDialog.addActionListener(oido);
        JButton btnInputDialog = new JButton("Input dialog");
         btnInputDialog.setSize(dim);
         btnInputDialog.setActionCommand("BtnID");
         btnInputDialog.addActionListener(oido);
        JButton btnInternal = new JButton("Internal dialog");
         btnInternal.setSize(dim);
         btnInternal.setActionCommand("BtnInternalD");
         btnInternal.addActionListener(oido);
        JButton btnMessage = new JButton("Message Dialog");
         btnMessage.setSize(dim);
         btnMessage.setActionCommand("BtnMD");
         btnMessage.addActionListener(oido);
        JButton btnOption = new JButton("Option dialog");
         btnOption.setSize(dim);
         btnOption.setActionCommand("BtnOD");
         btnOption.addActionListener(oido);
         
         panelPrincipal.add(btnConfirmDialog);
         panelPrincipal.add(btnInputDialog);
         panelPrincipal.add(btnInternal);
         panelPrincipal.add(btnMessage);
         panelPrincipal.add(btnOption);
         
         add(panelPrincipal);
         setVisible(true);
         setSize(400, 550);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
    }
    
    
}

