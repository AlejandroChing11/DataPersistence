package com.platzi.mensajes_app;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class MensajeServicio {
    public static void crearMensaje(){
        Conexion dbConnect = new Conexion();
        try (Connection conexion = dbConnect.getConnection()) {
            PreparedStatement ps = null;
            try () {
                String query = "INSERT INTO `mensajes` (`id_mensaje`, `mensaje`, `autor_mensaje`, `fecha_mensaje`) VALUES (NULL, 'Hola mundo, primer query', 'Alejandro', current_timestamp());";
            } catch {

            }

        } catch (SQLException e) {
            System.out.println("Connection error " + e);
        }
    }
    public static void listarMensaje(){

    }
    public static void borrarMensaje(){

    }
    public static void editarMensaje(){

    }
}
