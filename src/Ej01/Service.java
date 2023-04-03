/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej01;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Service {
    Scanner leer = new Scanner(System.in);
    //método para ingresar libro
    public void ingresarLibro(Libro libro){
        System.out.println("Ingrese el ISBN");
        libro.setIsbn(leer.nextLine());
        System.out.println("Ingrese el Autor");
        libro.setAutor(leer.nextLine());
        System.out.println("Ingrese el Titulo");
        libro.setTitulo(leer.nextLine());
        System.out.println("Ingrese el número de páginas");
        libro.setPaginas(leer.nextLine());
    }
    
    public void mostrarLibro(Libro libro){
        System.out.println(libro.toString()); 
    }
}
