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
public class Array {
//atributos

    private float array1[] = new float[50];
    private float array2[] = new float[20];
//consturctor

    public Array() {
        for (int i = 0; i < this.array1.length; i++) {
            if (i < 20) {
                this.array2[i] = (float) (Math.random() * 100);
            }

            this.array1[i] = (float) (Math.random() * 100);
        }
    }
//getters

    public float[] getArray1() {
        return array1;
    }

    public float[] getArray2() {
        return array2;
    }

}
