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

/**
 *
 * @author suntaxi-chasipanta
 */
public class Piezas extends Conexion {

    static PreparedStatement preparedStatement = null; //Agregar o modificar la base de datos
    static ResultSet resultSet = null; //Se saca los datos de la base de datos

    Connection mysqlConexion = getConexion();

    public boolean registrarDatos(Pieza obPieza) {

        String queryRegistro = "";

        try {
            int campoCodPieza = obPieza.getCodigoPieza();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {//siempre cierra la conexion
            try {
                mysqlConexion.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }

        }
        return false;
    }
}
