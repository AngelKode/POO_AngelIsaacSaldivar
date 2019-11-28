/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_clase;
import clases.Calculadora;
import java.util.Scanner;

/**
 *
 * @author depot
 */
public class Ejercicio_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Calculadora calculadoraUno = new Calculadora();
                Scanner lector = new Scanner(System.in);
                int opcion, otraOperacion;
                double dato;
                
            do{   
                System.out.println("Ingrese la operacion a realizar: ");
                System.out.println("1.Sumar");
                System.out.println("2.Restar");
                System.out.println("3.Dividir");
                System.out.println("4.Multiplicar");
                System.out.println("5.Limpiar resultado");
                System.out.println("Resultado actual: " + calculadoraUno.getResultado());
                System.out.print("R: ");
                opcion = lector.nextInt();
                
                 switch(opcion){
                     case 1:{
                       System.out.println("Ingrese el dato a sumar: ");
                       dato = lector.nextDouble();
                       calculadoraUno.sumar(dato);
                       break;
                     }
                     case 2:{
                       System.out.println("Ingrese el dato a restar: ");
                       dato = lector.nextDouble();
                       calculadoraUno.restar(dato);
                       break;
                     }
                     case 3:{
                       System.out.println("Ingrese el dato a dividir: ");
                       dato = lector.nextDouble(); 
                       calculadoraUno.dividir(dato);
                       break;  
                     }
                     case 4:{
                       System.out.println("Ingrese el dato a multiplicar: ");
                       dato = lector.nextDouble();
                       calculadoraUno.multiplicar(dato);
                       break;
                     }
                     case 5:{
                         calculadoraUno.setResultado(0.0);
                         break;
                     }
                     default:{
                         System.out.println("Eliga una opcion válida");  
                     }
                 }
               System.out.println(calculadoraUno.getResultado());
                System.out.println("Desea hacer otra operacion?: ");
                  otraOperacion = lector.nextInt();
           }while(otraOperacion == 1);
            
        }
}
