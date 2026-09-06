package dosw.semana_1.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 03 - Obtener nombres de los Usuarios.
 * <p>
 * Dada una lista de usuarios (id, name, age, active), filtra únicamente
 * los usuarios activos y obtiene una lista con sus nombres en mayúscula
 * y ordenada alfabéticamente, usando {@code filter()}, {@code map()} y
 * {@code sorted()}.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        List<Usuario> users = List.of(
                new Usuario(1L, "Ana", 28, true),
                new Usuario(2L, "Luis", 17, false),
                new Usuario(3L, "Marta", 35, true),
                new Usuario(4L, "Pedro", 22, false),
                new Usuario(5L, "Sofia", 19, true)
        );

        List<String> sortedUsers = users.stream()
                .filter(Usuario::active)
                .map(usuario -> usuario.name().toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Datos de entrada: " + users);
        System.out.println("sortedUsers = " + sortedUsers);
    }
}
