/*r5
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author salacomputo
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}



import java.util.Scanner;

public class EcuacionRecta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar pendiente
        System.out.print("Ingresa el valor de la pendiente (m): ");
        double m = scanner.nextDouble();

        // Solicitar coordenadas del punto
        System.out.print("Ingresa la coordenada x de un punto en la recta: ");
        double x = scanner.nextDouble();

        System.out.print("Ingresa la coordenada y de ese punto: ");
        double y = scanner.nextDouble();

        // Calcular b usando la fórmula: b = y - m * x
        double b = y - m * x;

        // Mostrar la ecuación de la recta
        System.out.printf("La ecuación de la recta es: Y = %.2fX + %.2f\n", m, b);
    }
}
