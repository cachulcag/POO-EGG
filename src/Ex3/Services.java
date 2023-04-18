/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Services {

    Scanner leer = new Scanner(System.in);

    public Raices inicializar() {
        System.out.println("Ingrese los datos 'a', 'b' y 'c'  ");
        Raices ecuacion = new Raices(leer.nextInt(), leer.nextInt(), leer.nextInt());
        return ecuacion;
    }

    private boolean tieneRaices(Raices ecuacion) {
        return ecuacion.getDiscriminante() > 0;
    }

    private boolean tieneRaiz(Raices ecuacion) {
        return ecuacion.getDiscriminante() == 0;
    }

    public void obtenerRaices(Raices ecuacion) {
        if (tieneRaices(ecuacion)) {
            System.out.println("Las posibles soluciones son: ");
            System.out.print(-ecuacion.getB() + (ecuacion.getDiscriminante() / (2 * ecuacion.getA())));
            System.out.print(" y ");
            System.out.print(-ecuacion.getB() - (ecuacion.getDiscriminante() / (2 * ecuacion.getA())));
            System.out.println("");
        }
    }

    public void obtenerRaiz(Raices ecuacion) {
        if (tieneRaiz(ecuacion)) {
            System.out.println("La soluacion es: ");
            System.out.println(-ecuacion.getB() + (ecuacion.getDiscriminante() / (2 * ecuacion.getA())));
            System.out.println("");
        }
    }

    public void calcular(Raices ecuacion) {
        if (tieneRaices(ecuacion)) {
            obtenerRaices(ecuacion);
        } else {
            if (tieneRaiz(ecuacion)) {
                obtenerRaiz(ecuacion);
            } else {
                System.out.println("No existe solución");
            }
        }
    }
}
