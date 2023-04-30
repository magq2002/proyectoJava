/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorActa;
import controlador.ControladorProyecto;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Acta;

/**
 *
 * @author mario
 */
public class V_Acta extends javax.swing.JFrame {

    ControladorActa controlActa = new ControladorActa();
    ControladorProyecto controlProyecto = new ControladorProyecto();

    /**
     * Creates new form V_Acta
     */
    public V_Acta() {
        initComponents();
        
        //FONDOS
        //instancio la imagen que esta guardada en el Packages
        Image fondoProfe = new ImageIcon(getClass().getResource("/imagenes/acta.jpg")).getImage();

        //le asigno un tamaño de la imagen 
        Image FondoProfe = fondoProfe.getScaledInstance(this.fondo.getWidth(), this.fondo.getHeight(), Image.SCALE_SMOOTH);//le asigno  los valores realaes de el  boton

        ImageIcon icono = new ImageIcon(FondoProfe);

        //asigno la imagen al  boton
        this.fondo.setIcon(icono);
        
        
        this.codigoActa.setText("" + controlActa.generarId());
        listaActas.setText(controlProyecto.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codigoActa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        años = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observaciones = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaActas = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        codigoProyecto = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear acta");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("CREAR ACTA DE INICIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Codigo  del  acta :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        codigoActa.setEditable(false);
        getContentPane().add(codigoActa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Fecha de creacion (*)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mesKeyTyped(evt);
            }
        });
        getContentPane().add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 30, 30));

        años.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                añosKeyTyped(evt);
            }
        });
        getContentPane().add(años, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 90, 30));

        dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                diaKeyTyped(evt);
            }
        });
        getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 30, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("mes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("año:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("dia");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        observaciones.setColumns(20);
        observaciones.setRows(5);
        jScrollPane1.setViewportView(observaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("Observaciones:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 20));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setText("Lista de proyectos registrados ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        listaActas.setColumns(20);
        listaActas.setRows(5);
        jScrollPane2.setViewportView(listaActas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setText("Agregar codigo  de proyecto:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        codigoProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoProyectoKeyTyped(evt);
            }
        });
        getContentPane().add(codigoProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 220, 30));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        Acta nuevo = new Acta();
        try {
            if (!(this.codigoActa.getText().equals("")
                    || this.dia.getText().equals("")
                    || this.mes.getText().equals("")
                    || this.años.getText().equals("")
                    || this.observaciones.getText().equals("")
                    || this.codigoProyecto.getText().equals(""))) {

                nuevo.setCodigoActa(Long.parseLong(this.codigoActa.getText()));
                nuevo.setFecha(LocalDate.of(Integer.parseInt(this.años.getText()), Integer.parseInt(this.mes.getText()), Integer.parseInt(this.dia.getText())));
                nuevo.setObservaciones(this.observaciones.getText());
                nuevo.setCodigoProyecto(Long.parseLong(this.codigoProyecto.getText()));

                if (controlActa.createActa(nuevo)) {
                    JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                    this.codigoActa.setText("");
                    this.dia.setText("");
                    this.mes.setText("");
                    this.años.setText("");
                    this.observaciones.setText("");
                    this.codigoProyecto.setText("");

                } else {
                    JOptionPane.showMessageDialog(this, "NO SE PUDIERON GUARDAR LOS DATOS", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } else {
                JOptionPane.showMessageDialog(this, "PORFAVOR DIGITE TODOS LOS CAMPOS ", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR FECHA MAL  DIGITADA \n" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        this.codigoActa.setText("" + controlActa.generarId());

    }//GEN-LAST:event_guardarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        V_Menu menu = new V_Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void diaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_diaKeyTyped

    private void mesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_mesKeyTyped

    private void añosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_añosKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_añosKeyTyped

    private void codigoProyectoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoProyectoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_codigoProyectoKeyTyped

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
            java.util.logging.Logger.getLogger(V_Acta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Acta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Acta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Acta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Acta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField años;
    private javax.swing.JTextField codigoActa;
    private javax.swing.JTextField codigoProyecto;
    private javax.swing.JTextField dia;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea listaActas;
    private javax.swing.JTextField mes;
    private javax.swing.JTextArea observaciones;
    // End of variables declaration//GEN-END:variables
}
