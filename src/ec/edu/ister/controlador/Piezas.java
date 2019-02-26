/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import ec.edu.ister.modelo.Pieza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author suntaxi-chasipanta
 */
public class Piezas extends Conexion {
    Pieza obPieza = new Pieza();
    
    public int registrarPieza(Pieza obPieza) { 
        ResultSet resultSet = null;
        Connection conexion = getConexion();
        PreparedStatement preparedStatement = null;
        String insert = "INSERT INTO piezas (codigoPieza,nombrePieza,modeloPieza,colorPieza,costoPieza,cantidadPieza,descripcionPieza) VALUES(?,?,?,?,?,?,?);";
        try {
            preparedStatement = conexion.prepareStatement(insert);
            preparedStatement.setString(1, obPieza.getCodigoPieza());
            preparedStatement.setString(2, obPieza.getNombrePieza());
            preparedStatement.setString(3, obPieza.getModeloPieza());
            preparedStatement.setString(4, obPieza.getColorPieza());
            preparedStatement.setDouble(5, obPieza.getCostoPieza());
            preparedStatement.setInt(6, obPieza.getCantidadPieza());
            preparedStatement.setString(7, obPieza.getDescripcionPieza());
            preparedStatement.execute();
            return 1;
        } catch (SQLException e) {
            e.getMessage();
            return 0;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }
    public int setPieza(String codigoPieza, String nombrePieza, String modeloPieza, String colorPieza, double costoPieza, int cantidadPieza, String descripcionPieza) {
        obPieza.setCodigoPieza(codigoPieza);
        obPieza.setNombrePieza(nombrePieza);
        obPieza.setModeloPieza(modeloPieza);
        obPieza.setColorPieza(colorPieza);
        obPieza.setCostoPieza(costoPieza);
        obPieza.setCantidadPieza(cantidadPieza);
        obPieza.setDescripcionPieza(descripcionPieza);

        if (registrarPieza(obPieza) == 1) {
            JOptionPane.showMessageDialog(null, "bine");

        } else {
            JOptionPane.showMessageDialog(null, "Error");

        }
        return 0;
    }
    public int modificarPolitico(String codigoPieza, String nombrePieza, String modeloPieza, String colorPieza, double costoPieza, int cantidadPieza, String descripcionPieza) {
        ResultSet resultSet = null;
        Connection conexion = getConexion();
        PreparedStatement preparedStatement = null;
        
        String update = "UPDATE piezas SET nombrePieza='" +nombrePieza + "',modeloPieza='" + modeloPieza + "',colorPieza='" + colorPieza + "',costoPieza='" + costoPieza + "',cantidadPieza='" + cantidadPieza + "',descripcionPieza='" + descripcionPieza + "' WHERE codigoPieza='" + codigoPieza + "';";

        try {
            preparedStatement = conexion.prepareStatement(update);
            preparedStatement.execute();
            return 1;
        } catch (SQLException e) {
            e.getMessage();
            return 0;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }
    public int EliminarPolitico(String codigoPieza) {
        ResultSet resultSet = null;
        Connection conexion = getConexion();
        PreparedStatement preparedStatement = null;
        
        String delete = "DELETE FROM piezas WHERE  codigoPieza='" + codigoPieza + "';";

        try {
            preparedStatement = conexion.prepareStatement(delete);
            preparedStatement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            e.getMessage();
            return 0;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }
}
