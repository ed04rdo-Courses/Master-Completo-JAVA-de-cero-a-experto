# _String_

- Es un objeto inmutable
- Para realizar una comparación:   
    - '==' lo hace por __referencia__ (alocación de memoria)
    - _equals()_ lo hace por __valor__
    
    _ejemplo_:

            String str1 = "Hola Mundo";
            String str2 = new String("Hola Mundo");

            // false
            System.out.println("Comparación: "+(str1 == str2));

            // true
            System.out.println("Comparación: "+(str1.equals(str2)));
### Métodos relevantes:
- _equalsIgnoreCase()_: Compara __ignorando mayúsculas y minúsculas__ 
- _compareTo()_: Compara __lexicográficamente__ (orden UNICODE), retorna la diferencia unicode entre el primer caracter distinto.
    - `= 0` misma cadena
    - `< 0` _str1_ anterior a _str2_
    - `> 0` _str1_ posterior a _str2_
- _compareToIgnoreCase()_: ...__ignorando mayúsculas y minúsculas.__
- _transform()_: Permite aplicar cualquier función lambda a una cadena

<br>

# StringBuilder 
- Es mutable
- Usar en:
    - Concatenación en bucle 
    - Construcción incremental con condiciones
    - Insertar / borrar / invertir texto
    - Generación de texto largo