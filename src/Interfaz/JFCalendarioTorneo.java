/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import static calendariotorneo.CalendarioTorneo.inicializarTablaPosiciones;
import calendariotorneo.Equipo;
import calendariotorneo.Equipo;
import calendariotorneo.Jornada;
import calendariotorneo.Jornada;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Jhona
 */
public class JFCalendarioTorneo extends javax.swing.JFrame {
    public static Jornada jornadas[] = new Jornada[15];

    public JFCalendarioTorneo(Jornada jornadas[]) {
        initComponents();
    }
        public static void setJornadaVector() {
        for (int i = 0; i < jornadas.length; i++) {
            jornadas[i] = new Jornada();  //Creamo un vector de objetos de tipo Jornada     
        }
        int jornada_1[][] = {{0, 1}, {2, 3}, {4, 5}, {6, 7}, {8, 9}, {10, 11}, {12, 13}, {14, 15}};
        jornadas[0].orden_Partidos = jornada_1;
        int jornada_2[][] = {{11, 6}, {13, 2}, {15, 8}, {7, 10}, {1, 14}, {3, 4}, {9, 12}, {5, 0}};
        jornadas[1].orden_Partidos = jornada_2;
        int jornada_3[][] = {{0, 9}, {7, 11}, {2, 1}, {4, 15}, {6, 5}, {14, 12}, {8, 13}, {10, 3}};
        jornadas[2].orden_Partidos = jornada_3;
        int jornada_4[][] = {{13, 4}, {15, 6}, {0, 10}, {1, 7}, {3, 5}, {9, 11}, {12, 8}, {14, 2}};
        jornadas[3].orden_Partidos = jornada_4;
        int jornada_5[][] = {{11, 14}, {15, 1}, {2, 4}, {8, 3}, {9, 13}, {5, 7}, {10, 6}, {12, 0}};
        jornadas[4].orden_Partidos = jornada_5;
        int jornada_6[][] = {{13, 0}, {7, 8}, {1, 12}, {3, 15}, {4, 10}, {6, 2}, {5, 11}, {14, 9}};
        jornadas[5].orden_Partidos = jornada_6;
        int jornada_7[][] = {{11, 3}, {15, 13}, {0, 14}, {2, 7}, {1, 6}, {8, 4}, {9, 10}, {12, 5}};
        jornadas[6].orden_Partidos = jornada_7;
        int jornada_8[][] = {{11, 2}, {13, 14}, {7, 3}, {4, 1}, {6, 12}, {8, 0}, {5, 9}, {10, 15}};
        jornadas[7].orden_Partidos = jornada_8;
        int jornada_9[][] = {{15, 11}, {0, 4}, {2, 5}, {1, 13}, {3, 6}, {9, 7}, {12, 10}, {14, 8}};
        jornadas[8].orden_Partidos = jornada_9;
        int jornada_10[][] = {{11, 13}, {7, 15}, {2, 12}, {3, 9}, {4, 14}, {6, 0}, {5, 1}, {10, 8}};
        jornadas[9].orden_Partidos = jornada_10;
        int jornada_11[][] = {{13, 10}, {15, 5}, {0, 3}, {1, 11}, {8, 2}, {9, 6}, {12, 4}, {14, 7}};
        jornadas[10].orden_Partidos = jornada_11;
        int jornada_12[][] = {{11, 0}, {7, 12}, {2, 15}, {3, 1}, {4, 9}, {6, 8}, {5, 13}, {10, 14}};
        jornadas[11].orden_Partidos = jornada_12;
        int jornada_13[][] = {{13, 3}, {0, 7}, {1, 10}, {4, 6}, {8, 11}, {9, 2}, {12, 15}, {14, 5}};
        jornadas[12].orden_Partidos = jornada_13;
        int jornada_14[][] = {{11, 4}, {15, 9}, {7, 13}, {2, 0}, {1, 8}, {3, 12}, {6, 14}, {5, 10}};
        jornadas[13].orden_Partidos = jornada_14;
        int jornada_15[][] = {{13, 6}, {0, 15}, {4, 7}, {9, 1}, {10, 2}, {12, 11}, {14, 3}, {8, 5}};
        jornadas[14].orden_Partidos = jornada_15;
    }

    public static void inicializarTablaPosiciones(String tablaPosiciones[][], Equipo ligaEcuatoriana[]) {
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

public void mostrarTabla(){
      DefaultTableModel tablaPosiciones=new DefaultTableModel();
   String tablaPosiciones_Matriz[][] = new String[16][9];
    this.jTTablaPosiciones.setModel(tablaPosiciones);
     Equipo ligaEcuatoriana_Vector[] = {new Equipo("Barcelona"), new Equipo("Emelec"), new Equipo("Independiente del Valle"),
            new Equipo("U. Catolico"), new Equipo("LDU Quito"), new Equipo("Macará"),
            new Equipo("Mushuc Runa"), new Equipo("Deflfín"), new Equipo("9 de Octubre"),
            new Equipo("Aucas"), new Equipo("Manta"), new Equipo("Dep. Cuenta"),
            new Equipo("Tecnico Universitario"), new Equipo("Orense"), new Equipo("Guayaquil City"),
            new Equipo("Olmedo")};
     setJornadaVector();
     
    inicializarTablaPosiciones(tablaPosiciones_Matriz, ligaEcuatoriana_Vector);
    tablaPosiciones.addColumn("EQUIPO");
    tablaPosiciones.addColumn("PJ");
    tablaPosiciones.addColumn("PG");
    tablaPosiciones.addColumn("PE");
    tablaPosiciones.addColumn("PP");
    tablaPosiciones.addColumn("GF");
    tablaPosiciones.addColumn("GC");
    tablaPosiciones.addColumn("DG");
    tablaPosiciones.addColumn("PTS");
    this.jTTablaPosiciones.setModel(tablaPosiciones);
      for (int i = 0; i <16; i++) {
          for (int j = 0; j <9; j++) {
              tablaPosiciones.addRow(ligaEcuatoriana_Vector);
          }   
    }
        this.jTTablaPosiciones.setModel(tablaPosiciones);
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTTablaPosiciones = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTTablaPosiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTTablaPosiciones);

        jButton1.setText("Visualizar tabla de posiciones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(119, 119, 119)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(231, 231, 231))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrarTabla();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFCalendarioTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCalendarioTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCalendarioTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCalendarioTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTTablaPosiciones;
    // End of variables declaration//GEN-END:variables
}
