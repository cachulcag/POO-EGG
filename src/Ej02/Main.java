/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/
package Ej02;

/**
 *
 * @author crist
 */
public class Main {
    
    public static void main(String[] args) {       
        Services servicio = new Services();
        Circunferencia cir1 = servicio.ingresarRadio();
        
        
        //implementación de métodos
        servicio.area(cir1);
        servicio.perimetro(cir1);
        Circunferencia cir2 = servicio.ingresarRadio();
        servicio.area(cir2);
        servicio.perimetro(cir2);
    }
}
