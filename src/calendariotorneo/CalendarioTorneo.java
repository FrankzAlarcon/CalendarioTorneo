/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariotorneo;

import java.util.Arrays;

/*
    @author Frankz
 */
public class CalendarioTorneo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //opcion para jugar 1 fecha
        //Opcion para jugar todas las fechas de la primera fase
        //tabla de posiciones ordenada según los puntos,de estar partidos ganados, perdidos, empatados, goles a favor, en contra y diferencia de goles.
        //arreglo con los equipos de futbol(16)
        //Arreglo String con las fechas que se jugaran o con un algoritmo generar los encuentros
        //finalizando la primera fase, el 1er lugar juega contra el 3ro y el 2do contra el 4to
        //de esos 2 encuentros salen las 2 finales
        
        String tablaPosiciones[][] = new String[16][9];
        Equipo ligaEcuatoriana[]={new Equipo("Barcelona"), new Equipo("Emelec"), new Equipo("Independiente del Valle"),
            new Equipo("U. Catolico"), new Equipo("LDU Quito"), new Equipo("Macará"),
            new Equipo("Mushuc Runa"), new Equipo("Deflfín"), new Equipo("9 de Octubre"),
            new Equipo("Aucas"), new Equipo("Manta"), new Equipo("Dep. Cuenta"),
            new Equipo("Tecnico Universitario"), new Equipo("Orense"),new Equipo("Guayaquil City"),
            new Equipo("Olmedo")};
        
        for (int i = 0; i < tablaPosiciones.length; i++) {
            tablaPosiciones[i][0]= ligaEcuatoriana[i].getNombreEquipo();
            tablaPosiciones[i][1]= "" + ligaEcuatoriana[i].getPartidosJugados();
            tablaPosiciones[i][2]= "" + ligaEcuatoriana[i].getPartidosGanados();
            tablaPosiciones[i][3]= "" + ligaEcuatoriana[i].getPartidosEmpatados();
            tablaPosiciones[i][4]= "" + ligaEcuatoriana[i].getPartidosPerdidos();
            tablaPosiciones[i][5]= "" + ligaEcuatoriana[i].getGolesAfavor();
            tablaPosiciones[i][6]= "" + ligaEcuatoriana[i].getGolesEnContra();
            tablaPosiciones[i][7]= "" + ligaEcuatoriana[i].getDiferenciaDeGoles();
            tablaPosiciones[i][8]= "" + ligaEcuatoriana[i].getPuntos();          
        }                        
    }
    
    public void ordenarMatriz(String matriz[][]){
        for (int i = 1; i < matriz.length; i++) {
            if(Integer.parseInt(matriz[i-1][8])>Integer.parseInt(matriz[i][8])){
                
            }else{
                
            }
            
        }
    }
    
    public void intercambio(int mayor, int menor, String matriz[][]){
        String aux[] = new String[8];
        for (int i = 0; i < aux.length; i++) {
            
            
        }
    }
    
}
