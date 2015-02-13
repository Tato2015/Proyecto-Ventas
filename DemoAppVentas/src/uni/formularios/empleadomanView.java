package uni.formularios;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uni.controller.EmpleadoBLL;
import uni.dao.EmpleadoDAO;
import uni.entity.EmpleadoDTO;
import uni.entity.ProductoDTO;


public class empleadomanView extends javax.swing.JInternalFrame {

    EmpleadoDAO empleadoDAO=new EmpleadoDAO();
    
    public empleadomanView() {
        initComponents();
        listaEmpleados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();

        setTitle("MANTENIMIENTO DE EMPLEADO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado"));

        jLabel1.setText("Id Empleado");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Email");

        jLabel5.setText("Usuario");

        jLabel6.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(txtApellido)
                            .addComponent(txtEmail)
                            .addComponent(txtUsuario)
                            .addComponent(txtIdEmpleado))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Email"
            }
        ));
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);
        if (tblEmpleado.getColumnModel().getColumnCount() > 0) {
            tblEmpleado.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblEmpleado.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblEmpleado.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                        .addComponent(btnCerrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCerrar)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
     this.dispose();
 }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
    procesar(1);    
    listaEmpleados();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    procesar(2);  
    listaEmpleados();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this, "¿ Desea eliminar a "+txtNombre.getText()+" "+txtApellido.getText()+"?", "Seleccione una opción", JOptionPane.YES_NO_OPTION);
    if(opcion == 0){
    procesar(3);  
    listaEmpleados();
    }else{
    JOptionPane.showMessageDialog(rootPane,"No se ha eliminado ningún empleado");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    mostarDatos(); 
    listaEmpleados();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
        
        if (evt.getClickCount() >= 1) {
           // inhabilitar();
            int fila = tblEmpleado.getSelectedRow();
            if (fila >= 0) {
                Object tmpIdEmpleado = tblEmpleado.getValueAt(fila, 0);
                if (tmpIdEmpleado != null) {
                    try {
                        String idEmpleado = String.valueOf(tmpIdEmpleado.toString());
                        EmpleadoDTO empleado = empleadoDAO.find(idEmpleado);
                        if (empleado != null) {
                            try {                                
                                //System.out.println(empleado);
                                txtIdEmpleado.setText(empleado.getIdempleado());
                                txtNombre.setText(empleado.getNombre());
                                txtApellido.setText(empleado.getApellidos());
                                txtEmail.setText(empleado.getEmail());
                                txtUsuario.setText(empleado.getUsuario());
                                txtPassword.setText(empleado.getClave());
                            } catch (Exception e) {
                                System.err.println("Error al buscar empleado");
                            }
                        } else {
                            System.out.println("Empleado no existe con el Código especificado");
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(empleadomanView.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

        }
        
        
        
        
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    EmpleadoBLL obj = new EmpleadoBLL();
    EmpleadoDTO em = null;
            
    private void procesar(int i) {
   
        try {
            em = new EmpleadoDTO();
            em.setIdempleado(txtIdEmpleado.getText());
            em.setNombre(txtNombre.getText());
            em.setApellidos(txtApellido.getText());
            em.setEmail(txtEmail.getText());
            em.setUsuario(txtUsuario.getText());
            em.setClave(txtPassword.getText());// cuando sale tachado significa que es obsoleto y se puede usar otro metodo
            
            switch(i){
                case 1:obj.EmpleadoAdicionar(em);break;
                case 2:obj.EmpleadoActualizar(em);break;
                case 3:obj.EmpleadoEliminar(em);break;
            }
            JOptionPane.showMessageDialog(this,"Tabla de empleado actualizado");
        } catch (Exception ex) {
            Logger.getLogger(empleadomanView.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

      private void listaEmpleados() {
        List<EmpleadoDTO> empleados;
        try {
            empleados = obj.EmpleadosTodo();            
            verEmpleados(empleados);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
    
    
    private void verEmpleados(List<EmpleadoDTO> empleados) {
    DefaultTableModel model = (DefaultTableModel) tblEmpleado.getModel();
        model.setRowCount(0);
        for (EmpleadoDTO e : empleados) {
            Object[] fila = {e.getIdempleado(), e.getNombre(), e.getApellidos(),
                e.getEmail()};
            model.addRow(fila);
        }  
    }

    private void mostarDatos() {
     try {
            em = obj.EmpleadoBuscar(txtIdEmpleado.getText());
            if (em!=null) {
                txtIdEmpleado.setText(em.getIdempleado());
                txtNombre.setText(em.getNombre());
                txtApellido.setText(em.getApellidos());
                txtEmail.setText(em.getEmail());
                txtUsuario.setText(em.getUsuario());
                txtPassword.setText(em.getClave());                
            }else{
                JOptionPane.showMessageDialog(null,"Producto no existe ...");
            }
        } catch (Exception ex) {
            Logger.getLogger(productomanview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
