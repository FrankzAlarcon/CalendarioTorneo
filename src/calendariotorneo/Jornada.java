/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariotorneo;

/**
 *
 * @author Jhona
 */
public class Jornada {
   public Partido[] match;
   public  int[][] orden_Partidos;

    public Jornada() {
        this.match = new Partido[8];
        this.orden_Partidos = new int[8][2];
    }

    public void insertarPartidoEnJornada(Partido p1, Partido p2, Partido p3, Partido p4, Partido p5, Partido p6, Partido p7, Partido p8) {
        this.match[0] = p1;
        this.match[1] = p2;
        this.match[2] = p3;
        this.match[3] = p4;
        this.match[4] = p5;
        this.match[5] = p6;
        this.match[6] = p7;
        this.match[7] = p8;
    }

    public Partido[] getMatch() {
        return match;
    }

    public void setMatch(Partido[] match) {
        this.match = match;
    }

    @Override
    public String toString() {
        String salida = "";
        for (int i = 0; i < match.length; i++) {
            salida+= match[i].toString();
            
        }
        return salida;
    }

}
