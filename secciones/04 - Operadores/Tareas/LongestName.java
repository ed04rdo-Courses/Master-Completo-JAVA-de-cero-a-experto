
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 * Solicita nombres y muestra el nombre propio más largo.
 */
public class LongestName {

    /**
     * Constructor de la aplicación.
     */
    public LongestName() {
    }

    /**
     * Solicita la cantidad de personas y sus nombres, y muestra el nombre
     * propio más largo entre los datos ingresados.
     *
     * @param args argumentos de línea de comandos; no se utilizan
     */
    public static void main(String[] args) {
        Integer numPersons = getNumNames();
        String[] namesArray = new String[numPersons];

        namesArray = getNames(namesArray, namesArray.length);

        String longest = getLongestName(namesArray);

        JOptionPane.showMessageDialog(null, longest);

    }

    /**
     * Solicita recursivamente una cantidad válida de nombres.
     * La cantidad aceptada debe ser un dígito entre 1 y 9.
     *
     * @return cantidad de nombres que se solicitarán
     */
    private static Integer getNumNames() {
        String number = JOptionPane.showInputDialog("Ingrese el número de nombres a comparar: ");

        if (number.matches("^[1-9]$")) {
            return Integer.valueOf(number);
        }

        JOptionPane.showMessageDialog(null, "Ingrese un número distinto a 0 y menor a 10");
        return getNumNames();
    }

    /**
     * Solicita y almacena los nombres mediante llamadas recursivas.
     * Si un nombre no es válido, vuelve a solicitarlo para la misma persona.
     *
     * @param names arreglo donde se almacenan los nombres
     * @param length número de la persona que se está solicitando; disminuye
     *               en cada llamada recursiva
     * @return el arreglo completado, o {@code null} si se cancela el diálogo
     */
    private static String[] getNames(String[] names, Integer length) {
        String nameString = JOptionPane.showInputDialog("Ingrese el nombre de la persona " + length + ": ");

        if (nameString == null) {
            return null; // Canceló
        }

        if (!isValid(nameString)) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre válido, usando solo letras y espacios.");
            return getNames(names, length);
        }

        names[length - 1] = nameString;

        if (length == 1) {
            return names;
        }

        return getNames(names, length - 1);
    }

    /**
     * Comprueba que el texto contenga dos grupos de letras separados por un
     * único espacio, ignorando espacios al inicio y al final.
     *
     * @param name texto que se desea validar
     * @return {@code true} si el texto cumple el formato; de lo contrario,
     *         {@code false}
     */
    private static boolean isValid(String name) {
        return name != null
                && !name.isBlank()
                && name.strip().matches("[\\p{L}]+ [\\p{L}]+");
    }

    /**
     * Busca el nombre propio de mayor longitud y devuelve el nombre completo
     * asociado.
     *
     * @param names arreglo con nombres completos, cada uno separado en nombre
     *              propio y apellido por un espacio
     * @return nombre completo cuyo nombre propio tiene más caracteres, o una
     *         cadena vacía si el arreglo no contiene elementos
     */
    private static String getLongestName(String[] names) {
        return Arrays.stream(names)
                .max(Comparator.comparingInt(nombreCompleto
                        -> nombreCompleto.substring(0, nombreCompleto.indexOf(' ')).length()))
                .orElse("");
    }

}
