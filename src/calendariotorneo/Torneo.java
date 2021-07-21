package calendariotorneo;

import calendariotorneo.Jornada;
import calendariotorneo.Equipo;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * @author dell
 */
public class Torneo {

    //ATRIBUTOS
    public Jornada jornadas[];
    public String tablaPosiciones[][];
    public Equipo ligaEcuatoriana[];
    public Equipo finalistas[] = new Equipo[4];
    
    //Variable globales que nos ayudan en los calculos
    public static int numJornadas = 0;
    public String resultadoFinal = "";

    public Torneo() {
        //Constructor
        //Se inicializan los atributos
        this.jornadas = new Jornada[15];
        this.tablaPosiciones = new String[16][9];
        this.ligaEcuatoriana = new Equipo[16];
        //Se llenan los atributos con los datos necesitado
        llenarEquipos();
        establecerJornadas();
        inicializarTablaPosiciones();
    }

    public Jornada[] getJornadas() {
        return jornadas;
    }

    public String[][] getTablaPosiciones() {
        return tablaPosiciones;
    }

    public Equipo[] getLigaEcuatoriana() {
        return ligaEcuatoriana;
    }

    public void llenarEquipos() {
        /*se crea cada objeto dentro del arreglo
        y se le asigna su respectivo nombre*/
        this.ligaEcuatoriana[0] = new Equipo("Barcelona");
        this.ligaEcuatoriana[1] = new Equipo("Emelec");
        this.ligaEcuatoriana[2] = new Equipo("Independiente del Valle");
        this.ligaEcuatoriana[3] = new Equipo("U. Catolica");
        this.ligaEcuatoriana[4] = new Equipo("LDU Quito");
        this.ligaEcuatoriana[5] = new Equipo("Macará");
        this.ligaEcuatoriana[6] = new Equipo("Mushuc Runa");
        this.ligaEcuatoriana[7] = new Equipo("Deflfín");
        this.ligaEcuatoriana[8] = new Equipo("9 de Octubre");
        this.ligaEcuatoriana[9] = new Equipo("Aucas");
        this.ligaEcuatoriana[10] = new Equipo("Manta");
        this.ligaEcuatoriana[11] = new Equipo("Dep. Cuenta");
        this.ligaEcuatoriana[12] = new Equipo("Tecnico Universitario");
        this.ligaEcuatoriana[13] = new Equipo("Orense");
        this.ligaEcuatoriana[14] = new Equipo("Guayaquil City");
        this.ligaEcuatoriana[15] = new Equipo("Olmedo");
    }
    //ESTABLECEMOS LAS JORNADAS
    public void establecerJornadas() {
        for (int i = 0; i < jornadas.length; i++) {
            this.jornadas[i] = new Jornada();   
        }
        //Para facilitar el código se han establecido de manera estática el orden de los partidos
        int jornada_1[][] = {{0, 1}, {2, 3}, {4, 5}, {6, 7}, {8, 9}, {10, 11}, {12, 13}, {14, 15}};
        this.jornadas[0].orden_Partidos = jornada_1;
        int jornada_2[][] = {{11, 6}, {13, 2}, {15, 8}, {7, 10}, {1, 14}, {3, 4}, {9, 12}, {5, 0}};
        this.jornadas[1].orden_Partidos = jornada_2;
        int jornada_3[][] = {{0, 9}, {7, 11}, {2, 1}, {4, 15}, {6, 5}, {14, 12}, {8, 13}, {10, 3}};
        this.jornadas[2].orden_Partidos = jornada_3;
        int jornada_4[][] = {{13, 4}, {15, 6}, {0, 10}, {1, 7}, {3, 5}, {9, 11}, {12, 8}, {14, 2}};
        this.jornadas[3].orden_Partidos = jornada_4;
        int jornada_5[][] = {{11, 14}, {15, 1}, {2, 4}, {8, 3}, {9, 13}, {5, 7}, {10, 6}, {12, 0}};
        this.jornadas[4].orden_Partidos = jornada_5;
        int jornada_6[][] = {{13, 0}, {7, 8}, {1, 12}, {3, 15}, {4, 10}, {6, 2}, {5, 11}, {14, 9}};
        this.jornadas[5].orden_Partidos = jornada_6;
        int jornada_7[][] = {{11, 3}, {15, 13}, {0, 14}, {2, 7}, {1, 6}, {8, 4}, {9, 10}, {12, 5}};
        this.jornadas[6].orden_Partidos = jornada_7;
        int jornada_8[][] = {{11, 2}, {13, 14}, {7, 3}, {4, 1}, {6, 12}, {8, 0}, {5, 9}, {10, 15}};
        this.jornadas[7].orden_Partidos = jornada_8;
        int jornada_9[][] = {{15, 11}, {0, 4}, {2, 5}, {1, 13}, {3, 6}, {9, 7}, {12, 10}, {14, 8}};
        this.jornadas[8].orden_Partidos = jornada_9;
        int jornada_10[][] = {{11, 13}, {7, 15}, {2, 12}, {3, 9}, {4, 14}, {6, 0}, {5, 1}, {10, 8}};
        this.jornadas[9].orden_Partidos = jornada_10;
        int jornada_11[][] = {{13, 10}, {15, 5}, {0, 3}, {1, 11}, {8, 2}, {9, 6}, {12, 4}, {14, 7}};
        this.jornadas[10].orden_Partidos = jornada_11;
        int jornada_12[][] = {{11, 0}, {7, 12}, {2, 15}, {3, 1}, {4, 9}, {6, 8}, {5, 13}, {10, 14}};
        this.jornadas[11].orden_Partidos = jornada_12;
        int jornada_13[][] = {{13, 3}, {0, 7}, {1, 10}, {4, 6}, {8, 11}, {9, 2}, {12, 15}, {14, 5}};
        this.jornadas[12].orden_Partidos = jornada_13;
        int jornada_14[][] = {{11, 4}, {15, 9}, {7, 13}, {2, 0}, {1, 8}, {3, 12}, {6, 14}, {5, 10}};
        this.jornadas[13].orden_Partidos = jornada_14;
        int jornada_15[][] = {{13, 6}, {0, 15}, {4, 7}, {9, 1}, {10, 2}, {12, 11}, {14, 3}, {8, 5}};
        this.jornadas[14].orden_Partidos = jornada_15;
    }

    //Inicializamos la tabla de posiciones
    public void inicializarTablaPosiciones() {
        for (int i = 0; i < this.tablaPosiciones.length; i++) {
            /*Cada atributo de los equipos es almacenado en la tabla de posiciones*/
            this.tablaPosiciones[i][0] = this.ligaEcuatoriana[i].getNombreEquipo();
            this.tablaPosiciones[i][1] = "" + this.ligaEcuatoriana[i].getPartidosJugados();
            this.tablaPosiciones[i][2] = "" + this.ligaEcuatoriana[i].getPartidosGanados();
            this.tablaPosiciones[i][3] = "" + this.ligaEcuatoriana[i].getPartidosEmpatados();
            this.tablaPosiciones[i][4] = "" + this.ligaEcuatoriana[i].getPartidosPerdidos();
            this.tablaPosiciones[i][5] = "" + this.ligaEcuatoriana[i].getGolesAfavor();
            this.tablaPosiciones[i][6] = "" + this.ligaEcuatoriana[i].getGolesEnContra();
            this.tablaPosiciones[i][7] = "" + this.ligaEcuatoriana[i].getDiferenciaDeGoles();
            this.tablaPosiciones[i][8] = "" + this.ligaEcuatoriana[i].getPuntos();
        }
    }

    //Metodo Burbuja adaptado para ordenar la tabla de posiciones
    public void ordenarTablaPosiciones(String matriz[][]) {
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                //En la columna 8 se encuantra los puntos y en la 7 el gol diferencia
                if (Integer.parseInt(matriz[i][8]) == Integer.parseInt(matriz[j][8])) {
                    //En caso de empate de puntos, se comparará la diferencia de goles.
                    if (Integer.parseInt(matriz[i][7]) < Integer.parseInt(matriz[j][7])) {
                        intercambio(i, j, matriz);
                    }
                } else {
                    if (Integer.parseInt(matriz[i][8]) < Integer.parseInt(matriz[j][8])) {
                        //Si un equipo tienen más puntos, sube lugares.
                        intercambio(i, j, matriz);
                    }
                }
            }
        }

    }



    //Jugar una fecha y regresa los resultado de la misma en String
    public String jugarUnaFecha() {
        String resultado = "\t*** Jornada " + (numJornadas + 1) + " ***\n";
        resultadoFinal += resultado;
        //Se jugaran los 8 partidos de una jornada
        for (int i = 0; i < 8; i++) {
            //Se crea un nuevo partido
            Partido partido1 = new Partido(ligaEcuatoriana[jornadas[numJornadas].orden_Partidos[i][0]], ligaEcuatoriana[jornadas[numJornadas].orden_Partidos[i][1]]);
            jornadas[numJornadas].match[i] = partido1; //Se juega un partido
            partido1.jugarPartido();
            //Se utiliza la varible resultado para imprimir los resultados en la interfaz
            resultado += partido1.resultadoPartido() + "\n";
            resultadoFinal += partido1.resultadoPartido() + "\n";
        }
        //Se inicializa la tabla de posiciones con los nuevos datos de los equipos
        inicializarTablaPosiciones();
        //Se ordena la tabla despues de jugar una jordad de partidos
        ordenarTablaPosiciones(tablaPosiciones);
        numJornadas++;
        return resultado;
    }

    //Jugar todas las fechas
    public String jugarTodasFechas() {
        //Se juegan las 15 jornadas de un torneo
        //Se toma en cuenta las jornadas que ya se han jugado
        for (int j = numJornadas; j < 15; j++) {
            resultadoFinal += "\n\t*** Jornada " + (numJornadas + 1) + " ***\n";
            for (int i = 0; i < 8; i++) {
                Partido partido1 = new Partido(ligaEcuatoriana[jornadas[j].orden_Partidos[i][0]],
                        ligaEcuatoriana[jornadas[j].orden_Partidos[i][1]]);
                jornadas[j].match[i] = partido1; //Se juega un partido
                partido1.jugarPartido();
                resultadoFinal += partido1.resultadoPartido() + "\n";
            }
            //Se inicializa la tabla de posiciones con los nuevos datos de los equipos
            inicializarTablaPosiciones();
            //Se ordena la tabla despues de jugar una jordad de partidos
            ordenarTablaPosiciones(tablaPosiciones);
            numJornadas++;
        }
        return resultadoFinal;
    }

    //Imprimir Matriz
    public String imprimirMatriz(String[][] tablaPosiciones) {
        String salida = "";
        for (int i = 0; i < tablaPosiciones.length; i++) {
            for (int j = 0; j < tablaPosiciones[i].length; j++) {
                salida += tablaPosiciones[i][j] + "  ";
            }
            salida += "\n";
        }
        return salida;
    }

    //Encontrar Finalistas
    public void encontrarFinalistas() {
        for (int indice = 0; indice < finalistas.length; indice++) {
            //Se repite hasta encontrar los 4 finalistas
            for (int i = 0; i < ligaEcuatoriana.length; i++) {
                //Se repite 15 veces hasta encontrar un finalista
                //Se compara el el atributo nombre de un objeto equipo con el nombre de 
                //las primeras posiciones de la tabla. Asi para encontrar los finalistas
                if (ligaEcuatoriana[i].getNombreEquipo().equals(tablaPosiciones[indice][0])) {
                    //Se ha encontrado un finalista
                    finalistas[indice] = ligaEcuatoriana[i];
                }
            }
        }
    }
    
    //Muestra los enfrentamientos del cuadrangular
    public String mostrarCuadrangular(){
        return "\t*** Cuadrangular Final *** \n Seminifinales\n" + finalistas[0].getNombreEquipo() + " VS " + finalistas[3].getNombreEquipo() + "\n"
            + finalistas[1].getNombreEquipo() + " VS " + finalistas[2].getNombreEquipo() + "\n";
        
    }
    
    public String jugarCruadrangular(int equipo1, int equipo2){
        String resultado="";
        Partido semifinal1= new Partido(finalistas[equipo1], finalistas[equipo2]);
        semifinal1.jugarPartido();
        if(semifinal1.getGoles1()==semifinal1.getGoles2()){
            resultado += finalistas[equipo1].getNombreEquipo() + "  " + semifinal1.getGoles1() + " ( 5 )" + "  -  " + " ( 4 ) " 
                    + semifinal1.getGoles2() + "  " + finalistas[equipo2].getNombreEquipo();
            JOptionPane.showMessageDialog(null, "Los equipos han empatado. Se juegan penaltis\n"+ resultado);                
        }else{
            if(semifinal1.getGoles1() > semifinal1.getGoles2()){
                resultado +=  finalistas[equipo1].getNombreEquipo() + "  " + semifinal1.getGoles1()  + "  -  " +  semifinal1.getGoles2() + "  " + finalistas[equipo2].getNombreEquipo();
            }else{
                resultado +=  finalistas[equipo1].getNombreEquipo() + "  " + semifinal1.getGoles1()  + "  -  " +  semifinal1.getGoles2() + "  " + finalistas[equipo2].getNombreEquipo();
                intercambioEquipos(equipo2, equipo1, finalistas);
                System.out.println(Arrays.toString(finalistas));
                
            }
        }  
        return resultado;
    }
    
    public void intercambioEquipos(int ganador, int perdedor, Equipo finalistas[]){
        Equipo aux = new Equipo();
        aux = finalistas[ganador];
        this.finalistas[ganador] = finalistas[perdedor];
        this.finalistas[perdedor] = aux;
    }

    //Intercambio
    public void intercambio(int mayor, int menor, String matriz[][]) {
        //Se guardarán los 9 elementos de una fila
        String aux[] = new String[9];
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
    //Resetear
    public void resetear() {
        this.jornadas = new Jornada[15];
        this.tablaPosiciones = new String[16][9];
        this.ligaEcuatoriana = new Equipo[16];
        llenarEquipos();
        establecerJornadas();
        inicializarTablaPosiciones();
    }

    public String mostrarSiguienteFecha() {
        String fecha = "*** Jornada *** " + (numJornadas + 1) + "\n";
        for (int i = 0; i < 8; i++) {
            fecha += ligaEcuatoriana[jornadas[numJornadas].orden_Partidos[i][0]].getNombreEquipo() + " VS "
                    + ligaEcuatoriana[jornadas[numJornadas].orden_Partidos[i][1]].getNombreEquipo() + "\n";
        }
        return fecha;
    }

}
