package dosw.semana_2.pokemon;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Ejercicio 14 - Organizar por Región.
 * <p>
 * Agrupa los Pokémon según su región de origen, usando {@code groupingBy()}.
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        List<Pokemon> pokedex = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 30, 320, "Kanto", false),
                new Pokemon(2L, "Chikorita", "Planta", 18, 180, "Johto", false),
                new Pokemon(3L, "Torchic", "Fuego", 20, 210, "Hoenn", false),
                new Pokemon(4L, "Piplup", "Agua", 17, 175, "Sinnoh", false),
                new Pokemon(5L, "Charmander", "Fuego", 22, 240, "Kanto", false),
                new Pokemon(6L, "Totodile", "Agua", 19, 195, "Johto", false)
        );

        Map<String, List<String>> pokemonPorRegion = pokedex.stream()
                .collect(Collectors.groupingBy(
                        Pokemon::getRegion,
                        Collectors.mapping(Pokemon::getNombre, Collectors.toList())
                ));

        System.out.println("Pokédex: " + pokedex);
        System.out.println("Agrupados por región: " + pokemonPorRegion);
    }
}
