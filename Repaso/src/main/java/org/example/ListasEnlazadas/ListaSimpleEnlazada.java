package org.example.ListasEnlazadas;

public class ListaSimpleEnlazada {
    private Nodo cabeza;

    public ListaSimpleEnlazada() {
        this.cabeza = null; // Inicialización o creación
    }

    public boolean estaVacia() { // Comprobar si la lista está vacía
        return cabeza == null;
    }

    public void insertar(int dato) { // Insertar elementos en la lista
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void insertarEnPosicion(int dato, int posicion) { // Insertar en cualquier posición
        Nodo nuevo = new Nodo(dato);
        if (posicion == 0) { // Insertar al inicio
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;
        int contador = 0;

        while (actual != null && contador < posicion - 1) {
            actual = actual.siguiente;
            contador++;
        }

        if (actual == null) {
            System.out.println("Posición fuera de rango");
        } else {
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }


    public boolean eliminar(int dato) { // Eliminar elementos de la lista
        if (estaVacia()) {
            return false;
        }

        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return true;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != dato) {
            actual = actual.siguiente;
        }

        if (actual.siguiente == null) {
            return false;
        }

        actual.siguiente = actual.siguiente.siguiente;
        return true;
    }

    public boolean buscar(int dato) { // Buscar elementos en la lista
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void recorrer() { // Recorrer la lista enlazada
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaSimpleEnlazada lista = new ListaSimpleEnlazada();

        // Insertar elementos
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);

        // Insertar en cualquier posición
        lista.insertarEnPosicion(15, 1);
        lista.insertarEnPosicion(5, 0);
        lista.insertarEnPosicion(25, 4);

        // Recorrer la lista
        System.out.println("Lista actual:");
        lista.recorrer();

        // Buscar un elemento
        System.out.println("Buscar 20: " + lista.buscar(20));

        // Eliminar un elemento
        System.out.println("Eliminar 20: " + lista.eliminar(20));

        // Recorrer la lista después de eliminar
        System.out.println("Lista después de eliminar:");
        lista.recorrer();

        // Comprobar si la lista está vacía
        System.out.println("¿La lista está vacía?: " + lista.estaVacia());
    }
}
