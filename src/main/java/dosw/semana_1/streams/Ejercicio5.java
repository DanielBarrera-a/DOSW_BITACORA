package dosw.semana_1.streams;

import java.util.List;

/**
 * Ejercicio 05 - Transacciones Bancarias.
 * <p>
 * Procesa una lista de transacciones bancarias usando {@code peek()} para
 * observar cada transacción y {@code anyMatch()} para verificar si existe
 * al menos una transacción no aprobada, determinando si el lote es válido.
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        List<Transaccion> transacciones = List.of(
                new Transaccion("T1", 150.00, true),
                new Transaccion("T2", 320.50, true),
                new Transaccion("T3", 75.25, false),
                new Transaccion("T4", 500.00, true)
        );

        boolean existeNoAprobada = transacciones.stream()
                .peek(transaccion -> System.out.println("Procesando transacción: " + transaccion))
                .anyMatch(transaccion -> !transaccion.approved());

        boolean loteValido = !existeNoAprobada;

        System.out.println("¿Existe alguna transacción no aprobada?: " + existeNoAprobada);
        System.out.println("¿El lote de transacciones es válido?: " + loteValido);
    }
}
