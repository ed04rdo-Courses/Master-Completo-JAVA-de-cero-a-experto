
import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {

        String username = "eduardo";
        String password = "12345";

        String username2 = "admin";
        String password2 = "admin";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        String user = scanner.nextLine();

        System.out.println("Ingrese el pass: ");
        String pass = scanner.nextLine();

        boolean isGranted = (username.equals(user) && password.equals(pass))
                || (username2.equals(user) && password2.equals(pass));

        if (isGranted) {
            System.out.println("Login exitoso, Bienvanido: " + user);
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }
}
