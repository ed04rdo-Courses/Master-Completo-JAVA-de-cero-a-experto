import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int size = calculateSize(scanner);
            int max = maxFromArray(size, scanner);
            System.out.println("El número mayor es: " + max);
        }
    }

    /**
     * Calculates the size of the array to be created based on user input.
     * @param scanner scanner to read the size from console
     * @return 
     */
    private static int calculateSize(Scanner scanner) {
        try {
            System.out.println("Ingrese la cantidad de números a comparar: ");
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

    /**
     * Calculates the maximum number from an array of integers using the ternary operator.
     * 
     * @param size array size to be created
     * @param scanner scanner to read the numbers from console
     * @return the maximum number from the array
     */
    private static int maxFromArray(int size, Scanner scanner) {

        int max = Integer.MIN_VALUE;
        int[] comparedNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ": ");
            comparedNumbers[i] = scanner.nextInt();

            max = (comparedNumbers[i] > max) ? comparedNumbers[i] : max;
        }

        return max;

    }
}
