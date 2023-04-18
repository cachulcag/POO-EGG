/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Services {
    
    Scanner leer = new Scanner(System.in);
    private static double x;
    private static double y;
    
    public void ingresarPuntos(Puntos puntos) {
        System.out.println("Ingrese las coordenadas (x1,x2)");
        puntos.setX1(leer.nextDouble());
        puntos.setX2(leer.nextDouble());
        System.out.println("Ingrese las coordenadas (y1,y2)");
        puntos.setY1(leer.nextDouble());
        puntos.setY2(leer.nextDouble());
    }
    
    public void calcularDistancia(Puntos puntos) {
        x = puntos.getX1() - puntos.getX2();
        y = puntos.getY1() - puntos.getY2();
        
        System.out.println("La distancia entre los puntos (" + puntos.getX1() + " , " + puntos.getX2() + ") (" + puntos.getY1() + " , " + puntos.getY2() + ")  es: " + Math.sqrt((x * x) + (y * y)));
    }
}
