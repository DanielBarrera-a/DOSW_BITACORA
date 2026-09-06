package dosw.semana_1.streams;

/**
 * Modelo de transacción bancaria usado por el Ejercicio 05.
 *
 * @param id       identificador de la transacción
 * @param amount   monto de la transacción
 * @param approved indica si la transacción fue aprobada
 */
public record Transaccion(String id, double amount, boolean approved) {
}
