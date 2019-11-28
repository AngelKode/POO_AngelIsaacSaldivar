/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_tarea;
import lista_clases.Almohada;
import lista_clases.Audifonos;
import lista_clases.Aves;
import lista_clases.Bicicleta;
import lista_clases.Bocinas;
import lista_clases.Carro;
import lista_clases.Casa;
import lista_clases.Cuaderno;
import lista_clases.Estudiante;
import lista_clases.Gato;
import lista_clases.Liquido;
import lista_clases.Mochila;
import lista_clases.Pantalon;
import lista_clases.Pared;
import lista_clases.Playera;
import lista_clases.Pluma;
import lista_clases.Procesador;
import lista_clases.Shampoo;
import lista_clases.Sombrero;
import lista_clases.Television;

/**
 *
 * @author depot
 */
public class Clases_Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PROBANDO EL OBJETO ALMOHADA
        Almohada _almohada = new Almohada("Sognare", "Algodon", "Alta", 40);
        
        //PROBANDO LA CLASE AUDIFONOS
        Audifonos _audifonos = new Audifonos("Sony", "Buena","MDR-105", 50.0, 1.8);
        //PROBANDO LA CLASE AVES
        Aves _aves = new Aves(6.5, 40.0, "Blanco", "Paloma");
        
        //PROBANDO LA CLASE BICICLETA
        Bicicleta _bicicleta = new Bicicleta("Yamaha", "Buenos", "Acero", 10.0);
        
        //PROBANDO LA CLASE BOCINAS
        Bocinas _bocina = new Bocinas("Sony", "Fuerte", "20-20,000",250.5);
        
        //PROBANDO LA CLASE CARRO
        Carro _carro = new Carro("Suzuki", "Aluminio", 1300.45, 6);
        //PROBANDO LA CLASE CASA
        Casa _casa = new Casa("Jose", "Centro", 2, 1600000);
        
        //PROBANDO CLASE CUADERNO
        Cuaderno _cuaderno = new Cuaderno(30.6, "Roble", "Scribe", 100);
        //PROBANDO CLASE ESTUDIANTE
        Estudiante _estudiante = new Estudiante("Roberto", "Hombre", 20, 1.67);
        
        //PROBANDO CLASE GATO
        Gato _gato = new Gato("Egipcio","Michi", 7.8, 1.2);
 
        //PROBANDO LA CLASE LIQUIDO
        Liquido _liquido = new Liquido("Limon", 780.2, 20.0, 1.4);
        
        //PROBANDO LA CLASE MOCHILA
        Mochila _moch = new Mochila(200.5, "Nike", "Azul", "Tela");
 
        //PROBANDO LA CLASE PANTALON
        Pantalon _pant = new Pantalon("Algodon", "Levis", "Azul", 0.80, 270.0);
        
        //PROBANDO LA CLASE PARED
        Pared _pared = new Pared(0.30, 2.5, "Adobe");
 
        //PROBANDO LA CLASE PLAYERA
        Playera _playera = new Playera("Algodon", "Mediana", "Blanca", 30.0);
        
        //PROBANDO LA CLASE PLUMA
        Pluma _pluma = new Pluma(10.0, "Negra", "Bic", "Plastico");
        
        //PROBANDO LA CLASE PROCESADOR
        Procesador _proces = new Procesador(4, 4, 2.5, "Intel");
        
        //PROBANDO LA CLASE SHAMPOO
        Shampoo _shamp = new Shampoo("Verde", "Menta", "Caprice", 1000);

        //PROBANDO CLASE SOMBRERO
        Sombrero _somb = new Sombrero("Negro", "G", "Algodon", 15.0);
    
        //PROBANDO CLASE TELEVISION
        Television _tele = new Television("Sony", "Gris", 13.0, 2073600);
      }
}
