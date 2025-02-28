package org.example.Ejercicio11;
import java.util.LinkedHashSet;

public class AplicacionMusica {

    // Usamos un LinkedHashSet para almacenar las canciones favoritas
    private LinkedHashSet<Cancion> cancionesFavoritas;

    public AplicacionMusica() {
        // Inicializamos el conjunto de canciones favoritas
        cancionesFavoritas = new LinkedHashSet<>();
    }
    // Método principal que gestiona las canciones dentro de la aplicación
    public static void main(String[] args) {
        AplicacionMusica app = new AplicacionMusica();

        // Crear algunas canciones y agregarlas a favoritos
        Cancion cancion1 = new Cancion("Shape of You", "Ed Sheeran");
        Cancion cancion2 = new Cancion("Mi suerte", "Morat");
        Cancion cancion3 = new Cancion("Lose you to love me", "Selena Gomez");

        // Agregar canciones a favoritos
        app.agregarCancion(cancion1);
        app.agregarCancion(cancion2);
        app.agregarCancion(cancion3);

        // Intentamos agregar una canción duplicada
        Cancion cancionDuplicada = new Cancion("Shape of You", "Ed Sheeran");
        app.agregarCancion(cancionDuplicada);

        // Mostrar las canciones favoritas
        app.mostrarCancionesFavoritas();
    }

    // Método para agregar una canción a la lista de favoritas
    public void agregarCancion(Cancion cancion) {
        if (cancionesFavoritas.add(cancion)) {
            System.out.println("Canción añadida a favoritos: " + cancion);
        } else {
            System.out.println("La canción ya está en favoritos.");
        }
    }

    // Método para mostrar las canciones favoritas
    public void mostrarCancionesFavoritas() {
        if (cancionesFavoritas.isEmpty()) {
            System.out.println("No tienes canciones favoritas.");
        } else {
            System.out.println("Canciones favoritas:");
            for (Cancion cancion : cancionesFavoritas) {
                System.out.println(cancion);
            }
        }
    }

}
