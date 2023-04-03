/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej09;

/**
 *
 * @author crist
 */
public class Service {

    public void devolverMayor(Matematica numeros) {
        System.out.println("El número mayor es: " + (Math.max(numeros.getNum1(), numeros.getNum2())));
        System.out.println("");
    }

    public void calcularPotencia(Matematica numeros) {
        int mayor = (int) Math.floor(Math.max(numeros.getNum1(), numeros.getNum2()));
        int menor = (int) Math.floor(Math.min(numeros.getNum1(), numeros.getNum2()));
        System.out.println("La potencia de " + mayor + " elevado a " + menor + " es: " + (int) Math.pow(mayor, menor));
        System.out.println("");
    }

    public void calculaRaiz(Matematica numeros) {
        int menor = (int) Math.abs(Math.min(numeros.getNum1(), numeros.getNum2()));
        System.out.println("La raiz cuadrada del menor de los números (" + menor + ") es: " + Math.sqrt(menor));
        System.out.println("");
    }

}
