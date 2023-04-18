/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej12;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Services {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Date hoy = new Date();

    public Persona crearPersona() {
        System.out.println("Ingrese su fecha de nacimiento (año, mes, día)");
        Persona persona = new Persona(leer.nextInt(), leer.nextInt(), leer.nextInt());
        return persona;
    }

    public void calcularEdad(Persona persona) {
        System.out.println("Su edad es: " + (hoy.getYear() + 1900 - persona.getNacimiento().getYear()) + " años, " + (hoy.getMonth() + 1 - persona.getNacimiento().getMonth()) + " meses y " + (hoy.getDate() - persona.getNacimiento().getDate()) + " dias.");
    }
    
    
}
