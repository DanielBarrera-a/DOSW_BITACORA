package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Ejercicio 18 - Top 5 Pokémon Más Fuertes.
 * <p>
 * Genera un ranking de los cinco Pokémon con mayor poderCombate de toda
 * la Pokédex, usando {@code sorted()} y {@code limit(5)}.
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        List<Pokemon> pokedex = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 30, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 70, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 55, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 20, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 45, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 58, 610, "Kanto", false)
        );

        List<Pokemon> top5 = pokedex.stream()
                .sorted(Comparator.comparingDouble(Pokemon::getPoderCombate).reversed())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Pokédex: " + pokedex);
        System.out.println("Top 5 Pokémon más fuertes:");
        IntStream.range(0, top5.size())
                .mapToObj(indice -> String.format("#%d %-12s- PC: %.0f",
                        indice + 1, top5.get(indice).getNombre(), top5.get(indice).getPoderCombate()))
                .forEach(System.out::println);
    }
}
