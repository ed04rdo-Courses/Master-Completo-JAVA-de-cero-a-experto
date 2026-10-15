public class InstanceOfGeneric {
    
    public static void main(String[] args) {
        // Un objeto declarado como Object puede contener cualquier tipo de dato.
        Object text = "Hello, World!";

        // Un objeto declarado como Number puede contener tipos numéricos como Integer, Double, etc.
        Number number = 4;

        // Se crean dos objetos Number a partir de valores enteros.
        Number byValue = Integer.valueOf(5);
        Number byValueString = Integer.valueOf("5");

        // Verifica si 'text' es una instancia de String.
        boolean b1 = text instanceof String;
        System.out.println("text is an instance of String: " + b1);

        // Verifica si 'text' es una instancia de Integer.
        // Como 'text' guarda un String, el resultado es false.
        // Si se declarara como String, el compilador detectaría que no puede ser Integer.
        boolean b2 = text instanceof Integer;
        System.out.println("text is an instance of Integer: " + b2);

        // 'number' es un Number y el valor real almacenado es un Integer.
        boolean b3 = number instanceof Integer;
        System.out.println("number is an instance of Integer: " + b3); 

        // Todo objeto en Java hereda de Object, por lo tanto un Integer también es un Object.
        boolean b4 = number instanceof Object;
        System.out.println("number is an instance of Object: " + b4);

        // Verifica si el valor real es Long.
        boolean b5 = number instanceof Long;
        System.out.println("number is an instance of Long: " + b5);

        // Verifica si el valor real es Double.
        boolean b6 = number instanceof Double;
        System.out.println("number is an instance of Double: " + b6);

        // Un valor decimal se guarda como Double.
        Number decimal = 45.54;
        boolean b7 = decimal instanceof Double;
        System.out.println("decimal is an instance of Double: " + b7);

        // Se comprueba si ambos objetos Number son realmente Integer.
        System.out.println("byValue is an instance of Integer: " + (byValue instanceof Integer));
        System.out.println("byValueString is an instance of Integer: " + (byValueString instanceof Integer));
    }
}
