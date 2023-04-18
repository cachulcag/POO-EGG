/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej14;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Services {

    Scanner leer = new Scanner(System.in);
    private String[] codigo = new String[7];

    public void cargarCelular(Movil celular) {
        System.out.println("Bienvenido, vamos a ingresar los datos del celular");
        System.out.println("Ingrese la marca:");
        celular.setMarca(leer.next());
        System.out.println("Ingrese su precio (ej. 320,65)");
        celular.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el modelo del celular:");
        celular.setModelo(leer.next());
        System.out.println("Ingrese la cantidad de memoria ram:");
        celular.setMemoriaRam(leer.next());
        System.out.println("Ingrese el almacenamiento:");
        celular.setAlmacenamiento(leer.next());
        ingresarCodigo(celular);
    }

    private void ingresarCodigo(Movil celular) {
        System.out.println("Ingrese el código del celular, caracter por caracter:");
        for (int i = 0; i < this.codigo.length; i++) {
            this.codigo[i] = leer.next();
        }
        celular.setCodigo(this.codigo);
    }
}
