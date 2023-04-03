/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /* En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();*/
package Ej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // constructor por defecto
        Date fechaActual = new Date();

        System.out.println("La fecha actual es: ");
        System.out.println(fechaActual.getDate() + "/" + (fechaActual.getMonth() + 1) + "/" + (fechaActual.getYear() + 1900));

        //constructor con parámetros        
        System.out.println("Ingrese su fecha de nacimiento (año, mes, día)");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        Date fecha = new Date(fechaActual.getYear() + 1900 - anio, fechaActual.getMonth() + 1 - mes, fechaActual.getDate() - dia);

        System.out.println("Su edad es: " + fecha.getYear() + " años, " + fecha.getMonth() + " meses y " + fecha.getDate() + " dias.");
    }
}
