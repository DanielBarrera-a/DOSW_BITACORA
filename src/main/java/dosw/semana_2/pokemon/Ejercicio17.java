package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Ejercicio 17 - Equipo Más Poderoso.
 * <p>
 * Calcula cuál entrenador tiene la suma total de poderCombate más alta
 * entre todos sus Pokémon, usando {@code mapToDouble()} y {@code sum()}.
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        Entrenador ash = new Entrenador(1L, "Ash", 8, List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 600, "Kanto", false),
                new Pokemon(2L, "Charizard", "Fuego", 58, 650, "Kanto", false),
                new Pokemon(3L, "Squirtle", "Agua", 40, 600, "Kanto", false)
        ));
        Entrenador gary = new Entrenador(2L, "Gary", 10, List.of(
                new Pokemon(4L, "Eevee", "Normal", 35, 800, "Kanto", false),
                new Pokemon(5L, "Arcanine", "Fuego", 50, 840, "Kanto", false),
                new Pokemon(6L, "Nidoking", "Veneno", 48, 700, "Kanto", false)
        ));
        Entrenador brock = new Entrenador(3L, "Brock", 6, List.of(
                new Pokemon(7L, "Onix", "Roca", 42, 900, "Kanto", false),
                new Pokemon(8L, "Geodude", "Roca", 30, 770, "Kanto", false)
        ));

        List<Entrenador> entrenadores = List.of(ash, gary, brock);

        Map<String, Double> poderPorEntrenador = entrenadores.stream()
                .collect(Collectors.toMap(
                        Entrenador::getNombre,
                        entrenador -> entrenador.getEquipo().stream()
                                .mapToDouble(Pokemon::getPoderCombate)
                                .sum()
                ));

        Entrenador masPoderoso = entrenadores.stream()
                .max(Comparator.comparingDouble(entrenador -> entrenador.getEquipo().stream()
                        .mapToDouble(Pokemon::getPoderCombate)
                        .sum()))
                .orElseThrow();

        System.out.println("Poder acumulado por entrenador: " + poderPorEntrenador);
        System.out.println("Entrenador más poderoso: " + masPoderoso.getNombre());
        System.out.println("Poder acumulado del equipo: " + poderPorEntrenador.get(masPoderoso.getNombre()));
    }
}
