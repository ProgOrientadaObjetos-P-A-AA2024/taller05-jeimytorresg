/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author USUARIO
 */
public class Automotores {

    private String cedula;
    private String marca;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotores(String c, String m, int anio, double valor) {
        cedula = c;
        marca = m;
        anioFabricacion = anio;
        valorVehiculo = valor;
    }

    public Automotores(String c, String m) {
        cedula = c;
        marca = m;
        anioFabricacion = 2010;
        valorVehiculo = 27000;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerAnioFabricacion(int n) {
        anioFabricacion = n;
    }

    public void establecerValorVehiculo(double n) {
        valorVehiculo = n;
    }

    public void calcularValorMatricula() {
        valorMatricula = (0.00002 * valorVehiculo)
                * (double) (2024 - anioFabricacion);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnioFabricacion() {
        return anioFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Caracteristicas Automotores\n"
                + "Cedula del dueño: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Año de Fabricacion: %d\n"
                + "Valor del Vehiculo: %.2f\n"
                + "Valor de la Matricula: %.2f\n", cedula, marca,
                anioFabricacion, obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }
}
