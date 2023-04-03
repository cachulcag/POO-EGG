/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/
package Ej01;

/**
 *
 * @author crist
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //intancias
        Service servicio = new Service();
        
        Libro libro1 = new Libro();
        
        Libro libro2 = new Libro();
        //llama a los métodos
        
        System.out.println("Ingrese el libro 1");
        servicio.ingresarLibro(libro1);
        System.out.println("Ingrese el libro 2");
        servicio.ingresarLibro(libro2);
        
        System.out.println("A continuación se muestran los datos del libro");
        servicio.mostrarLibro(libro1);
        servicio.mostrarLibro(libro2);
          
    }
    
}
