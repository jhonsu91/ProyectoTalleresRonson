/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.controlador.Validar;
import ec.edu.ister.modelo.Conexion;
import ec.edu.ister.modelo.Pieza;
import ec.edu.ister.modelo.Piezas;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author suntaxi-chasipanta
 */
public final class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    Validar valida = new Validar();

    public Interfaz() {
        initComponents();
        getTabla("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        btnSeleccionar = new javax.swing.JMenuItem();
        btnEliminar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnAactualzar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        btnSeleccionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSeleccionar.setText("SELECCIONAR INFORMACION");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(btnSeleccionar);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(btnEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Talleres Ronson");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tabla.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1000, 120));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Color");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        txtColor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });
        getContentPane().add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 160, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 70, 50, -1));

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 160, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modelo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 100, 50, -1));

        txtCosto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Costo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 160, 40, -1));

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 160, -1));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 190, 60, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Descripción");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 80, -1));

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 160, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Código");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 110, -1));

        btnAactualzar.setText("Actualizar");
        btnAactualzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAactualzarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAactualzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 110, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 110, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, 90, -1));

        btnIngresar.setText("Agregar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 110, -1));

        jButton6.setText("jButton1");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 160, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ister/fotos/fondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Piezas piezas = new Piezas();
    Pieza pieza = new Pieza();
    Conexion conexion = new Conexion();
    Connection connection = conexion.getConexion();
    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        seleccionarValor();
    }//GEN-LAST:event_btnSeleccionarActionPerformed
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        setGrabar();
    }//GEN-LAST:event_btnIngresarActionPerformed
    private void btnAactualzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAactualzarActionPerformed
        getTabla("");
    }//GEN-LAST:event_btnAactualzarActionPerformed
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        setLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        setModificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        getTabla(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        valida.numeros(evt);
    }//GEN-LAST:event_txtCodigoKeyTyped
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        valida.letras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped
    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        valida.letras(evt);
    }//GEN-LAST:event_txtColorKeyTyped
    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        valida.precio(evt);
    }//GEN-LAST:event_txtCostoKeyTyped
    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        valida.numeros(evt);
    }//GEN-LAST:event_txtCantidadKeyTyped
    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        valida.numeros(evt);
    }//GEN-LAST:event_txtBuscarKeyTyped
    boolean setGrabar() {
        try {
            pieza.setCodigoPieza(txtCodigo.getText());
            pieza.setNombrePieza(txtNombre.getText());
            pieza.setModeloPieza(txtModelo.getText());
            pieza.setColorPieza(txtColor.getText());
            pieza.setCostoPieza(Double.parseDouble(txtCosto.getText()));
            pieza.setCantidadPieza(Integer.parseInt(txtCantidad.getText()));
            pieza.setDescripcionPieza(txtDescripcion.getText());

            if (piezas.existe(txtCodigo.getText()) != 1) {
                piezas.registrarPieza(pieza);
                JOptionPane.showMessageDialog(null, "Registro Grabado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Código ya existente");
            }

            getTabla("");
            setLimpiar();
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de grabado..");
            getTabla("");
            setLimpiar();
            e.getMessage();
            return false;
        }

    }

    boolean setValidarCamposEnBlanco() {
        if (txtCantidad.getText().equals("") || txtCodigo.getText().equals("") || txtColor.getText().equals("") || txtCosto.getText().equals("") || txtDescripcion.getText().equals("") || txtModelo.getText().equals("") || txtNombre.getText().equals("")) {
            return true;
        } else {
            return false;
        }
    }

    void getTabla(String indice) {
        txtBuscar.setText("");
        DefaultTableModel obDefaultTabelModel = new DefaultTableModel();
        String busquedaMysql = "";

        obDefaultTabelModel.addColumn("CÓDIGO");
        obDefaultTabelModel.addColumn("NOMBRE");
        obDefaultTabelModel.addColumn("MODELO");
        obDefaultTabelModel.addColumn("COLOR");
        obDefaultTabelModel.addColumn("COSTO");
        obDefaultTabelModel.addColumn("CANTIDAD");
        obDefaultTabelModel.addColumn("DESCRIPCION");

        tabla.setModel(obDefaultTabelModel);

        if (indice.equals("")) {
            busquedaMysql = "SELECT * FROM piezas;";
        } else {
            busquedaMysql = "SELECT * FROM piezas WHERE codigoPieza='" + indice + "';";
        }
        String[] campoTabla = new String[7];

        try {
            Statement obStatement = connection.createStatement();
            ResultSet resultSet = obStatement.executeQuery(busquedaMysql);

            while (resultSet.next()) {
                campoTabla[0] = resultSet.getString(1);
                campoTabla[1] = resultSet.getString(2);
                campoTabla[2] = resultSet.getString(3);
                campoTabla[3] = resultSet.getString(4);
                campoTabla[4] = resultSet.getString(5);
                campoTabla[5] = resultSet.getString(6);
                campoTabla[6] = resultSet.getString(7);
                obDefaultTabelModel.addRow(campoTabla);
            }
            tabla.setModel(obDefaultTabelModel);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    boolean getSeleccionar() {
        int fila = tabla.getSelectedRow();
        try {
            if (fila >= 0) {
                txtCodigo.setText(tabla.getValueAt(fila, 0).toString());
                txtNombre.setText(tabla.getValueAt(fila, 1).toString());
                txtModelo.setText(tabla.getValueAt(fila, 2).toString());
                txtColor.setText(tabla.getValueAt(fila, 3).toString());
                txtCosto.setText(tabla.getValueAt(fila, 4).toString());
                txtCantidad.setText(tabla.getValueAt(fila, 5).toString());
                txtDescripcion.setText(tabla.getValueAt(fila, 6).toString());
                return true;
            } else {
                return false;
            }
        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    void seleccionarValor() {
        if (!getSeleccionar()) {
            JOptionPane.showMessageDialog(null, "No a seleciones una fila..");
        }
    }

    void eliminar() {
        int row = tabla.getSelectedRow();
        if (row >= 0) {
            if (getEliminar()) {
                JOptionPane.showMessageDialog(null, "Eliminado con exito...");
                getTabla("");
                setLimpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No a seleciones una fila......");
        }
    }

    boolean getEliminar() {
        int respuesta = JOptionPane.showConfirmDialog(null, "Seguro desea Borrar ?", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        int fila = tabla.getSelectedRow();
        if (respuesta == 0) {
            piezas.setElimina(tabla.getValueAt(fila, 0).toString());
            getTabla("");
            setLimpiar();

            return true;
        } else {
            return false;
        }
    }

    boolean setModificar() {
        try {
            piezas.setModifica(txtCodigo.getText(), txtNombre.getText(), txtModelo.getText(), txtColor.getText(), Double.parseDouble(txtCosto.getText()), Integer.parseInt(txtCantidad.getText()), txtDescripcion.getText());
            JOptionPane.showMessageDialog(null, "Registro actualizado con exito");
            getTabla("");
            setLimpiar();
            return true;
        } catch (NumberFormatException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Error al actualizar....");
            getTabla("");
            setLimpiar();
            return false;
        }
    }

    void setLimpiar() {
        txtCantidad.setText("");
        txtCodigo.setText("");
        txtColor.setText("");
        txtCosto.setText("");
        txtDescripcion.setText("");
        txtModelo.setText("");
        txtNombre.setText("");
        txtBuscar.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAactualzar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JMenuItem btnSeleccionar;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
