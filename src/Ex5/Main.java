/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
*/
package Ex5;

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
        Meses meses = new  Meses();
        System.out.println("Adivine el mes secreto!");
        System.out.println("El programa ha generado un mes secreto aleatoreamente, usted tiene que adivinarlo...");
        do{
            System.out.println("Por favor ingrese el nombre del mes que usted considere que es el mes secreto (en minusculas)");    
        }while(meses.comprobacion(leer.nextLine()));
        
            
        
    }
    
}
