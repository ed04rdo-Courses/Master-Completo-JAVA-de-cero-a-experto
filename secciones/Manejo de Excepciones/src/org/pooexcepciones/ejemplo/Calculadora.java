package org.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir(double numerador, double divisor) throws DivisionPorZeroException {
        if (divisor == 0) {
            throw new DivisionPorZeroException("No se puede dividir por 0");
            
        }
        return numerador / divisor;
    }
}
