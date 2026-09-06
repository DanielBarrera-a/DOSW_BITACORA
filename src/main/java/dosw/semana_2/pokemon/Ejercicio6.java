package dosw.semana_2.pokemon;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 06 - Pokédex Sin Duplicados.
 * <p>
 * Dada una lista de Pokémon con elementos repetidos, genera una nueva
 * colección donde cada Pokémon aparece una sola vez, usando {@code distinct()}.
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        List<String> pokedexConDuplicados = List.of(
                "Pikachu", "Charmander", "Pikachu", "Squirtle", "Charmander", "Mewtwo"
        );

        List<String> pokedexSinDuplicados = pokedexConDuplicados.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Pokédex con duplicados: " + pokedexConDuplicados);
        System.out.println("Pokédex sin duplicados: " + pokedexSinDuplicados);
    }
}
