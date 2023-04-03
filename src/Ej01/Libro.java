/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej01;

/**
 *
 * @author crist
 */
public class Libro {
    //atributos
    private String isbn;
    private String autor;
    private String titulo;
    private String paginas;

    //constructores
    public Libro() {
    }

    
    public Libro(String isbn, String autor, String titulo, String paginas) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro con: " + "isbn =" + isbn + ", autor = " + autor + ", titulo = " + titulo + ", paginas = " + paginas;
    }
    
    
}
