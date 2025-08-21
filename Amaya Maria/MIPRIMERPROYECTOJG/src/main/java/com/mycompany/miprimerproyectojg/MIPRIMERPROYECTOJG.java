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
        PARABOLA par = new PARABOLA(); 
        valpen = pendiente(3,2,4,1);
        fase=desfaseEcuRed(valpen, 1, 2);
        
        String data=par.miprimeraClase();
        System.out.println(data);
        
        par.setParametros(4, 3, 12);
        
        float PARAMETRO1=par.get_a();
        System.out.println("a="+ PARAMETRO1);
        System.out.println("x1= " + par.x1() + " x2= " + par.x2());
        System.out.println("la pendiente es: " + valpen +" b= " + fase); 
         System.out.println("y= " + valpen + "x + " + fase ); 
    }
  
}
