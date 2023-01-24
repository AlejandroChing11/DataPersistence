package com.platzi.mensajes_app;
import java.util.Scanner;
import java.util.ArrayList;

public class MensajeServicio {

    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your message");
        String mensaje = sc.nextLine();


        System.out.println("Tu nombre: ");
        String autor = sc.nextLine();

        Mensaje registro = new Mensaje();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(autor);
        MensajeDao.crearMensajeBd(registro);
    }

    public static void listarMensaje(){
        ArrayList <Mensaje> mensajes = MensajeDao.leerMensajeDb();
        for (Mensaje mensaje: mensajes) {
            System.out.println("id: " + mensaje.getIdMensaje());
            System.out.println("Mensaje: " + mensaje.getMensaje());
            System.out.println("Autor: " + mensaje.getAutorMensaje());
            System.out.println("Fecha de registros: " + mensaje.getFechaMensaje());
        }
        MensajeDao.leerMensajeDb();
    }
    public static void borrarMensaje(){

    }
    public static void editarMensaje(){

    }
}
