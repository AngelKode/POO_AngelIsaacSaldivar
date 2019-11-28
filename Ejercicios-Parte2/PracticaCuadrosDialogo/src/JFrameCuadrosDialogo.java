
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author depot
 */
public class JFrameCuadrosDialogo extends JFrame{
    private final JPanel panelPrincipal = new JPanel(new GridLayout(5, 1));
    private final escuchadorBotones oido = new escuchadorBotones();

    public JFrameCuadrosDialogo() {
        initComponentes();
    }

    private void initComponentes() {
       Dimension dim = new Dimension(45,45);
        JButton btnConfirmDialog = new JButton("Confirm Dialog");
         btnConfirmDialog.setSize(dim);
        JButton btnInputDialog = new JButton("Input dialog");
         btnInputDialog.setSize(dim);
        JButton btnInternal = new JButton("Internal dialog");
         btnInternal.setSize(dim);
        JButton btnMessage = new JButton("Message Dialog");
         btnMessage.setSize(dim);
        JButton btnOption = new JButton("Option dialog");
         btnOption.setSize(dim);
         
         panelPrincipal.add(btnConfirmDialog);
         panelPrincipal.add(btnInputDialog);
         panelPrincipal.add(btnInternal);
         panelPrincipal.add(btnMessage);
         panelPrincipal.add(btnOption);
         
         add(panelPrincipal);
    }
    
    
}
