/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcional.estructuras;

import java.util.Scanner;

/**
 *
 * @author Erick Díaz Estructura de Datos: Lista circular.
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

    void setBefore(int number, int bite) {
        Nodo temp = top;
        while ((temp.next.number != number) && (temp.next != top)) {
            temp = temp.next;
        }
        if (temp.next.number == number) {
            Nodo temp1 = new Nodo(bite);
            temp1.next = temp.next;
            temp.next = temp1;
        } else {
            System.out.println(number + " doesn't exist.");
        }
    }

    void setAfter(int number, int bite) {
        Nodo temp = top;
        while ((temp.number != number) && (temp.next != top)) {
            temp = temp.next;
        }
        if (temp.number == number) {
            Nodo temp1 = new Nodo(bite);
            temp1.next = temp.next;
            temp.next = temp1;
        } else {
            System.out.println(number + " doesn't exist.");
        }
    }

    void deleteNode(int number) {
        Nodo temp = top;
        Nodo previous = top;
        if (temp.number == number) {
            do {
                previous = previous.next;
            } while (previous.next != top);
            top = top.next;
            previous.next = top;
        } else {
            do {
                previous = temp;
                temp = temp.next;
            } while ((temp.number != number) && (temp != top));
            if (temp != top) {
                previous.next = temp.next;
            } else {
                System.out.println(number + " doesn't exist");
            }
        }
    }

    void modify(int newNumber, int oldNumber) {
        Nodo temp = top;
        while ((temp.number != oldNumber) && (temp.next != top)) {
            temp = temp.next;
        }
        if (temp.number == oldNumber) {
            temp.number = newNumber;
        } else {
            System.out.println(oldNumber + " doesn't exist.");
        }
    }

    void ruleta() {
        Scanner leer = new Scanner(System.in);
        int exit = 0;
        Nodo temp = top;
        do {
            System.out.print("Ingrese el número de vueltas ");
            exit = leer.nextInt();
            for (int i = 0; i < exit; i++) {
                temp = temp.next;
            }
            System.out.println("The number is " + temp.number);
        } while (exit != -1);
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
        System.out.println("");
        // Se pueden utilizar todos los métodos de lista circular desarrollados.
    }

}
