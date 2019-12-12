/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcional.estructuras;

/**
 * Clase que representa operaciones básicas admitidas
 * en una Pila
 * @author Erick Díaz
 */
public class Pila {
    
    private Nodo pila = null;

    private class Nodo {

        int number;
        Nodo next;

        public Nodo(int number) {
            this.number = number;
            this.next = null;
        }

    }
    
    void add(int bite) {
        Nodo temp = new Nodo(bite);
        temp.next = pila;
        pila = temp;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
