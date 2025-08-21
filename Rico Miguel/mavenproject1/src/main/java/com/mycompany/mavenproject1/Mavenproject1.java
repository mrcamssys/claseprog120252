/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author salacomputo
 */
public class Mavenproject1 {

    public static float pendiente(int yf, int yi, int xf, int xi) {
        float m;
        m = (float) (yf - yi) / (xf - xi);
        return m;

    }

    public static float calcularelinterceptorY(float pendiente, int x, int y) {
        float b;
        b = y - (pendiente * x);
        return b;
    }

    public static void main(String[] args) {
        float valpen, fase;
        PARABOLA par = new PARABOLA();

        valpen = pendiente(3, 2, 4, 1);
        fase = calcularelinterceptorY(valpen, 4, 3);

        String data = par.miprimeraClase();
        System.out.println(data);

        par.setParametros(4, 3, 12);

        float PARAMETRO1 = par.get_a();
        System.out.println("x1 = " + par.x1()+ "x2= " + par.x2());
        System.out.println()
        System.out.println        

        System.out.println("a=" + PARAMETRO1);

        System.out.println("la pendiente es: " + valpen + " b= " + fase);
        System.out.println("y = + valpen +  x + " + fase);

    }

}
