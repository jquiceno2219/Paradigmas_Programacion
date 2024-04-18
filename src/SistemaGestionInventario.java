import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
EJ. 1: Desarrollar el siguiente caso de uso con programación imperativa.

Caso de uso: Sistema de Gestión de Inventario

Descripción: El sistema de gestión de inventario permite a los empleados de una tienda llevar un registro de los
productos en stock, así como realizar acciones como agregar nuevos productos, eliminar productos agotados y actualizar
la cantidad de productos disponibles.

 */

public class SistemaGestionInventario {
    public static void main(String[] args) {
        Map<String, Integer> inventario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Actualizar cantidad de producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidad = scanner.nextInt();
                    inventario.put(nombre, cantidad);
                    System.out.println("Producto agregado al inventario.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    nombre = scanner.nextLine();
                    if (inventario.containsKey(nombre)) {
                        inventario.remove(nombre);
                        System.out.println("Producto eliminado del inventario.");
                    } else {
                        System.out.println("El producto no existe en el inventario.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    nombre = scanner.nextLine();
                    if (inventario.containsKey(nombre)) {
                        System.out.print("Ingrese la nueva cantidad del producto: ");
                        cantidad = scanner.nextInt();
                        inventario.put(nombre, cantidad);
                        System.out.println("Cantidad de producto actualizada en el inventario.");
                    } else {
                        System.out.println("El producto no existe en el inventario.");
                    }
                    break;
                case 4:
                    System.out.println("Inventario:");
                    int i = 0;
                    for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
                        i++;
                        System.out.println("Producto " + i + ": " + entry.getKey() + ", Cantidad: " + entry.getValue());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema de gestión de inventario.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }
    }
}
