/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author HPSupport
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la medida A: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese la medida B: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese la medida C: ");
        double c = sc.nextDouble();

        // Calcular el área del terreno
        double areaTriangulo = (b * c) / 2;
        double areaRectangulo = a * (c - b);
        double areaTerreno = areaTriangulo + areaRectangulo;

        // Mostrar el resultado
        System.out.println("El área del terreno es: " + areaTerreno);
    }
}
