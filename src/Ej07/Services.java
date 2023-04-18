/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej07;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Services {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static int sobrepeso = 0;
    static int normal = 0;
    static int pordebajo = 0;
    static int porcenEdad = 0;
    static int casos = 0;

    public void crearPersona(Persona persona) {
        System.out.println("Por favor ingrese sus datos: ");
        System.out.println("Nombre:");
        persona.setNombre(leer.next());
        System.out.println("Edad:");
        persona.setEdad(leer.nextInt());
        System.out.println("Sexo : (H = 'Hombre', M = 'Mujer' u O = 'Otro'");
        boolean confirmacion = false;
        do {
            persona.setSexo(leer.next());
            if ("o".equalsIgnoreCase(persona.getSexo()) || "h".equalsIgnoreCase(persona.getSexo()) || "m".equalsIgnoreCase(persona.getSexo())) {
                confirmacion = true;
            } else {
                System.out.println("Solo se permite las letras 'H', 'M' u 'O'.");
                System.out.println("Ingrese nuevamente");
            }
        } while (confirmacion == false);
        System.out.println("Altura (en metros):");
        persona.setAltura(leer.nextFloat());
        System.out.println("Peso (en kg):");
        persona.setPeso(leer.nextFloat());
        casos++; 
    }

    public void calcularIMC(Persona persona) {
        if ((persona.getPeso() / Math.pow(persona.getAltura(), 2)) < 20) {
            System.out.println("Está por debajo de su peso ideal");
            pordebajo++;
        } else {
            if ((persona.getPeso() / Math.pow(persona.getAltura(), 2)) >= 20 || (persona.getPeso() / Math.pow(persona.getAltura(), 2)) <= 25) {
                System.out.println("Está en su peso ideal");
                normal++;
            } else {
                if ((persona.getPeso() / Math.pow(persona.getAltura(), 2)) > 25) {
                    System.out.println("Está por encima de su peso ideal");
                    sobrepeso++; 
                }
            }
        }
    }

    public void esMayorDeEdad(Persona persona) {
        boolean conteo;
        if (persona.getEdad() >= 18) {
            System.out.println("es mayor de edad");
            conteo = true;
            porcenEdad++;
        } else {
            conteo = false;
        }
        System.out.println(conteo);
    }

    
    public void mostrarResultados(){
        System.out.println("Existen " + porcenEdad + " personas mayores de edad, dando un pocentaje de: " + (porcenEdad*100)/casos + "%");
        System.out.println("");
        System.out.println("En cuanto a IMC");
        System.out.println("El " + (sobrepeso*100)/casos + "% de personas tienen sobrepeso");
        System.out.println("El " + (normal*100)/casos + "% de personas tienen un peso adecuado");
        System.out.println("El " + (pordebajo*100)/casos + "% de personas tienen un peso por debajo de lo adecuado");
}
        
}
