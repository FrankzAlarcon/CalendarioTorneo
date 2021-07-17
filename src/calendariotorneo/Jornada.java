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
