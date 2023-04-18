/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej12;

import java.util.Date;

/**
 *
 * @author crist
 */
public class Persona {
    private String nombre;
    private Date nacimiento;

    public Persona(int año, int mes, int dia) {
        this.nacimiento = new Date(año, mes, dia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
           
}
