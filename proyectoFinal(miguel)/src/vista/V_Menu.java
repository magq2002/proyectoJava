/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import javax.swing.ImageIcon;
import vista.V_Estudiante;
import vista.V_LineaInvestigacion;
import vista.V_Modalidad;
import vista.V_Profesor;
import vista.V_Proyecto;

/**
 *
 * @author magq2
 */
public class V_Menu extends javax.swing.JFrame {

    /**
     * Creates new form V_Menu
     */
    public V_Menu() {
        initComponents();
        
         //FONDO 
        //instancio la imagen que esta guardada en el Packages
        Image fondoMenu = new ImageIcon(getClass().getResource("/imagenes/menu.jpg")).getImage();

        //le asigno un tamaño de la imagen 
        Image FondoMenu = fondoMenu.getScaledInstance(this.fondo.getWidth(), this.fondo.getHeight(), Image.SCALE_SMOOTH);//le asigno  los valores realaes de el  boton

        ImageIcon icono = new ImageIcon(FondoMenu);

        //asigno la imagen al  boton
        this.fondo.setIcon(icono);
        
         //ICONO1
        //instancio la imagen que esta guardada en el Packages
        Image profe = new ImageIcon(getClass().getResource("/iconos/CRUDprofesor.png")).getImage();

        //le asigno un tamaño de la imagen 
        Image Profe = profe.getScaledInstance(this.Profesor.getWidth(), this.Profesor.getHeight(), Image.SCALE_SMOOTH);//le asigno  los valores realaes de el  boton

        ImageIcon icono1 = new ImageIcon(Profe);

        //asigno la imagen al  boton
        this.Profesor.setIcon(icono1);
        
        //ICONO2
        //instancio la imagen que esta guardada en el Packages
        Image estud = new ImageIcon(getClass().getResource("/iconos/estudiante.png")).getImage();

        //le asigno un tamaño de la imagen 
        Image Estud = estud.getScaledInstance(this.estudiante.getWidth(), this.estudiante.getHeight(), Image.SCALE_SMOOTH);//le asigno  los valores realaes de el  boton

        ImageIcon icono2 = new ImageIcon(Estud);

        //asigno la imagen al  boton
        this.estudiante.setIcon(icono2);
        
        //ICONO3
        //instancio la imagen que esta guardada en el Packages
        Image vinEstud = new ImageIcon(getClass().getResource("/iconos/vicularEstudiante.png")).getImage();

        //le asigno un tamaño de la imagen 
        Image VinEstud = vinEstud.getScaledInstance(this.vincularEstudiante.getWidth(), this.vincularEstudiante.getHeight(), Image.SCALE_SMOOTH);//le asigno  los valores realaes de el  boton

        ImageIcon icono3 = new ImageIcon(VinEstud);

        //asigno la imagen al  boton
        this.vincularEstudiante.setIcon(icono3);
        
        //ICONO4
        //instancio la imagen que esta guardada en el Packages
        Image vinProfe = new ImageIcon(getClass().getResource("/iconos/vincularProfesor.png")).getImage();

        //le asigno un tamaño de la imagen 
        Image VinProfe = vinProfe.getScaledInstance(this.vincularProfesor.getWidth(), this.vincularProfesor.getHeight(), Image.SCALE_SMOOTH);//le asigno  los valores realaes de el  boton

        ImageIcon icono4 = new ImageIcon(VinProfe);

        //asigno la imagen al  boton
        this.vincularProfesor.setIcon(icono4);
        
         //ICONO5
        //instancio la imagen que esta guardada en el Packages
        Image modalidad = new ImageIcon(getClass().getResource("/iconos/modalidad.png")).getImage();

        //le asigno un tamaño de la imagen 
        Image Modalidad = modalidad.getScaledInstance(this.Modalidad.getWidth(), this.Modalidad.getHeight(), Image.SCALE_SMOOTH);//le asigno  los valores realaes de el  boton

        ImageIcon icono5 = new ImageIcon(Modalidad);

        //asigno la imagen al  boton
        this.Modalidad.setIcon(icono5);
        
         //ICONO6
        //instancio la imagen que esta guardada en el Packages
        Image linea = new ImageIcon(getClass().getResource("/iconos/linea.png")).getImage();

        //le asigno un tamaño de la imagen 
        Image Linea = linea.getScaledInstance(this.lineaInvestigacion.getWidth(), this.lineaInvestigacion.getHeight(), Image.SCALE_SMOOTH);//le asigno  los valores realaes de el  boton

        ImageIcon icono6 = new ImageIcon(Linea);

        //asigno la imagen al  boton
        this.lineaInvestigacion.setIcon(icono6);
        
        
          //ICONO7
        //instancio la imagen que esta guardada en el Packages
        Image reportes = new ImageIcon(getClass().getResource("/iconos/reportes.png")).getImage();

        //le asigno un tamaño de la imagen 
        Image Reportes = reportes.getScaledInstance(this.reportes.getWidth(), this.reportes.getHeight(), Image.SCALE_SMOOTH);//le asigno  los valores realaes de el  boton

        ImageIcon icono7 = new ImageIcon(Reportes);

        //asigno la imagen al  boton
        this.reportes.setIcon(icono7);
        
         //ICONO8
        //instancio la imagen que esta guardada en el Packages
        Image proyecto = new ImageIcon(getClass().getResource("/iconos/proyecto.png")).getImage();

        //le asigno un tamaño de la imagen 
        Image Proyecto = proyecto.getScaledInstance(this.Proyecto.getWidth(), this.Proyecto.getHeight(), Image.SCALE_SMOOTH);//le asigno  los valores realaes de el  boton

        ImageIcon icono8 = new ImageIcon(Proyecto);

        //asigno la imagen al  boton
        this.Proyecto.setIcon(icono8);
        
         //ICONO9
        //instancio la imagen que esta guardada en el Packages
        Image acta = new ImageIcon(getClass().getResource("/iconos/acta.png")).getImage();

        //le asigno un tamaño de la imagen 
        Image Acta = acta.getScaledInstance(this.Acta.getWidth(), this.Acta.getHeight(), Image.SCALE_SMOOTH);//le asigno  los valores realaes de el  boton

        ImageIcon icono9 = new ImageIcon(Acta);

        //asigno la imagen al  boton
        this.Acta.setIcon(icono9);
        
        //ICONO10
        //instancio la imagen que esta guardada en el Packages
        Image salir = new ImageIcon(getClass().getResource("/iconos/salir.png")).getImage();

        //le asigno un tamaño de la imagen 
        Image Salir = salir.getScaledInstance(this.Salir.getWidth(), this.Salir.getHeight(), Image.SCALE_SMOOTH);//le asigno  los valores realaes de el  boton

        ImageIcon icono10 = new ImageIcon(Salir);

        //asigno la imagen al  boton
        this.Salir.setIcon(icono10);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lineaInvestigacion = new javax.swing.JButton();
        Modalidad = new javax.swing.JButton();
        estudiante = new javax.swing.JButton();
        Profesor = new javax.swing.JButton();
        Proyecto = new javax.swing.JButton();
        vincularEstudiante = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Acta = new javax.swing.JButton();
        vincularProfesor = new javax.swing.JButton();
        reportes = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("MENU PRINCIPAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lineaInvestigacion.setBackground(new java.awt.Color(204, 255, 255));
        lineaInvestigacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineaInvestigacionActionPerformed(evt);
            }
        });
        getContentPane().add(lineaInvestigacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 70));

        Modalidad.setBackground(new java.awt.Color(204, 255, 255));
        Modalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModalidadActionPerformed(evt);
            }
        });
        getContentPane().add(Modalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 110, 70));

        estudiante.setBackground(new java.awt.Color(204, 255, 255));
        estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudianteActionPerformed(evt);
            }
        });
        getContentPane().add(estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 110, 70));

        Profesor.setBackground(new java.awt.Color(204, 255, 255));
        Profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesorActionPerformed(evt);
            }
        });
        getContentPane().add(Profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 70));

        Proyecto.setBackground(new java.awt.Color(204, 255, 255));
        Proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProyectoActionPerformed(evt);
            }
        });
        getContentPane().add(Proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, 70));

        vincularEstudiante.setBackground(new java.awt.Color(204, 255, 255));
        vincularEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vincularEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(vincularEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, 70));

        Salir.setBackground(new java.awt.Color(204, 255, 255));
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, 70));

        Acta.setBackground(new java.awt.Color(204, 255, 255));
        Acta.setText("Crear acta");
        Acta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActaActionPerformed(evt);
            }
        });
        getContentPane().add(Acta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 110, 70));

        vincularProfesor.setBackground(new java.awt.Color(204, 255, 255));
        vincularProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vincularProfesorActionPerformed(evt);
            }
        });
        getContentPane().add(vincularProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 110, 70));

        reportes.setBackground(new java.awt.Color(204, 255, 255));
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });
        getContentPane().add(reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, 70));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
     System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void vincularEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vincularEstudianteActionPerformed
    this.dispose();
    new V_VincularEstudiante().setVisible(true);
    }//GEN-LAST:event_vincularEstudianteActionPerformed

    private void ProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProyectoActionPerformed
      this.dispose();
      new V_Proyecto().setVisible(true);
    }//GEN-LAST:event_ProyectoActionPerformed

    private void ProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesorActionPerformed
        this.dispose();
        new V_Profesor().setVisible(true);
    }//GEN-LAST:event_ProfesorActionPerformed

    private void estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudianteActionPerformed
        this.dispose();
        new V_Estudiante().setVisible(true);
    }//GEN-LAST:event_estudianteActionPerformed

    private void ModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModalidadActionPerformed
        this.dispose();
        new V_Modalidad().setVisible(true);
    }//GEN-LAST:event_ModalidadActionPerformed

    private void lineaInvestigacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineaInvestigacionActionPerformed
        this.dispose();
        new V_LineaInvestigacion().setVisible(true);
    }//GEN-LAST:event_lineaInvestigacionActionPerformed

    private void ActaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActaActionPerformed
     V_Acta acta=new V_Acta();
  acta.setVisible(true);
  dispose();
    }//GEN-LAST:event_ActaActionPerformed

    private void vincularProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vincularProfesorActionPerformed
      V_VincularProfesor vProfesor=new   V_VincularProfesor();
      vProfesor.setVisible(true);
      dispose();
    }//GEN-LAST:event_vincularProfesorActionPerformed

    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
      V_Reportes reportes=new V_Reportes();
      reportes.setVisible(true);
      dispose();
    }//GEN-LAST:event_reportesActionPerformed

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
            java.util.logging.Logger.getLogger(V_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acta;
    private javax.swing.JButton Modalidad;
    private javax.swing.JButton Profesor;
    private javax.swing.JButton Proyecto;
    private javax.swing.JButton Salir;
    private javax.swing.JButton estudiante;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lineaInvestigacion;
    private javax.swing.JButton reportes;
    private javax.swing.JButton vincularEstudiante;
    private javax.swing.JButton vincularProfesor;
    // End of variables declaration//GEN-END:variables
}
