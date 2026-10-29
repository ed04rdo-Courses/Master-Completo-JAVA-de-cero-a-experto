


public class SentenciaIfElse {

    public static void main(String[] args) {

        float promedio = 6.3f;

        if (promedio >= 10.0f) 
            System.out.println("Excelente");
        else if (promedio >= 8.0)
            System.out.println("Muy bueno");
        else if (promedio >= 6)
            System.out.println("Regular");
        else 
            System.out.println("Reprobado");

        System.out.println("El promedio es: " + promedio);
        
    }
}