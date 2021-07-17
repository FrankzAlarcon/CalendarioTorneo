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
        Equipo ligaEcuatoriana[] = {new Equipo("Barcelona"), new Equipo("Emelec"), new Equipo("Independiente del Valle"),
            new Equipo("U. Catolico"), new Equipo("LDU Quito"), new Equipo("Macará"),
            new Equipo("Mushuc Runa"), new Equipo("Deflfín"), new Equipo("9 de Octubre"),
            new Equipo("Aucas"), new Equipo("Manta"), new Equipo("Dep. Cuenta"),
            new Equipo("Tecnico Universitario"), new Equipo("Orense"), new Equipo("Guayaquil City"),
            new Equipo("Olmedo")};
        int jornada_1[][] = {{0, 1}, {2, 3}, {4, 5}, {6, 7}, {8, 9}, {10, 11}, {12, 13}, {14, 15}};
        int jornada_2[][] = {{11, 6}, {13, 2}, {15, 8}, {7, 10}, {1, 14}, {3, 4}, {9, 12}, {5, 0}};
        int jornada_3[][] = {{0, 9}, {7, 11}, {2, 1}, {4, 15}, {6, 15}, {14, 12}, {8, 13}, {10, 3}};
        int jornada_4[][] = {{13, 4}, {15, 6}, {0, 10}, {1, 7}, {3, 5}, {9, 11}, {12, 8}, {14, 2}};
        int jornada_5[][] = {{11, 14}, {15, 1}, {2, 4}, {8, 3}, {9, 13}, {5, 7}, {10, 6}, {12, 0}};
        int jornada_6[][] = {{13, 0}, {7, 8}, {1, 12}, {3, 15}, {4, 10}, {6, 2}, {5, 11}, {14, 9}};
        int jornada_7[][] = {{11, 3}, {15, 13}, {0, 14}, {2, 7}, {1, 6}, {8, 4}, {9, 10}, {12, 5}};
        int jornada_8[][] = {{11, 2}, {13, 14}, {7, 3}, {4, 1}, {6, 12}, {8, 0}, {5, 9}, {10, 15}};
        int jornada_9[][] = {{15, 11}, {0, 4}, {2, 5}, {1, 13}, {3, 6}, {9, 7}, {12, 10}, {12, 10}};
        int jornada_10[][] = {{11, 13}, {7, 15}, {2, 12}, {3, 9}, {4, 14}, {6, 0}, {5, 1}, {10, 8}};
        int jornada_11[][] = {{13, 10}, {15, 5}, {0, 3}, {1, 11}, {8, 2}, {9, 6}, {12, 4}, {14, 7}};
        int jornada_12[][] = {{11, 0}, {7, 12}, {2, 15}, {3, 1}, {4, 9}, {6, 8}, {5, 18}, {10, 14}};
        int jornada_13[][] = {{13, 3}, {0, 7}, {1, 10}, {4, 6}, {8, 11}, {9, 2}, {12, 15}, {14, 5}};
        int jornada_14[][] = {{11, 4}, {15, 9}, {7, 13}, {2, 0}, {1, 8}, {3, 12}, {6, 14}, {5, 10}};
        int jornada_15[][] = {{13, 6}, {0, 15}, {4, 7}, {9, 1}, {10, 2}, {12, 11}, {14, 3}, {8, 5}};

        for (int i = 0; i < tablaPosiciones.length; i++) {
            tablaPosiciones[i][0] = ligaEcuatoriana[i].getNombreEquipo();
            tablaPosiciones[i][1] = "" + ligaEcuatoriana[i].getPartidosJugados();
            tablaPosiciones[i][2] = "" + ligaEcuatoriana[i].getPartidosGanados();
            tablaPosiciones[i][3] = "" + ligaEcuatoriana[i].getPartidosEmpatados();
            tablaPosiciones[i][4] = "" + ligaEcuatoriana[i].getPartidosPerdidos();
            tablaPosiciones[i][5] = "" + ligaEcuatoriana[i].getGolesAfavor();
            tablaPosiciones[i][6] = "" + ligaEcuatoriana[i].getGolesEnContra();
            tablaPosiciones[i][7] = "" + ligaEcuatoriana[i].getDiferenciaDeGoles();
            tablaPosiciones[i][8] = "" + ligaEcuatoriana[i].getPuntos();
        }
    }

    public void ordenarMatriz(String matriz[][]) {
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                if (Integer.parseInt(matriz[i][8]) == Integer.parseInt(matriz[j][8])) {
                    //En caso de empate de puntos, se comparará la diferencia de goles.
                    if (Integer.parseInt(matriz[i][7]) > Integer.parseInt(matriz[j][7])) {
                        intercambio(i, j, matriz);
                    }
                } else {
                    if (Integer.parseInt(matriz[i][8]) > Integer.parseInt(matriz[j][8])) {
                        intercambio(i, j, matriz);
                    }
                }
            }
        }

    }

    public void intercambio(int mayor, int menor, String matriz[][]) {
        String aux[] = new String[8];
        for (int i = 0; i < aux.length; i++) {
            //copio el mayor en aux
            aux[i] = matriz[mayor][i];
        }
        for (int i = 0; i < aux.length; i++) {
            //pongo el menor en el mayor
            matriz[mayor][i] = matriz[menor][i];
        }
        for (int i = 0; i < aux.length; i++) {
            //pongo en el menor el aux
            matriz[menor][i] = aux[i];
        }
    }

}
