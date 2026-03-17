public class EjemploRendimientoStringConcat {
    public static void main(String[] args) {
        
        String a = "a";
        String b = "b";
        String c = a;
        Integer count = 100000;

        long inicio = System.nanoTime();
        System.out.println(inicio);

        for (int i = 0; i < count; i++) {
            c += a;
        }

        long fin = System.nanoTime();
        System.out.println((fin-inicio)/1000000);

    }
}