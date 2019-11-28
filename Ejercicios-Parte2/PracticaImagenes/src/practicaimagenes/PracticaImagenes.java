/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaimagenes;

import gui.Gestor;
import gui.Grafica;
import gui.JFrameImagen;
import java.awt.Image;
import javax.swing.JFrame;

/**
 *
 * @author depot
 */
public class PracticaImagenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        Image io = gestor.abrirImagen();
        JFrame frame = new JFrameImagen(io);
        Grafica ejemplo = new Grafica();
        ejemplo.escribirEnArchivo();
        
    }
    
}
