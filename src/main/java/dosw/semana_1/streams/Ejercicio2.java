package dosw.semana_1.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 02 - Cantidad de Palabras con más de 4 caracteres.
 * <p>
 * Filtra las palabras con más de 4 caracteres, las convierte a
 * mayúsculas, las ordena alfabéticamente y obtiene la cantidad
 * total de palabras resultantes, usando {@code filter()}, {@code map()}
 * y {@code sorted()}.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        List<String> palabras = List.of("java", "stream", "api", "functional", "code", "git");

        List<String> resultado = palabras.stream()
                .filter(palabra -> palabra.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Datos de entrada: " + palabras);
        System.out.println("Palabras resultantes: " + resultado);
        System.out.println("Cantidad de palabras resultantes: " + resultado.size());
    }
}
