/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author salacomputo
 */
public class Mavenproject1 {

    public static float desfaseEcuRec(float m, int xc0, int yc0) {
        float b;
        b = (float) yc0 - m * (float) xc0;
        return b;
    }

    public static float pendiente(int yf, int yi, int xf, int xi) {
        float m;
        m = (float) (yf - yi) / (xf - xi);
        return m;
    }

    public static void main(String[] args) {
        float valpen, fase;
        Parabola par = new Parabola();
        valpen = pendiente(3, 2, 4, 1);
        fase = desfaseEcuRec(valpen, 1, 2);

        String data=par.miprimeraclase();
        System.out.println(data);
        
        par.setParametros(1, 6, 8);
        
        float parametro1=par.get_a();
        
        System.out.println("x1= "+ par.x1() + " x2= "+ par.x2());
        System.out.println(par.miprimeraclase());
        System.out.println("Hello World!" + valpen + "b= " + fase);
        System.out.println("Y = " + valpen + " x + " + fase);

    }
}
