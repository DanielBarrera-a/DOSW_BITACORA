# DOSW_BITACORA

Bitácora del Torneo Pokémon del Profesor Oak — Taller 2 de DOSW (Java, Streams y Expresiones Lambda).

## Estructura del repositorio

```
DOSW_BITACORA/
├── README.md
└── src/main/java/dosw/
    ├── semana_1/streams/    → Ejercicio1.java ... Ejercicio5.java
    └── semana_2/pokemon/    → Ejercicio1.java ... Ejercicio20.java (+ Pokemon.java, Entrenador.java)
```

## Estrategia de ramas

- `main` y `develop` son las ramas principales.
- Cada semana vive en `feature/semana-n-dosw`, creada desde `develop`.
- Cada ejercicio se resuelve en `feature/semana-n-dosw-ejercicio-n`, creada desde la rama de la semana; al terminar se mezcla en la rama semanal y se elimina.
- Al completar todos los ejercicios de una semana, `feature/semana-n-dosw` se mezcla a `develop` (la rama semanal **no** se elimina: queda como evidencia).
- Al cierre de cada ciclo, `develop` se sincroniza hacia `main`.

---

# SEMANA No 1 — DOSW Manejo de Streams

## Datos personales:
- Nombre y Apellido:
- Código de Estudiante:
- Curso:

---

### Ejercicio 01 — Números Pares mayores a diez

Dada una lista de números enteros, obtener una nueva lista solo con los números pares mayores a 10.

**Código implementado:** [`Ejercicio1.java`](src/main/java/dosw/semana_1/streams/Ejercicio1.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 02 — Cantidad de Palabras con más de 4 caracteres

Filtrar palabras con más de 4 caracteres, convertirlas a mayúsculas, ordenarlas alfabéticamente y contar el resultado.

**Código implementado:** [`Ejercicio2.java`](src/main/java/dosw/semana_1/streams/Ejercicio2.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 03 — Obtener nombres de los Usuarios

Filtrar usuarios activos, obtener sus nombres en mayúscula y ordenados alfabéticamente.

**Código implementado:** [`Ejercicio3.java`](src/main/java/dosw/semana_1/streams/Ejercicio3.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 04 — Personas mayores de edad

Filtrar usuarios mayores de edad y obtener sus nombres.

**Código implementado:** [`Ejercicio4.java`](src/main/java/dosw/semana_1/streams/Ejercicio4.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 05 — Transacciones Bancarias

Usar `peek()` para observar cada transacción y `anyMatch()` para verificar si existe alguna no aprobada.

**Código implementado:** [`Ejercicio5.java`](src/main/java/dosw/semana_1/streams/Ejercicio5.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

---

# SEMANA No 2 — Bitácora Pokémon

## Datos de Entrenador:
- Nombre y Apellido:
- Código de Estudiante:
- Curso:

---

## Nivel 1 — Entrenador Novato

### Ejercicio 01 — Pokémon Tipo Fuego
**Código implementado:** [`Ejercicio1.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio1.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 02 — Pokédex Gritona
**Código implementado:** [`Ejercicio2.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio2.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 03 — Poder Total del Equipo
**Código implementado:** [`Ejercicio3.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio3.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 04 — Pokémon Alfa
**Código implementado:** [`Ejercicio4.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio4.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 05 — Pokémon Legendarios
**Código implementado:** [`Ejercicio5.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio5.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

## Nivel 2 — Entrenador Intermedio

### Ejercicio 06 — Pokédex Sin Duplicados
**Código implementado:** [`Ejercicio6.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio6.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 07 — Orden del Profesor Oak
**Código implementado:** [`Ejercicio7.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio7.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 08 — Evoluciones Preparadas
**Código implementado:** [`Ejercicio8.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio8.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

## Nivel 3 — Líder de Gimnasio

*A partir de aquí se usa la clase [`Pokemon`](src/main/java/dosw/semana_2/pokemon/Pokemon.java).*

### Ejercicio 09 — Equipo Élite
**Código implementado:** [`Ejercicio9.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio9.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 10 — Pokédex Compacta
**Código implementado:** [`Ejercicio10.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio10.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 11 — Poder Promedio
**Código implementado:** [`Ejercicio11.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio11.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 12 — Campeón Regional
**Código implementado:** [`Ejercicio12.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio12.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 13 — Organizar por Tipo
**Código implementado:** [`Ejercicio13.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio13.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 14 — Organizar por Región
**Código implementado:** [`Ejercicio14.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio14.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

## Nivel 4 — Alto Mando

*A partir de aquí se usa también la clase [`Entrenador`](src/main/java/dosw/semana_2/pokemon/Entrenador.java).*

### Ejercicio 15 — Maestro de Gimnasios
**Código implementado:** [`Ejercicio15.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio15.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 16 — Entrenadores Experimentados
**Código implementado:** [`Ejercicio16.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio16.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 17 — Equipo Más Poderoso
**Código implementado:** [`Ejercicio17.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio17.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

## Nivel 5 — Campeón de la Liga Pokémon DOSW

### Ejercicio 18 — Top 5 Pokémon Más Fuertes
**Código implementado:** [`Ejercicio18.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio18.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 19 — Top 3 Entrenadores
**Código implementado:** [`Ejercicio19.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio19.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

### Ejercicio 20 — Pokédex Analítica
**Código implementado:** [`Ejercicio20.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio20.java)
**Captura de ejecución:** (pendiente)
**Explicación:** (pendiente)

---

## Retos Especiales (si aplica)
- [ ] Reto Legendario — Method References
- [ ] Reto Shiny — Buenas prácticas de commits
- [ ] Reto Mewtwo — Ejercicio propuesto
