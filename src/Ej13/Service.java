/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej13;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String[] array = new String[5];

    public void cargarAlumno(Curso alumnos) {
        for (int i = 0; i < alumnos.getAlumnos().length; i++) {
            System.out.println("Ingrese el nombre del estudiante número " + (i + 1));
            this.array[i] = leer.next();
        }
        alumnos.setAlumnos(array);
    }

    public void crearCurso(Curso datos) {
        System.out.println("Ingrese el nombre del curso:");
        datos.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por día:");
        datos.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana:");
        datos.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el turno (mañana o tarde)");
        datos.setTurno(leer.next());
        System.out.println("Ingrese el precio por hora (ej. 2,50)");
        datos.setPrecioPorHora(leer.nextDouble());
        System.out.println("Ahora por favor, ingrese los nombres de los estudiantes:");
        cargarAlumno(datos);
    }

    public void calcularGanaciasSemana(Curso curso) {
        System.out.println("La ganacia semanal es: " + (curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana() * curso.getAlumnos().length * curso.getPrecioPorHora()) + "$");
    }
}
