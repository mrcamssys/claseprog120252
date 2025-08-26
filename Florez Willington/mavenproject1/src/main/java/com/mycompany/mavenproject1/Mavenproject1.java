/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author salacomputo
 */
public class Mavenproject1 {

       
    public static float pendiente (int yf, int yo, int xf, int xo){
        float m;
        m = (float) (yf-yo) / (xf-xo);
        return m;
    }

    public static void main(String[] args) {
        float valpen, fase;
        Parabola par = new Parabola();
        
        valpen = pendiente (3,2,4,1);
        fase=desfaseEcuRec (valpen, 1, 2);
        String data=par.miprimeraClase();
        System.out.println(data);
        
        par.setParametros(1, 19, 18);
        
        float parametro1=par.get_a();
        float parametro2=par.get_b();
        float parametro3=par.get_c();
        
        
        System.out.println("a="+ parametro1 + " b=" + parametro2 + " c="+ parametro3);
        System.out.println("El valor de X1 es: " + par.x1());
        System.out.println("El valor de X2 es: " + par.x2());
        System.out.println("la pendiente es: "+valpen+ " b= " +fase);
        System.out.println("y = " + valpen + " x + " + fase);
        System.out.println("el valo de X1 complejo es: " + par.x1Complejo());
        System.out.println("el valor de X2 complejo es: " + par.x2Complejo());
    }
    public static float desfaseEcuRec(float m, int xc0, int yc0){
    float b;
    b = (float)yc0 - (m*xc0);
    return b;
    }    

        
       
        
    
}
