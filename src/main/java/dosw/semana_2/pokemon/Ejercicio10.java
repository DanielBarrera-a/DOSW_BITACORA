package dosw.semana_2.pokemon;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 10 - Pokédex Compacta.
 * <p>
 * Genera una lista que contenga únicamente los nombres de todos los
 * Pokémon del equipo, usando {@code map()} y {@code collect()}.
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        List<Pokemon> equipo = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 30, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 70, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 55, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 20, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 45, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 58, 610, "Kanto", false)
        );

        List<String> pokedexCompacta = equipo.stream()
                .map(Pokemon::getNombre)
                .collect(Collectors.toList());

        System.out.println("Equipo: " + equipo);
        System.out.println("Pokédex Compacta: " + pokedexCompacta);
    }
}
