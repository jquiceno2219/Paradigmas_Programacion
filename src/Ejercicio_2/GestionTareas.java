package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GestionTareas {
    private List<Tarea> tareas;

    public GestionTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
    }

    public void marcarTareaComoCompletada(String nombre) {
        tareas.stream()
                .filter(task -> task.getNombre().equals(nombre))
                .findFirst()
                .ifPresent(Tarea::marcarCompletada);
    }

    public List<Tarea> obtenerPendientes() {
        return tareas.stream()
                .filter(tarea -> !tarea.estaCompletada())
                .collect(Collectors.toList());
    }

    public List<Tarea> obtenerCompletadas() {
        return tareas.stream()
                .filter(Tarea::estaCompletada)
                .collect(Collectors.toList());
    }

}