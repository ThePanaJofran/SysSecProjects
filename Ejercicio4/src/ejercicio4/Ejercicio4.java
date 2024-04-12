/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author HPSupport
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
   
      Scanner input = new Scanner(System.in);
      
      // Leer los lados del triángulo
      System.out.print("Ingrese la longitud del primer lado: ");
      double lado1 = input.nextDouble();
      
      System.out.print("Ingrese la longitud del segundo lado: ");
      double lado2 = input.nextDouble();
      
      System.out.print("Ingrese la longitud del tercer lado: ");
      double lado3 = input.nextDouble();
      
      // Calcular el semiperímetro
      double s = (lado1 + lado2 + lado3) / 2;
      
      // Calcular el área del triángulo utilizando la fórmula de Herón
      double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
      
      // Imprimir el resultado
      System.out.println("El área del triángulo es: " + area);
   }
}
