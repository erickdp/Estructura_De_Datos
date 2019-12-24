/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcional.estructuras;

/**
 *
 * @author Erick Díaz Estructura de Datos: Lista circular.
 */
public class ListaCircular {

    private Nodo top = null;
    private Nodo ultimo = null;
    int longitud = 0;

    final void insercionInicio(int numero) {
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

    final void insercionFinal(int numero) {
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

    final void insercionDespues(int numero, int buscar) {
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

    final void insercionAntes(int numero, int buscar) {
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

    final void modificarNodo(int numero, int buscar) {
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

    final void eliminarNodo(int numero) {
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

    final void impresionLista() {
        Nodo temp = top;
        int contador = 0;
        System.out.println();
        do {
            System.out.print(temp.numero + " ");
            if (contador == 10) {
                System.out.println();
                contador = 0;
            }
            contador++;
            temp = temp.siguiente;
        } while (temp != top);
        System.out.println();
    }

}