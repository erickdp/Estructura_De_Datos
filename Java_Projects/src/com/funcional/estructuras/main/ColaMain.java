/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcional.estructuras.main;

import com.funcional.control.Funcional;
import com.funcional.estructuras.Cola;

/**
 *
 * @author Erick Díaz
 */
public class ColaMain {

    private static Cola co = new Cola();

    private static void transformacion(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            co.insercion(vector[i]);
            vector[i] = 0;
        }
    }

    final static void menuListaSimple(int[] vector, boolean inicio) {
        boolean door = false;
        System.out.println("- - - - - - - - - COLA - - - - - - - - -");
        int opcion = 0;
        int numeros;
        int buscar;
        int numero;
        int multiplo;
        if (inicio) {
            co = new Cola();
            transformacion(vector);
            System.out.println("Atención: \nTransformación con éxito, puede volver a realizar "
                    + " una nueva inserción o utilizar las opciones alternas de la estructura.");
            co.imprimir();
            System.out.println("");
            door = true;
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
                co.insercion(i * multiplo);
            }
            co.imprimir();
            door = true;
        }
        do {
            System.out.println("\n1. Inserción");
            System.out.println("2. Inserción después de ");
            System.out.println("3. Modificar nodo");
            System.out.println("4. Eliminar Nodo");
            System.out.println("5. Transformación de Estructura");
            System.out.println("6. Salir");
            opcion = Funcional.leer.nextInt();
            switch (opcion) {
                case 1:
                    co = new Cola();
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
                        co.insercion(i * multiplo);
                    }
                    co.imprimir();
                    door = true;
                    break;
                case 2:
                    System.out.println("(Solo Número Enteros)");
                    System.out.print("Ingrese el número a buscar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número a insertar: ");
                    numero = Funcional.leer.nextInt();
                    co.insercionDespues(numero, buscar);
                    co.imprimir();
                    break;
                case 3:
                    System.out.print("Ingrese el nodo a modificar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número: ");
                    numero = Funcional.leer.nextInt();
                    co.modificarNodo(numero, buscar);
                    co.imprimir();
                    break;
                case 4:
                    System.out.print("Ingrese el nodo a eliminar: ");
                    numero = Funcional.leer.nextInt();
                    co.eliminarNodo(numero);
                    co.imprimir();
                    break;
                case 5:
                    int opcion2 = 0;
                    int opcion3 = 0;
                    if (door) {
                        do {
                            System.out.println("- - - - Transformar a: - - - -");
                            System.out.println("1. Arreglos");
                            System.out.println("2. Lista Simple");
                            System.out.println("3. Lista Circular");
                            System.out.println("4. Pila");
                            System.out.println("5. Lista Doblemente Enlazada");
                            System.out.println("6. Volver");
                            System.out.print("Ingrese una opción a transformar: ");
                            opcion2 = Funcional.leer.nextInt();
                            switch (opcion2) {
                                case 1:
                                    ArregloMain.menuArreglo(co.vector(), true);
                                    break;
                                case 2:
                                    System.out.println("1. Inserción Inicio");
                                    System.out.println("2. Inserción Final");
                                    System.out.print("Digite: ");
                                    opcion3 = Funcional.leer.nextInt();
                                    switch (opcion3) {
                                        case 1:
                                            ListaSimpleInicioMain.menuListaSimple(co.vector(), true);
                                            break;
                                        case 2:
                                            ListaSimpleFinalMain.menuListaSimple(co.vector(), true);
                                            break;
                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("1. Inserción Inicio");
                                    System.out.println("2. Inserción Final");
                                    System.out.print("Digite: ");
                                    opcion3 = Funcional.leer.nextInt();
                                    switch (opcion3) {
                                        case 1:
                                            ListaCircularInicioMain.menuListaCircular(co.vector(), true);
                                            break;
                                        case 2:
                                            ListaCircularFinalMain.menuListaCircular(co.vector(), true);
                                            break;
                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;
                                    }
                                    break;
                                case 4:
                                    PilaInicioMain.menuListaSimple(co.vector(), true);
                                    break;
                                case 5:
                                    System.out.println("1. Inserción Inicio");
                                    System.out.println("2. Inserción Final");
                                    System.out.print("Digite: ");
                                    opcion3 = Funcional.leer.nextInt();
                                    switch (opcion3) {
                                        case 1:
                                            ListaDBEMain.menuListaDME(co.vector(), true);
                                            break;
                                        case 2:
                                            ListaDBEMainFinal.menuListaDME(co.vector(), true);
                                            break;
                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;
                                    }
                                    break;
                                default:
                                    System.out.println("Opción Incorrecta, vuelva a intentar.");
                                    break;
                            }
                        } while (opcion2 != 6);
                    } else {
                        System.out.println("La Estructura está vacía, ingrese valores primero.");
                    }
                    break;
                case 6:
                    System.out.println("- - - Saliendo - - -");
                    break;
                default:
                    System.out.println("Error al ingresar, intente de nuevo.");
            }
        } while (opcion != 6);
    }

}
