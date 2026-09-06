package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

/**
 * Ejercicio 12 - Campeón Regional.
 * <p>
 * Obtiene el Pokémon con mayor poderCombate de toda la lista, usando
 * {@code max(Comparator)}.
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        List<Pokemon> pokedex = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 30, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 70, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 55, 530, "Kanto", false),
                new Pokemon(4L, "Charizard", "Fuego", 58, 610, "Kanto", false)
        );

        Pokemon campeon = pokedex.stream()
                .max(Comparator.comparingDouble(Pokemon::getPoderCombate))
                .orElseThrow();

        System.out.println("Pokédex: " + pokedex);
        System.out.println("Campeón: " + campeon.getNombre() + " con PC: " + campeon.getPoderCombate());
    }
}
