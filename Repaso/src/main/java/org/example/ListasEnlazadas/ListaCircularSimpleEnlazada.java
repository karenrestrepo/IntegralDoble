package org.example.ListasEnlazadas;

public class ListaCircularSimpleEnlazada {
    private Nodo cabeza;

    public ListaCircularSimpleEnlazada() {
        cabeza = null;
    }

    // Insertar al inicio
    public void insertarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza; // Apunta a sí mismo
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            temp.siguiente = cabeza;
        }
    }

    // Insertar al final
    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    // Eliminar un elemento
    public void eliminar(int dato) {
        if (cabeza == null) return;

        Nodo actual = cabeza;
        Nodo anterior = null;
        do {
            if (actual.dato == dato) {
                if (anterior != null) {
                    anterior.siguiente = actual.siguiente;
                } else {
                    if (actual.siguiente == cabeza) {
                        cabeza = null;
                    } else {
                        Nodo temp = cabeza;
                        while (temp.siguiente != cabeza) {
                            temp = temp.siguiente;
                        }
                        cabeza = cabeza.siguiente;
                        temp.siguiente = cabeza;
                    }
                }
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    // Buscar un elemento
    public boolean buscar(int dato) {
        if (cabeza == null) return false;

        Nodo actual = cabeza;
        do {
            if (actual.dato == dato) return true;
            actual = actual.siguiente;
        } while (actual != cabeza);

        return false;
    }

    // Recorrer la lista
    public void recorrer() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo actual = cabeza;
        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println("(regresa al inicio)");
    }

    public static void main(String[] args) {
        ListaCircularSimpleEnlazada lista = new ListaCircularSimpleEnlazada();
        lista.insertarAlInicio(3);
        lista.insertarAlInicio(2);
        lista.insertarAlInicio(1);

        lista.insertarAlFinal(4);
        lista.insertarAlFinal(5);

        System.out.println("Lista completa:");
        lista.recorrer();

        System.out.println("¿El número 3 está en la lista?: " + lista.buscar(3));
        System.out.println("¿El número 10 está en la lista?: " + lista.buscar(10));

        System.out.println("Eliminando el número 3...");
        lista.eliminar(3);
        lista.recorrer();
    }
}
