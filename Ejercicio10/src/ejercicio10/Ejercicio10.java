/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author HPSupport
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nnn = new Scanner(System.in);
        System.out.print("Ingrese el presupuesto anual del hospital: ");
        double presupuesto = nnn.nextDouble();

        // Calcular la cantidad de dinero que recibirá cada área
        double ginecologia = presupuesto * 0.4;
        double traumatologia = presupuesto * 0.3;
        double pediatria = presupuesto * 0.3;

        // Mostrar la cantidad de dinero que recibirá cada área
        System.out.println("Ginecología recibirá: " + ginecologia);
        System.out.println("Traumatología recibirá: " + traumatologia);
        System.out.println("Pediatría recibirá: " + pediatria);
    }
}
