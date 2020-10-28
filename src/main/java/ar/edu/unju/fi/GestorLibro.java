package ar.edu.unju.fi;

import java.util.ArrayList;
import java.util.List;

public class GestorLibro {
    List <Libro> libros;

    public GestorLibro() {
        libros = new ArrayList<>();
    }
    


    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    
    public void eliminarLibro(Libro libro){
        libros.remove(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

   

    

    
}
