package Ejecicio_3;


import java.util.ArrayList;

// Clase que representa un usuario de la biblioteca
public class Usuario {
    private String nombre;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void prestarLibro(Libro libro) {
        librosPrestados.add(libro);
        libro.prestar();
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
        libro.devolver();
    }
}

