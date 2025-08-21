/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1;

/**
 *
 * @author salacomputo
 */
public class Project1 {
    
    public static float pendiente (int yf, int yi, int xf, int xi){
        float m;
        m = (float) (yf-yi) / (xf-xi);
        return m;
    }
    public static float desfaseEcuRec (float m, int xc0, int yc0){
        float b;
        b = (float) yc0 - m* (float) xc0;
        return b;
    }

    public static void main(String[] args) {
        float valpen, fase;
        Parabola par = new Parabola();
        
        
        valpen = pendiente (3,2,1,4);
        fase= desfaseEcuRec (valpen, 1, 2); 
        string data=par.miprimerClase();
        
        System.out.println(data);
        System.out.println("La pendiente es: "+valpen+ "b= " +fase);
        System.out.println("La ecuacion de la recta es y = "+ valpen + "x + " + fase);
               
    }
}
