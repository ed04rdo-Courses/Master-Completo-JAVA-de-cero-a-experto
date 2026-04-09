
import javax.swing.JOptionPane;


public class OperadorAritmetico {

    public static void main(String[] args) {

        // Declaración en una línea de mismo tipo
        int i = 5, j = 4, suma = i + j;

        System.out.println("Suma: " + suma);

        int multi = i * j;
        System.out.println("Multiplicación: " + multi);

        // Variable resultante int
        int div = i / j;
        System.out.println("int div = " + i + " / " + j + ": " + div);

        // Variable resultante float
        float div2 = i / j;
        System.out.println("float div2 = " + i + " / " + j + ": " + div2);

        // Variable resultante con cast de divisor y dividendo
        float div3 = (float) i / (float) j;
        System.out.println("float div3 = (float) " + i + " / (float) " + j + ": " + div3);

        
        int modulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        if (modulo % 2 == 0) {
            System.out.println("El número " + modulo + " es par");
        }else {
            System.out.println("El número " + modulo + " es impar");
        }
    }
}
