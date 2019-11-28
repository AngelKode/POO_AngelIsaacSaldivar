/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author depot
 */
public class JuegoGato {
    
    private int tablero[][];
    private int jugador[];
    private int turno;

    public JuegoGato() {
      this.tablero = new int[3][3];  
      for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
            this.tablero[i][j] = 0; 
         } 
      }
      this.turno = -1;
      this.jugador = new int[]{1,2,1,2,1,2,1,2,1};
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public int[] getJugador() {
        return jugador;
    }

    public void setJugador(int[] jugador) {
        this.jugador = jugador;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    public boolean jugada(int c,int f){
       if(this.turno == -1){
         this.turno++;  
       }  
       if(this.tablero[f][c] == 0){
         this.tablero[f][c] = this.jugador[this.turno];
       }else{
         return false;  
       }
       return true;
    }
    public boolean ganadorONo(){  
     int cantidadCoincidencias = 0;   
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if(this.tablero[i][j] == this.jugador[this.turno]){
                 cantidadCoincidencias++;  
               } 
            }
           if(cantidadCoincidencias == 3){
               return true;
           } 
        }
       cantidadCoincidencias = 0; 
       for(int k = 0;k<3;k++){
          for(int h =0;h<3;h++){
            if(this.tablero[k][h] == this.jugador[this.turno]){
                cantidadCoincidencias++;
            }  
          }
         if(cantidadCoincidencias == 3){
             return true;
         } 
       }
       cantidadCoincidencias = 0;
       for(int l = 0;l<3;l++){
           if(this.tablero[l][l] == this.jugador[this.turno]){
           cantidadCoincidencias++;  
         }
       }
       if(cantidadCoincidencias == 3){
          return true; 
       }
       cantidadCoincidencias = 0;
       int o = 2;
       for(int u=0;u<3;u++){
          if(this.tablero[u][o] == this.jugador[this.turno]){
             cantidadCoincidencias++; 
          }
          o--;
       }
       if(cantidadCoincidencias == 3){
          return true; 
       }
       cantidadCoincidencias = 0;
       this.turno++;
       return false; 
    }
    public void mostrarTablero(){
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               System.out.print(this.tablero[i][j]);
               System.out.print("|");
           }
           System.out.println();
       }
    }
}
