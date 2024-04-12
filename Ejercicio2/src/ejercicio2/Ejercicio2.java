/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author HPSupport
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        // Pedir la edad de Juan
        System.out.print("Ingrese la edad de Juan: ");
        int juanEdad = input.nextInt();

        // Calcular las edades de Alberto, Ana y la mamá
        int albertoEdad = juanEdad * 2/ 3;
        int anaEdad = juanEdad * 4 / 3;
        int mamaEdad = juanEdad + albertoEdad + anaEdad;

        // Mostrar las edades de los cuatro
        System.out.println("Edad de Juan: " + juanEdad);
        System.out.println("Edad de Alberto: " + albertoEdad);
        System.out.println("Edad de Ana: " + anaEdad);
        System.out.println("Edad de la mamá: " + mamaEdad);
    }
}

    