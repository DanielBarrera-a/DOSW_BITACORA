package dosw.semana_1.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 01 - Números Pares mayores a diez.
 * <p>
 * Dada una lista de números enteros, obtiene una nueva lista solo con
 * los números pares mayores a 10, usando {@code filter()}.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(3, 8, 10, 12, 15, 18, 20);

        List<Integer> paresMayoresADiez = numeros.stream()
                .filter(numero -> numero % 2 == 0 && numero > 10)
                .collect(Collectors.toList());

        System.out.println("Datos de entrada: " + numeros);
        System.out.println("Pares mayores a 10: " + paresMayoresADiez);
    }
}
