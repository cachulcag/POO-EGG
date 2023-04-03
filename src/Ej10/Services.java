/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej10;

/**
 *
 * @author crist
 */
public class Services {

    public void imprimirArray(float[] arreglo) {
        System.out.println("Imprimiendo Array");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%.2f", arreglo[i]);
            System.out.println("");
        }
        System.out.println("");
    }

    public void ordenar(Array arreglo) {
        float aux;
        for (int i = 0; i < arreglo.getArray1().length; i++) {
            for (int j = i + 1; j < arreglo.getArray1().length; j++) {
                if (arreglo.getArray1()[i] > arreglo.getArray1()[j]) {
                    aux = arreglo.getArray1()[i];
                    arreglo.getArray1()[i] = arreglo.getArray1()[j];
                    arreglo.getArray1()[j] = aux;
                }
            }
        }
        System.out.println("El arreglo en orden es: ");
    }

    public void copiarAB(Array arreglo) {
        System.arraycopy(arreglo.getArray1(), 0, arreglo.getArray2(), 0, 10);
        System.out.println("A continuación se copia los 10 primeros elementos ordenados del arreglo A al B");
    }

    public void rellenar(Array arreglo) {
        float num = 0.5F;
        for (int i = arreglo.getArray2().length - 1; i > 10; i--) {
            arreglo.getArray2()[i] = num;
        }
        System.out.println("Se llena los utimos 10 digitos con 0.5");
    }
}
