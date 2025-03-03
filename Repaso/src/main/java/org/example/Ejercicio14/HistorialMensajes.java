package org.example.Ejercicio14;

import java.util.ArrayDeque;
import java.util.Deque;

public class HistorialMensajes {
    private Deque<String> mensajes; // Deque para almacenar los mensajes
    private static final int MAX_MENSAJES = 10; // Número máximo de mensajes en el historial

    public HistorialMensajes() {
        mensajes = new ArrayDeque<>();
    }

    // Método para agregar un mensaje al final
    public void agregarMensaje(String mensaje) {
        // Si ya tenemos 10 mensajes, eliminamos el más antiguo
        if (mensajes.size() == MAX_MENSAJES) {
            mensajes.poll(); // Elimina el primer mensaje (el más antiguo)
        }
        // Agrega el nuevo mensaje al final de la cola
        mensajes.offer(mensaje);
    }

    // Método para obtener los últimos 10 mensajes
    public void mostrarMensajes() {
        // Mostrar los mensajes en el historial
        System.out.println("Últimos " + MAX_MENSAJES + " mensajes:");
        for (String mensaje : mensajes) {
            System.out.println(mensaje);
        }
    }

    public static void main(String[] args) {
        HistorialMensajes historial = new HistorialMensajes();

        // Agregar algunos mensajes cortos de presentación
        historial.agregarMensaje("Hola, ¿cómo te llamas?");
        historial.agregarMensaje("Me llamo Ana, ¿y tú?");
        historial.agregarMensaje("Soy Luis, un placer conocerte.");
        historial.agregarMensaje("Igualmente, ¿de dónde eres?");
        historial.agregarMensaje("Soy de Armenia, ¿y tú?");
        historial.agregarMensaje("Yo soy de Pijao.");
        historial.agregarMensaje("¡Qué bien! He ido una vez a Pijao.");
        historial.agregarMensaje("Sí, es un pueblo tranquilo.");
        historial.agregarMensaje("¿Qué te gusta hacer en tu tiempo libre?");
        historial.agregarMensaje("Me encanta leer y pasear por el parque.");

        // Mostrar los mensajes actuales
        historial.mostrarMensajes();

        // Agregar más mensajes para ver cómo se eliminan los más antiguos
        historial.agregarMensaje("Yo disfruto mucho del cine.");
        historial.agregarMensaje("¡Yo también! ¿Cuál es tu película favorita?");

        // Mostrar los últimos 10 mensajes después de agregar nuevos
        historial.mostrarMensajes();
    }
}


