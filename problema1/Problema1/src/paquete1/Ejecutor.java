/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.LibretaNotas;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner para ingresar datos por teclado
        Scanner sc = new Scanner(System.in);

        String nombre;
        double c1, c2, c3;

        System.out.println("¿Que opcion va a ingresar?\n1) Opcion 1"
                + "\n2) Opcion 2");
        byte n = sc.nextByte();

        // limpieza del buffer
        sc.nextLine();
        if (n == 1) {
            System.out.println("Ingrese el nombre del estudiante: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese la calificacion 1: ");
            c1 = sc.nextDouble();
            System.out.println("Ingrese la calificacion 2: ");
            c2 = sc.nextDouble();

            // uso del constructor con nombre, calificacion 1 y calificacion 2
            LibretaNotas notas1 = new LibretaNotas(nombre, c1, c2);

            notas1.calcularPromedio();

            System.out.printf("%s\n", notas1);
        } else if (n == 2) {
            System.out.println("Ingrese el nombre del estudiante: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese la calificacion 1: ");
            c1 = sc.nextDouble();
            System.out.println("Ingrese la calificacion 2: ");
            c2 = sc.nextDouble();
            System.out.println("Ingrese la calificacion 3: ");
            c3 = sc.nextDouble();

            // uso del constructor con nombre y 3 calificaciones
            LibretaNotas notas2 = new LibretaNotas(nombre, c1, c2, c3);

            notas2.calcularPromedio();

            System.out.printf("%s\n", notas2);
        } else {
            System.out.println("Opcion fuera de rango!");
        }

    }

}
