
package com.funcional.estructuras;

/**
 *
 * @author Erick Díaz
 */
public class Arreglo {

    public int[] numeros;
    private int contador = 0; //Contador que ayuda a que nuestro arreglo simule ser dinámico
    //permitiendo aumentar o eliminar posiciones.

    public final void insercion(int numero) {
        numeros[contador] = numero;
        contador++;
    }

    public final void eliminar(int buscar) {
        boolean bandera = false;
        int posicion = 0;
        for (int i = 0; i < numeros.length; i++) {
            if ((numeros[i] == buscar) || (bandera)) {
                if (((i + 1) != numeros.length) && (numeros[i] != 0)) {
                    /*
                    1. Una vez encontrado el dato a eliminar nuestra bandera
                    permitirá el pasó para que el algoritmo continue, 
                    dando al dato del vector el siguiente para enviar
                    los ceros al final
                    2. El numeros[i[ != 0 para recorrer hasta el último cero
                    y no hacer hasta la último posición
                    */
                    numeros[i] = numeros[i + 1];
                }
                bandera = true;
            }
        }
        if (bandera) {
            numeros[numeros.length - 1] = 0; //Practicamente solo se usará una vez
            contador--;
        } else {
            System.out.println("El número " + buscar + " no existe.");
        }
    }

    public final void insercionDespues(int numero, int buscar) {
        int posicion = 0;
        boolean bandera = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                agregarPosicion(); //Métoo que permite aumentar el número de posiciones en el arrreglo
                bandera = true;
                posicion = i;
                break;
            }
        }
        if (bandera) {
            for (int i = numeros.length - 1; i > posicion; i--) {
                numeros[i] = numeros[i - 1]; //Se recorren los números de la iz a la derecha
            }
            numeros[posicion + 1] = numero;
            /*
            Ej:
            El vector 5 4 3 3 2 1 
            será      5 4 3 n 2 1
            */
        } else {
            System.out.println("El número " + buscar + " no existe.");
        }
    }

    public final void insercionAntes(int numero, int buscar) {
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

    public final void modificar(int numero, int buscar) {
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

    /**
     * Este método ayuda a adicionar posiciones al vector
     * creando un vector auxiliar con una posición +1 del actual
     * vector y al final copiando la dirección de memoria
     * al vector original
     */
    private void agregarPosicion() {
        int[] aux = new int[numeros.length + 1];
        for (int i = 0; i < numeros.length; i++) {
            aux[i] = 0;
        }
        for (int i = 0; i < numeros.length; i++) {
            aux[i] = numeros[i];
            numeros[i] = 0;
        }
        aux[aux.length - 1] = 0;
        numeros = aux;
        contador++;
    }

    public final void imprimirArreglo() {
        int co = 0;
        for (int numero : numeros) {
            System.out.print(numero + " ");
            co++;
            if (co == 20) {
                System.out.println();
                co = 0;
            }
        }
    }
    
    /**
     * Método que encera al vector una vez
     * inicializado en main.
     */
    public final void encerar() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 0;
        }
    }
}
