/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

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
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
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
        txtDescripcion = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnSeleccionar.setText("Seleccione Registro");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(btnSeleccionar);

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 950, 100));

        txtDescripcion.setBorder(null);
        txtDescripcion.setOpaque(false);
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 150, 20));

        txtCantidad.setBorder(null);
        txtCantidad.setOpaque(false);
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 150, 20));

        txtCosto.setBorder(null);
        txtCosto.setOpaque(false);
        getContentPane().add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 150, 20));

        txtColor.setBorder(null);
        txtColor.setOpaque(false);
        getContentPane().add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 150, 20));

        txtModelo.setBorder(null);
        txtModelo.setOpaque(false);
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 150, 20));

        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 150, 20));

        txtCodigo.setBorder(null);
        txtCodigo.setOpaque(false);
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 150, 20));

        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 473, 160, 30));

        btnGrabar.setBorder(null);
        btnGrabar.setContentAreaFilled(false);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 473, 160, 30));

        btnModificar.setBorder(null);
        btnModificar.setContentAreaFilled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 473, 160, 30));

        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 473, 150, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/img.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Piezas piezas = new Piezas();
    Pieza pieza = new Pieza();
    Conexion conexion = new Conexion();
    Connection connection = conexion.getConexion();
   
    boolean setGrabar(){
        try {
            pieza.setCodigoPieza(txtCodigo.getText());
            pieza.setNombrePieza(txtNombre.getText());
            pieza.setModeloPieza(txtModelo.getText());
            pieza.setColorPieza(txtColor.getText());
            pieza.setCostoPieza(Double.parseDouble(txtCosto.getText()));
            pieza.setCantidadPieza(Integer.parseInt(txtCantidad.getText()));
            pieza.setDescripcionPieza(txtDescripcion.getText());
            piezas.registrarPieza(pieza);
            return true;
        } catch (NumberFormatException e) {
            System.out.println( e.toString());
            return false;
        }
        
    }
    boolean setValidarCamposEnBlanco(){
        if (txtCantidad.getText().equals("") || txtCodigo.getText().equals("") || txtColor.getText().equals("")  || txtCosto.getText().equals("") || txtDescripcion.getText().equals("") || txtModelo.getText().equals("") || txtNombre.getText().equals("")) {
            return true;
        }else{
            return false;
        }
    }
    void getTabla(String indice) {

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

        if (indice.equals("")) 
        {
            busquedaMysql = "SELECT * FROM piezas;";
        } 
        else 
        {
            busquedaMysql = "SELECT * FROM piezas WHERE codigoPieza='"+indice+"';";
        }
        String[] campoTabla = new String[7];
        
        try {
            Statement obStatement = connection.createStatement();
            ResultSet resultSet = obStatement.executeQuery(busquedaMysql);
            
            while (resultSet.next()) 
            {
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
        } catch (SQLException ex) 
        {
            System.out.println(ex.toString());
        }
    }
    boolean getSeleccionar(){
        int fila = tabla.getSelectedRow();
        try {
            if (fila >= 0) 
            {
            txtCodigo.setText(tabla.getValueAt(fila, 0).toString());
            txtNombre.setText(tabla.getValueAt(fila, 1).toString());
            txtModelo.setText(tabla.getValueAt(fila, 2).toString());
            txtColor.setText(tabla.getValueAt(fila, 3).toString());
            txtCosto.setText(tabla.getValueAt(fila, 4).toString());
            txtCantidad.setText(tabla.getValueAt(fila, 5).toString());
            txtDescripcion.setText(tabla.getValueAt(fila, 6).toString());
            return true;
            } 
            else 
            {
                return false;
            }
        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    boolean setModificar(){
        try {
            piezas.setModifica(txtCodigo.getText(), txtNombre.getText(), txtModelo.getText(), txtColor.getText(), Double.parseDouble(txtCosto.getText()), Integer.parseInt(txtCantidad.getText()), txtDescripcion.getText());
            return true;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return false;
        }
    
    }
    void setLimpiar(){
        txtCantidad.setText("");
        txtCodigo.setText("");
        txtColor.setText("");
        txtCosto.setText("");
        txtDescripcion.setText("");
        txtModelo.setText("");
        txtNombre.setText("");
    }    
    boolean getEliminar(){
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro desea Eliminiar?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        int fila = tabla.getSelectedRow();           
            if (respuesta == 0) 
            {
                piezas.setElimina(tabla.getValueAt(fila, 0).toString());
                getTabla("");
                setLimpiar();
                
                return true;
            }else{
                return false;
        }  
    }
    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
//        !validarCamposEnBlanco()
        if (!setValidarCamposEnBlanco()) {
            if (setGrabar())
            {
                JOptionPane.showMessageDialog(null,"Todo Bien");
                getTabla("");
                setLimpiar();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "mal");
                getTabla("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campos en en blanco");
            getTabla("");
        }
                // TODO add your handling code here:

    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        if (!getSeleccionar()) {
            JOptionPane.showMessageDialog(null, "No a seleciones una fila..");
        }
                // TODO add your handling code here:

    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (!setValidarCamposEnBlanco()) {
            if (setModificar()) {
                JOptionPane.showMessageDialog(null,"Bien actualizado");
                getTabla("");
                setLimpiar();
            }
            else
            {
               JOptionPane.showMessageDialog(null,"mal actualizado");
               getTabla("");
               setLimpiar();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"campos en blanco");
            getTabla("");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        getTabla(JOptionPane.showInputDialog("Ingrese un codigo"));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setLimpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila >= 0) 
        {
              if (getEliminar()) 
              {
                JOptionPane.showMessageDialog(null, "Eliminado con exito");
                getTabla("");
                setLimpiar();
            }  
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No a seleciones una fila..");

        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
