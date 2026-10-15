public class InstanceOfOperator {

    public static void main (String[] args) {

        String text = "Hello, World!";

        Integer number = 4;

        boolean b1 = text instanceof String;
        boolean b2 = number instanceof Integer;
        boolean b3 = text instanceof Object;
        boolean b4 = number instanceof Number;
        boolean b5 = number instanceof Object;

        System.out.println("text is an instance of String: " + b1);
        System.out.println("number is an instance of Integer: " + b2);
        System.out.println("text is an instance of Object: " + b3);
        System.out.println("number is an instance of Number: " + b4);
        System.out.println("number is an instance of Object: " + b5);
    }
    
}
