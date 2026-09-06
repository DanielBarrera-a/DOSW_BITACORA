package dosw.semana_2.pokemon;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 02 - Pokédex Gritona.
 * <p>
 * Transforma todos los nombres de Pokémon a mayúsculas, usando {@code map()}.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        List<String> pokedex = List.of("Pikachu", "Charmander", "Squirtle", "Bulbasaur");

        List<String> pokedexGritona = pokedex.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Pokédex: " + pokedex);
        System.out.println("Pokédex Gritona: " + pokedexGritona);
    }
}
