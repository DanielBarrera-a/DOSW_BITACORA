package dosw.semana_2.pokemon;

import java.util.List;
import java.util.Locale;

/**
 * Ejercicio 11 - Poder Promedio.
 * <p>
 * Calcula el promedio de poderCombate de todos los Pokémon del equipo,
 * usando {@code mapToDouble()} y {@code average()}.
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        List<Pokemon> equipo = List.of(
                new Pokemon(1L, "Pikachu", "Eléctrico", 30, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psíquico", 70, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragón", 55, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 20, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 45, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 58, 610, "Kanto", false)
        );

        double poderPromedio = equipo.stream()
                .mapToDouble(Pokemon::getPoderCombate)
                .average()
                .orElse(0.0);

        System.out.println("Equipo: " + equipo);
        System.out.printf(Locale.US, "Poder de combate promedio: %.2f%n", poderPromedio);
    }
}
