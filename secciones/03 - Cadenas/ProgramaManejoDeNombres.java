import java.util.Locale;
import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String[] nombres = new String[3];
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            do {
                System.out.print("Ingrese el nombre (al menos 2 caracteres)" + (i + 1) + ": ");
                nombres[i] = scanner.nextLine();
            } while (nombres[i].length() < 2);

            resultado.append(Character.toUpperCase(nombres[i].charAt(1)))
                    .append(".")
                    .append(nombres[i].substring(nombres[i].length() - 2));

            if (i < 2) {
                resultado.append("_");
            }
        }

        System.out.println(resultado);

    }
}
