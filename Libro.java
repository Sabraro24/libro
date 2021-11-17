
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

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
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
    
    public String getDetalles(){
        String detalles;
        detalles = autor + ", " + titulo + ", " + numeroPaginas +" págs.";
        return detalles;
    }
    
    public void imprimeAutor(){
        System.out.println("Autor: " + autor);
    }
    
    public void imprimeTitulo(){
        System.out.println("Título: " + titulo);
    }
    
    public void impimirDetalles (){
        System.out.println("Título: "+ titulo +", Autor: " + autor + 
        ", Páginas: "+ numeroPaginas);
    }
}
