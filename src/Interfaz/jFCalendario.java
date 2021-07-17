/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import calendariotorneo.CalendarioTorneo1;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author dell
 */
public class jFCalendario extends javax.swing.JFrame {

    CalendarioTorneo1 calendarioTorneo;
    DefaultTableModel dtmTablaPosiciones;
    FondoAgencia fondoe = new FondoAgencia();
   
    public jFCalendario() {
        this.setContentPane(fondoe);
        initComponents();
        calendarioTorneo = new CalendarioTorneo1();
        dtmTablaPosiciones = new DefaultTableModel();
        crearColumnas(dtmTablaPosiciones);
        actualizarTablaPosiciones();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("LIGA PRO");
        

    }
    
  
    public void crearColumnas(DefaultTableModel dtmTabla){
        dtmTabla.addColumn("Club");
        dtmTabla.addColumn("PJ");
        dtmTabla.addColumn("PG");
        dtmTabla.addColumn("PE");
        dtmTabla.addColumn("PP");
        dtmTabla.addColumn("GF");
        dtmTabla.addColumn("GC");
        dtmTabla.addColumn("DG");
        dtmTabla.addColumn("PTS");      
    }
    //Actulizar Tabla
    public void actualizarTablaPosiciones(){
    DefaultTableModel dtmTablaPosicionesAux = new DefaultTableModel();
    crearColumnas(dtmTablaPosicionesAux);
    for (int i = 0; i < calendarioTorneo.tablaPosiciones.length; i++) {
            dtmTablaPosicionesAux.addRow(new Object[]{calendarioTorneo.tablaPosiciones[i][0],
            calendarioTorneo.tablaPosiciones[i][1],calendarioTorneo.tablaPosiciones[i][2],
            calendarioTorneo.tablaPosiciones[i][3],calendarioTorneo.tablaPosiciones[i][4],
            calendarioTorneo.tablaPosiciones[i][5],calendarioTorneo.tablaPosiciones[i][6],
            calendarioTorneo.tablaPosiciones[i][7],calendarioTorneo.tablaPosiciones[i][8],});        
        }
        this.jTable1.setModel(dtmTablaPosicionesAux);
    }
    
    class FondoAgencia extends JPanel {
         private Image fondoAgencia;
        @Override
        public void paint(Graphics g) {
        fondoAgencia = new ImageIcon(getClass().getResource("/Imagen/Barcelona.png")).getImage();
        g.drawImage(fondoAgencia, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
        }
}
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBJugar1Partido = new javax.swing.JButton();
        jBJugarTodosPartidos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAMostrarJornada = new javax.swing.JTextArea();
        JBMostrarFechas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setForeground(new java.awt.Color(51, 51, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 780, 290));

        jBJugar1Partido.setText("JUGAR UNA FECHA");
        jBJugar1Partido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJugar1PartidoActionPerformed(evt);
            }
        });
        getContentPane().add(jBJugar1Partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jBJugarTodosPartidos.setText("JUGAR TODOS PARTIDOS");
        jBJugarTodosPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJugarTodosPartidosActionPerformed(evt);
            }
        });
        getContentPane().add(jBJugarTodosPartidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jTAMostrarJornada.setEditable(false);
        jTAMostrarJornada.setColumns(20);
        jTAMostrarJornada.setRows(5);
        jTAMostrarJornada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTAMostrarJornada);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 360, 280));

        JBMostrarFechas.setText("MOSTRAR FECHAS");
        JBMostrarFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMostrarFechasActionPerformed(evt);
            }
        });
        getContentPane().add(JBMostrarFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel1.setBackground(java.awt.SystemColor.textHighlightText);
        jLabel1.setFont(new java.awt.Font("Stencil Std", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BARCELONA CAMPEÓN 2022");
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Stencil Std", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TABLA DE POSICIONES");
        jLabel2.setFocusable(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, -1, -1));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 210, -1, -1));

        jMenu1.setText("Menu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBJugar1PartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJugar1PartidoActionPerformed
        this.jTAMostrarJornada.setText(calendarioTorneo.jugarUnaFecha());
        actualizarTablaPosiciones();
    }//GEN-LAST:event_jBJugar1PartidoActionPerformed

    private void jBJugarTodosPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJugarTodosPartidosActionPerformed
        this.jTAMostrarJornada.setText(calendarioTorneo.jugarTodasFechas());
        actualizarTablaPosiciones();
    }//GEN-LAST:event_jBJugarTodosPartidosActionPerformed

    private void JBMostrarFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMostrarFechasActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, calendarioTorneo.mostrarSiguienteFecha(), "Jornadas",0);
        
    }//GEN-LAST:event_JBMostrarFechasActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(jFCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFCalendario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBMostrarFechas;
    private javax.swing.JButton jBJugar1Partido;
    private javax.swing.JButton jBJugarTodosPartidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAMostrarJornada;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
