package ar.edu.unju.fi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;



public class testLibro {

        Libro validar;
        GestorLibro gestor;
        
            @BeforeEach
            public void setUp() throws Exception{
                validar = new Libro();  
                gestor = new GestorLibro();   
            }
        
            @AfterEach
            public void tearDown() throws Exception{
               validar = null;
               gestor = null;
            }
        
            @Test
            public void testISBNValido() throws Exception{
                assertTrue(validar.validarIsbn10("0140441492"));
            }

            @Test
            public void testAgregarLibroValido() throws Exception{
                assertTrue(validar.validarIsbn10("0140441492"));
                Libro libro1 = new Libro();
                libro1.setIsbn("0140441492");
                gestor.agregarLibro(libro1);
                assertEquals(1, gestor.getLibros().size());
            }
        
         
        
}
