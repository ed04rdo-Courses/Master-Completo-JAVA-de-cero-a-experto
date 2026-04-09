public class OperadorIncremental {
    public static void main(String[] args) {
        
        // pre-incremento, primero se incrementa y luego se asigna
        int i = 1;
        int j = ++i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // post-incremento, primero se incrementa y luego se asigna
        i = 2;
        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = 5;
        j = 10;

        System.out.println("i = " + i++);
        System.out.println("j = " + ++j);
    }
}