/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControllerCitas;
import controlador.ControllerCitasDueño;
import controlador.ControllerCitasFecha;
import controlador.ControllerUsuarios;
import controlador.ControllerVeterinarios;
import controlador.ControllerDueños;
import controlador.ControllerMascotas;
import helpers.Helpers;
import javax.swing.JOptionPane;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class frmVentanaPrincipal extends javax.swing.JFrame {

    Helpers helpers = new Helpers();

    public void permisoUsuario(String tipoUsuario) {
        if ("ADMINISTRADOR".equals(tipoUsuario)) {
            btnRegistroCitas.setVisible(false);
        } else if ("ASISTENTE".equals(tipoUsuario)) {
            btnUsuarios.setVisible(false);
            btnVeterinarios.setVisible(false);
        }
    }

    /**
     * Creates new form frmVentaPrincipal
     */
    public frmVentanaPrincipal(String idUsuario, String nombreUsuario, String tipoUsuario, String fecha) {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("SISTEMA MASCOTAS");
        lblIdUsuario.setText(idUsuario);
        lblNombreUsuario.setText(nombreUsuario);
        lblTipoUsuario.setText(tipoUsuario);
        lblFecha.setText(fecha);
        permisoUsuario(tipoUsuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        lblIdUsuario = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblTipoUsuario = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenuItem();
        btnDueños = new javax.swing.JMenu();
        btnUsuarios = new javax.swing.JMenuItem();
        btnVeterinarios = new javax.swing.JMenuItem();
        btnMascota = new javax.swing.JMenuItem();
        btnDueño = new javax.swing.JMenuItem();
        menuGestionProcesos = new javax.swing.JMenu();
        btnRegistroCitas = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        CitasFecha = new javax.swing.JMenuItem();
        btnCitasDueño = new javax.swing.JMenuItem();
        menuAcercaDe = new javax.swing.JMenu();
        btnManual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setForeground(new java.awt.Color(0, 102, 102));

        lblIdUsuario.setText("ID de Usuario");

        lblNombreUsuario.setText("Nombre de Usuario");

        lblTipoUsuario.setText("Tipo de Usuario");

        lblFecha.setText("Fecha");

        desktopPane.setLayer(lblIdUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(lblNombreUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(lblTipoUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(lblFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha)
                    .addComponent(lblTipoUsuario)
                    .addComponent(lblNombreUsuario)
                    .addComponent(lblIdUsuario))
                .addContainerGap(745, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblIdUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreUsuario)
                .addGap(18, 18, 18)
                .addComponent(lblTipoUsuario)
                .addGap(18, 18, 18)
                .addComponent(lblFecha)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        menuArchivo.setText("Archivo");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(btnSalir);

        menuBar.add(menuArchivo);

        btnDueños.setText("Catalogo de Datos");
        btnDueños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDueñosActionPerformed(evt);
            }
        });

        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        btnDueños.add(btnUsuarios);

        btnVeterinarios.setText("Veterinarios");
        btnVeterinarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeterinariosActionPerformed(evt);
            }
        });
        btnDueños.add(btnVeterinarios);

        btnMascota.setText("Mascotas");
        btnMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotaActionPerformed(evt);
            }
        });
        btnDueños.add(btnMascota);

        btnDueño.setText("Dueños");
        btnDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDueñoActionPerformed(evt);
            }
        });
        btnDueños.add(btnDueño);

        menuBar.add(btnDueños);

        menuGestionProcesos.setText("Gestión de procesos");

        btnRegistroCitas.setText("Registro de citas");
        btnRegistroCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroCitasActionPerformed(evt);
            }
        });
        menuGestionProcesos.add(btnRegistroCitas);

        menuBar.add(menuGestionProcesos);

        menuReportes.setText("Reportes");

        CitasFecha.setText("Citas por fecha");
        CitasFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitasFechaActionPerformed(evt);
            }
        });
        menuReportes.add(CitasFecha);

        btnCitasDueño.setText("Citas por dueño");
        btnCitasDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasDueñoActionPerformed(evt);
            }
        });
        menuReportes.add(btnCitasDueño);

        menuBar.add(menuReportes);

        menuAcercaDe.setText("Acerca de.");
        menuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAcercaDeActionPerformed(evt);
            }
        });

        btnManual.setText("Descargar manual");
        btnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManualActionPerformed(evt);
            }
        });
        menuAcercaDe.add(btnManual);

        menuBar.add(menuAcercaDe);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(desktopPane,"¡Que tenga un buen día!");
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVeterinariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeterinariosActionPerformed
        // TODO add your handling code here:
        frmVeterinarios frm = new frmVeterinarios();
        desktopPane.add(frm);
        ControllerVeterinarios con = new ControllerVeterinarios(frm);
        con.iniciar();
        frm.toFront();
        frm.setLocation(desktopPane.getWidth() / 2 - frm.getWidth() / 2, desktopPane.getHeight() / 2 - frm.getHeight() / 2);
        frm.setVisible(true);
    }//GEN-LAST:event_btnVeterinariosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        frmUsuarios frm = new frmUsuarios();
        desktopPane.add(frm);
        ControllerUsuarios con = new ControllerUsuarios(frm);
        con.iniciar();
        frm.toFront();
        frm.setLocation(desktopPane.getWidth() / 2 - frm.getWidth() / 2, desktopPane.getHeight() / 2 - frm.getHeight() / 2);
        frm.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotaActionPerformed
        // TODO add your handling code here:
        frmMascotas frm = new frmMascotas();
        desktopPane.add(frm);
        ControllerMascotas con= new ControllerMascotas(frm);
        con.iniciar();
        frm.toFront();
        frm.setLocation(desktopPane.getWidth() / 2 - frm.getWidth() / 2, desktopPane.getHeight() / 2 - frm.getHeight() / 2);
        frm.setVisible(true);
    }//GEN-LAST:event_btnMascotaActionPerformed

    private void btnRegistroCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroCitasActionPerformed
        // TODO add your handling code here:
        frmCitas frm = new frmCitas();
        desktopPane.add(frm);
        ControllerCitas con = new ControllerCitas(frm);
        con.iniciar();
        frm.toFront();
        frm.setLocation(desktopPane.getWidth() / 2 - frm.getWidth() / 2, desktopPane.getHeight() / 2 - frm.getHeight() / 2);
        frm.setVisible(true);

    }//GEN-LAST:event_btnRegistroCitasActionPerformed

    private void btnDueñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDueñosActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnDueñosActionPerformed

    private void btnDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDueñoActionPerformed
        // TODO add your handling code here:
        frmDueños frm = new frmDueños();
        desktopPane.add(frm);
        ControllerDueños con = new ControllerDueños(frm);
        con.iniciar();
        frm.toFront();
        frm.setLocation(desktopPane.getWidth() / 2 - frm.getWidth() / 2, desktopPane.getHeight() / 2 - frm.getHeight() / 2);
        frm.setVisible(true);
    }//GEN-LAST:event_btnDueñoActionPerformed

    private void menuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAcercaDeActionPerformed
        // TODO add your handling code here:
                           
    }//GEN-LAST:event_menuAcercaDeActionPerformed

    private void CitasFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitasFechaActionPerformed
        // TODO add your handling code here:
        frmCitasFecha frm = new frmCitasFecha();
        desktopPane.add(frm);
        ControllerCitasFecha con = new ControllerCitasFecha(frm);
        con.iniciar();
        frm.toFront();
        frm.setLocation(desktopPane.getWidth() / 2 - frm.getWidth() / 2, desktopPane.getHeight() / 2 - frm.getHeight() / 2);
        frm.setVisible(true);
    }//GEN-LAST:event_CitasFechaActionPerformed

    private void btnCitasDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasDueñoActionPerformed
        // TODO add your handling code here:
        frmCitasDueño frm = new frmCitasDueño();
        desktopPane.add(frm);
        ControllerCitasDueño con = new ControllerCitasDueño(frm);
        con.iniciar();
        frm.toFront();
        frm.setLocation(desktopPane.getWidth() / 2 - frm.getWidth() / 2, desktopPane.getHeight() / 2 - frm.getHeight() / 2);
        frm.setVisible(true);
    }//GEN-LAST:event_btnCitasDueñoActionPerformed

    private void btnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManualActionPerformed
        // TODO add your handling code here:
         helpers.abrir(); 
    }//GEN-LAST:event_btnManualActionPerformed

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
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentanaPrincipal(lblIdUsuario.getText(),lblNombreUsuario.getText(),lblTipoUsuario.getText(),lblFecha.getText()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CitasFecha;
    private javax.swing.JMenuItem btnCitasDueño;
    private javax.swing.JMenuItem btnDueño;
    private javax.swing.JMenu btnDueños;
    private javax.swing.JMenuItem btnManual;
    private javax.swing.JMenuItem btnMascota;
    private javax.swing.JMenuItem btnRegistroCitas;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuItem btnUsuarios;
    private javax.swing.JMenuItem btnVeterinarios;
    public javax.swing.JDesktopPane desktopPane;
    public static javax.swing.JLabel lblFecha;
    public static javax.swing.JLabel lblIdUsuario;
    public static javax.swing.JLabel lblNombreUsuario;
    public static javax.swing.JLabel lblTipoUsuario;
    private javax.swing.JMenu menuAcercaDe;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuGestionProcesos;
    private javax.swing.JMenu menuReportes;
    // End of variables declaration//GEN-END:variables
}
