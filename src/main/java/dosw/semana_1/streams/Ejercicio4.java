package dosw.semana_1.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 04 - Personas mayores de edad.
 * <p>
 * Dado un listado de usuarios, filtra las personas mayores de edad
 * (18 años o más) y obtiene sus nombres, usando {@code filter()} y
 * {@code map()}.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        List<Usuario> users = List.of(
                new Usuario(1L, "Ana", 28, true),
                new Usuario(2L, "Luis", 17, false),
                new Usuario(3L, "Marta", 35, true),
                new Usuario(4L, "Pedro", 22, false),
                new Usuario(5L, "Sofia", 19, true)
        );

        List<String> mayoresDeEdad = users.stream()
                .filter(usuario -> usuario.age() >= 18)
                .map(Usuario::name)
                .collect(Collectors.toList());

        System.out.println("Datos de entrada: " + users);
        System.out.println("Nombres de mayores de edad: " + mayoresDeEdad);
    }
}
