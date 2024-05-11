/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Automotores;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjecutorDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner para leer datos por teclado
        Scanner sc = new Scanner(System.in);

        String cedula;
        String marca;
        int anio;
        double valor;
        String n;
        String cadena = "";

        boolean bandera = true;

        // ciclo repetitivo while para crear objetos hasta que el usuario
        // decida detenerse
        while(bandera) {
            System.out.println("Ingrese la cédula del cliente: ");
            cedula = sc.nextLine();
            System.out.println("Ingrese la marca del vehiculo: ");
            marca = sc.nextLine();
            System.out.println("Ingrese el año de fabricacion del vehiculo: ");
            anio = sc.nextInt();
            System.out.println("Ingrese el valor del vehiculo: ");
            valor = sc.nextDouble();

            // hacer uso del constructor que se acople
            Automotores auto = new Automotores(cedula, marca, anio, valor);

            auto.calcularValorMatricula();

            cadena = String.format("%sCaracteristicas Automotores\n"
                    + "Cedula del dueño: %s\n"
                    + "Marca del vehiculo: %s\n"
                    + "Año de Fabricacion: %d\n"
                    + "Valor del Vehiculo: %.2f\n"
                    + "Valor de la Matricula: %.2f\n"
                    + "-----------------\n", cadena, auto.obtenerCedula(),
                    auto.obtenerMarca(), auto.obtenerAnioFabricacion(),
                    auto.obtenerValorVehiculo(), auto.obtenerValorMatricula());

            sc.nextLine();
            System.out.println("¿Desea ingresar mas vehiculos? Ingrese n para "
                    + "salir.");
            n = sc.nextLine();
            if (n.equals("n")){
                bandera = false;
            }
        }
        System.out.printf("%s\n", cadena);
    }

}
