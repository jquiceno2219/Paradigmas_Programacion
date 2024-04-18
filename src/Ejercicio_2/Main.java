package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

/*
Ej. 2: Desarrollar el siguiente caso de uso con programación funcional.

Caso de uso: Sistema de Gestión de Tareas Pendientes

Descripción: El sistema de gestión de tareas pendientes permite a los usuarios mantener un registro de las tareas que
necesitan ser completadas, así como agregar nuevas tareas, marcar tareas como completadas y filtrar tareas según su estado.

 */

public class Main {
    public static void main(String[] args) {
        GestionTareas gestionTareas = new GestionTareas();

        //Agregar tareas nuevas
        gestionTareas.agregarTarea("Terminar test");
        gestionTareas.agregarTarea("Sacar al perro");
        gestionTareas.agregarTarea("Preparar la presentación");

        //Marcar completada
        gestionTareas.marcarTareaComoCompletada("Terminar test");

        //Mostrar pendientes
        List<Tarea> tareasPendientes = gestionTareas.obtenerPendientes();
        System.out.println("Tareas pendientes:");
        tareasPendientes.forEach(System.out::println);

        //Mostrar completa
        List<Tarea> tareasCompletadas = gestionTareas.obtenerCompletadas();
        System.out.println("\nTareas completadas:");
        tareasCompletadas.forEach(System.out::println);
    }
}
