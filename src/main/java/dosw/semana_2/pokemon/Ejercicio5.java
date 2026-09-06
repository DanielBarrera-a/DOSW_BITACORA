package dosw.semana_2.pokemon;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 05 - Pokémon Legendarios.
 * <p>
 * Cuenta cuántos Pokémon del equipo tienen nivel superior a 80, usando
 * {@code filter()} y {@code count()}.
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        List<PokemonNivel> equipo = List.of(
                new PokemonNivel("Pikachu", 45),
                new PokemonNivel("Mewtwo", 88),
                new PokemonNivel("Dragonite", 82),
                new PokemonNivel("Squirtle", 38),
                new PokemonNivel("Mew", 85),
                new PokemonNivel("Charmander", 62)
        );

        long cantidadLegendarios = equipo.stream()
                .filter(pokemon -> pokemon.nivel() > 80)
                .count();

        List<String> legendarios = equipo.stream()
                .filter(pokemon -> pokemon.nivel() > 80)
                .map(PokemonNivel::nombre)
                .collect(Collectors.toList());

        System.out.println("Equipo: " + equipo);
        System.out.println("Pokémon con nivel > 80: " + cantidadLegendarios + " " + legendarios);
    }
}
