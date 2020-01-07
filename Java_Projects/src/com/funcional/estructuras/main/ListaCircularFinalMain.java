package com.funcional.estructuras.main;

import com.funcional.control.Funcional;
import com.funcional.estructuras.ListaCircular;

/**
 *
 * @author Erick Díaz
 */
public class ListaCircularFinalMain {

    private static ListaCircular lc = new ListaCircular();

    final static void transformacion(int[] vector) {
        for (int i : vector) {
            lc.insercionFinal(i);
        }
    }

    final static void menuListaCircular(int[] vector, boolean ultimo) {
        boolean door = false;
        if (ultimo) {
            lc = new ListaCircular();
            transformacion(vector);
            System.out.println("Atención: \nTransformación con éxito, puede volver a realizar "
                    + " una nueva inserción o utilizar las opciones alternas de la estructura.");
            lc.impresionLista();
            door = true;
            System.out.println("");
        }
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
                        lc.insercionFinal(i * multiplo);
                    }
                    lc.impresionLista();
                    door = true;
                    break;
                case 2:
                    System.out.println("(Solo Número Enteros)");
                    System.out.print("Ingrese el número a buscar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número a insertar: ");
                    numero = Funcional.leer.nextInt();
                    lc.insercionDespues(numero, buscar);
                    lc.impresionLista();
                    break;
                case 3:
                    System.out.println("(Solo Número Enteros)");
                    System.out.print("Ingrese el número a buscar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número a insertar: ");
                    numero = Funcional.leer.nextInt();
                    lc.insercionAntes(numero, buscar);
                    lc.impresionLista();
                    break;
                case 4:
                    System.out.print("Ingrese el nodo a modificar: ");
                    buscar = Funcional.leer.nextInt();
                    System.out.print("Ingrese el nuevo número: ");
                    numero = Funcional.leer.nextInt();
                    lc.modificarNodo(numero, buscar);
                    lc.impresionLista();
                    break;
                case 5:
                    System.out.print("Ingrese el nodo a eliminar: ");
                    numero = Funcional.leer.nextInt();
                    lc.eliminarNodo(numero);
                    lc.impresionLista();
                    break;
                case 6:
                    int opcion2 = 0;
                    int opcion3 = 0;
                    if (door) {
                        do {
                            System.out.println("- - - - Transformar a: - - - -");
                            System.out.println("1. Arreglos");
                            System.out.println("2. Lista Simple");
                            System.out.println("3. Lista Circular (Inserción Inicio)");
                            System.out.println("4. Pila");
                            System.out.println("5. Cola");
                            System.out.println("6. Lista Doblemente Enlazada");
                            System.out.println("7. Volver");
                            System.out.print("Ingrese una opción a transformar: ");
                            opcion2 = Funcional.leer.nextInt();
                            switch (opcion2) {
                                case 1:
                                    ArregloMain.menuArreglo(lc.vector(), true);
                                    break;
                                case 2:
                                    System.out.println("1. Inserción Inicio");
                                    System.out.println("2. Inserción Final");
                                    System.out.print("Digite: ");
                                    opcion3 = Funcional.leer.nextInt();
                                    switch (opcion3) {
                                        case 1:
                                            ListaSimpleInicioMain.menuListaSimple(lc.vector(), true);
                                            break;
                                        case 2:
                                            ListaSimpleFinalMain.menuListaSimple(lc.vector(), true);
                                            break;
                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;
                                    }
                                    break;
                                case 3:
                                    ListaCircularInicioMain.menuListaCircular(lc.vector(), true);
                                    break;
                                case 4:
                                    PilaInicioMain.menuListaSimple(lc.vector(), true);
                                    break;
                                case 5:
                                    ColaMain.menuListaSimple(lc.vector(), true);
                                    break;
                                case 6:
                                    System.out.println("1. Inserción Inicio");
                                    System.out.println("2. Inserción Final");
                                    System.out.print("Digite: ");
                                    opcion3 = Funcional.leer.nextInt();
                                    switch (opcion3) {
                                        case 1:
                                            ListaDBEMain.menuListaDME(lc.vector(), true);
                                            break;
                                        case 2:
                                            ListaDBEMainFinal.menuListaDME(lc.vector(), true);
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
