package dosw.semana_2.pokemon;

/**
 * Representación mínima de un Pokémon (nombre + nivel), usada en los
 * ejercicios del Nivel 1 antes de introducir la clase {@link Pokemon}.
 *
 * @param nombre nombre del Pokémon
 * @param nivel  nivel del Pokémon
 */
public record PokemonNivel(String nombre, int nivel) {
}
