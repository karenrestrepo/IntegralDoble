package org.example.PreParcial;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MiLista implements Iterable<String> {
    private String[] cadenas;

    public MiLista(String[] cadenas) {
        this.cadenas = cadenas;
    }

    @Override
    public Iterator<String> iterator() {
        return iteradorPar();
    }

    private Iterator<String> iteradorPar() {
        return new Iterator<String>() {
            private int posicion = 0;

            @Override
            public boolean hasNext() {
                return posicion < cadenas.length;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                String resultado = cadenas[posicion];
                posicion += 2;
                return resultado;
            }
        };
    }

    public static void main(String[] args) {
        String[] palabras = {"Hola", "Mundo", "Java", "Es", "Genial", "!"};
        MiLista lista = new MiLista(palabras);

        for (String palabra : lista) {
            System.out.println(palabra);
        }
    }
}

