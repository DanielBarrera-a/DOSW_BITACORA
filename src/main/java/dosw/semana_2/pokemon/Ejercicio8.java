package dosw.semana_2.pokemon;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 08 - Evoluciones Preparadas.
 * <p>
 * Dada una lista de Pokémon que incluye si pueden evolucionar, obtiene
 * únicamente los que están listos para evolucionar, usando {@code filter()}.
 */
public class Ejercicio8 {

    private record PokemonEvolucion(String nombre, boolean puedeEvolucionar) {
    }

    public static void main(String[] args) {
        List<PokemonEvolucion> equipo = List.of(
                new PokemonEvolucion("Pikachu", true),
                new PokemonEvolucion("Raichu", false),
                new PokemonEvolucion("Charmander", true),
                new PokemonEvolucion("Charizard", false),
                new PokemonEvolucion("Squirtle", true),
                new PokemonEvolucion("Blastoise", false)
        );

        List<String> listosParaEvolucionar = equipo.stream()
                .filter(PokemonEvolucion::puedeEvolucionar)
                .map(PokemonEvolucion::nombre)
                .collect(Collectors.toList());

        System.out.println("Equipo: " + equipo);
        System.out.println("Listos para evolucionar: " + listosParaEvolucionar);
    }
}
