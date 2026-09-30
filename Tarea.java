import java.util.List;
import java.util.stream.Collectors;

public class Tarea {

    // Método solicitado en la Tarea
    public static List<Producto> filtrarProductosDisponibles(List<Producto> productos) {
        if (productos == null || productos.isEmpty()) {
            return List.of();
        }
        return productos.stream()
                .filter(p -> p.getStock() > 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Ejemplo de prueba
        List<Producto> lista = List.of(
            new Producto("P01", "Teclado", 150.0, 5),
            new Producto("P02", "Mouse", 80.0, 0),
            new Producto("P03", "Monitor", 600.0, 2)
        );

        List<Producto> disponibles = filtrarProductosDisponibles(lista);
        System.out.println("Productos disponibles en stock:");
        disponibles.forEach(System.out::println);
    }
}