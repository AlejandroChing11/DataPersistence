package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajeDao {
    public static void crearMensajeBd(Mensaje mensaje) {
        Conexion dbConnect = new Conexion();
        try (Connection conexion = dbConnect.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`) VALUES (?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("The message was successfully created");
            } catch (SQLException ex){
                System.out.println(ex);
            }

        } catch (SQLException e) {
            System.out.println("Connection error " + e);
        }
    }
    public static void leerMensajeDb() {

    }
    public static void borrarMensajeDb(int idMensaje) {

    }
    public static void actualizarMensaje(Mensaje mensaje) {

    }
}
