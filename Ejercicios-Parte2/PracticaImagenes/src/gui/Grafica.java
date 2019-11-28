/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author depot
 */
public class Grafica{
    
    public void agregarSerie(){
        //todo: investigar funcionamiento del recurso jfreechart
        //tipos de gráficas,como agregar series de graficas, como crear colecciones de series, como crear frames con la grafica incluida, escribir en un documnto de texto, investigar como funciona JSlide
    }
    public void crearYMostrarGrafica(){
        
    }
    public void escribirEnArchivo(){
        try{
           File archivo = new File("EJEMPLO.txt");
            try (FileWriter escritor = new FileWriter(archivo,true)) {
                escritor.write("Prueba");
                escritor.close();
            }catch(Exception e){
                System.out.println("Error al escribir en al archivo");
            }
        }catch(Exception e){
            System.out.println("Error al escribir");
        }
    }
}
