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
    private int contador = 0;

    public final void insercion(int numero) {
        Nodo temp = new Nodo(numero);
        temp.siguiente = pila;
        pila = temp;
        contador++;
    }

    public final void insercionDespues(int numero, int buscar) {
        Nodo temp = pila;
        Nodo pilat = null;
        while ((temp != null) && (temp.numero != buscar)) {
            Nodo temp1 = new Nodo(temp.numero);
            temp1.siguiente = pilat;
            pilat = temp1;
            temp = temp.siguiente;
            pila = pila.siguiente;
        }
        if (temp != null) {
            //La lista original solo se puede modificar hacia la derecha 
            //Para izq se debe de copiar la dirección de memoria a la original
            Nodo temp1 = new Nodo(numero);
            temp1.siguiente = temp.siguiente;
            temp.siguiente = temp1;
            contador++;
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

    public final void eliminarNodo(int numero) {
        Nodo temp = pila;
        Nodo pilat = null;
        while ((temp != null) && (temp.numero != numero)) {
            Nodo temp1 = new Nodo(temp.numero);
            temp1.siguiente = pilat;
            pilat = temp1;
            temp = temp.siguiente;
            pila = pila.siguiente;
        }
        if (temp != null) {
            pila = pila.siguiente;
            temp = temp.siguiente;
            contador--;
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

    public final void modificar(int numero, int buscar) {
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

    public final void imprimir() {
        Nodo temp = pila;
        int salto = 0;
        while (temp != null) {
            System.out.print(temp.numero + " ");
            temp = temp.siguiente;
            salto++;
            if (salto == 20) {
                System.out.println("");
                salto = 0;
            }
        }
    }

    public final int length() {
        return contador;
    }

    public final int[] vector() {
        int vector[] = new int[length()];
        Nodo temp = pila;
        for (int i = 0; i < length(); i++) {
            vector[i] = temp.numero;
            temp = temp.siguiente;
            pila = pila.siguiente;
        }
        System.out.println("La Estructura Pila está vacía.");
        return vector;
    }

}
