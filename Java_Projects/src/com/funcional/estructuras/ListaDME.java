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
public class ListaDME {

    private class Nodo {

        int numero;
        Nodo siguiente;
        Nodo anterior;

        private Nodo(int numero) {
            this.numero = numero;
            siguiente = null;
            anterior = null;
        }
    }

    private Nodo top = null;
    private Nodo ultimo = null;
    public int longitud = 0;

    public final void insercionInicio(int numero) {
        Nodo temp = new Nodo(numero);
        if (top != null) {
            temp.siguiente = top;
            top.anterior = temp;
        }
        top = temp;
        longitud++;
    }

    public final void insercionFinal(int numero) {
        Nodo temp = new Nodo(numero);
        if (top == null) {
            top = temp;
        } else {
            ultimo.siguiente = temp;
            temp.anterior = ultimo;
        }
        ultimo = temp;
        longitud++;
    }

    public final void impresionLista() {
        Nodo temp = top;
        int salto = 0;
        while (temp != null) {
            System.out.print(temp.numero + " ");
            salto++;
            if (salto == 20) {
                System.out.println("");
                salto = 0;
            }
            temp = temp.siguiente;
        }
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
        }
        return vector;
    }

}
