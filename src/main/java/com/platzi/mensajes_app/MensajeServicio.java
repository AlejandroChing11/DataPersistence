package com.platzi.mensajes_app;
import java.util.Scanner;

public class MensajeServicio {

    public static void listarMensaje(){
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
    public static void borrarMensaje(){

    }
    public static void editarMensaje(){

    }
}
