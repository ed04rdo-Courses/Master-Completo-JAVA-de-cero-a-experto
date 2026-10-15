import java.util.Map;
import java.util.Scanner;

public class LogicOperatorsLogin {

    /**
     * Demo credentials where key = username and value = password.
     */
    private static final Map<String, String> CREDENTIALS = Map.of(
            "andres", "12345",
            "admin", "12345",
        "eduardo", "0192837465");

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese su nombre de usuario: ");
            String u = scanner.next();

            System.out.println("Ingrese su contraseña: ");
            String p = scanner.next();

            /**
             * The ternary operator is used to evaluate the result of the authentication check.
             */
            String message = isAuthenticated(u, p) ? "Bienvenido " + u : "Usuario o contraseña incorrectos";
            System.out.println(message);
        }

    }

    /**
     * Validates whether the provided username and password match the map.
     *
     * @param username user name entered from console
     * @param password password entered from console
     * @return true when credentials match; otherwise false
     */
    private static boolean isAuthenticated(String username, String password) {
        return password.equals(CREDENTIALS.get(username));

    }
}