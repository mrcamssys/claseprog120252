/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.miprimerproyecto;

/**
 *
 * @author salacomputo
 */
public class MIPRIMERPROYECTO {

    public static float pendiente(int yf, int yi, int xf, int xi) {
        float m;
        m = (float) (yf - yi) / (xf - xi);
        return m;
    }

    public static float desfase(int y0, float m, int x0) {
        float b;
        b = (float) y0 - (m * (float) x0);
        return b;
    }

    public static void main(String[] args) {
        float valpen, valdesfase;
        Parabola par = new Parabola();
        valpen = pendiente(3, 2, 4, 1);

        valdesfase = desfase(2, valpen, 1);
        
        String data=par.miprimeraClase();
        System.out.println(data);
        
        par.setParametros(1,6,8);
        float parametro1=par.get_a();
        
        System.out.println(parametro1);

        System.out.println("x1= "+par.x1() + " x2= " + par.x2());
        System.out.println("la pendiente es: " + valpen + " b= " + valdesfase);
        System.out.println(" la ecuacion de la recta es y = "+ valpen + "x + " + valdesfase);
    }

}
