package dosw.semana_2.pokemon;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Ejercicio 13 - Organizar por Tipo.
 * <p>
 * Agrupa todos los Pokémon por su tipo, usando {@code groupingBy()}.
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        List<Pokemon> pokedex = List.of(
                new Pokemon(1L, "Squirtle", "Agua", 20, 210, "Kanto", false),
                new Pokemon(2L, "Psyduck", "Agua", 18, 190, "Kanto", false),
                new Pokemon(3L, "Charmander", "Fuego", 22, 240, "Kanto", false),
                new Pokemon(4L, "Vulpix", "Fuego", 25, 260, "Kanto", false),
                new Pokemon(5L, "Bulbasaur", "Planta", 19, 200, "Kanto", false)
        );

        Map<String, List<String>> pokemonPorTipo = pokedex.stream()
                .collect(Collectors.groupingBy(
                        Pokemon::getTipo,
                        Collectors.mapping(Pokemon::getNombre, Collectors.toList())
                ));

        System.out.println("Pokédex: " + pokedex);
        System.out.println("Agrupados por tipo: " + pokemonPorTipo);
    }
}
