/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej04;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Services {

    Scanner leer = new Scanner(System.in);

    public void inicializacion(Rectangulo rect) {
        System.out.println("Ingrese la altura");
        rect.setAltura(leer.nextFloat());
        System.out.println("Ingrese la base");
        rect.setBase(leer.nextFloat());
    }

    public void superficie(Rectangulo rect) {
        System.out.println("La superficie es :" + (rect.getAltura() * rect.getBase()));
        System.out.println("");
    }

    public void dibujarRectangulo(Rectangulo rect) {
        for (int i = 0; i < rect.getAltura(); i++) {
            for (int j = 0; j < rect.getBase(); j++) {
                if (i == 0 || i == rect.getAltura() - 1) {
                    System.out.print(" * ");
                } else {
                    if (j == 0 || j == rect.getBase() - 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println(" ");
        }

    }
}
