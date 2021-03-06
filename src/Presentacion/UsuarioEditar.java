/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;
import Negocio.Usuario;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.ImageIcon;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsuarioEditar extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioEditar
     */
    public UsuarioEditar() {
        initComponents();
          //CENTRA LA PANTALLA
        setLocationRelativeTo(null);
        //NO PERMITE CAMBIAR EL TAMAÑO
        setResizable(false);
        //AGREGA EL TITULO
        setTitle("Editar artículo");
        CargarImagen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblCorreo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        chbActivo = new javax.swing.JCheckBox();
        lblIdUsuario = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        btnImagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnCancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCancelar.setText("Volver");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblCorreo.setText("Correo:");

        jLabel1.setText("Activo:");

        lblContraseña.setText("Contraseña:");

        lblUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblIdUsuario.setText("Codigo:");

        btnImagen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnImagen.setText("Imagen");
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblNombre)
                            .addComponent(lblCorreo)
                            .addComponent(jLabel1)
                            .addComponent(lblContraseña)
                            .addComponent(lblIdUsuario))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txtUsuario)
                            .addComponent(txtNombre)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(chbActivo, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txtIdUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdUsuario)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorreo)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(chbActivo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContraseña)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnGuardar)
                            .addComponent(btnImagen))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
      Cerrar();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       //CREA EL OBJETO
        Usuario u = new Usuario();
        //ASIGNA LOS ATRIBUTOS
        u.setActivo(chbActivo.isSelected());
        u.setContrasena(txtContraseña.getText());
        u.setCorreo(txtCorreo.getText());
        u.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
        u.setNombre(txtNombre.getText());
        u.setUsuario(txtUsuario.getText());
        //GUARDA EN LA BASE DE DATOS
        u.Editar();
        //CIERRA LA VENTANA
        Cerrar();
    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed
      //CREA CARGADOR DE ARCHIVO
        JFileChooser fc = new JFileChooser();
        //CONFIGURA TITULO
        fc.setDialogTitle("Seleccione una imagen");
        //AGREGA FILTRO DE EXTENSIONES
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagenes png","png");
        fc.setFileFilter(filter);
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                //TOMA EL ARCHIVO
                File archivo = new File(fc.getSelectedFile().toString());
                //INDICA LA RUTA ORIGEN
                String Origen = archivo.getPath();
                //INDICA LA RUTA DESTINO
                String Destino = System.getProperty("user.dir") + "\\Imagenes\\" + txtIdUsuario.getText() + ".png";
                Path PathOrigen = Paths.get(Origen);
                Path PathDestino = Paths.get(Destino);
                
                Files.copy(PathOrigen, PathDestino, REPLACE_EXISTING);
                
            } catch (Exception e) {
                String error = e.getMessage();
            }
        }
    }//GEN-LAST:event_btnImagenActionPerformed
    private void CargarImagen(){
        String ruta = System.getProperty("user.dir"+"\\Imagenes\\"+txtIdUsuario.getText()+".png");
        lblImagen.setIcon(new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT)));
        
    }
    
    private void Cerrar(){
       UsuarioListado obj = new UsuarioListado();
       obj.setVisible(true);
       dispose();
    }
    
    public void CargarDatos(){
        Usuario u = new Usuario();
        u.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
        u.Consulta();
        txtUsuario.setText(u.getUsuario());
        txtNombre.setText(u.getNombre());
        txtCorreo.setText(u.getCorreo());
        txtContraseña.setText(u.getContrasena());
        chbActivo.setSelected(u.isActivo());
        CargarImagen();
    }
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
            java.util.logging.Logger.getLogger(UsuarioEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImagen;
    public javax.swing.JCheckBox chbActivo;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lblContraseña;
    public javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblIdUsuario;
    private javax.swing.JLabel lblImagen;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblUsuario;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextField txtIdUsuario;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
