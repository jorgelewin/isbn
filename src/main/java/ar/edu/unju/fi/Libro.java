package ar.edu.unju.fi;

public class Libro implements Comparable<Libro>{

    private String isbn;

    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean validarIsbn10( String isbn )
    {
        if ( isbn == null )
        {
            return false;
        }

        isbn = isbn.replaceAll( "-", "" );

        if ( isbn.length() != 10 )
        {
            return false;
        }

        try
        {
            int tot = 0;
            for ( int i = 0; i < 9; i++ )
            {
                int digit = Integer.parseInt( isbn.substring( i, i + 1 ) );
                tot += ((10 - i) * digit);
            }

            
            String checksum = Integer.toString( (11 - (tot % 11)) % 11 );
            if ( "10".equals( checksum ) )
            {
                checksum = "X";
            }

            return checksum.equals( isbn.substring( 9 ) );
        }
        catch ( NumberFormatException nfe )
        {
           
            return false;
        }
    }

    public int compareTo(Libro libro){
       return isbn.compareTo(libro.getIsbn());
    }

    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + "]";
    }

    public Libro(String isbn) {
        this.isbn = isbn;
    }



  

    
    
}


