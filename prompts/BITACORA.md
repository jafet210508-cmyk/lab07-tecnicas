## Tarea: Prompt estructurado y filtrado de productos

```text
[ROL]
Actúa como un desarrollador Senior en Java especializado en estructuras de datos y lógica de programación.

[CONTEXTO]
Estoy construyendo un módulo para el sistema de inventario donde necesito filtrar productos según su disponibilidad en stock.

[TAREA]
Escribe un método en Java llamado `filtrarProductosDisponibles` que reciba una lista de objetos `Producto` y devuelva únicamente aquellos cuyo stock sea mayor a cero.

[RESTRICCIONES]
- Usa la API de Stream de Java (Java 8+).
- Maneja el caso de que la lista de entrada sea nula o esté vacía devolviendo una lista vacía.
- No uses bucles tradicionales (`for` o `while`).

[FORMATO DE SALIDA]
Proporciona el código Java del método junto con un caso de prueba ejecutable en un método `main`.