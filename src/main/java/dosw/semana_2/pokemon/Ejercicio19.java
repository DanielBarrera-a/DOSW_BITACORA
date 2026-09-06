package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Ejercicio 19 - Top 3 Entrenadores.
 * <p>
 * Genera un ranking de los 3 mejores entrenadores considerando: 1° más
 * medallas, 2° mayor poder acumulado, 3° orden alfabético como criterio
 * de desempate, usando {@code sorted()} y {@code limit(3)}.
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        Entrenador gary = new Entrenador(1L, "Gary", 10, List.of(
                new Pokemon(1L, "Eevee", "Normal", 35, 800, "Kanto", false),
                new Pokemon(2L, "Arcanine", "Fuego", 50, 840, "Kanto", false),
                new Pokemon(3L, "Nidoking", "Veneno", 48, 700, "Kanto", false)
        ));
        Entrenador ash = new Entrenador(2L, "Ash", 8, List.of(
                new Pokemon(4L, "Pikachu", "Eléctrico", 45, 600, "Kanto", false),
                new Pokemon(5L, "Charizard", "Fuego", 58, 650, "Kanto", false),
                new Pokemon(6L, "Squirtle", "Agua", 40, 600, "Kanto", false)
        ));
        Entrenador dawn = new Entrenador(3L, "Dawn", 7, List.of(
                new Pokemon(7L, "Piplup", "Agua", 38, 700, "Sinnoh", false),
                new Pokemon(8L, "Empoleon", "Agua", 52, 750, "Sinnoh", false),
                new Pokemon(9L, "Buizel", "Agua", 33, 650, "Sinnoh", false)
        ));
        Entrenador brock = new Entrenador(4L, "Brock", 6, List.of(
                new Pokemon(10L, "Onix", "Roca", 42, 900, "Kanto", false),
                new Pokemon(11L, "Geodude", "Roca", 30, 770, "Kanto", false)
        ));

        List<Entrenador> entrenadores = List.of(gary, ash, dawn, brock);

        Comparator<Entrenador> porPoderAcumulado = Comparator.comparingDouble(
                (Entrenador entrenador) -> entrenador.getEquipo().stream()
                        .mapToDouble(Pokemon::getPoderCombate)
                        .sum());

        List<Entrenador> top3 = entrenadores.stream()
                .sorted(Comparator.comparingInt(Entrenador::getMedallas).reversed()
                        .thenComparing(porPoderAcumulado.reversed())
                        .thenComparing(Entrenador::getNombre))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Entrenadores: " + entrenadores);
        System.out.println("Top 3 Entrenadores:");
        IntStream.range(0, top3.size())
                .mapToObj(indice -> {
                    Entrenador entrenador = top3.get(indice);
                    double poder = entrenador.getEquipo().stream()
                            .mapToDouble(Pokemon::getPoderCombate)
                            .sum();
                    return String.format("#%d %-6s- %d medallas, PC: %.0f",
                            indice + 1, entrenador.getNombre(), entrenador.getMedallas(), poder);
                })
                .forEach(System.out::println);
    }
}
