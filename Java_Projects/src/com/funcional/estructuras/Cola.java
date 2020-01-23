/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcional.estructuras;

/**
 *
 * @author Erick Díaz
 */
public class Cola {

    private Nodo cola = null;
    private Nodo ultimo = null;
    private int contador = 0;

    public final void insercion(int numero) {
        Nodo temp = new Nodo(numero);
        if (cola == null) {
            cola = temp;
        } else {
            ultimo.siguiente = temp;
        }
        ultimo = temp;
        contador++;
    }

    public final void insercionDespues(int numero, int buscar) {
        Nodo colat = null;
        Nodo ultimot = null;
        Nodo temp = cola;
        while ((temp.numero != buscar) && (temp.siguiente != null)) {
            Nodo temp1 = new Nodo(temp.numero);
            if (colat == null) {
                colat = temp1;
            } else {
                ultimot.siguiente = temp1;
            }
            ultimot = temp1;
            cola = cola.siguiente;
            temp = temp.siguiente;
        }
        if (temp.numero == buscar) {
            Nodo temp1 = new Nodo(temp.numero);
            if (colat == null) {
                colat = temp1;
            } else {
                ultimot.siguiente = temp1;
            }
            ultimot = temp1;
            temp = temp.siguiente;
            cola = cola.siguiente;
            Nodo temp2 = new Nodo(numero);
            ultimot.siguiente = temp2;
            ultimot = temp2;
            ultimot.siguiente = temp;
            cola = colat;
            contador++;
        } else {
            System.out.println("El número " + buscar + " no existe.");
            ultimot.siguiente = temp;
            cola = colat;
        }
    }

    public final void eliminarNodo(int numero) {
        Nodo temp = cola;
        Nodo colat = null;
        Nodo ultimot = null;
        while ((temp.numero != numero) && (temp.siguiente != null)) {
            Nodo temp1 = new Nodo(temp.numero);
            if (colat == null) {
                colat = temp1;
            } else {
                ultimot.siguiente = temp1;
            }
            ultimot = temp1;
            temp = temp.siguiente;
            cola = cola.siguiente;
        }
        if (temp.numero == numero) {
            temp = temp.siguiente;
            cola = cola.siguiente;
            if (colat != null) {
                ultimot.siguiente = temp;
                cola = colat;
            }
            contador--;
        } else {
            System.out.println("El número " + numero + " no existe.");
            ultimot.siguiente = temp;
            cola = colat;
        }
    }

    public final void modificarNodo(int numero, int buscar) {
        Nodo colat = null;
        Nodo ultimot = null;
        Nodo temp = cola;
        while ((temp.numero != buscar) && (temp.siguiente != null)) {
            Nodo temp1 = new Nodo(temp.numero);
            if (colat == null) {
                colat = temp1;
            } else {
                ultimot.siguiente = temp1;
            }
            ultimot = temp1;
            temp = temp.siguiente;
            cola = cola.siguiente;
        }
        if (temp.numero == buscar) {
            temp.numero = numero;
            if (colat != null) {
                ultimot.siguiente = temp;
                cola = colat;
            }
        } else {
            System.out.println("El número " + buscar + " no existe.");
            ultimot.siguiente = temp;
            cola = colat;
        }
    }

    public final void imprimir() {
        Nodo temp = cola;
        int co = 0;
        while (temp != null) {
            System.out.print(temp.numero + " ");
            temp = temp.siguiente;
            co++;
            if (co == 15) {
                System.out.println("");
                co = 0;
            }
        }
    }

    private int length() {
        return contador;
    }

    /**
     * Este método es esencial para la transformnación a otra
     * estructura.
     * 1. Mediante la variable contador obtendremos la cantidad de 
     * datos presentes en la estructura.
     * 2. Se inicializa el vector que guardará los datos de la lista actual
     * para siguiente eliminarlos de la estructura presente.
     * 3. Se retorna el vector con los datos y la estructura queda vacía.
     * @return 
     */
    public final int[] vector() {
        int vector[] = new int[length()];
        Nodo temp = cola;
        for (int i = 0; i < length(); i++) {
            vector[i] = temp.numero;
            temp = temp.siguiente;
            cola = cola.siguiente;
        }
        System.out.println("La Estructura Cola está vacía.");
        return vector;
    }

}
