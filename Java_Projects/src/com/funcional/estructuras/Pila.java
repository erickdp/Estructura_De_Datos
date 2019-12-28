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
public class Pila {

    private Nodo pila = null;

    final void insercion(int numero) {
        Nodo temp = new Nodo(numero);
        temp.siguiente = pila;
        pila = temp;
    }

    final void insercionAntes(int numero, int buscar) {
        Nodo temp = pila;
        Nodo pilat = null;
        while ((temp.numero != buscar) && (temp.siguiente != null)) {
            Nodo temp1 = new Nodo(temp.numero);
            temp1.siguiente = pilat;
            pilat = temp1;
            pila = pila.siguiente;
            temp = temp.siguiente;
        }
        if (temp.numero == buscar) {
            Nodo temp2 = new Nodo(numero);
            temp2.siguiente = temp;
            temp = temp2;
            pila = temp;
        } else {
            System.out.println("El número " + buscar + " no existe.");
        }
        while (pilat != null) {
            Nodo temp1 = new Nodo(pilat.numero);
            temp1.siguiente = temp;
            temp = temp1;
            pila = temp;
            pilat = pilat.siguiente;
        }
    }

    final void insercionDespues(int numero, int buscar) {
        Nodo temp = pila;
        Nodo pilat = null;
        while ((temp.numero != buscar) && (temp.siguiente != null)) {
            Nodo temp1 = new Nodo(temp.numero);
            temp1.siguiente = pilat;
            pilat = temp1;
            temp = temp.siguiente;
            pila = pila.siguiente;
        }
        if (temp.numero == buscar) {
            Nodo temp1 = new Nodo(temp.numero);
            temp1.siguiente = pilat;
            pilat = temp1;
            temp = temp.siguiente;
            pila = pila.siguiente;
            Nodo temp2 = new Nodo(numero);
            temp2.siguiente = temp;
            temp = temp2;
        } else {
            System.out.println("El número " + buscar + " no exsite.");
        }
        while (pilat != null) {
            Nodo temp3 = new Nodo(pilat.numero);
            temp3.siguiente = temp;
            temp = temp3;
            pila = temp;
            pilat = pilat.siguiente;
        }
    }

    final void eliminarNodo(int numero) {
        Nodo temp = pila;
        Nodo pilat = null;
        while ((temp.numero != numero) && (temp.siguiente != null)) {
            Nodo temp1 = new Nodo(temp.numero);
            temp1.siguiente = pilat;
            pilat = temp1;
            temp = temp.siguiente;
            pila = pila.siguiente;
        }
        if (temp.numero == numero) {
            pila = pila.siguiente;
            temp = temp.siguiente;
        } else {
            System.out.println("El número " + numero + " no existe.");
        }
        while (pilat != null) {
            Nodo temp1 = new Nodo(pilat.numero);
            temp1.siguiente = temp;
            temp = temp1;
            pila = temp;
            pilat = pilat.siguiente;
        }
    }

    final void modificar(int numero, int buscar) {
        Nodo temp = pila;
        Nodo pilat = null;
        while ((temp.numero != buscar) && (temp.siguiente != null)) {
            Nodo temp1 = new Nodo(temp.numero);
            temp1.siguiente = pilat;
            pilat = temp1;
            pila = pila.siguiente;
            temp = temp.siguiente;
        }
        if (temp.numero == buscar) {
            temp.numero = numero;
        } else {
            System.out.println("El número " + buscar + " no existe");
        }
        while (pilat != null) {
            Nodo temp1 = new Nodo(pilat.numero);
            temp1.siguiente = temp;
            temp = temp1;
            pila = temp;
            pilat = pilat.siguiente;
        }
    }

    final void imprimir() {
        Nodo temp = pila;
        int salto = 0;
        while (temp != null) {
            System.out.print(temp.numero + " ");
            temp = temp.siguiente;
            if (salto == 20) {
                System.out.println();
                salto = 0;
            }
        }
    }

}
