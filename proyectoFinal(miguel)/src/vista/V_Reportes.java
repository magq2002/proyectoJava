/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorActa;
import controlador.ControladorInformacion;
import controlador.ControladorPersona;
import controlador.ControladorProyecto;
import java.awt.Image;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import modelo.Persona;

/**
 *
 * @author magq2
 */
public class V_Reportes extends javax.swing.JFrame {
    ControladorPersona controlPersona= new ControladorPersona();
    ControladorProyecto controlProyecto= new ControladorProyecto();
    ControladorInformacion controlInfo= new ControladorInformacion();
    ControladorActa controlActa=new ControladorActa();

    /**
     * Creates new form V_Reportes
     */
    public V_Reportes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        reporte1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rep1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();
        reporte2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rep2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        reporte3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        rep3 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        fondo3 = new javax.swing.JLabel();
        reporte4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        rep4 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        fondo4 = new javax.swing.JLabel();
        reporte5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        rep5 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        fondo5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reportes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        reporte1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rep1.setColumns(20);
        rep1.setRows(5);
        jScrollPane2.setViewportView(rep1);

        reporte1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 98, 410, 436));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText(" profesores mayores a 35 años ");
        reporte1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, 27));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("y que su primer  apellido no empiece con la letra 'w' o 'z'.");
        reporte1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));
        reporte1.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 550));

        jTabbedPane1.addTab("reporte1", reporte1);

        reporte2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rep2.setColumns(20);
        rep2.setRows(5);
        jScrollPane3.setViewportView(rep2);

        reporte2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 78, 390, 458));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Un listado con los nombres y las notas ");
        reporte2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 24, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("de los proyectos con notas menores a 3.");
        reporte2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 45, -1, -1));
        reporte2.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 550));

        jTabbedPane1.addTab("reporte2", reporte2);

        reporte3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rep3.setColumns(20);
        rep3.setRows(5);
        jScrollPane4.setViewportView(rep3);

        reporte3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 75, 400, 458));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("diferentes modalidades para proyectos de investigación.");
        reporte3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));
        reporte3.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 550));

        jTabbedPane1.addTab("reporte3", reporte3);

        reporte4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rep4.setColumns(20);
        rep4.setRows(5);
        jScrollPane5.setViewportView(rep4);

        reporte4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 76, 400, 458));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("Listado de todas las actas creadas por orden de fecha.");
        reporte4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        reporte4.add(fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 550));

        jTabbedPane1.addTab("reporte4", reporte4);

        reporte5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rep5.setColumns(20);
        rep5.setRows(5);
        jScrollPane6.setViewportView(rep5);

        reporte5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 76, 400, 458));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("Listado  de proyectos registrados.");
        reporte5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 32, -1, -1));
        reporte5.add(fondo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 550));

        jTabbedPane1.addTab("reporte5", reporte5);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Reportes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
  rep1.setText(controlPersona.ReporteP1());
  rep2.setText(controlProyecto.reporteN3());
  rep3.setText(controlInfo.reporteModalidades());
  rep4.setText(controlActa.OrdenarActasFecha());
  rep5.setText(controlProyecto.reportes());
  
    //FONDOS
        //instancio la imagen que esta guardada en el Packages
        Image fondoRepor = new ImageIcon(getClass().getResource("/imagenes/reportes.jpg")).getImage();

        //le asigno un tamaño de la imagen 
        Image FondoRepor = fondoRepor.getScaledInstance(this.fondo1.getWidth(), this.fondo1.getHeight(), Image.SCALE_SMOOTH);//le asigno  los valores realaes de el  boton

        ImageIcon icono = new ImageIcon(FondoRepor);

        //asigno la imagen al  boton
        this.fondo1.setIcon(icono);
        this.fondo2.setIcon(icono);
        this.fondo3.setIcon(icono);
        this.fondo4.setIcon(icono);
        this.fondo5.setIcon(icono);
  
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        V_Menu menu = new V_Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(V_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondo3;
    private javax.swing.JLabel fondo4;
    private javax.swing.JLabel fondo5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea rep1;
    private javax.swing.JTextArea rep2;
    private javax.swing.JTextArea rep3;
    private javax.swing.JTextArea rep4;
    private javax.swing.JTextArea rep5;
    private javax.swing.JPanel reporte1;
    private javax.swing.JPanel reporte2;
    private javax.swing.JPanel reporte3;
    private javax.swing.JPanel reporte4;
    private javax.swing.JPanel reporte5;
    // End of variables declaration//GEN-END:variables
}