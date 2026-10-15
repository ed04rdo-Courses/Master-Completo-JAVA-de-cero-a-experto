import javax.swing.JOptionPane;

/**
 * Solicita el nivel de combustible de un estanque con capacidad de 70 litros
 * y muestra su categoría.
 *
 * <p>Las categorías se determinan según el nivel ingresado:
 * <ul>
 *   <li>70 litros: estanque lleno.</li>
 *   <li>Desde 60 y menos de 70: estanque casi lleno.</li>
 *   <li>Desde 40 y menos de 60: estanque 3/4.</li>
 *   <li>Desde 35 y menos de 40: medio estanque.</li>
 *   <li>Desde 20 y menos de 35: suficiente.</li>
 *   <li>Desde 1 y menos de 20: insuficiente.</li>
 * </ul>
 */
public class FuelGauge {
 
    /**
     * Crea una instancia de {@code FuelGauge}.
     */
    public FuelGauge() {
    }

    /**
     * Solicita el nivel de combustible y muestra la categoría correspondiente.
     *
     * @param args argumentos de línea de comandos; no se utilizan
     */
    public static void main(String[] args) {
        Double fuelLevel = getFuelLevel();
        JOptionPane.showMessageDialog(null, "Nivel de combustible: "+ validateFuelLevel(fuelLevel));
    }

    /**
     * Solicita un nivel de combustible hasta que el usuario ingrese un valor
     * con formato válido y dentro del rango de 1 a 70 litros.
     *
     * <p>Se aceptan números enteros o decimales con exactamente dos cifras
     * decimales.
     *
     * @return el nivel de combustible validado
     */
    private static Double getFuelLevel(){
        String fuelLevel = JOptionPane.showInputDialog("Ingrese en litros el nivel de combustible en el tanque: ");

        if (fuelLevel.matches("^\\d+(\\.\\d\\d)?$")) {
            Double level = Double.valueOf(fuelLevel);
            if ((level >= 1 && level <= 70)) {
                JOptionPane.showMessageDialog(null, "Valor capturado correctamente");
                return level;
            }
            JOptionPane.showMessageDialog(null, "Valor fuera del rango del tanque");
            return getFuelLevel();
        }

        JOptionPane.showMessageDialog(null, "Valor o formato incorrecto, intente nuevamente");
        return getFuelLevel();
    }

    /**
     * Determina la categoría correspondiente al nivel de combustible.
     *
     * @param fuelLevel nivel de combustible en litros
     * @return descripción de la categoría del estanque
     */
    private static String validateFuelLevel(Double fuelLevel){
        if (fuelLevel == 70) {
            return "Tanque lleno";
        } else if (fuelLevel >= 60) {
            return "Tanque casi lleno";
        } else if (fuelLevel >= 40) {
            return "Tanque 3/4";
        } else if (fuelLevel >= 35) {
            return "Medio tanque";
        } else if (fuelLevel >= 20) {
            return "Suficiente";
        } else if (fuelLevel >= 1) {
            return "Insuficiente";
        }
        return "Valor fuera del rango del tanque";
    } 
}