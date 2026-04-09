
public class OperadoresLogicos {

    public static void main(String[] args) {

        // la precedencia en operadores lógicos es primero () y luego && y luego ||
        boolean precedencia = true || true && false;
        boolean precedencia2 = (true || true) && false;
        boolean precedencia3 = true || false && false || false;
        boolean precedencia4 = ((true || false) && false) || false;

        System.out.println("precedencia: " + precedencia);
        System.out.println("precedencia2: " + precedencia2);
        System.out.println("precedencia3: " + precedencia3);
        System.out.println("precedencia4: " + precedencia4);
    }
}
