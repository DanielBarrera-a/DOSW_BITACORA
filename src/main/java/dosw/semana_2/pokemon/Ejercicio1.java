package dosw.semana_2.pokemon;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 01 - Pokémon Tipo Fuego.
 * <p>
 * Dada una lista de Pokémon con nombre y tipo, obtiene únicamente
 * aquellos cuyo tipo sea Fuego, usando {@code filter()}.
 */
public class Ejercicio1 {

    private record PokemonTipo(String nombre, String tipo) {
    }

    public static void main(String[] args) {
        List<PokemonTipo> pokedex = List.of(
                new PokemonTipo("Pikachu", "Eléctrico"),
                new PokemonTipo("Charmander", "Fuego"),
                new PokemonTipo("Squirtle", "Agua"),
                new PokemonTipo("Vulpix", "Fuego"),
                new PokemonTipo("Bulbasaur", "Planta"),
                new PokemonTipo("Flareon", "Fuego")
        );

        List<String> pokemonDeFuego = pokedex.stream()
                .filter(pokemon -> pokemon.tipo().equals("Fuego"))
                .map(PokemonTipo::nombre)
                .collect(Collectors.toList());

        System.out.println("Pokédex: " + pokedex);
        System.out.println("Pokémon de tipo Fuego: " + pokemonDeFuego);
    }
}
