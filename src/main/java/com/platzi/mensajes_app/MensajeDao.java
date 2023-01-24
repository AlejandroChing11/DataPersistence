package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    public static ArrayList<Mensaje> leerMensajeDb() {
        Conexion dbConnect = new Conexion();
        ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();
        try {
            Connection connection = dbConnect.getConnection();
            String query = "SELECT * FROM mensajes";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Mensaje mensaje = new Mensaje();
                mensaje.setIdMensaje(rs.getInt("id_mensaje"));
                System.out.println("");
                mensaje.setMensaje(rs.getString("mensaje"));
                System.out.println("");
                mensaje.setAutorMensaje(rs.getString("autor_mensaje"));
                System.out.println("");
                mensaje.setFechaMensaje(rs.getString("fecha_mensaje"));
                mensajes.add(mensaje);
            }


        } catch (SQLException e){
            System.out.println(e);
            System.out.println("Couldn't charge messages");
        }

        return mensajes;
    }
    public static void borrarMensajeDb(int idMensaje) {

    }
    public static void actualizarMensaje(Mensaje mensaje) {

    }
}
