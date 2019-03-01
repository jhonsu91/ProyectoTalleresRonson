/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

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
    
    public int existe(String codigoPieza) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT count(codigoPieza) FROM piezas WHERE codigoPieza = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, codigoPieza);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
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
            JOptionPane.showMessageDialog(null, "Los datos se ingresaron con exito");

        } else {
            JOptionPane.showMessageDialog(null, "Código ya existente");

        }
        return 0;
    }

    public int setModifica(String codigoPieza, String nombrePieza, String modeloPieza, String colorPieza, double costoPieza, int cantidadPieza, String descripcionPieza) {
        ResultSet resultSet = null;
        Connection conexion = getConexion();
        PreparedStatement preparedStatement = null;

        String update = "UPDATE piezas SET nombrePieza='" + nombrePieza + "',modeloPieza='" + modeloPieza + "',colorPieza='" + colorPieza + "',costoPieza='" + costoPieza + "',cantidadPieza='" + cantidadPieza + "',descripcionPieza='" + descripcionPieza + "' WHERE codigoPieza='" + codigoPieza + "';";

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

    public int setElimina(String codigoPieza) {
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
