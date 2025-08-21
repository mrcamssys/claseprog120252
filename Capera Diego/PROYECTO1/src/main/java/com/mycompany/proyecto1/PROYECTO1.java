/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;

/**
 *
 * @author salacomputo
 */
public class PROYECTO1 {
    
    public static float pendiente(int yf, int yi, int xf, int xi){
        float m;
        m = (float)  (yf - yi) / (xf - xi);
        return m;
    }   
    public static float funcion ( float m, int xc0, int yc0){
       
        float b;
        b = (float)yc0 - m* (float)xc0;
        
        return b;
    }
     
 
    public static void main(String[] args) {
        float valpen, fase;
        Parabola par = new Parabola();
        
        valpen = pendiente(3,2,1,4);
        
        fase = funcion(valpen, 1, 2);
        System.out.println(par.miprimeraClase());
        System.out.println("La pendiente es: "+valpen+" b= "+fase);
        System.out.println("y = "+valpen+" x +"+fase);
    }
    
}
