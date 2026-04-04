
public class MétodosRelevantes {

    public static void main(String[] args) {

        String nombre = "Eduardo";

        System.out.println("\nnombre: " + nombre + "\n\n");
        System.out.println("nombre.length(): " + nombre.length());
        System.out.println("nombre.toUpperCase(): " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase(): " + nombre.toLowerCase());
        System.out.println("\nnombre.equals(\"Eduardo\"): " + nombre.equals("Eduardo"));
        System.out.println("nombre.equalsIgnoreCase(\"eduardo\"): " + nombre.equalsIgnoreCase("eduardo"));

        // Van primero las mayúsculas en UNICODE
        System.out.println("\nnombre.compareTo(\"eduardo\"): " + nombre.compareTo("eduardo"));
        System.out.println("nombre.compareToIgnoreCase(\"eduardo\"): " + nombre.compareToIgnoreCase("eduardo"));
        System.out.println("nombre.compareTo(\"Eduardo\"): " + nombre.compareTo("Eduardo"));

        // Positivo (+), la primera cadena va después que la segunda
        System.out.println("\nnombre.compareTo(\"Edgardo\"): " + nombre.compareTo("Edgardo"));
        System.out.println("nombre.compareToIgnoreCase(\"edgardo\"): " + nombre.compareToIgnoreCase("edgardo"));

        // Negativo (-), la primera cadena va antes que la segunda
        System.out.println("nombre.compareTo(\"edgardo\"): " + nombre.compareTo("edgardo"));

        System.out.println("\nnombre.charAt(0): " + nombre.charAt(0));
        System.out.println("nombre.charAt(1): " + nombre.charAt(1));
        System.out.println("nombre.charAt(2): " + nombre.charAt(2));
        System.out.println("nombre.charAt(3): " + nombre.charAt(3));
        System.out.println("nombre.charAt(4): " + nombre.charAt(4));
        System.out.println("nombre.charAt(5): " + nombre.charAt(5));
        System.out.println("nombre.charAt(6): " + nombre.charAt(6));

        // Última posición
        System.out.println("\nnombre.charAt(nombre.length()-1): " + nombre.charAt(nombre.length() - 1));

        // Desde - hasta el final
        System.out.println("\nnombre.substring(2): " + nombre.substring(2));
        // Desde - hasta
        System.out.println("nombre.substring(1,6): " + nombre.substring(1, 6));

        System.out.println("\n--------------------------------------------------------");

        String cadena = "trabalenguas";

        System.out.println("\n\ncadena: " + cadena + "\n\n");
        System.out.println("cadena.replace(\"a\",\".\"): " + cadena.replace("a", "."));
        // Primera coincidencia
        System.out.println("cadena.indexOf(\"a\"): " + cadena.indexOf("a"));
        System.out.println("cadena.indexOf(\"e\"): " + cadena.indexOf("e"));
        // >= 0 retorna la posición de la primer coincidencia, también funciona para cadenas 
        System.out.println("cadena.indexOf(\"abal\"): " + cadena.indexOf("abal"));
        // < 0 no se encuentra, también funciona para cadenas 
        System.out.println("cadena.indexOf(\"abaz\"): " + cadena.indexOf("abaz"));
        // Última coincidencia
        System.out.println("cadena.lastIndexOf(\"a\"): " + cadena.lastIndexOf("a"));
        // regresa boolean, también acepta cadenas
        System.out.println("\ncadena.contains(\"lengua\"): " + cadena.contains("lengua"));

        // caractér o cadena
        System.out.println("cadena.startsWith(\"traba\"): " + cadena.startsWith("traba"));
        // caractér o cadena
        System.out.println("cadena.endsWith(\"leguas\"): " + cadena.endsWith("lenguas"));

        System.out.println("\n\n    Cadena sin aplicar trim   ");
        System.out.println("    Cadena despues de aplicar trim   ".trim());


        String archivo = "nuevo_archivo_v1.1.1.csv";
        System.out.println("\n\narchivo: " + archivo);
        System.out.println("archivo.substring(archivo.lastIndexOf(\".\")+1): "+archivo.substring(archivo.lastIndexOf(".")+1));

        // devuelve el hash del arreglo
        System.out.println("\narchivo.toCharArray(): " + archivo.toCharArray());

        // [] set de caracteres o escapar un caracter que pueda ser reservado
        String[] strArreglo = archivo.split("[.]");

        for (String str : strArreglo) {
            System.out.print(str + " ");
        }
        
        System.out.println("\nstrArreglo[strArreglo.length]: " + strArreglo[strArreglo.length - 1]);
        
    }
}
