package dosw.semana_2.pokemon;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 07 - Orden del Profesor Oak.
 * <p>
 * El Profesor Oak quiere su Pokédex organizada: ordena alfabéticamente
 * los nombres de los Pokémon, usando {@code sorted()}.
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        List<String> pokedex = List.of(
                "Squirtle", "Pikachu", "Mewtwo", "Bulbasaur", "Charmander", "Abra"
        );

        List<String> pokedexOrdenada = pokedex.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Pokédex: " + pokedex);
        System.out.println("Pokédex ordenada: " + pokedexOrdenada);
    }
}
