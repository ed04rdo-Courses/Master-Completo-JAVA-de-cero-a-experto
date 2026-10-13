import javax.swing.JOptionPane;

public class LongestName {

    public static void main(String[] args) {
        Integer numPersons = getNumNames();
        String[] namesArray = new String[numPersons];

    
    }

    private static Integer getNumNames() {
        String number = JOptionPane.showInputDialog("Ingrese el número de nombres a comparar: ");
        
        if (number.matches("^[1-9]$")) {
            return Integer.valueOf(number);
        }

        JOptionPane.showMessageDialog(null, "Ingrese un número distinto a 0 y menor a 10");
        return getNumNames();
    }

    private static String[] getNames(String[] names) {
        String number = JOptionPane.showInputDialog("Ingrese el número de nombres a comparar: ");
        return names;
    }

}