package org.example.Ejercicio17;
import java.util.Map;
import java.util.TreeMap;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class AgendaEventos {
    private TreeMap<Date, String> eventos; // TreeMap para almacenar los eventos ordenados por fecha

    public AgendaEventos() {
        eventos = new TreeMap<>();
    }

    // Método para agregar un evento con una fecha y su nombre
    public void agregarEvento(String fechaStr, String evento) {
        // Convertir la cadena de fecha a un objeto Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            Date fecha = sdf.parse(fechaStr);
            eventos.put(fecha, evento); // Agregar el evento al TreeMap
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
    }

    // Método para mostrar todos los eventos ordenados cronológicamente
    public void mostrarEventos() {
        for (Map.Entry<Date, String> entry : eventos.entrySet()) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            System.out.println("Fecha: " + sdf.format(entry.getKey()) + " | Evento: " + entry.getValue());
        }
    }

    // Método para obtener el próximo evento (el más cercano en el tiempo)
    public void mostrarProximoEvento() {
        Map.Entry<Date, String> proximoEvento = eventos.firstEntry();
        if (proximoEvento != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            System.out.println("Próximo evento: " + sdf.format(proximoEvento.getKey()) + " | Evento: " + proximoEvento.getValue());
        } else {
            System.out.println("No hay eventos programados.");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        // Agregar algunos eventos
        agenda.agregarEvento("05/03/2025 09:00", "Reunión de trabajo");
        agenda.agregarEvento("06/04/2025 14:00", "Cita con el dentista");
        agenda.agregarEvento("20/03/2025 18:30", "Cena con amigos");
        agenda.agregarEvento("04/03/2025 10:00", "Llamada de conferencia");

        // Mostrar todos los eventos ordenados
        System.out.println("Todos los eventos programados:");
        agenda.mostrarEventos();

        // Mostrar el próximo evento
        System.out.println("\nPróximo evento:");
        agenda.mostrarProximoEvento();
    }
}

