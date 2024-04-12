/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author HPSupport
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la medida de tiempo (hh mm ss): ");
        int horas = input.nextInt();
        int minutos = input.nextInt();
        int segundos = input.nextInt();

        int minutosExcedentes = segundos / 60;
        segundos = segundos % 60;
        minutos = minutos + minutosExcedentes;

        int horasExcedentes = minutos / 60;
        minutos = minutos % 60;
        horas = horas + horasExcedentes;

        System.out.printf("La medida de tiempo corregida es: %dh %dm %ds", horas, minutos, segundos);

        input.close();
    }
}
