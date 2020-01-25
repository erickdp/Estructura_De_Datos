package com.funcional.estructuras;

/**
 *
 * @author Erick Díaz
 */
public class ListaSimple {

    private Nodo top = null;
    private Nodo ultimo = null;
    private int contador = 0;

    public final void insercionInicio(int numero) {
        Nodo temp = new Nodo(numero);
        temp.siguiente = top;
        top = temp;
        contador++;
    }

    public final void insercionFinal(int numero) {
        Nodo temp = new Nodo(numero);
        if (top == null) {
            top = temp;
        } else {
            ultimo.siguiente = temp;
        }
        ultimo = temp;
        contador++;
    }

    public final void insercionDespues(int numero, int buscar) {
        Nodo temp = top;
        while ((temp.numero != buscar) && (temp.siguiente != null)) {
            temp = temp.siguiente;
        }
        if (temp.numero == buscar) {
            Nodo temp1 = new Nodo(numero);
            temp1.siguiente = temp.siguiente;
            temp.siguiente = temp1;
            contador++;
        } else {
            System.out.println("El Nodo " + buscar + " no exsite.");
        }
    }

    public final void insercionAntes(int numero, int buscar) {
        Nodo temp = top;
        Nodo nodoFinal = ultimo;
        if (temp.numero == buscar) {
            Nodo temp1 = new Nodo(numero);
            temp1.siguiente = top;
            top = temp1;
        } else {
            while ((temp.numero != buscar) && (temp.siguiente != null)) {
                nodoFinal = temp;
                temp = temp.siguiente;
            }
            if (temp.numero == buscar) {
                Nodo temp1 = new Nodo(numero);
                temp1.siguiente = temp;
                nodoFinal.siguiente = temp1;
                contador++;
            } else {
                System.out.println("El número " + buscar + " no existe.");
            }
        }
    }

    public final void eliminarNodo(int buscar) {
        Nodo temp = top;
        Nodo ultimoNodo = ultimo;
        if (temp.numero == buscar) {
            top = top.siguiente;
            contador--;
        } else {
            while ((temp.numero != buscar) && (temp.siguiente != null)) {
                ultimoNodo = temp;
                temp = temp.siguiente;
            }
            if (temp.numero == buscar) {
                ultimoNodo.siguiente = temp.siguiente;
                contador--;
            } else {
                System.out.println("El número " + buscar + " no existe.");
            }
        }
    }

    public final void modificarNodo(int numero, int buscar) {
        Nodo temp = top;
        while ((temp.numero != buscar) && (temp.siguiente != null)) {
            temp = temp.siguiente;
        }
        if (temp.numero == buscar) {
            temp.numero = numero;
        } else {
            System.out.println("El número " + buscar + " no existe.");
        }
    }

    public final void imprimirlista() {
        Nodo temp = top;
        int co = 0;
        while (temp != null) {
            System.out.print(temp.numero + " ");
            co++;
            if (co == 20) {
                System.out.println("");
                co = 0;
            }
            temp = temp.siguiente;
        }
    }

    public final int length() {
        return contador;
    }

    public final int[] vector() {
        int vector[] = new int[length()];
        Nodo temp = top;
        for (int i = 0; i < length(); i++) {
            vector[i] = temp.numero;
            temp = temp.siguiente;
            top = top.siguiente;
        }
        System.out.println("La Estructura Lista Simple está vacía.");
        return vector;
    }
}
