/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectos2x;


public class PROYECTOS2X {
    
    public static float pendiente (int yf,int yi, int xf, int xi){
        float m;
        m = (float)(yf -yi)/(yf-xi);
        return m;
    }
    public static float desFaseEcuRec(float m,int xc0,int yc0){
        float b;
        b = (float)yc0 - m* (float)xc0;
        return b;
    }
    public static void main(String[] args) {
        
        float valpen, fase;
        
        valpen = pendiente (3,2,4,1);
        fase=desFaseEcuRec(valpen, 1,2);
                
        System.out.println("la pendiente es;"+valpen+ "b="+fase );
        System.out.println("y="+ valpen + "x +"+ fase );
    }
}
