public class EjemploRendimientoStringConcat {
    public static void main(String[] args) {
        
        String a = "a";
        String b = "b";
        String c = a;
        Integer count = 100000;

        // StringBuilder es mutable, por lo que las modificaciones son sobre el mismo objeto
        StringBuilder sb = new StringBuilder(a);

        // System.nanoTime() es más preciso
        Long inicio = System.nanoTime();
        System.out.println(inicio.toString().length());

        // CONCATENACION COUNT VECES DE UNA VARIABLE
        for (int i = 0; i < count; i++) {
            // c += a + b; // aprox 500ms, += implementa StringBuilder
            // c = c.concat(a).concat(b); // aprox 900ms
            sb.append(a).append(b); // 4ms, más de 100 veces más rápido
        }

        long fin = System.nanoTime();

        // A MILISEGUNDOS
        System.out.println(((fin-inicio)/1000000) + " ms" );

    }
}