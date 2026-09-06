package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

/**
 * Ejercicio 04 - Pokémon Alfa.
 * <p>
 * Encuentra el Pokémon con el nivel más alto dentro del equipo, usando
 * {@code max(Comparator)}.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        List<PokemonNivel> equipo = List.of(
                new PokemonNivel("Pikachu", 45),
                new PokemonNivel("Charmander", 62),
                new PokemonNivel("Squirtle", 38),
                new PokemonNivel("Snorlax", 90),
                new PokemonNivel("Mewtwo", 88)
        );

        PokemonNivel pokemonAlfa = equipo.stream()
                .max(Comparator.comparingInt(PokemonNivel::nivel))
                .orElseThrow();

        System.out.println("Equipo: " + equipo);
        System.out.println("Pokémon Alfa: " + pokemonAlfa.nombre() + " (nivel " + pokemonAlfa.nivel() + ")");
    }
}
