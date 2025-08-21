/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miprimerproyectojg;

/**
 *
 * @author salacomputo
 */
public class MIPRIMERPROYECTOJG {

    public static float pendiente(int yf, int yi, int xf, int xi) {
    float m; 
    m = (float) (yf - yi) / (xf - xi);
    return m; 
    }
    
    public static float desfaseEcuRed(float m, int xc0, int yc0){
    float b;
    b = (float)yc0 - m* (float)xc0;
    return b;
    
    }
    
    public static void main(String[] args) {
        float valpen, fase;
        parabola par = new parabola(); 
        valpen = pendiente(3,2,4,1);
        fase=desfaseEcuRed(valpen, 1, 2);
        
        string data=par.miprimeraClase();
        System.out.println(data); 
        System.out.println("la pendiente es: " + valpen +" b= " + fase); 
         System.out.println("y= " + valpen + "x + " + fase ); 
    }
 
}
