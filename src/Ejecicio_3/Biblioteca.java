package Ejecicio_3;

import java.util.ArrayList;

class Biblioteca {
    public ArrayList<Libro> inventario;

    public Biblioteca() {
        this.inventario = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        inventario.add(libro);
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        if (libro.estaPrestado()) {
            System.out.println("El libro \"" + libro.getTitulo() + "\" ya está prestado.");
        } else {
            usuario.prestarLibro(libro);
            System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido prestado a " + usuario.getNombre() + ".");
        }
    }

    public void devolverLibro(Libro libro, Usuario usuario) {
        if (usuario == null) {
            System.out.println("Este libro no fue prestado por este usuario.");
        } else {
            usuario.devolverLibro(libro);
            System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido devuelto.");
        }
    }
}
