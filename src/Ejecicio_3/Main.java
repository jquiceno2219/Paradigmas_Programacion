package Ejecicio_3;


import java.util.Scanner;

/*
Ej. 3: Desarrollar el siguiente caso de uso con programación orientada a objetos.

Caso de uso: Sistema de Gestión de Biblioteca

Descripción: El sistema de gestión de biblioteca permite a los usuarios buscar libros, prestar libros,
devolver libros y gestionar el inventario de la biblioteca.

 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("Bienvenido al Sistema de Gestión de Biblioteca");

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String tituloLibro = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autorLibro = scanner.nextLine();
                    Libro nuevoLibro = new Libro(tituloLibro, autorLibro);
                    biblioteca.agregarLibro(nuevoLibro);
                    System.out.println("Libro agregado exitosamente.");
                    break;
                case 2:
                    System.out.print("Ingrese su nombre: ");
                    String nombreUsuario = scanner.nextLine();
                    Usuario usuario = new Usuario(nombreUsuario);
                    System.out.print("Ingrese el título del libro que desea prestar: ");
                    String tituloPrestamo = scanner.nextLine();
                    for (Libro libro : biblioteca.inventario) {
                        if (libro.getTitulo().equalsIgnoreCase(tituloPrestamo)) {
                            biblioteca.prestarLibro(libro, usuario);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese su nombre: ");
                    String nombreUsuarioDev = scanner.nextLine();
                    Usuario usuarioDev = new Usuario(nombreUsuarioDev);
                    System.out.print("Ingrese el título del libro que desea devolver: ");
                    String tituloDevolucion = scanner.nextLine();
                    for (Libro libro : biblioteca.inventario) {
                        if (libro.getTitulo().equalsIgnoreCase(tituloDevolucion)) {
                            biblioteca.devolverLibro(libro, usuarioDev);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema de gestión.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
