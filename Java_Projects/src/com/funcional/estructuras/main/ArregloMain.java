/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcional.estructuras.main;

import com.funcional.control.Funcional;
import com.funcional.estructuras.Arreglo;

/**
 *
 * @author Erick Díaz
 */
public class ArregloMain {

    private static Arreglo ar = new Arreglo();

    static final void menuArreglo(int[] vector, boolean bandera) {
        boolean door = false;
        int opcion = 0;
        int numeros;
        int buscar;
        int numero;
        int multiplo;
        System.out.println("- - - - - - - - - Arreglos - - - - - - - - -");
        if (bandera) {
            door = true;
            ar = new Arreglo();
            ar.numeros = vector;
            System.out.println("Atención: \nTransformación con éxito, puede volver a realizar "
                    + " una nueva inserción o utilizar las opciones alternas de la estructura.");
            ar.imprimirArreglo();
            System.out.println("");
        } else {
            do {
                System.out.print("Ingrese la cantidad de números que conformarán al"
                        + " arreglo (debe ser mayor a 1): ");
                numeros = Funcional.leer.nextInt();
            } while (numeros < 1);
            do {
                System.out.print("Ingrese el múltiplo que conformará el arreglo: ");
                multiplo = Funcional.leer.nextInt();
            } while (multiplo < 0);
            ar.numeros = new int[numeros];
            for (int i = 1; i < numeros + 1; i++) {
                ar.insercion(i * multiplo);
            }
            door = true;
            ar.imprimirArreglo();
        }
        do {
            System.out.println("\n1. Inserción");
            System.out.println("2. Inserción después de ");
            System.out.println("3. Inserción antes de ");
            System.out.println("4. Modificar nodo");
            System.out.println("5. Eliminar Nodo");
            System.out.println("6. Transformación de Lista");
            System.out.println("7. Salir");
            opcion = Funcional.leer.nextInt();
            switch (opcion) {
                case 1:
                    ar = new Arreglo();
                    do {
                        System.out.print("Ingrese la cantidad de números que conformarán al"
                                + " arreglo (debe ser mayor a 1): ");
                        numeros = Funcional.leer.nextInt();
                    } while (numeros < 1);
                    do {
                        System.out.print("Ingrese el múltiplo que conformará el arreglo: ");
                        multiplo = Funcional.leer.nextInt();
                    } while (multiplo < 0);
                    ar.numeros = new int[numeros];
                    ar.encerar();
                    for (int i = 1; i < numeros + 1; i++) {
                        ar.insercion(i * multiplo);
                    }
                    door = true;
                    ar.imprimirArreglo();
                    break;
                case 2:
                    System.out.println("(Solo Número Enteros)");
                    System.out.print("Ingrese el número a buscar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número a insertar: ");
                    numero = Funcional.leer.nextInt();
                    ar.insercionDespues(numero, buscar);
                    ar.imprimirArreglo();
                    break;
                case 3:
                    System.out.println("(Solo Número Enteros)");
                    System.out.print("Ingrese el número a buscar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número a insertar: ");
                    numero = Funcional.leer.nextInt();
                    ar.insercionAntes(numero, buscar);
                    ar.imprimirArreglo();
                    break;
                case 4:
                    System.out.print("Ingrese el nodo a modificar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número: ");
                    numero = Funcional.leer.nextInt();
                    ar.modificar(numero, buscar);
                    ar.imprimirArreglo();
                    break;
                case 5:
                    System.out.print("Ingrese el nodo a eliminar: ");
                    numero = Funcional.leer.nextInt();
                    ar.eliminar(numero);
                    ar.imprimirArreglo();
                    break;
                case 6:
                    int opcion2 = 0;
                    int opcion3 = 0;
                    if (door) {
                        do {
                            System.out.println("- - - - Transformar a: - - - -");
                            System.out.println("1. Lista Simple");
                            System.out.println("2. Lista Circular");
                            System.out.println("3. Pila");
                            System.out.println("4. Cola");
                            System.out.println("5. Lista Doblemente Enlazada");
                            System.out.println("6. Volver");
                            System.out.print("Digite: ");
                            opcion2 = Funcional.leer.nextInt();
                            switch (opcion2) {
                                case 1:
                                    System.out.println("1. Inserción Inicio");
                                    System.out.println("2. Inserción Final");
                                    System.out.print("Digite: ");
                                    opcion3 = Funcional.leer.nextInt();
                                    System.out.println("La Estructura Arreglo está vacia.");
                                    switch (opcion3) {
                                        case 1:
                                            ListaSimpleInicioMain.menuListaSimple(ar.numeros, true);
                                            break;
                                        case 2:
                                            ListaSimpleFinalMain.menuListaSimple(ar.numeros, true);
                                            break;
                                        default:
                                            System.out.println("Opción Incorrecta, intente de nuevo.");
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("1. Inserción Inicio");
                                    System.out.println("2. Inserción Final");
                                    System.out.print("Digite: ");
                                    opcion3 = Funcional.leer.nextInt();
                                    System.out.println("La Estructura Arreglo está vacia.");
                                    switch (opcion3) {
                                        case 1:
                                            ListaCircularInicioMain.menuListaCircular(ar.numeros, true);
                                            break;
                                        case 2:
                                            ListaSimpleFinalMain.menuListaSimple(ar.numeros, true);
                                            break;
                                        default:
                                            System.out.println("Opción Incorrecta, intente de nuevo.");
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("La Estructura Arreglo está vacia.");
                                    PilaInicioMain.menuListaSimple(ar.numeros, true);
                                    break;
                                case 4:
                                    System.out.println("La Estructura Arreglo está vacia.");
                                    ColaMain.menuListaSimple(ar.numeros, true);
                                    break;
                                case 5:
                                    System.out.println("1. Inserción Inicio");
                                    System.out.println("2. Inserción Final");
                                    System.out.print("Digite: ");
                                    opcion3 = Funcional.leer.nextInt();
                                    System.out.println("La Estructura Arreglo está vacia.");
                                    switch (opcion3) {
                                        case 1:
                                            ListaDBEMain.menuListaDME(ar.numeros, true);
                                            break;
                                        case 2:
                                            ListaDBEMainFinal.menuListaDME(ar.numeros, true);
                                            break;
                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;
                                    }
                                    break;
                                default:
                                    System.out.println("Opción Incorrecta, intente de nuevo");
                                    break;
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
