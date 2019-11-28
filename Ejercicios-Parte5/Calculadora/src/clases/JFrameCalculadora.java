/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author depot
 */
public class JFrameCalculadora extends JFrame{
   Display  display = new Display();
   private final JPanel panelCentral = new JPanel(new GridLayout(5, 4));
   private final listenerBlancos listenerNumeros = new listenerBlancos(display);
   private final ListenerNegros listenerOperaciones = new ListenerNegros(display);
   private final ListenerAmarillos listenerOtros = new ListenerAmarillos(display);
   
    public JFrameCalculadora() {
        incializarComponentes();
    }
    
    private void incializarComponentes() {
        Dimension dim = new Dimension(30,30);
        Color color = new Color(61, 0, 101);
        Color colorCentral = new Color(39,124,166);
        Color colorDisplay = new Color(255,255,255);
        JButtonCalculadora btnC = new JButtonCalculadora("C", dim,color);
        JButtonCalculadora btnCE = new JButtonCalculadora("CE", dim,color);
        JButtonCalculadora btnMM = new JButtonCalculadora("+/-", dim, color);
        JButtonCalculadora btnProduct = new JButtonCalculadora("x", dim, color);
        JButtonCalculadora btn7 = new JButtonCalculadora("7", dim, colorCentral);
        JButtonCalculadora btn8 = new JButtonCalculadora("8", dim, colorCentral);
        JButtonCalculadora btn9 = new JButtonCalculadora("9", dim, colorCentral);
        JButtonCalculadora btnDiv = new JButtonCalculadora("/", dim, color);
        JButtonCalculadora btn4 = new JButtonCalculadora("4", dim, colorCentral);
        JButtonCalculadora btn5 = new JButtonCalculadora("5", dim, colorCentral);
        JButtonCalculadora btn6 = new JButtonCalculadora("6", dim, colorCentral);
        JButtonCalculadora btnMenos = new JButtonCalculadora("-", dim, color);
        JButtonCalculadora btn1 = new JButtonCalculadora("1", dim, colorCentral);
        JButtonCalculadora btn2 = new JButtonCalculadora("2", dim, colorCentral);
        JButtonCalculadora btn3 = new JButtonCalculadora("3", dim, colorCentral);
        JButtonCalculadora btnPlus = new JButtonCalculadora("+", dim, color);
        JButtonCalculadora btnCero = new JButtonCalculadora("0", dim, colorCentral);
        JButtonCalculadora btnPunto = new JButtonCalculadora(".", dim, colorCentral);
        JButtonCalculadora btnIgual = new JButtonCalculadora("=", dim, colorCentral);
        JButtonCalculadora btnAcercaDe = new JButtonCalculadora("?", dim, color);
        
        panelCentral.add(btnC);
         btnC.setActionCommand("BtnC");
         btnC.addActionListener(listenerOtros);
        panelCentral.add(btnCE);
          btnCE.setActionCommand("BtnCE");
          btnCE.addActionListener(listenerOtros);
        panelCentral.add(btnMM);
          btnMM.setActionCommand("BtnMM");
          btnMM.addActionListener(listenerNumeros);
        panelCentral.add(btnProduct);
          btnProduct.setActionCommand("BtnProduct");
          btnProduct.addActionListener(listenerOperaciones);
        panelCentral.add(btn7);
          btn7.addActionListener(listenerNumeros);
        panelCentral.add(btn8);
          btn8.addActionListener(listenerNumeros);
        panelCentral.add(btn9);
          btn9.addActionListener(listenerNumeros);
        panelCentral.add(btnDiv);
        panelCentral.add(btn4);
          btn4.addActionListener(listenerNumeros);
        panelCentral.add(btn5);
          btn5.addActionListener(listenerNumeros);
        panelCentral.add(btn6);
          btn6.addActionListener(listenerNumeros);
        panelCentral.add(btnMenos);
          btnMenos.setActionCommand("BtnMenos");
          btnMenos.addActionListener(listenerOperaciones);
        panelCentral.add(btn1);
          btn1.addActionListener(listenerNumeros);
        panelCentral.add(btn2);
          btn2.addActionListener(listenerNumeros);
        panelCentral.add(btn3);
          btn3.addActionListener(listenerNumeros);
        panelCentral.add(btnPlus);
          btnPlus.addActionListener(listenerOperaciones);
        panelCentral.add(btnCero);
         btnCero.addActionListener(listenerNumeros);
        panelCentral.add(btnPunto);
        btnPunto.setActionCommand("BtnPunto");
         btnPunto.addActionListener(listenerOtros);
        panelCentral.add(btnIgual);
          btnIgual.setActionCommand("BtnIgual");
          btnIgual.addActionListener(listenerOperaciones);
        panelCentral.add(btnAcercaDe);
          btnAcercaDe.setActionCommand("BtnAcercaDe");
          btnAcercaDe.setToolTipText("Informacion del creador...");
          btnAcercaDe.addActionListener(listenerOtros);
        setLayout(new BorderLayout());//Ejecutando funcion que se encuentra en el arbol jerarquico
        add(panelCentral,BorderLayout.CENTER);
        
        
        Font auxFuente = display.getFont();
        Font nueva = new Font(auxFuente.getName(),auxFuente.getStyle(),40);
        display.setFont(nueva);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBackground(colorDisplay);
        display.setEditable(false);
        display.setForeground(new Color(56,61,61));
        add(display,BorderLayout.NORTH);
        setTitle("CALCULADORA");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}
