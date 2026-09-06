# DOSW_BITACORA

Bitacora del Torneo Pokemon del Profesor Oak — Taller 2 de DOSW (Java, Streams y Expresiones Lambda).

## 📁 Estructura del repositorio

```
DOSW_BITACORA/
├── README.md
└── src/main/java/dosw/
    ├── semana_1/streams/    → Ejercicio1.java ... Ejercicio5.java
    └── semana_2/pokemon/    → Ejercicio1.java ... Ejercicio20.java (+ Pokemon.java, Entrenador.java)
```

## 🌿 Estrategia de ramas

- `main` y `develop` son las ramas principales.
- Cada semana vive en `feature/semana-n-dosw`, creada desde `develop`.
- Cada ejercicio se resuelve en `feature/semana-n-dosw-ejercicio-n`, creada desde la rama de la semana; al terminar se mezcla en la rama semanal y se elimina.
- Al completar todos los ejercicios de una semana, `feature/semana-n-dosw` se mezcla a `develop` (la rama semanal **no** se elimina: queda como evidencia).
- Al cierre de cada ciclo, `develop` se sincroniza hacia `main`.

---

# SEMANA No 1 — DOSW Manejo de Streams

## Datos personales:
- Nombre y Apellido:
- Codigo de Estudiante:
- Curso:

---

### Ejercicio 01 — Numeros Pares mayores a diez

Nos dan una lista de numeros y hay que quedarnos solo con los que sean pares **y** mayores a 10.

**Codigo implementado:** [`Ejercicio1.java`](src/main/java/dosw/semana_1/streams/Ejercicio1.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Usamos `filter()` con una condicion doble: que el numero sea par (`numero % 2 == 0`) y que sea mayor a 10. El stream recorre la lista solo, no hace falta escribir ningun `for`.

### Ejercicio 02 — Cantidad de Palabras con mas de 4 caracteres

Filtrar palabras largas, pasarlas a mayusculas, ordenarlas y contar cuantas quedaron.

**Codigo implementado:** [`Ejercicio2.java`](src/main/java/dosw/semana_1/streams/Ejercicio2.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Encadenamos tres pasos: `filter()` deja solo las palabras con mas de 4 letras, `map()` las pasa a mayusculas y `sorted()` las ordena alfabeticamente. Al final, `size()` sobre la lista resultante nos da el conteo.

### Ejercicio 03 — Obtener nombres de los Usuarios

Filtrar usuarios activos y sacar sus nombres en mayuscula, ordenados alfabeticamente.

**Codigo implementado:** [`Ejercicio3.java`](src/main/java/dosw/semana_1/streams/Ejercicio3.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Primero `filter(Usuario::active)` deja solo a los usuarios activos, luego `map()` saca el nombre y lo pasa a mayuscula, y `sorted()` ordena el resultado. Todo en una sola cadena de streams, sin variables intermedias ni ciclos.

### Ejercicio 04 — Personas mayores de edad

Filtrar usuarios mayores de edad y obtener sus nombres.

**Codigo implementado:** [`Ejercicio4.java`](src/main/java/dosw/semana_1/streams/Ejercicio4.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Con `filter()` nos quedamos solo con los usuarios de 18 anios o mas, y con `map()` sacamos unicamente su nombre.

### Ejercicio 05 — Transacciones Bancarias

Usar `peek()` para observar cada transaccion y `anyMatch()` para verificar si existe alguna no aprobada.

**Codigo implementado:** [`Ejercicio5.java`](src/main/java/dosw/semana_1/streams/Ejercicio5.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `peek()` nos deja "espiar" cada transaccion justo cuando el stream la esta procesando (imprimimos un log). Despues `anyMatch()` revisa si hay alguna transaccion no aprobada — apenas encuentra una, corta ahi mismo (por eso en la consola no siempre aparecen todas: los streams son "vagos" y paran en cuanto ya tienen la respuesta).

---

# SEMANA No 2 — Bitacora Pokemon

## Datos de Entrenador:
- Nombre y Apellido:
- Codigo de Estudiante:
- Curso:

---

## Nivel 1 — Entrenador Novato

### Ejercicio 01 — Pokemon Tipo Fuego
**Codigo implementado:** [`Ejercicio1.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio1.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `filter()` deja solo los Pokemon cuyo tipo es "Fuego" y con `map()` sacamos nada mas el nombre de cada uno.

### Ejercicio 02 — Pokedex Gritona
**Codigo implementado:** [`Ejercicio2.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio2.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `map(String::toUpperCase)` pasa cada nombre a mayusculas. Usamos una referencia a metodo en vez de escribir la lambda `n -> n.toUpperCase()`, queda mas corto y se lee igual de claro.

### Ejercicio 03 — Poder Total del Equipo
**Codigo implementado:** [`Ejercicio3.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio3.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `reduce(0, Integer::sum)` va sumando los niveles uno por uno, arrancando desde 0, hasta entregarnos el total del equipo.

### Ejercicio 04 — Pokemon Alfa
**Codigo implementado:** [`Ejercicio4.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio4.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `max()` con un `Comparator` que compara por nivel nos devuelve directo al Pokemon con el nivel mas alto, sin tener que recorrer la lista a mano comparando de a uno.

### Ejercicio 05 — Pokemon Legendarios
**Codigo implementado:** [`Ejercicio5.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio5.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `filter()` deja solo los Pokemon con nivel mayor a 80, y `count()` cuenta cuantos quedaron.

## Nivel 2 — Entrenador Intermedio

### Ejercicio 06 — Pokedex Sin Duplicados
**Codigo implementado:** [`Ejercicio6.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio6.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `distinct()` elimina los nombres repetidos y deja cada Pokemon una sola vez, respetando el orden en que aparecieron.

### Ejercicio 07 — Orden del Profesor Oak
**Codigo implementado:** [`Ejercicio7.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio7.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `sorted()` ordena la lista alfabeticamente sin que tengamos que programar ningun algoritmo de ordenamiento nosotros mismos.

### Ejercicio 08 — Evoluciones Preparadas
**Codigo implementado:** [`Ejercicio8.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio8.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `filter(PokemonEvolucion::puedeEvolucionar)` deja solo los Pokemon que tienen ese booleano en `true`.

## Nivel 3 — Lider de Gimnasio

*A partir de aqui se usa la clase [`Pokemon`](src/main/java/dosw/semana_2/pokemon/Pokemon.java).*

### Ejercicio 09 — Equipo Elite
**Codigo implementado:** [`Ejercicio9.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio9.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `filter()` deja solo los Pokemon con `poderCombate` mayor a 500, y de paso `sorted()` los ordena de mayor a menor poder para que el equipo elite salga ya rankeado.

### Ejercicio 10 — Pokedex Compacta
**Codigo implementado:** [`Ejercicio10.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio10.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `map(Pokemon::getNombre)` transforma la lista de objetos `Pokemon` en una lista simple de puros nombres (`String`).

### Ejercicio 11 — Poder Promedio
**Codigo implementado:** [`Ejercicio11.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio11.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `mapToDouble()` convierte el stream de Pokemon en un stream de numeros (el `poderCombate` de cada uno) y `average()` calcula el promedio directo, sin sumar y dividir a mano.

### Ejercicio 12 — Campeon Regional
**Codigo implementado:** [`Ejercicio12.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio12.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Igual que el Pokemon Alfa, pero comparando por `poderCombate`: `max()` nos da directo al mas fuerte de toda la lista.

### Ejercicio 13 — Organizar por Tipo
**Codigo implementado:** [`Ejercicio13.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio13.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `groupingBy()` arma un mapa donde la clave es el tipo del Pokemon y el valor es la lista de nombres con ese tipo. Es basicamente un "agrupar por" de toda la vida, pero resuelto con una sola linea de streams.

### Ejercicio 14 — Organizar por Region
**Codigo implementado:** [`Ejercicio14.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio14.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Lo mismo que el ejercicio anterior, pero agrupando por region en vez de por tipo.

## Nivel 4 — Alto Mando

*A partir de aqui se usa tambien la clase [`Entrenador`](src/main/java/dosw/semana_2/pokemon/Entrenador.java).*

### Ejercicio 15 — Maestro de Gimnasios
**Codigo implementado:** [`Ejercicio15.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio15.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `max()` con un `Comparator` por medallas nos devuelve directo al entrenador con mas medallas.

### Ejercicio 16 — Entrenadores Experimentados
**Codigo implementado:** [`Ejercicio16.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio16.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** `filter()` deja solo a los entrenadores con mas de 5 medallas.

### Ejercicio 17 — Equipo Mas Poderoso
**Codigo implementado:** [`Ejercicio17.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio17.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Por cada entrenador sumamos el `poderCombate` de todos los Pokemon de su equipo con `mapToDouble()` + `sum()`, y despues comparamos esos totales para saber quien tiene el equipo mas fuerte.

## Nivel 5 — Campeon de la Liga Pokemon DOSW

### Ejercicio 18 — Top 5 Pokemon Mas Fuertes
**Codigo implementado:** [`Ejercicio18.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio18.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Ordenamos toda la pokedex de mayor a menor `poderCombate` con `sorted()` y con `limit(5)` nos quedamos solo con los primeros cinco. Asi armamos el ranking sin tocar la lista original.

### Ejercicio 19 — Top 3 Entrenadores
**Codigo implementado:** [`Ejercicio19.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio19.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Ordenamos a los entrenadores combinando varios criterios con `thenComparing()`: primero por medallas, si hay empate por el poder acumulado del equipo, y si todavia empatan, por nombre. Con `limit(3)` nos quedamos con el podio.

### Ejercicio 20 — Pokedex Analitica
**Codigo implementado:** [`Ejercicio20.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio20.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Es el ejercicio que junta casi todo lo aprendido: `groupingBy()` + `counting()` para contar por tipo y por region, `filter()` + `count()` para los legendarios, `mapToInt()` + `average()` para el nivel promedio, y `max()` para encontrar al mas fuerte. Todo armado en un solo resumen.

---

## Retos Especiales (si aplica)
- [ ] Reto Legendario — Method References
- [ ] Reto Shiny — Buenas practicas de commits
- [ ] Reto Mewtwo — Ejercicio propuesto
