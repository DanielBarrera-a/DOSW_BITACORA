package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 09 - Equipo Élite.
 * <p>
 * Muestra únicamente los Pokémon cuyo poderCombate sea superior a 500,
 * ordenados de mayor a menor poder, usando {@code filter()} y {@code sorted()}.
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        List<Pokemon> pokedex = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 30, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 70, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 55, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 20, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 45, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 58, 610, "Kanto", false)
        );

        List<Pokemon> equipoElite = pokedex.stream()
                .filter(pokemon -> pokemon.getPoderCombate() > 500)
                .sorted(Comparator.comparingDouble(Pokemon::getPoderCombate).reversed())
                .collect(Collectors.toList());

        System.out.println("Pokédex: " + pokedex);
        System.out.println("Equipo Élite (PC > 500): " + equipoElite);
    }
}
