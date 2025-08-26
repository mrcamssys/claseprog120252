/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.miprimerproyecto;

/**
 *
 * @author salacomputo
 */
public class Miprimerproyecto {

    public static float pendiente(int yf, int yi, int xf, int xi) {
        float m;
        m = (float) (yf - yi) / (xf - xi);
        return m;
    }

    public static void main(String[] args) {
        float valpen, fase;
        Parabola par = new Parabola();
        
        valpen = pendiente(3, 2, 4, 1);
        fase = desfasecurec(2, valpen, 1);
        
        String data=par.miprimeraClase();
        System.out.println(data);
        
        par.setParametros(1, 19, 8);
        float parametro1=par.get_a();
        
        System.out.println("x1= "+ par.x1() + " x2 = "+ par.x2());
        
        
        System.out.println("la pendiente es = " + valpen + " La recta es = " + fase);
        System.out.println("y = " + valpen + "x + " + fase);
        System.out.println(par.x1Complejo());
        System.out.println(par.x2Complejo());
    }

    public static float desfasecurec(int yi, float m, int xi) {
        float b;
        b = (float) yi - m * (float) xi;
        return b;

    }
}
