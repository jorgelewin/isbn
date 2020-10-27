package ar.edu.unju.fi;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestValidarISBN {
ValidarISBN validar;

    @BeforeEach
    public void setUp() throws Exception{
     
        validar = new ValidarISBN();  
            
             
    }

    @AfterEach
    public void tearDown() throws Exception{
       validar = null;
        
    }

    @Test
    public void testISBNValido() throws Exception{
        
       
        Boolean isbnValido = validar.validarIsbn10("0140441492");

        assertTrue(isbnValido);
        
    }

    @Test
    public void testISBNNoValido() throws Exception{
        
 
        Boolean isbnValido = validar.validarIsbn10("0540441492");

        assertFalse(isbnValido);
        
    }
}
