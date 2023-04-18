/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

/**
 *
 * @author crist
 */
public class Raices {

    private int a, b, c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getDiscriminante() {
        return (Math.pow(b, 2)) - (4 * a * c);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
