/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author HPSupport
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // Declaración de variables
        String nombreVendedor;
        int motosVendidas;
        double valorVentas, salarioFijo, comision, salarioTotal;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del vendedor: ");
        nombreVendedor = sc.nextLine();
        System.out.print("Ingrese el número de motos vendidas: ");
        motosVendidas = sc.nextInt();
        System.out.print("Ingrese el valor total de las motocicletas vendidas: ");
        valorVentas = sc.nextDouble();

        // Cálculo del salario total
        salarioFijo = 1000; // Supongamos que el salario fijo es s/1000
        comision = motosVendidas * 50 + valorVentas * 0.05;
        salarioTotal = salarioFijo + comision;

        // Salida de datos
        System.out.println("Salario total de " + nombreVendedor + ": s/" + salarioTotal);
    }
}

