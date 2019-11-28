/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_clase;
import clases.JuegoGato;
import java.util.Scanner;
/**
 *
 * @author depot
 */
public class Main_Gato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JuegoGato gato1 = new JuegoGato();
        Scanner lector = new Scanner(System.in);
        int columna = 0, fila = 0;
        do{
           do{ 
            System.out.println("Deme la posicion: ");
            System.out.print("Columna: ");
            columna = lector.nextInt();
            System.out.print("Fila: ");
            fila = lector.nextInt(); 
           }while(gato1.jugada(fila, columna) == false);
            gato1.mostrarTablero();
        }while(gato1.ganadorONo() == false);
        System.out.println("Se acabó el juego"); 
    }
    
}
