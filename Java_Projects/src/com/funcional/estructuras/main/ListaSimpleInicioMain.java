/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcional.estructuras.main;

import com.funcional.control.Funcional;
import com.funcional.estructuras.ListaSimple;

/**
 *
 * @author Erick Díaz
 */
public class ListaSimpleInicioMain {

    private static ListaSimple ls = new ListaSimple();

    private static void transformacion(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            ls.insercionInicio(vector[i]);
            vector[i] = 0;
        }
    }

    final static void menuListaSimple(int[] vector, boolean inicio) {
        boolean door = false;
        System.out.println("- - - - - - - - - LISTA SIMPLE - - - - - - - - -");
        int opcion = 0;
        int numeros;
        int buscar;
        int numero;
        int multiplo;
        if (inicio) {
            ls = new ListaSimple();
            transformacion(vector);
            System.out.println("Atención: \nTransformación con éxito, puede volver a realizar "
                    + " una nueva inserción o utilizar las opciones alternas de la estructura.");
            ls.imprimirlista();
            door = true;
            System.out.println("");
        } else {
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
                ls.insercionInicio(i * multiplo);
            }
            ls.imprimirlista();
            door = true;
        }
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
                    ls = new ListaSimple();
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
                        ls.insercionInicio(i * multiplo);
                    }
                    ls.imprimirlista();
                    door = true;
                    break;
                case 2:
                    System.out.println("(Solo Número Enteros)");
                    System.out.print("Ingrese el número a buscar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número a insertar: ");
                    numero = Funcional.leer.nextInt();
                    ls.insercionDespues(numero, buscar);
                    ls.imprimirlista();
                    break;
                case 3:
                    System.out.println("(Solo Número Enteros)");
                    System.out.print("Ingrese el número a buscar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número a insertar: ");
                    numero = Funcional.leer.nextInt();
                    ls.insercionAntes(numero, buscar);
                    ls.imprimirlista();
                    break;
                case 4:
                    System.out.print("Ingrese el nodo a modificar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número: ");
                    numero = Funcional.leer.nextInt();
                    ls.modificarNodo(numero, buscar);
                    ls.imprimirlista();
                    break;
                case 5:
                    System.out.print("Ingrese el nodo a eliminar: ");
                    numero = Funcional.leer.nextInt();
                    ls.eliminarNodo(numero);
                    ls.imprimirlista();
                    break;
                case 6:
                    int opcion2 = 0;
                    int opcion3 = 0;
                    if (door) {
                        do {
                            System.out.println("- - - - Transformar a: - - - -");
                            System.out.println("1. Arreglos");
                            System.out.println("2. Lista Simple (Inserción Final)");
                            System.out.println("3. Lista Circular");
                            System.out.println("4. Pila");
                            System.out.println("5. Cola");
                            System.out.println("6. Lista Doblemente Enlazada");
                            System.out.println("7. Volver");
                            System.out.print("Ingrese una opción a transformar: ");
                            opcion2 = Funcional.leer.nextInt();
                            switch (opcion2) {
                                case 1:
                                    ArregloMain.menuArreglo(ls.vector(), true);
                                    break;
                                case 2:
                                    ListaSimpleFinalMain.menuListaSimple(ls.vector(), true);
                                case 3:
                                    System.out.println("1. Inserción Inicio");
                                    System.out.println("2. Inserción Final");
                                    System.out.print("Digite: ");
                                    opcion3 = Funcional.leer.nextInt();
                                    switch (opcion3) {
                                        case 1:
                                            ListaCircularInicioMain.menuListaCircular(ls.vector(), true);
                                            break;
                                        case 2:
                                            ListaCircularFinalMain.menuListaCircular(ls.vector(), true);
                                            break;
                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;
                                    }
                                    break;
                                case 4:
                                    PilaInicioMain.menuListaSimple(ls.vector(), true);
                                    break;
                                case 5:
                                    ColaMain.menuListaSimple(ls.vector(), true);
                                    break;
                                case 6:
                                    System.out.println("1. Inserción Inicio");
                                    System.out.println("2. Inserción Final");
                                    System.out.print("Digite: ");
                                    opcion3 = Funcional.leer.nextInt();
                                    switch (opcion3) {
                                        case 1:
                                            ListaDBEMain.menuListaDME(ls.vector(), true);
                                            break;
                                        case 2:
                                            ListaDBEMainFinal.menuListaDME(ls.vector(), true);
                                            break;
                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;
                                    }
                                    break;
                                default:
                                    System.out.println("Opción Incorrecta, vuelva a intentar.");
                            }
                        } while (opcion2 != 7);
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
