package org.eruiz.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eruiz.poointerfaces.modelo.Cliente;
import org.eruiz.poointerfaces.modelo.ClientePremium;

/**
 * Ejemplo de uso de colecciones y métodos genéricos para convertir arreglos
 * en listas.
 */
public class EjemploGenerics {

    /**
     * Crea una lista de clientes y muestra listas obtenidas a partir de
     * arreglos de clientes y números enteros.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Eduardo", "Ruiz"));

        //Cliente eduardo = (Cliente)clientes.get(0);
        Cliente eduardo = clientes.iterator().next();

        Cliente[] clientesArray = {
            new Cliente("Gerardo", "Ruiz"),
            new Cliente("Ramiro", "Ruiz")
        };

        Integer[] enteros = {
            1,
            2,
            3,
            4,
            5
        };

        List<Cliente> clientesList = fromArrayToList(clientesArray);
        List<Integer> integerList = fromArrayToList(enteros);
        // Nota: Los genéricos no pueden ser tipos de datos primitivos
        List<String> nombres = fromArrayToList(new String[]{"Andres","Ramses"}, new Integer[]{1,2,3,4,5}); 
        List<ClientePremium> clientePremiumList = fromArrayToList(
            new ClientePremium[]{
                new ClientePremium("VIP 1", "VIP 1 LN"),
                new ClientePremium("VIP 2", "VIP 2 LN")
            });

        clientesList.forEach(System.out::println);
        integerList.forEach(System.out::println);
        nombres.forEach(System.out::println);

        imprimirClientes(clientes);
        imprimirClientes(clientesList);
        imprimirClientes(clientePremiumList);
    }

    /**
     * Convierte un arreglo en una lista cuyos elementos tienen el mismo tipo
     * que los elementos del arreglo.
     *
     * @param <T> tipo de los elementos del arreglo y de la lista resultante
     * @param c arreglo que se convertirá en lista
     * @return una lista respaldada por el arreglo recibido
     */
    public static <T> List<T> fromArrayToList(T[] c) {

        return Arrays.asList(c);
    }

    /**
     * Convierte un arreglo de números en una lista.
     *
     * <p>El límite {@code T extends Number} restringe el tipo de sus elementos
     * a {@code Number} o a una de sus subclases, como {@code Integer} o
     * {@code Double}.</p>
     *
     * @param <T> tipo concreto de número contenido en el arreglo
     * @param c arreglo de números que se convertirá en lista
     * @return una lista respaldada por el arreglo recibido
     */
    public static <T extends Number> List<T> fromNumberArrayToList(T[] c) {

        return Arrays.asList(c);
    }

    /**
     * Convierte un arreglo de clientes en una lista.
     *
     * <p>El límite múltiple {@code T extends Cliente & Comparable<T>} exige
     * que el tipo de los elementos sea una subclase de {@code Cliente} y que
     * implemente {@code Comparable} para poder compararse con otros elementos
     * de ese mismo tipo. Aunque el método no realiza comparaciones, el tipo
     * debe cumplir ambos requisitos para poder utilizarlo.</p>
     *
     * @param <T> tipo concreto de cliente que implementa
     *            {@code Comparable<T>}
     * @param c arreglo de clientes que se convertirá en lista
     * @return una lista respaldada por el arreglo recibido
     */
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c) {

        return Arrays.asList(c);
    }

    /**
     * Convierte el primer arreglo en una lista e imprime los elementos del
     * segundo arreglo.
     *
     * @param <T> tipo de los elementos del primer arreglo y de la lista
     *            resultante
     * @param <G> tipo de los elementos del segundo arreglo
     * @param c arreglo cuyos elementos se devolverán en la lista
     * @param g arreglo cuyos elementos se imprimirán
     * @return una lista respaldada por el primer arreglo
     */
    public static <T, G> List<T> fromArrayToList(T[] c, G[] g) {
        for (G elemento: g) {
            System.out.println(elemento);
        }

        return Arrays.asList(c);
        
    }

    public static void imprimirClientes(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }
}
