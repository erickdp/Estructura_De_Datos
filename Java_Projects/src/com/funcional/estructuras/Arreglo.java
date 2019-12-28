/*;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcional.estructuras;

/**
 *
 * @author Erick Díaz
 */
public class Arreglo {

    public int[] numeros;
    private int contador = 0;

    final void insercion(int numero) {
        numeros[contador] = numero;
        contador++;
    }

    final void eliminar(int buscar) {
        boolean bandera = false;
        int posicion = 0;
        for (int i = 0; i < numeros.length; i++) {
            if ((numeros[i] == buscar) || (bandera)) {
                if (((i + 1) != numeros.length) && (numeros[i] != 0)) {
                    numeros[i] = numeros[i + 1];
                }
                bandera = true;
            }
        }
        if (bandera) {
            numeros[numeros.length - 1] = 0;
            contador--;
        } else {
            System.out.println("El número " + buscar + " no existe.");
        }
    }

    final void insercionDespues(int numero, int buscar) {
        int posicion = 0;
        boolean bandera = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                agregarPosicion();
                bandera = true;
                posicion = i;
                break;
            }
        }
        if (bandera) {
            for (int i = numeros.length - 1; i > posicion; i--) {
                numeros[i] = numeros[i - 1];
            }
            numeros[posicion + 1] = numero;
        } else {
            System.out.println("El número " + buscar + " no existe.");
        }
    }

    final void insercionAntes(int numero, int buscar) {
        int posicion = 0;
        boolean bandera = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                agregarPosicion();
                bandera = true;
                posicion = i;
                break;
            }
        }
        if (bandera) {
            for (int i = numeros.length - 1; i > posicion - 1; i--) {
                if (i != 0) {
                    numeros[i] = numeros[i - 1];
                }
            }
            numeros[posicion] = numero;
        } else {
            System.out.println("El número " + buscar + " no existe.");
        }
    }

    final void modificar(int numero, int buscar) {
        boolean bandera = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                numeros[i] = numero;
                bandera = true;
                break;
            }
        }
        if (!bandera) {
            System.out.println("El número " + buscar + " no existe.");
        }
    }

    private void agregarPosicion() {
        int[] aux = new int[numeros.length + 1];
        for (int i = 0; i < numeros.length; i++) {
            aux[i] = numeros[i];
        }
        aux[aux.length - 1] = 0;
        numeros = aux;
        contador++;
    }

    final void imprimirArreglo() {
        int contador = 0;
        for (int numero : numeros) {
            System.out.print(numero + " ");
            contador++;
            if (contador == 20) {
                System.out.println();
                contador = 0;
            }
        }
    }
}
