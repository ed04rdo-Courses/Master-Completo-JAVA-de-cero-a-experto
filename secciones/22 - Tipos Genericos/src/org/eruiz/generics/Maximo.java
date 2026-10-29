package org.eruiz.generics;

/**
 * Ejemplo de cómo encontrar el mayor de tres valores comparables.
 */
public class Maximo {

    /**
     * Muestra ejemplos de búsqueda del máximo con números y cadenas.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {

        System.out.println("El maximo entre 1,5,7 es: " + maximo(1, 5, 7));
        System.out.println("El maximo entre 7.34, 5.345, 3.28 es: " + maximo(7.34, 5.345, 3.28));
        System.out.println("El maximo entre zanahoria, arandano, manzana es: " + maximo("zanahoria", "arandano", "manzana"));
        
    }

    /**
     * Devuelve el mayor de tres valores según su orden natural.
     *
     * @param <T> tipo de los valores, que debe ser comparable
     * @param a primer valor
     * @param b segundo valor
     * @param c tercer valor
     * @return el mayor de los tres valores; en caso de empate, el primero
     */
    public static <T extends Comparable<? super T>> T maximo(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
    
}
