/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcional.estructuras;

import java.util.Scanner;

/**
 *
 * @author Erick Díaz
 */
public class ListaCircularMain {

    public ListaCircularMain() {
        menuListaCircular();
    }

    final static void menuListaCircular() {
        Scanner leer = new Scanner(System.in);
        ListaCircular lc = new ListaCircular();
        System.out.print("- - - - - - - - - LISTA CIRCULAR - - - - - - - - -");
        int opcion = 0;
        int numeros;
        int buscar;
        int numero;
        int multiplo;
        do {
            System.out.println("\n1. Inserción al Final");
            System.out.println("2. Inserción después de ");
            System.out.println("3. Inserción antes de ");
            System.out.println("4. Modificar nodo");
            System.out.println("5. Eliminar Nodo");
            System.out.println("6. Transformación de Lista");
            System.out.println("7. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
//                case 1:
//                    do {
//                        System.out.print("Ingrese la cantidad de números que conformarán la"
//                                + " lista circular (debe ser mayor a 1): ");
//                        numeros = leer.nextInt();
//                    } while (numeros < 1);
//                    do {
//                        System.out.print("Ingrese el múltiplo que conformará la lista: ");
//                        multiplo = leer.nextInt();
//                    } while (multiplo < 0);
//                    for (int i = 1; i < numeros + 1; i++) {
//                        lc.insercionInicio(multiplo * i);
//                    }
//                    lc.impresionLista();
//                    break;
                case 1:
                    do {
                        System.out.print("Ingrese la cantidad de números que conformarán la"
                                + " lista circular (debe ser mayor a 1): ");
                        numeros = leer.nextInt();
                    } while (numeros < 1);
                    do {
                        System.out.print("Ingrese el múltiplo que conformará la lista: ");
                        multiplo = leer.nextInt();
                    } while (multiplo < 0);
                    for (int i = 1; i < numeros + 1; i++) {
                        lc.insercionInicio(multiplo * i);
                    }
                    lc.impresionLista();
                    break;
                case 2:
                    System.out.println("(Solo Número Enteros)");
                    System.out.print("Ingrese el número a buscar: ");
                    buscar = leer.nextInt();
                    System.out.print("Ingrese el nuevo número a insertar: ");
                    numero = leer.nextInt();
                    lc.insercionDespues(numero, buscar);
                    lc.impresionLista();
                    break;
                case 3:
                    System.out.println("(Solo Número Enteros)");
                    System.out.print("Ingrese el número a buscar: ");
                    buscar = leer.nextInt();
                    System.out.print("Ingrese el nuevo número a insertar: ");
                    numero = leer.nextInt();
                    lc.insercionAntes(numero, buscar);
                    lc.impresionLista();
                    break;
                case 4:
                    System.out.print("Ingrese el nodo a modificar: ");
                    buscar = leer.nextInt();
                    System.out.print("Ingrese el nuevo número: ");
                    numero = leer.nextInt();
                    lc.modificarNodo(numero, buscar);
                    lc.impresionLista();
                    break;
                case 5:
                    System.out.print("Ingrese el nodo a eliminar: ");
                    numero = leer.nextInt();
                    lc.eliminarNodo(numero);
                    lc.impresionLista();
                    break;
                case 6:
                    //Algoritmo para transformar a otras listas
                    break;
                case 7:
                    System.out.println("- - - Saliendo - - -");
                    break;
                default:
                    System.out.println("Error al ingresar, intente de nuevo.");
            }
        } while (opcion != 7);
    }

}
