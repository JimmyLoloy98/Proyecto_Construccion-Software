/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz_Grafica;

import Metodos.MetodosDepartamento;
import Metodos.MetodosDoctor;
import Metodos.MetodosEst_Doctorado;
import Metodos.MetodosEst_Grado;
import Metodos.MetodosEstudiante;
import Metodos.MetodosPAS;
import Metodos.MetodosPDI;
import Metodos.MetodosTrabajador;
import Metodos.MetodosUniversidad;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUMNO - FIIS
 */
public class VentanaIngresoUniversidad extends javax.swing.JFrame {
    //Ventanas
    VentanaPrincipal vtnPrincipal = new VentanaPrincipal();
    
    //Metodos
    MetodosUniversidad metUni = new MetodosUniversidad();
    MetodosDepartamento metDep = new MetodosDepartamento();
    MetodosEstudiante metEst = new MetodosEstudiante();
    MetodosPDI metPDI = new MetodosPDI();
    MetodosPAS metPAS = new MetodosPAS();
    MetodosTrabajador metTrab = new MetodosTrabajador();
    MetodosDoctor metDoc = new MetodosDoctor();
    MetodosEst_Doctorado metEst_Doc = new MetodosEst_Doctorado();
    MetodosEst_Grado metEst_Grad = new MetodosEst_Grado();
    
    public VentanaIngresoUniversidad() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDepartamento = new javax.swing.JButton();
        btnEstudiante = new javax.swing.JButton();
        btnTrabajador = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxOpciones = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtS = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDepartamento.setText("DEPARTAMENTOS");
        btnDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartamentoActionPerformed(evt);
            }
        });

        btnEstudiante.setText("ESTUDIANTES");
        btnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudianteActionPerformed(evt);
            }
        });

        btnTrabajador.setText("TRABAJADORES");
        btnTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajadorActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("AGREGAR");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Opciones -->");

        cbxOpciones.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbxOpciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Listar Departamentos", "Listar Estudiantes Grado", "Listar Estudiantes Doctorado", "Listar Trabajadores PDI", "Listar Trabajadores PAS" }));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtS.setColumns(20);
        txtS.setRows(5);
        jScrollPane2.setViewportView(txtS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbxOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(btnEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(75, 75, 75))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cbxOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnDepartamento)
                        .addGap(18, 18, 18)
                        .addComponent(btnEstudiante)
                        .addGap(18, 18, 18)
                        .addComponent(btnTrabajador)
                        .addGap(0, 96, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartamentoActionPerformed
        VentanaAgregarDepartamento vtnDepartamento = new VentanaAgregarDepartamento();
        vtnDepartamento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDepartamentoActionPerformed

    private void btnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudianteActionPerformed
        VentanaAgregarEstudiante vtnEstudiante = new VentanaAgregarEstudiante();
        vtnEstudiante.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEstudianteActionPerformed

    private void btnTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajadorActionPerformed
        VentanaAgregarTrabajador vtnTrabajador = new VentanaAgregarTrabajador();
        vtnTrabajador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTrabajadorActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        vtnPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Opcion = cbxOpciones.getSelectedItem().toString();
        if(Opcion.equals("Listar Departamentos")) {
            ListarDepartamentos();
        }else if(Opcion.equals("Listar Estudiantes Grado")) {
            ListarEstudiantesGrado();
        }else if(Opcion.equals("Listar Estudiantes Doctorado")) {
            ListarEstudiantesDoctorado();
        }else if(Opcion.equals("Listar Trabajadores PDI")) {
            ListarTrabajadoresPDI();
        }else if(Opcion.equals("Listar Trabajadores PAS")) {
            ListarTrabajadoresPAS();
        }else {
            txtS.setText("");
            JOptionPane.showMessageDialog(null, "Selecione una opcion a mostrar");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    //======================================================================
    public void ListarDepartamentos() {
        txtS.setText("===== DEPARTAMENTOS =====\n");
        for(int i = 0 ; i < metDep.Tamanio() ; i++) {
            txtS.append("Departamento " + (i+1) + ":\n");
            txtS.append("Nombre --> " + metDep.Obtener(i).getNombre() + "\n");
        }
    }
    public void ListarEstudiantesGrado() {
        txtS.setText("===== ESTUDIANTES DE GRADO=====\n");
        txtS.append("Codigo\tNombre\tTitulacion\n");
        for(int i = 0 ; i < metEst_Grad.Tamanio() ; i++) {
            txtS.append(metEst_Grad.Obtener(i).getCodigo()+"\t"+metEst_Grad.Obtener(i).getNombre()+"\t"+metEst_Grad.Obtener(i).getTitulacion()+"\n");
        }
    }
    public void ListarEstudiantesDoctorado() {
        txtS.setText("===== ESTUDIANTES DOCTORADO=====\n");
        txtS.append("Codigo\tNombre\tPrograma\n");
        for(int i = 0 ; i < metEst_Doc.Tamanio() ; i++) {
            txtS.append(metEst.Obtener(i).getCodigo()+"\t"+metEst.Obtener(i).getNombre()+"\t"+metEst_Doc.Obtener(i).getPrograma()+"\n");
        }
    }
    public void ListarTrabajadoresPDI() {
        txtS.setText("===== TRABAJADORES PDI =====\n");
        for(int i = 0 ; i < metPDI.Tamanio() ; i++) {
            txtS.append("Trabajador " + (i+1) + ":\n");
            if(metPDI.Obtener(i).getTrabajadores() != null) {
                txtS.append("\nCodigo --> " + metPDI.Obtener(i).getTrabajadores().getCodigo());
                txtS.append("Nombre --> " + metPDI.Obtener(i).getTrabajadores().getNombre());
                txtS.append("Categoria --> " + metPDI.Obtener(i).getCategoria());
                txtS.append("Fecha Inicio --> " + metPDI.Obtener(i).getTrabajadores().getFecha_inicio());
                txtS.append("Doctor -->" + " NO\n");
            }
            if(metPDI.Obtener(i).getDoctores() != null) {
                txtS.append("\nCodigo --> " + metPDI.Obtener(i).getDoctores().getCodigo());
                txtS.append("Nombre --> " + metPDI.Obtener(i).getDoctores().getNombre());
                txtS.append("Categoria --> " + metPDI.Obtener(i).getCategoria());
                txtS.append("Fecha Inicio --> " + metPDI.Obtener(i).getDoctores().getFecha_inicio());
                txtS.append("Doctor -->" + " SI\n");
            }
        }
    }
    public void ListarTrabajadoresPAS() {
        txtS.setText("===== TRABAJADORES PAS =====\n");
        for(int i = 0 ; i < metPAS.Tamanio() ; i++) {
            txtS.append("\nTrabajador " + (i+1) + ":\n");
            txtS.append("Codigo --> " + metPAS.Obtener(i).getTrabajadores().getCodigo());
            txtS.append("Nombre --> " + metPAS.Obtener(i).getTrabajadores().getNombre());
            txtS.append("Puesto --> " + metPAS.Obtener(i).getPuesto());
            txtS.append("Fecha Inicio --> " + metPAS.Obtener(i).getTrabajadores().getFecha_inicio() + "\n");
        }
    }
    
    //======================================================================
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
            java.util.logging.Logger.getLogger(VentanaIngresoUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoUniversidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIngresoUniversidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepartamento;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTrabajador;
    private javax.swing.JComboBox<String> cbxOpciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtS;
    // End of variables declaration//GEN-END:variables
}
