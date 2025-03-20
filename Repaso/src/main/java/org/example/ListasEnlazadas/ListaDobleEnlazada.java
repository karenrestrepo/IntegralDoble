package org.example.ListasEnlazadas;

public class ListaDobleEnlazada {
    private Nodo cabeza;
    private Nodo cola;

    // Verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Insertar al inicio
    public void insertarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            cabeza = cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
    }

    // Insertar al final
    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    // Insertar en cualquier posición
    public void insertarEnPosicion(int dato, int posicion) {
        if (posicion <= 0) {
            insertarAlInicio(dato);
            return;
        }

        Nodo actual = cabeza;
        int indice = 0;
        while (actual != null && indice < posicion - 1) {
            actual = actual.siguiente;
            indice++;
        }

        if (actual == null || actual == cola) {
            insertarAlFinal(dato);
        } else {
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = actual.siguiente;
            nuevo.anterior = actual;
            if (actual.siguiente != null) {
                actual.siguiente.anterior = nuevo;
            }
            actual.siguiente = nuevo;
        }
    }

    // Eliminar un elemento por valor
    public void eliminar(int dato) {
        if (estaVacia()) return;

        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == dato) {
                if (actual == cabeza) {
                    cabeza = cabeza.siguiente;
                    if (cabeza != null) cabeza.anterior = null;
                } else if (actual == cola) {
                    cola = cola.anterior;
                    if (cola != null) cola.siguiente = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                return;
            }
            actual = actual.siguiente;
        }
    }

    // Buscar un elemento
    public boolean buscar(int dato) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == dato) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    // Recorrer la lista hacia adelante
    public void mostrarAdelante() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Recorrer la lista hacia atrás
    public void mostrarAtras() {
        Nodo actual = cola;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.anterior;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaDobleEnlazada lista = new ListaDobleEnlazada();

        // Insertar al inicio
        lista.insertarAlInicio(3);
        lista.insertarAlInicio(2);
        lista.insertarAlInicio(1);

        // Insertar al final
        lista.insertarAlFinal(4);
        lista.insertarAlFinal(5);

        // Insertar en posición específica
        lista.insertarEnPosicion(99, 2); // Insertar 99 en la posición 2

        // Mostrar la lista hacia adelante
        System.out.print("Lista hacia adelante: ");
        lista.mostrarAdelante();

        // Mostrar la lista hacia atrás
        System.out.print("Lista hacia atrás: ");
        lista.mostrarAtras();

        // Buscar un elemento
        System.out.println("Buscar 3: " + lista.buscar(3));

        // Eliminar un elemento
        lista.eliminar(99);
        System.out.print("Después de eliminar 99: ");
        lista.mostrarAdelante();
    }
}
