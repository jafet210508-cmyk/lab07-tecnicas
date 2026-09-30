cat << 'EOF' > prompts/BITACORA.md
# Bitacora de tecnicas avanzadas
Laboratorio 07: Tecnicas Avanzadas de Prompting.
Herramienta de IA usada: Gemini

## Ejercicio 2: Zero-shot, one-shot y few-shot

| Tipo | Aciertos (de 5) | Formato de la respuesta | Todas con el mismo formato (Si/No) |
|------|-----------------|-------------------------|------------------------------------|
| Zero-shot | 5 | Texto introductorio con emojis y flechas | No |
| One-shot | 1 | Respondió solo una línea por error de sintaxis en el prompt | No |
| Few-shot | 5 | "Comentario" -> Etiqueta (Línea por línea limpia) | Sí |

## Ejercicio 3: Chain of Thought

| Pedido | Respuesta de la IA | Muestra los pasos (Si/No) | Correcta (Si/No) |
|--------|--------------------|---------------------------|------------------|
| Directo | 339.48 | No | No |
| Paso a paso | Muestra descuento (90), IGV (106.20) y total (318.60) | Sí | Sí |

Ver el razonamiento paso a paso es fundamental porque en este caso la respuesta directa cometió un error de cálculo (dio 339.48). Al obligar a la IA a desglosar cada operación, no solo corregimos el resultado, sino que pudimos auditar y verificar cada paso intermedio.

## Ejercicio 4: Role prompting

| Version | Vocabulario (sencillo/tecnico) | Usa ejemplos o codigo | A quien le sirve mas |
|---------|-------------------------------|-----------------------|----------------------|
| A. Sin rol | Directo y neutro | Código simple (`int edad = 18;`) | Para consultas rápidas |
| B. Rol docente | Sencillo y explicativo | Analogía de la caja con etiqueta | Para principiantes que aprenden desde cero |
| C. Rol senior | Técnico y estructurado | Múltiples tipos (`int`, `String`, `double`) y reasignación | Para desarrolladores que buscan estructura formal |

## Ejercicio 5: Descomposicion

Descomponer el problema paso a paso permitió que cada etapa sirviera de base para la siguiente. En lugar de generar un sistema completo en un solo prompt (que suele ser genérico), la IA definió primero los requisitos, usó esos requisitos para modelar las clases (`Producto`, `Venta`, `Inventario`), generó la implementación limpia de la clase `Producto` y finalmente propuso validaciones y encapsulamiento avanzado.

## Ejercicio 6: Prompt estructurado y autocritica

```text
[ROL]
Actúa como un arquitecto de software experto en Java.

[CONTEXTO]
Estoy desarrollando una aplicación de consola en Java para la gestión de inventarios de una pequeña tienda.

[TAREA]
Diseña una clase Java llamada `Producto` que modele los artículos del inventario.

[RESTRICCIONES]
- Usa encapsulamiento (atributos privados con getters y setters).
- Incluye validación en el setter de precio (no puede ser negativo).
- Agrega un método `toString()` formateado para mostrar la información del producto de forma clara.
- No uses librerías externas.

[FORMATO DE SALIDA]
Presenta únicamente el código Java documentado con comentarios breves y un ejemplo de uso en un método `main`.

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