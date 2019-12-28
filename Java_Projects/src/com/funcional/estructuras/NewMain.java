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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola cola = new Cola();
        for (int i = 1; i < 6; i++) {
            cola.insercion(i * 5);
        }
        cola.imprimir();
        cola.modificarNodo(0, 15);
        System.out.println("");
        cola.imprimir();
    }

}
