/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex5;

/**
 *
 * @author crist
 */
public class Meses {

    private final String[] mesesArray = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = mesesArray[(int) (Math.random() * 10)];

    public String[] getMesesArray() {
        return mesesArray;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public boolean comprobacion(String mesAdivinado) {
        if (mesAdivinado.equalsIgnoreCase(mesSecreto)) {
            System.out.println("Felicidades encontraste el mes secreto!!!");
            return false;
        } else {
            System.out.println("Intente nuevamente");
            System.out.println("");
            return true;
        }
    }
}
