
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int length;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
        numeroReferencia = "";
    }

    public String getAutorLibro(){
        return autor;
    }

    public String getTituloLibro(){
        return titulo;
    }

    public int getNumeroPaginasLibro(){
        return numeroPaginas;
    }

    public String getNumeroReferenciaLibro(){
        return numeroReferencia;
    }

    public void setNumeroReferenciaLibro(String NumeroReferenciaLibro){
        numeroReferencia = NumeroReferenciaLibro;
    }

    public String getDetalles(){
        if (numeroReferencia.length() >= 1) {
            String detalles;
            detalles = autor + ", " + titulo + ", " + numeroPaginas +" p�gs, " + 
            numeroReferencia + ".";
            return detalles;
        }
        else {
            String detalles;
            detalles = autor + ", " + titulo + ", " + numeroPaginas +" p�gs, " + "ZZZ.";
            return detalles;
        }       
    }

    public void imprimeAutor(){
        System.out.println("Autor: " + autor);
    }

    public void imprimeTitulo(){
        System.out.println("T�tulo: " + titulo);
    }

    public void impimirDetalles (){
        if (numeroReferencia.length() >= 1) {
            System.out.println("T�tulo: "+ titulo +", Autor: " + autor + 
                ", P�ginas: "+ numeroPaginas + "Numero de referencia: " + numeroReferencia);
        }
        else {
            System.out.println("T�tulo: "+ titulo +", Autor: " + autor + 
                ", P�ginas: "+ numeroPaginas + "Numero de referencia: ZZZ.");           
        }
    }
}    
