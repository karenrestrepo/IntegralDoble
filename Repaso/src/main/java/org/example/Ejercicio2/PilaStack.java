package org.example.Ejercicio2;

import java.util.Stack;

public class PilaStack {
    private Stack<Object> pila = new Stack<>();  // Usamos Object para aceptar cualquier tipo de objeto

    public static void main(String[] args) {
        // Crear una pila que acepte cualquier tipo de objeto
        PilaStack pila = new PilaStack();

        // Insertamos un Integer
        pila.insertar(10);  // Pila acepta este valor, porque está vacía.

        // Intentamos insertar un String (esto debería fallar, porque la cima es un Integer)
        pila.insertar("Hola");

        // Insertamos otro Integer (esto debería funcionar, porque la cima es un Integer)
        pila.insertar(20);

        // Intentamos insertar un Integer (esto debería fallar, porque la cima es un Persona)
        pila.insertar(100);

    }


    // Método para insertar elementos en la pila
    public boolean insertar(Object elemento) {
        if (pila.isEmpty()) {
            pila.push(elemento);// Si la pila está vacía, insertamos cualquier objeto
            System.out.println("Elemento '" + elemento + "' agregado a la pila");
            return true;
        } else {
            // Verificamos si el tipo del objeto coincide con el tipo del objeto en la cima
            if (pila.peek().getClass().equals(elemento.getClass())) {
                pila.push(elemento);  // Si coinciden los tipos, lo insertamos
                System.out.println("Elemento '" + elemento + "' agregado a la pila");
                return true;
            } else {
                System.out.println("Error: El tipo del objeto '" +elemento+ "' no coincide con el tipo en la cima de la pila");
                return false;  // Si los tipos no coinciden, no se inserta
            }
        }
    }

}
