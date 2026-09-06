package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

/**
 * Ejercicio 15 - Maestro de Gimnasios.
 * <p>
 * Dado un listado de entrenadores con sus medallas, encuentra el
 * entrenador con más medallas, usando {@code max(Comparator)}.
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        List<Entrenador> entrenadores = List.of(
                new Entrenador(1L, "Ash", 8, List.of()),
                new Entrenador(2L, "Misty", 5, List.of()),
                new Entrenador(3L, "Brock", 6, List.of()),
                new Entrenador(4L, "Gary", 10, List.of())
        );

        Entrenador campeonDeGimnasios = entrenadores.stream()
                .max(Comparator.comparingInt(Entrenador::getMedallas))
                .orElseThrow();

        System.out.println("Entrenadores: " + entrenadores);
        System.out.println("Campeón de gimnasios: " + campeonDeGimnasios.getNombre());
        System.out.println("Medallas obtenidas: " + campeonDeGimnasios.getMedallas());
    }
}
