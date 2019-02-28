/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suntaxi-chasipanta
 */
public class Conexion {

   
    private Connection mysqlConexion = null;
    private String ssl="?useTimezone=true&serverTimezone=GMT&useSSL=false&allowPublicKeyRetrieval=true";

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            mysqlConexion = DriverManager.getConnection("jdbc:mysql://localhost/talleresronson"+this.ssl, "root", "");
            System.out.println("Conexion exitosa a la base de Datos");
        } catch (SQLException e) {
            System.err.println(e.toString());
            System.out.println("Sin acceso al servidor de base de datos");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mysqlConexion;
    }
}



