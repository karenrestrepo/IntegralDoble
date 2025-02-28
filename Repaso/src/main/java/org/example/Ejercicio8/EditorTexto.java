package org.example.Ejercicio8;
import java.util.Scanner;
import java.util.Vector;

public class EditorTexto {

    private String texto;                // El texto actual del editor
    private Vector<String> historial;    // Historial de cambios en el texto

    public EditorTexto() {
        texto = "";                      // Inicializamos el texto vacío
        historial = new Vector<>();      // Inicializamos el historial vacío
    }

    public static void main(String[] args) {
        // Creamos el editor de texto
        EditorTexto editor = new EditorTexto();
        Scanner scanner = new Scanner(System.in);
        String comando;


        // Bucle para manejar las entradas del usuario
        while (true) {

            // Leer la entrada del usuario
            System.out.print("Ingrese nuevo texto o 'deshacer': ");
            comando = scanner.nextLine();

            if (comando.equals("deshacer")) {
                editor.deshacer();  // Deshacer el último cambio si el comando es 'deshacer'
            } else if (comando.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del editor...");
                break;  // Salir del bucle si el usuario escribe 'salir'
            } else {
                editor.realizarCambio(comando);  // Realizar un cambio con el texto ingresado
            }
        }

        scanner.close();
    }

    // Método para realizar un cambio en el texto
    public void realizarCambio(String nuevoTexto) {
        // Guardamos el estado actual del texto en el historial antes de realizar el cambio
        historial.add(texto);
        // Realizamos el cambio (actualizamos el texto)
        texto = nuevoTexto;
        System.out.println("Cambio realizado: " + texto);
    }

    // Método para deshacer el último cambio
    public void deshacer() {
        if (historial.isEmpty()) {
            System.out.println("No hay cambios para deshacer.");
        } else {
            // Recuperamos el último cambio del historial y restauramos el texto
            texto = historial.remove(historial.size() - 1);
            System.out.println("Último cambio deshecho. Texto restaurado: " + texto);
        }
    }
}

