
public class Comparación {

    public static void main(String[] args) {
        String str1 = "Hola Mundo";
        String str2 = new String("Hola Mundo");
        String str3 = "";
        String str4 = "";

        // false
        System.out.println("Comparación: "+(str1 == str2));

        // true
        System.out.println("Comparación: "+(str1.equals(str2)));

        System.out.println(str1.compareTo(str2));
    }
}
