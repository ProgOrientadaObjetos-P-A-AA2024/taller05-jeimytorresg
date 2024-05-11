/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class LibretaNotas {

    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public LibretaNotas(String n, double c1, double c2, double c3) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public LibretaNotas(String n, double c1, double c2) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = (c1 + c2) / 2;
    }

    public void establecerNombreEstudiante(String n) {
        nombreEstudiante = n;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public void establecerCalificacion1(double n) {
        calificacion1 = n;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public void establecerCalificacion2(double n) {
        calificacion2 = n;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public void establecerCalificacion3(double n) {
        calificacion3 = n;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + obtenerCalificacion2() + calificacion3) / 3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Libreta de Calificaciones\n"
                + "Nombre del Estudiante: %s\n"
                + "Calificacion 1: %.3f\n"
                + "Calificacion 2: %.3f\n"
                + "Calificacion 3: %.3f\n"
                + "Promedio: %.2f\n", nombreEstudiante,
                calificacion1, calificacion2,
                obtenerCalificacion3(), obtenerPromedio());

        return cadena;
    }
}
