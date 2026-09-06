package dosw.semana_2.pokemon;

import java.util.List;

/**
 * Ejercicio 03 - Poder Total del Equipo.
 * <p>
 * Dada una lista de niveles de Pokémon, calcula la suma total de niveles
 * del equipo, usando {@code reduce()}.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        List<Integer> niveles = List.of(45, 62, 38, 71, 55, 29);

        int sumaTotal = niveles.stream()
                .reduce(0, Integer::sum);

        System.out.println("Niveles: " + niveles);
        System.out.println("Suma total de niveles: " + sumaTotal);
    }
}
