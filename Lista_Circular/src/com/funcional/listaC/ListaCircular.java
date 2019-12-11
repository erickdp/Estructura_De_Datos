/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcional.listaC;

/**
 *
 * @author Erick Díaz
 * Estructura de Datos: Lista circular.
 */
public class ListaCircular {

    private Nodo top = null;
    private Nodo last = null;

    private class Nodo {

        int number;
        Nodo next;

        public Nodo(int number) {
            this.number = number;
            next = null;
        }

    }

    void setFirst(int bit) {
        Nodo temp = new Nodo(bit);
        if (top == null) {
            temp.next = temp;
            last = temp;
        } else {
            temp.next = top;
            last.next = temp;
        }
        top = temp;
    }
    
    void setLast(int bit) {
        Nodo temp = new Nodo(bit);
        if (top == null) {
            temp.next = temp;
            top = temp;
        } else {
            last.next = temp;
            temp.next = top;
        }
        last = temp;
    }
    
    void setAfter(int number, int bite) {
        Nodo temp = top;
        if (top.number == number) {
            Nodo temp1 = new Nodo(bite);
            temp1.next = top.next;
            top.next = temp1;
        } else {
            do {                
                temp = temp.next;
            } while ((temp.number != number) && (temp != top));
            if (temp != top) {
                Nodo temp1 = new Nodo(bite);
                temp1.next = temp.next;
                temp.next = temp1;
            } else {
                System.out.println(number + " doesn't exist.");
            }
        }
    }

    void putOnScreen() {
        Nodo temp = top;
        do {
            System.out.println(temp.number);
            temp = temp.next;
        } while (temp != top);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaCircular lc = new ListaCircular();
        for (int i = 1; i < 6; i++) {
            lc.setLast(i * 5);
        }
        lc.putOnScreen();
    }

}
