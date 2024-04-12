/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author HPSupport
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // Calificaciones de Matemáticas
        double matExam = 90;
        double[] matTareas = {95, 85, 92}; 
        double matPromedioTareas = calcularPromedio(matTareas); 
        double matPromedio = (matExam * 0.9) + (matPromedioTareas * 0.1); 

        // Calificaciones de Física
        double fisExam = 80;
        double[] fisTareas = {75, 85}; 
        double fisPromedioTareas = calcularPromedio(fisTareas); 
        double fisPromedio = (fisExam * 0.8) + (fisPromedioTareas * 0.2); 

        // Calificaciones de Química
        double quiExam = 85;
        double[] quiTareas = {90, 80, 95}; 
        double quiPromedioTareas = calcularPromedio(quiTareas); 
        double quiPromedio = (quiExam * 0.85) + (quiPromedioTareas * 0.15); 
        // Promedio general
        double promedioGeneral = (matPromedio + fisPromedio + quiPromedio) / 3;

        // Imprimir resultados
        System.out.println("El promedio final de Matemáticas es: " + matPromedio);
        System.out.println("El promedio final de Física es: " + fisPromedio);
        System.out.println("El promedio final de Química es: " + quiPromedio);
        System.out.println("El promedio general del alumno en las tres materias más difíciles es: " + promedioGeneral);
    }

    // Método para calcular el promedio de un arreglo de calificaciones
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calif : calificaciones) {
            suma += calif;
        }
        return suma / calificaciones.length;
    }
}
