package org.pooexcepciones.ejemplo;

import javax.swing.JOptionPane;

public class EjemploExcepciones {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        String value = JOptionPane.showInputDialog("Ingrese un entero: ");

        try {
            double division = calculadora.dividir(10, Double.parseDouble(value));

            System.out.println(division);
        } catch (DivisionPorZeroException dz) {
            System.out.println("Error: " + dz.getMessage());
            main(args);
        } catch (NumberFormatException nfe) {
            System.out.println("Error: " + nfe.getMessage());
            main(args);
        } finally {
            System.err.println("Este bloque se ejecuta siempre");
        }
        System.out.println("La aplicación sigue funcionando");
    }
}