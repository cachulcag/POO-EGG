/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/
package Ej10;

/**
 *
 * @author crist
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Services servicio = new Services();
        Array arreglo = new Array();
        
        servicio.imprimirArray(arreglo.getArray1());
        servicio.ordenar(arreglo);
        servicio.imprimirArray(arreglo.getArray1());
        servicio.copiarAB(arreglo);
        servicio.imprimirArray(arreglo.getArray2());
        servicio.rellenar(arreglo);
        servicio.imprimirArray(arreglo.getArray2());
        servicio.imprimirArray(arreglo.getArray1());
        
    }
    
}
