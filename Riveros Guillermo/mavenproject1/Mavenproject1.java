/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author salacomputo
 */
public class Mavenproject1 {

public static float pendiente(int yf, int yi, int xf, int xi){
        float m;
        m = (float) (yf - yi) / (xf - xi);
        return m;
    }
    
    public static float desfaseEcuRec(float m, int xc0, int yc0){
        float b;
        b = (float)yc0 - m*(float)xc0;
        return b;
    }
    
    public static void main(String [] args) {
        float valpen, fase;
        parabola par = new parabola();
        
        valpen = pendiente(3,2,4,1);
        fase = desfaseEcuRec(valpen,1, 2);
        String data=par.miprimeraClase();
        System.out.println(par.miprimeraClase());        
        System.out.println("la pendiente es: " + valpen+" b=" +fase );
        System.out.println("y =" + valpen + "x +" +fase);
    }
}
