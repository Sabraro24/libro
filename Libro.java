
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
    private int vecesPrestado;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
        numeroReferencia = "";
        vecesPrestado = 0;
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

    public int vecesPrestado(){
        return vecesPrestado;
    }
    
    public void prestar(){
        vecesPrestado = vecesPrestado + 1;
    }
    
    public void setNumeroReferenciaLibro(String numeroReferenciaLibro){
        if (numeroReferencia.length() <3){
            System.out.println("Numero caracteres insuficiente");
        }
        else {
            numeroReferencia = numeroReferenciaLibro;
        }
    }

    public String getDetalles(){
        if (numeroReferencia.length() >= 1) {
            String detalles;
            detalles = autor + ", " + titulo + ", " + numeroPaginas +" págs, " + 
            numeroReferencia + "," + vecesPrestado + ".";
            return detalles;
        }
        else {
            String detalles;
            detalles = autor + ", " + titulo + ", " + numeroPaginas +" págs, " + "ZZZ" 
            + "," + vecesPrestado + ".";
            return detalles;
        }       
    }

    public void imprimeAutor(){
        System.out.println("Autor: " + autor);
    }

    public void imprimeTitulo(){
        System.out.println("Título: " + titulo);
    }

    public void impimirDetalles (){
        if (numeroReferencia.length() >= 1) {
            System.out.println("Título: "+ titulo +", Autor: " + autor + 
                ", Páginas: "+ numeroPaginas + "Numero de referencia: " + numeroReferencia
                + ", Veces prestado: " + vecesPrestado + ".");
        }
        else {
            System.out.println("Título: "+ titulo +", Autor: " + autor + 
                ", Páginas: "+ numeroPaginas + "Numero de referencia: ZZZ" 
                + ", Veces prestado: " + vecesPrestado + ".");           
        }
    }
}    
