package org.example.ListasEnlazadas;

public class ListaCircularDobleEnlazada {
    private Nodo cabeza;

    public ListaCircularDobleEnlazada() {
        cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            Nodo ultimo = cabeza.anterior;
            nuevo.siguiente = cabeza;
            nuevo.anterior = ultimo;
            cabeza.anterior = nuevo;
            ultimo.siguiente = nuevo;
            cabeza = nuevo;
        }
    }

    public void insertarAlFinal(int dato) {
        if (estaVacia()) {
            insertarAlInicio(dato);
        } else {
            Nodo nuevo = new Nodo(dato);
            Nodo ultimo = cabeza.anterior;
            nuevo.siguiente = cabeza;
            nuevo.anterior = ultimo;
            ultimo.siguiente = nuevo;
            cabeza.anterior = nuevo;
        }
    }

    public boolean buscar(int dato) {
        if (estaVacia()) return false;

        Nodo actual = cabeza;
        do {
            if (actual.dato == dato) return true;
            actual = actual.siguiente;
        } while (actual != cabeza);

        return false;
    }

    public void eliminar(int dato) {
        if (estaVacia()) return;

        Nodo actual = cabeza;

        do {
            if (actual.dato == dato) {
                if (actual == cabeza && actual.siguiente == cabeza) {
                    cabeza = null; // La lista queda vacía
                } else {
                    Nodo anterior = actual.anterior;
                    Nodo siguiente = actual.siguiente;

                    anterior.siguiente = siguiente;
                    siguiente.anterior = anterior;

                    if (actual == cabeza) {
                        cabeza = siguiente;
                    }
                }
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    public void recorrerAdelante() {
        if (estaVacia()) return;

        Nodo actual = cabeza;
        do {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println("(vuelta al inicio)");
    }

    public void recorrerAtras() {
        if (estaVacia()) return;

        Nodo actual = cabeza.anterior;
        do {
            System.out.print(actual.dato + " <-> ");
            actual = actual.anterior;
        } while (actual != cabeza.anterior);
        System.out.println("(vuelta al inicio)");
    }

    public static void main(String[] args) {
        ListaCircularDobleEnlazada lista = new ListaCircularDobleEnlazada();
        lista.insertarAlInicio(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);
        lista.insertarAlInicio(0);

        System.out.println("Recorrido hacia adelante:");
        lista.recorrerAdelante();

        System.out.println("\nRecorrido hacia atrás:");
        lista.recorrerAtras();

        System.out.println("\n¿Está el número 2 en la lista?: " + lista.buscar(2));

        lista.eliminar(2);

        System.out.println("\nLista después de eliminar el número 2:");
        lista.recorrerAdelante();
    }
}
