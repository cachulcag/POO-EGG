/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej08;

/**
 *
 * @author crist
 */
public class Services {
//    deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.

    public void mostrarVocales(Cadena frase) {
        int contador = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if ("i".equalsIgnoreCase(frase.getFrase().substring(i, i + 1)) || "o".equalsIgnoreCase(frase.getFrase().substring(i, i + 1)) || "u".equalsIgnoreCase(frase.getFrase().substring(i, i + 1)) || "a".equalsIgnoreCase(frase.getFrase().substring(i, i + 1)) || "e".equalsIgnoreCase(frase.getFrase().substring(i, i + 1))) {
                contador++;
            }
        }

        System.out.println("La frase contiene " + contador + " Vocales");
        System.out.println("");
    }

    public void invertirFrase(Cadena frase) {
        String nuevaFrase = "";
        for (int i = frase.getLongitud() - 1; i >= 0; i--) {
            nuevaFrase += frase.getFrase().charAt(i);
        }
        System.out.println("la frase invertida es:");
        System.out.println(nuevaFrase);
        System.out.println("");
    }

    public void vecesRepetido(String letra, Cadena frase) {
        int contador = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(frase.getFrase().substring(i, i + 1))) {
                contador++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + contador + " veces.");
        System.out.println("");
    }

    public void compararLongitud(Cadena frase, Cadena fraseComparacion) {
        if (frase.getLongitud() == fraseComparacion.getLongitud()) {
            System.out.println("Si tienen la misma cantidad de caracteres");
        } else {
            System.out.println("Las frases no tienen la misma cantidad de caracteres");
        }
        System.out.println("");
    }

    public void unirFrases(Cadena frase, Cadena fraseComparacion) {
        System.out.println("A continuación se uniran las frases:");
        System.out.println(frase.getFrase()+" "+fraseComparacion.getFrase());
        System.out.println(frase.getFrase().concat(fraseComparacion.getFrase()));
        System.out.println("");
    }

    public void reemplazar(String letra, Cadena frase) {
        System.out.println("Se reemplazará la letra 'a' por la letra '" + letra + "'");
        System.out.println(frase.getFrase().replace("a", letra));
        System.out.println("");
    }
    
    public boolean contiene(String letra, Cadena frase){
        return frase.getFrase().contains(letra);
    }
}
