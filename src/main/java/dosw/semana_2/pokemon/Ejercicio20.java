package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Ejercicio 20 - Pokédex Analítica.
 * <p>
 * Construye una estructura que muestra: cantidad de Pokémon por tipo, por
 * región, cantidad de legendarios, promedio de nivel y el Pokémon más
 * fuerte. Todo usando únicamente Streams ({@code groupingBy()},
 * {@code counting()}, {@code filter()}, {@code mapToInt()}, {@code average()}
 * y {@code max()}).
 */
public class Ejercicio20 {

    private record ResumenPokedex(Map<String, Long> porTipo,
                                   Map<String, Long> porRegion,
                                   long legendarios,
                                   double promedioNivel,
                                   Pokemon masFuerte) {
    }

    public static void main(String[] args) {
        List<Pokemon> pokedex = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 25, 320, "Kanto", false),
                new Pokemon(2L, "Charmander", "Fuego", 22, 240, "Kanto", false),
                new Pokemon(3L, "Vulpix", "Fuego", 24, 260, "Kanto", false),
                new Pokemon(4L, "Flareon", "Fuego", 30, 400, "Johto", false),
                new Pokemon(5L, "Growlithe", "Fuego", 28, 350, "Johto", false),
                new Pokemon(6L, "Squirtle", "Agua", 20, 210, "Kanto", false),
                new Pokemon(7L, "Psyduck", "Agua", 18, 190, "Hoenn", false),
                new Pokemon(8L, "Vaporeon", "Agua", 32, 430, "Hoenn", false),
                new Pokemon(9L, "Mewtwo", "Psíquico", 70, 680, "Kanto", true),
                new Pokemon(10L, "Mew", "Psíquico", 65, 600, "Sinnoh", true)
        );

        ResumenPokedex resumen = new ResumenPokedex(
                pokedex.stream()
                        .collect(Collectors.groupingBy(Pokemon::getTipo, Collectors.counting())),
                pokedex.stream()
                        .collect(Collectors.groupingBy(Pokemon::getRegion, Collectors.counting())),
                pokedex.stream()
                        .filter(Pokemon::isLegendario)
                        .count(),
                pokedex.stream()
                        .mapToInt(Pokemon::getNivel)
                        .average()
                        .orElse(0.0),
                pokedex.stream()
                        .max(Comparator.comparingDouble(Pokemon::getPoderCombate))
                        .orElseThrow()
        );

        System.out.println("Pokédex: " + pokedex);
        System.out.println("Por tipo:     " + resumen.porTipo());
        System.out.println("Por región:   " + resumen.porRegion());
        System.out.println("Legendarios:  " + resumen.legendarios());
        System.out.printf(Locale.US, "Promedio niv: %.1f%n", resumen.promedioNivel());
        System.out.printf(Locale.US, "Más fuerte:   %s (PC: %.0f)%n",
                resumen.masFuerte().getNombre(), resumen.masFuerte().getPoderCombate());
    }
}
