
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
        if (numeroReferenciaLibro.length() < 3){
            System.out.println("Numero caracteres insuficiente");
        }
        else {
            numeroReferencia = numeroReferenciaLibro;
        }
    }

    public String getDetalles(){
        String detalles;
        String ref;
        detalles = autor + ", " + titulo + ", " + numeroPaginas +" págs, " + vecesPrestado
        + ",";
        if (numeroReferencia.length() >= 3) {
            ref = numeroReferencia;
        }
        else {
            ref = " ZZZ";
        }     
        detalles = detalles + ref + ".";
        return detalles;
    }

    public void imprimeAutor(){
        System.out.println("Autor: " + autor);
    }

    public void imprimeTitulo(){
        System.out.println("Título: " + titulo);
    }

    public void impimirDetalles (){
        String datos;
        String ref;
        datos = ("Título: "+ titulo +", Autor: " + autor + ", Páginas: "+ numeroPaginas 
        + ", Veces prestado: " + vecesPrestado + ", ");
        if (numeroReferencia.length() >= 3) {
            ref = numeroReferencia;
        }
        else {
            ref = "ZZZ";      
        }
        datos = datos + "Numero referencia: " + ref + ".";
        System.out.println (datos);
    }
}    
