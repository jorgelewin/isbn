package ar.edu.unju.fi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;


public class TestLibro {

        Libro libro;
        Libro libro2;
        Libro libro3;
        Libro libro4;
        Libro libro5;
        GestorLibro gestor;
        List<Libro> librosOrdenados;
        
            @BeforeEach
            public void setUp() throws Exception{
                libro = new Libro("0140441492");
                libro2 = new Libro("8403094264");
                libro3 = new Libro("8408058215");
                libro4 = new Libro("843030407X");
                libro5 = new Libro("8497364678");
                gestor = new GestorLibro(); 
                librosOrdenados = new ArrayList<>();  
            }
        
            @AfterEach
            public void tearDown() throws Exception{
                libro = null;
                libro2 = null;
                libro3 = null;
                libro4 = null;
                libro5 = null;
               gestor = null;
               librosOrdenados = null;
            }
        
            @Test
            public void testISBNValido() throws Exception{
                assertTrue(libro.validarIsbn10(libro.getIsbn()));
                assertTrue(libro2.validarIsbn10(libro2.getIsbn()));
            }


            @Test
            public void testISBNNoValido() throws Exception{
              
                assertFalse(libro.validarIsbn10("0540441492"));
                
            }

            @Test
            public void testAgregarLibroValido() throws Exception{

                gestor.agregarLibro(libro);
                assertEquals(1, gestor.getLibros().size());
            }

            @Test
            public void testMostrarLibrosEnOrdenAscendente() throws Exception{

                gestor.agregarLibro(libro);
                gestor.agregarLibro(libro2);
                gestor.agregarLibro(libro3);
                gestor.agregarLibro(libro4);
                gestor.agregarLibro(libro5);
                assertEquals(5, gestor.getLibros().size());

                librosOrdenados = gestor.ordenarLibrosEnOrdenAscendente(); 

                assertNotNull(librosOrdenados);

                gestor.mostrarLibrosOrdenados(librosOrdenados);

            }

            @Test
            public void testMostrarLibrosEnOrdenDescendente() throws Exception{

                gestor.agregarLibro(libro);
                gestor.agregarLibro(libro2);
                gestor.agregarLibro(libro3);
                gestor.agregarLibro(libro4);
                gestor.agregarLibro(libro5);
                assertEquals(5, gestor.getLibros().size());

                librosOrdenados = gestor.ordenarLibrosEnOrdenDescendente(); 

                assertNotNull(librosOrdenados);

                gestor.mostrarLibrosOrdenados(librosOrdenados);
            }
        
          
        
}
