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
- Al completar todos los ejercicios de una semana, `feature/semana-n-dosw` se mezcla a `develop` (la rama semanal no se elimina: queda como evidencia).
- Al cierre de cada ciclo, `develop` se sincroniza hacia `main`.

---

# SEMANA No 1 — DOSW Manejo de Streams

## Datos personales:
- Nombre y Apellido:
- Codigo de Estudiante:
- Curso:

---

### Ejercicio 01 — Numeros Pares mayores a diez

Toca sacar de una lista los numeros que sean pares y ademas mayores a 10.

**Codigo implementado:** [`Ejercicio1.java`](src/main/java/dosw/semana_1/streams/Ejercicio1.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Use filter() poniendo las dos condiciones juntas con && (que sea par y que sea mayor a 10) y ya queda la lista filtrada. No hizo falta nada mas.

### Ejercicio 02 — Cantidad de Palabras con mas de 4 caracteres

Filtrar palabras largas, pasarlas a mayusculas, ordenarlas y contar cuantas quedaron.

**Codigo implementado:** [`Ejercicio2.java`](src/main/java/dosw/semana_1/streams/Ejercicio2.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Primero filter() para quedarme con las palabras de mas de 4 letras, despues map() para pasarlas a mayuscula y sorted() para ordenarlas. Al final el conteo lo saco con size() sobre la lista que queda. Es solo encadenar los metodos uno detras de otro.

### Ejercicio 03 — Obtener nombres de los Usuarios

Filtrar usuarios activos y sacar sus nombres en mayuscula, ordenados alfabeticamente.

**Codigo implementado:** [`Ejercicio3.java`](src/main/java/dosw/semana_1/streams/Ejercicio3.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Saco primero los usuarios activos con filter(), les saco el nombre y lo paso a mayuscula con map(), y por ultimo sorted() para dejarlos en orden alfabetico.

### Ejercicio 04 — Personas mayores de edad

Filtrar usuarios mayores de edad y obtener sus nombres.

**Codigo implementado:** [`Ejercicio4.java`](src/main/java/dosw/semana_1/streams/Ejercicio4.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Parecido al anterior pero mas corto: filtro los que tengan 18 anios o mas y con map() me quedo solo con el nombre.

### Ejercicio 05 — Transacciones Bancarias

Usar peek() para observar cada transaccion y anyMatch() para verificar si existe alguna no aprobada.

**Codigo implementado:** [`Ejercicio5.java`](src/main/java/dosw/semana_1/streams/Ejercicio5.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** El peek() lo uso para ir imprimiendo cada transaccion mientras el stream la procesa, y el anyMatch() revisa si hay alguna no aprobada. Ojo que anyMatch corta apenas encuentra el primer caso que cumple, entonces en la consola no siempre salen impresas todas las transacciones.

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
**Explicacion:** Nada complicado: filter() para quedarme solo con los Pokemon de tipo Fuego y map() para sacar el nombre de cada uno.

### Ejercicio 02 — Pokedex Gritona
**Codigo implementado:** [`Ejercicio2.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio2.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** map() con la referencia String::toUpperCase pasa todos los nombres a mayuscula. Es lo mismo que poner una lambda pero queda mas corto.

### Ejercicio 03 — Poder Total del Equipo
**Codigo implementado:** [`Ejercicio3.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio3.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Sumo los niveles con reduce(), arrancando desde 0 y sumando de a uno con Integer::sum.

### Ejercicio 04 — Pokemon Alfa
**Codigo implementado:** [`Ejercicio4.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio4.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Con max() y un Comparator que compara por nivel, me trae directo el Pokemon con el nivel mas alto sin ir comparando uno por uno a mano.

### Ejercicio 05 — Pokemon Legendarios
**Codigo implementado:** [`Ejercicio5.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio5.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Filtro los que tengan nivel mayor a 80 y cuento cuantos quedaron con count().

## Nivel 2 — Entrenador Intermedio

### Ejercicio 06 — Pokedex Sin Duplicados
**Codigo implementado:** [`Ejercicio6.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio6.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** distinct() quita los nombres repetidos, asi de facil.

### Ejercicio 07 — Orden del Profesor Oak
**Codigo implementado:** [`Ejercicio7.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio7.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** sorted() ordena la lista alfabeticamente solo, no toca hacer nada mas.

### Ejercicio 08 — Evoluciones Preparadas
**Codigo implementado:** [`Ejercicio8.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio8.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** filter() con el booleano puedeEvolucionar me deja solo los que estan listos para evolucionar.

## Nivel 3 — Lider de Gimnasio

*A partir de aqui uso la clase [`Pokemon`](src/main/java/dosw/semana_2/pokemon/Pokemon.java).*

### Ejercicio 09 — Equipo Elite
**Codigo implementado:** [`Ejercicio9.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio9.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Filtro los que tengan poderCombate mayor a 500 y de una vez los ordeno de mayor a menor con sorted() para que el equipo elite salga ya organizado.

### Ejercicio 10 — Pokedex Compacta
**Codigo implementado:** [`Ejercicio10.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio10.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** map() con Pokemon::getNombre convierte la lista de objetos Pokemon en una lista de puros nombres.

### Ejercicio 11 — Poder Promedio
**Codigo implementado:** [`Ejercicio11.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio11.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** mapToDouble() saca el poderCombate de cada Pokemon como numero y average() calcula el promedio, sin sumar y dividir yo mismo.

### Ejercicio 12 — Campeon Regional
**Codigo implementado:** [`Ejercicio12.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio12.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Lo mismo que el ejercicio del Pokemon Alfa pero comparando por poderCombate en vez de nivel.

### Ejercicio 13 — Organizar por Tipo
**Codigo implementado:** [`Ejercicio13.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio13.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** groupingBy() agrupa los Pokemon segun su tipo y arma un mapa de tipo a lista de nombres. Es el "agrupar por" de toda la vida pero en una sola linea.

### Ejercicio 14 — Organizar por Region
**Codigo implementado:** [`Ejercicio14.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio14.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Igual que el anterior nada mas que agrupando por region.

## Nivel 4 — Alto Mando

*A partir de aqui uso tambien la clase [`Entrenador`](src/main/java/dosw/semana_2/pokemon/Entrenador.java).*

### Ejercicio 15 — Maestro de Gimnasios
**Codigo implementado:** [`Ejercicio15.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio15.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** max() con Comparator por medallas trae directo al entrenador que mas medallas tiene.

### Ejercicio 16 — Entrenadores Experimentados
**Codigo implementado:** [`Ejercicio16.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio16.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** filter() deja pasar solo a los que tengan mas de 5 medallas.

### Ejercicio 17 — Equipo Mas Poderoso
**Codigo implementado:** [`Ejercicio17.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio17.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Por cada entrenador sumo el poderCombate de todo su equipo (mapToDouble + sum) y despues comparo esos totales para saber cual entrenador tiene el equipo mas fuerte.

## Nivel 5 — Campeon de la Liga Pokemon DOSW

### Ejercicio 18 — Top 5 Pokemon Mas Fuertes
**Codigo implementado:** [`Ejercicio18.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio18.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Ordeno toda la pokedex de mayor a menor poderCombate y con limit(5) me quedo solo con los primeros 5. Listo el top.

### Ejercicio 19 — Top 3 Entrenadores
**Codigo implementado:** [`Ejercicio19.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio19.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Toca combinar varios criterios de orden con thenComparing(): primero medallas, si empatan poder acumulado del equipo, y si todavia empatan el nombre. limit(3) para quedarme con el podio.

### Ejercicio 20 — Pokedex Analitica
**Codigo implementado:** [`Ejercicio20.java`](src/main/java/dosw/semana_2/pokemon/Ejercicio20.java)
**Captura de ejecucion:** (pendiente)
**Explicacion:** Este junta casi todo lo visto: groupingBy + counting para contar por tipo y region, filter + count para los legendarios, mapToInt + average para el promedio de nivel, y max para el mas fuerte. Es el resumen final de la pokedex.

---

## Retos Especiales (si aplica)
- [ ] Reto Legendario — Method References
- [ ] Reto Shiny — Buenas practicas de commits
- [ ] Reto Mewtwo — Ejercicio propuesto
