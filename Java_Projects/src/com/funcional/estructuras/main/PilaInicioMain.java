/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Toopi | Templates
 * and open the template in the editor.
 */
package com.funcional.estructuras.main;

import com.funcional.control.Funcional;
import com.funcional.estructuras.Pila;

/**
 *
 * @author Erick Díaz
 */
public class PilaInicioMain {
    
    private static Pila pi = new Pila();
    
    private static void transformacion(int[] vector) {
        for (int i : vector) {
            pi.insercion(i);
        }
    }
    
    final static void menuListaSimple(int[] vector, boolean inicio) {
        boolean door = false;
        if (inicio) {
            transformacion(vector);
            System.out.println("Atención: \nTransformación con éxito, puede volver a realizar "
                    + " una nueva inserción o utilizar las opciones alternas de la estructura.");
            pi.imprimir();
            door = true;
            System.out.println("");
        }
        System.out.print("- - - - - - - - - LISTA SIMPLE - - - - - - - - -");
        int opcion = 0;
        int numeros;
        int buscar;
        int numero;
        int multiplo;
        do {
            System.out.println("\n1. Inserción al Inicio");
            System.out.println("2. Inserción después de ");
            System.out.println("3. Inserción antes de ");
            System.out.println("4. Modificar nodo");
            System.out.println("5. Eliminar Nodo");
            System.out.println("6. Transformación de Estructura");
            System.out.println("7. Salir");
            opcion = Funcional.leer.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.print("Ingrese la cantidad de números que conformarán la"
                                + " lista circular (debe ser mayor a 1): ");
                        numeros = Funcional.leer.nextInt();
                    } while (numeros < 1);
                    do {
                        System.out.print("Ingrese el múltiplo que conformará la lista: ");
                        multiplo = Funcional.leer.nextInt();
                    } while (multiplo < 0);
                    for (int i = 1; i < numeros + 1; i++) {
                        pi.insercion(i * multiplo);
                    }
                    pi.imprimir();
                    door = true;
                    break;
                case 2:
                    System.out.println("(Solo Número Enteros)");
                    System.out.print("Ingrese el número a buscar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número a insertar: ");
                    numero = Funcional.leer.nextInt();
                    pi.insercionDespues(numero, buscar);
                    pi.imprimir();
                    break;
                case 3:
                    System.out.println("(Solo Número Enteros)");
                    System.out.print("Ingrese el número a buscar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número a insertar: ");
                    numero = Funcional.leer.nextInt();
                    pi.insercionAntes(numero, buscar);
                    pi.imprimir();
                    break;
                case 4:
                    System.out.print("Ingrese el nodo a modificar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número: ");
                    numero = Funcional.leer.nextInt();
                    pi.modificar(numero, buscar);
                    pi.imprimir();
                    break;
                case 5:
                    System.out.print("Ingrese el nodo a eliminar: ");
                    numero = Funcional.leer.nextInt();
                    pi.eliminarNodo(numero);
                    pi.imprimir();
                    break;
                case 6:
                    int opcion2 = 0;
                    int opcion3 = 0;
                    if (door) {
                        do {
                            System.out.println("- - - - Transformar a: - - - -");
                            System.out.println("1. Arreglos");
                            System.out.println("2. Lista Simple");
                            System.out.println("3. Lista Circular");
                            System.out.println("4. Cola");
                            System.out.println("5. Lista Doblemente Enlazada");
                            System.out.println("6. Volver");
                            System.out.print("Ingrese una opción a transformar: ");
                            opcion2 = Funcional.leer.nextInt();
                            switch (opcion2) {
                                case 1:
                                    ArregloMain.menuArreglo(pi.vector(), true);
                                    break;
                                case 2:
                                    System.out.println("1. Inserción Inicio");
                                    System.out.println("2. Inserción Final");
                                    System.out.print("Digite: ");
                                    opcion3 = Funcional.leer.nextInt();
                                    switch (opcion3) {
                                        case 1:
                                            ListaSimpleInicioMain.menuListaSimple(pi.vector(), true);
                                            break;
                                        case 2:
                                            ListaSimpleFinalMain.menuListaSimple(pi.vector(), true);
                                            break;
                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;
                                    }
                                case 3:
                                    System.out.println("1. Inserción Inicio");
                                    System.out.println("2. Inserción Final");
                                    System.out.print("Digite: ");
                                    opcion3 = Funcional.leer.nextInt();
                                    switch (opcion3) {
                                        case 1:
                                            ListaCircularInicioMain.menuListaCircular(pi.vector(), true);
                                            break;
                                        case 2:
                                            ListaCircularFinalMain.menuListaCircular(pi.vector(), true);
                                            break;
                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;
                                    }
                                    break;
                                case 4:
                                    ColaMain.menuListaSimple(pi.vector(), true);
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Opción Incorrecta, vuelva a intentar.");
                            }
                        } while (opcion2 != 6);
                    } else {
                        System.out.println("La Lista está vacía, ingrese valores primero.");
                    }
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
