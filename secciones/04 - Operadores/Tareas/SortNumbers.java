import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 * Solicita números al usuario, los ordena de menor a mayor y muestra el
 * resultado en una ventana.
 */
public class SortNumbers {

    /**
     * Crea una instancia de {@code SortNumbers}.
     */
    public SortNumbers() {
    }

    /**
     * Solicita la cantidad de números, los recoge, los ordena y muestra el
     * arreglo resultante.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        Integer totalNumbers = getTotalNumbers();
        Number[] numsArray = new Number[totalNumbers];
        numsArray = getNumbers(numsArray, 0);
        Arrays.sort(numsArray, Comparator.comparingDouble(Number::doubleValue));
        JOptionPane.showMessageDialog(null, "Arreglo ordenado: \n" + Arrays.toString(numsArray));
        
    }

    /**
     * Solicita cuántos números se van a ordenar. Solo acepta cantidades entre
     * 2 y 10; si el texto ingresado no coincide con el formato esperado,
     * vuelve a solicitarlo.
     *
     * @return la cantidad de números que se van a ingresar
     */
    private static Integer getTotalNumbers() {
        String totalNumbers = JOptionPane.showInputDialog("Ingrese cuantos números se van a ordenar (10 MAX): ");

        if (totalNumbers.matches("(?:0*[2-9]|0*10)")) {
            return Integer.valueOf(totalNumbers);
        }

        JOptionPane.showMessageDialog(null, "Valor incorrecto, intente nuevamente");
        return getTotalNumbers();
    }

    /**
     * Solicita y almacena recursivamente los números del arreglo. Cada entrada
     * debe contener dígitos enteros o una parte decimal separada por un punto.
     *
     * @param numsArray arreglo donde se almacenan los números
     * @param index índice que se debe completar
     * @return el arreglo completo
     */
    private static Number[] getNumbers(Number[] numsArray, int index) {
        if (index == numsArray.length) {
            return numsArray;
        }

        String num = JOptionPane.showInputDialog(
                "Ingrese el valor del número " + (index + 1) + " :");

        if (num != null && num.matches("(?:\\d+|\\d+\\.\\d+)")) {
            numsArray[index] = Double.valueOf(num);
            return getNumbers(numsArray, index + 1);
        }

        JOptionPane.showMessageDialog(null, "Valor no aceptado, intente nuevamente");
        return getNumbers(numsArray, index);
    }

}
