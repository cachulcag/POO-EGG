/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej02;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Services {
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia ingresarRadio(){
        System.out.println("Ingrese el radio de la circunferencia");
        Circunferencia circ = new Circunferencia(leer.nextDouble());
        return circ;
    }
    
    public void area(Circunferencia circ){
        System.out.println("El área es: "+ (circ.getRadio()*Math.PI));
        System.out.println("");
    }
    
    public void perimetro(Circunferencia circ){
        System.out.println("El perímetro es: "+ (2*circ.getRadio()*Math.PI));
        System.out.println("");
    }
}
