/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Services {

    Scanner leer = new Scanner(System.in);
    private static final char[] array = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public void crearNif(NIF usuario) {
        System.out.println("Ingrese su DNI");
        usuario.setDNI(leer.nextLong());
        usuario.setLetra(array[(int) usuario.getDNI() % 23]);
    }
    public void mostrarNif(NIF usuario){
        System.out.println("Su NIF es :");
        System.out.println(usuario.getDNI() + "-" + usuario.getLetra());
    }
}
