package com.funcional.estructuras;

/**
 *
 * @author Erick Díaz Estructura de Datos: Lista circular.
 */
public class ListaCircular {

    private Nodo top = null;
    private Nodo ultimo = null;
    private int longitud = 0;

    public final void insercionInicio(int numero) {
        Nodo temp = new Nodo(numero);
        if (top == null) {
            ultimo = temp;
        } else {
            temp.siguiente = top;
            ultimo.siguiente = temp;
        }
        top = temp;
        longitud++;
    }

    public final void insercionFinal(int numero) {
        Nodo temp = new Nodo(numero);
        if (top == null) {
            top = temp;
        } else {
            temp.siguiente = top;
            ultimo.siguiente = temp;
        }
        ultimo = temp;
        longitud++;
    }

    public final void insercionDespues(int numero, int buscar) {
        Nodo temp = top;
        while ((temp.numero != buscar) && (temp.siguiente != top)) {
            temp = temp.siguiente;
        }
        if (temp.numero == buscar) {
            Nodo temp1 = new Nodo(numero);
            temp1.siguiente = temp.siguiente;
            temp.siguiente = temp1;
            longitud++;
        } else {
            System.out.println("El número " + buscar + " no existe.");
        }
    }

    public final void insercionAntes(int numero, int buscar) {
        Nodo temp = top;
        while ((temp.siguiente.numero != buscar) && (temp.siguiente != top)) {
            temp = temp.siguiente;
        }
        if (temp.siguiente.numero == buscar) {
            Nodo temp1 = new Nodo(numero);
            temp1.siguiente = temp.siguiente;
            temp.siguiente = temp1;
            longitud++;
        } else {
            System.out.println("El número " + buscar + " no existe.");
        }
    }

    public final void modificarNodo(int numero, int buscar) {
        Nodo temp = top;
        while ((temp.numero != buscar) && (temp.siguiente != top)) {
            temp = temp.siguiente;
        }
        if (temp.numero == buscar) {
            temp.numero = numero;
        } else {
            System.out.println("El número " + buscar + " no existe.");
        }
    }

    public final void eliminarNodo(int numero) {
        Nodo temp = top;
        Nodo temp1 = top;
        while ((temp.numero != numero) && (temp.siguiente != top)) {
            temp1 = temp;
            temp = temp.siguiente;
        }
        if (temp.numero == numero) {
            if (temp == top) {
                top = top.siguiente;
                ultimo.siguiente = top;
            } else {
                temp1.siguiente = temp.siguiente;
            }
            longitud--;
        } else {
            System.out.println("El número " + numero + " no existe.");
        }
    }

    public final void impresionLista() {
        Nodo temp = top;
        int contador = 0;
        do {
            System.out.print(temp.numero + " ");
            if (contador == 10) {
                System.out.println("");
                contador = 0;
            }
            contador++;
            temp = temp.siguiente;
        } while (temp != top);
    }

    public int length() {
        return longitud;
    }

    public int[] vector() {
        int[] vector = new int[length()];
        Nodo temp = top;
        for (int i = 0; i < length(); i++) {
            vector[i] = temp.numero;
            temp = temp.siguiente;
            top = top.siguiente;
        }
        System.out.println("La Estructura Lista Circular está vacía.");
        return vector;
    }
}
