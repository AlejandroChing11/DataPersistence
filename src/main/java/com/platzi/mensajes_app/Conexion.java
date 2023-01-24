package com.platzi.mensajes_app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection getConnection() {
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensaje_app?serverTimezone=UTC", "root", "");
            if(conection != null) {
                System.out.println("Connection ready");
            }
        } catch (SQLException e) {
            System.out.println("Connection Error" + e);
        }
        return conection;
    }
}
