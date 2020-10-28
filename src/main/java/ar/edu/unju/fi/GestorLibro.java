package ar.edu.unju.fi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorLibro {
   List <Libro> libros;

    public GestorLibro() {
        libros = new ArrayList<>();
    }
    

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro){
        if(libro.validarIsbn10(libro.getIsbn())){
            libros.add(libro);
        }
       
    }

    
    public void eliminarLibro(Libro libro){
        libros.remove(libro);
    }

    public List<Libro> ordenarLibrosEnOrdenAscendente(){
        List <Libro> librosOrdenados = libros;

        Collections.sort(librosOrdenados);

        return librosOrdenados;

    }

    public List<Libro> ordenarLibrosEnOrdenDescendente(){
        List <Libro> librosOrdenados = libros;
        Collections.sort(librosOrdenados, Collections.reverseOrder());

        for (Libro libro : librosOrdenados) {
            
            System.out.println(libro);
            
        }

        return librosOrdenados;

    }

    public void mostrarLibrosOrdenados(List<Libro> librosEnOrden){

        for (Libro libro : librosEnOrden) {
            
            System.out.println(libro);
            
        }
    }

    public boolean buscarLibroPorIsbn(Libro libroBuscar){
        boolean bandera = false;
        for (Libro li : libros) {
            if(li.getIsbn().equals(libroBuscar.getIsbn())){
                bandera=true;
                return bandera;
            }else{
                bandera = false;
            }
        }
        return bandera;
    }

  /*  public static void main(String[] args) {
        
        GestorLibro g = new GestorLibro();
        Libro libro1 = new Libro("2547852369");
        Libro libro2 = new Libro("2647852369");
        Libro libro3 = new Libro("2447852369");
        Libro libro4 = new Libro("2347852369");
        Libro libro5 = new Libro("2747852369");
        Libro libro6 = new Libro("2247852369");
        g.agregarLibro(libro1);
        g.agregarLibro(libro2);
        g.agregarLibro(libro3);
        g.agregarLibro(libro4);
        g.agregarLibro(libro5);
        g.agregarLibro(libro6);

        g.mostrarLibrosEnOrdenAscendente();
        System.out.println();
        g.mostrarLibrosEnOrdenDescendente();

      
    }*/
    
}
