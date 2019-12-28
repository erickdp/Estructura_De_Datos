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
public class ListaSimple {

    private Nodo top = null;
    private Nodo ultimo = null;

    final void insercionInicio(int numero) {
        Nodo temp = new Nodo(numero);
        temp.siguiente = top;
        top = temp;
    }

    final void insercionFinal(int numero) {
        Nodo temp = new Nodo(numero);
        if (top == null) {
            top = temp;
        } else {
            ultimo.siguiente = temp;
        }
        ultimo = temp;
    }

    final void insercionDespues(int numero, int buscar) {
        Nodo temp = top;
        while ((temp.numero != buscar) && (temp.siguiente != null)) {
            temp = temp.siguiente;
        }
        if (temp.numero == buscar) {
            Nodo temp1 = new Nodo(numero);
            temp1.siguiente = temp.siguiente;
            temp.siguiente = temp1;
        } else {
            System.out.println("El Nodo " + buscar + " no exsite.");
        }
    }

    final void insercionAntes(int numero, int buscar) {
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
            } else {
                System.out.println("El número " + buscar + " no existe.");
            }
        }
    }

    final void eliminarNodo(int buscar) {
        Nodo temp = top;
        Nodo ultimoNodo = ultimo;
        if (temp.numero == buscar) {
            top = top.siguiente;
        } else {
            while ((temp.numero != buscar) && (temp.siguiente != null)) {
                ultimoNodo = temp;
                temp = temp.siguiente;
            }
            if (temp.numero == buscar) {
                ultimoNodo.siguiente = temp.siguiente;
            } else {
                System.out.println("El número " + buscar + " no existe.");
            }
        }
    }

    final void modificarNodo(int numero, int buscar) {
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

    final void imprimirlista() {
        Nodo temp = top;
        int contador = 0;
        while (temp != null) {
            System.out.print(temp.numero + " ");
            contador++;
            if (contador == 20) {
                System.out.println();
                contador = 0;
            }
            temp = temp.siguiente;
        }
    }
}
