/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author HPSupport
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // Declarar variables
        double galones, litros, precio_litro, total_pagar;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de galones surtidos: ");
        galones = sc.nextDouble();
    
        litros = galones * 3.785;

        precio_litro = 18.60;
        total_pagar = litros * precio_litro;
     
        System.out.printf("El total a cobrar es: S/ %.2f", total_pagar);

        sc.close();
    }
}
