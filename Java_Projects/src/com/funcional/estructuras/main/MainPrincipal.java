/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcional.estructuras.main;

import com.funcional.control.Funcional;
import java.util.Scanner;

/**
 *
 * @author Erick Díaz
 */
public class MainPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("- - - - Estructura De Datos - Proyecto Final - - - -");
            System.out.println("1. Arreglos");
            System.out.println("2. Lista Simple");
            System.out.println("3. Lista Circular");
            System.out.println("4. Pila");
            System.out.println("5. Cola");
            System.out.println("6. Lista Doblemente Enlazada");
            System.out.println("7. SALIR");
            System.out.print("Seleccione una opción para trabajar con alguna estructura: ");
            opcion = leer.nextInt();
            int opcion3 = 0;
            switch (opcion) {
                case 1:
                    /*
                    En este caso al método de tranformación se envía un null para el vector
                    y un false para la bandera que permite el paso a la tranformación del vector,
                    pues si inicia el programa desde este main es por que se va a utilizar
                    la estructuras por primera vez.
                    */
                    ArregloMain.menuArreglo(null, false);
                    break;
                case 2:
                    /*
                    Dependiendo la estructura se tiene un main para una inserción
                    inicial o final de datos.
                    */
                    System.out.println("1. Inserción Inicio");
                    System.out.println("2. Inserción Final");
                    System.out.print("Digite: ");
                    opcion3 = Funcional.leer.nextInt();
                    switch (opcion3) {
                        case 1:
                            ListaSimpleInicioMain.menuListaSimple(null, false);
                            break;
                        case 2:
                            ListaSimpleFinalMain.menuListaSimple(null, false);
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
                            ListaCircularInicioMain.menuListaCircular(null, false);
                            break;
                        case 2:
                            ListaCircularFinalMain.menuListaCircular(null, false);
                            break;
                        default:
                            System.out.println("Opción incorrecta");
                            break;
                    }
                    break;
                case 4:
                    PilaInicioMain.menuListaSimple(null, false);
                    break;
                case 5:
                    ColaMain.menuListaSimple(null, false);
                    break;
                case 6:
                    System.out.println("1. Inserción Inicio");
                    System.out.println("2. Inserción Final");
                    System.out.print("Digite: ");
                    opcion3 = Funcional.leer.nextInt();
                    switch (opcion3) {
                        case 1:
                            ListaDBEMain.menuListaDME(null, false);
                            break;
                        case 2:
                            ListaDBEMainFinal.menuListaDME(null, false);
                            break;
                        default:
                            System.out.println("Opción incorrecta");
                            break;
                    }
                    break;
                default:
                    System.out.println("Opción incorrecta, intente de nuevo.");
            }
        } while (opcion != 7);
    }
    
}
