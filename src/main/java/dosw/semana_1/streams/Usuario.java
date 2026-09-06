package dosw.semana_1.streams;

/**
 * Modelo simple de usuario usado por los ejercicios de la Semana 1
 * (Ejercicio 03 y Ejercicio 04).
 *
 * @param id     identificador del usuario
 * @param name   nombre del usuario
 * @param age    edad del usuario
 * @param active indica si el usuario está activo
 */
public record Usuario(Long id, String name, int age, boolean active) {
}
