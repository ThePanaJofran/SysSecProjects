/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author HPSupport
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        int totalEstudiantes, numHombres = 0, numMujeres = 0;

        // Pedir al usuario que ingrese el número total de estudiantes en el grupo
        System.out.print("Ingrese el número total de estudiantes en el grupo: ");
        totalEstudiantes = sc.nextInt();

        // Pedir al usuario que ingrese el género de cada estudiante
        for (int i = 1; i <= totalEstudiantes; i++) {
            System.out.print("Ingrese el género del estudiante " + i + " (M para mujer, H para hombre): ");
            String genero = sc.next();
            if (genero.equalsIgnoreCase("H")) {
                numHombres++;
            } else if (genero.equalsIgnoreCase("M")) {
                numMujeres++;
            } else {
                System.out.println("Género no válido. Inténtelo de nuevo.");
                i--;
            }
        }

        // Calcular el porcentaje de hombres y mujeres
        double porcentajeHombres = ((double) numHombres / totalEstudiantes) * 100;
        double porcentajeMujeres = ((double) numMujeres / totalEstudiantes) * 100;

        // Imprimir los resultados
        System.out.println("El porcentaje de hombres en el grupo es: " + porcentajeHombres + "%");
        System.out.println("El porcentaje de mujeres en el grupo es: " + porcentajeMujeres + "%");
    }
}

    