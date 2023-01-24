package com.platzi.mensajes_app;
import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("----- WELCOME TO <3 ------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar mensaje");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("0. Salir");
            //Reading the input by the user
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    MensajeServicio.crearMensaje();
                    break;
                case 2:
                    MensajeServicio.listarMensaje();
                    break;
                case 3:
                    MensajeServicio.editarMensaje();
                    break;
                case 4:
                    MensajeServicio.borrarMensaje();
                    break;
                case 0:
                    break;
            }
        } while(option != 0);

    }
}
