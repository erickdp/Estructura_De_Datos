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
            switch(opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    ListaCircularMain lcm = new ListaCircularMain();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción incorrecta, intente de nuevo.");
            }
        } while (opcion != 7);
    }
    
}
