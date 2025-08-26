/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author salacomputo
 */
public class Mavenproject3 {

    public static float pendiente(int yf, int yi, int xf, int xi) {
        float m;
        m = (float) (yf - yi) / (xf - xi);
        return m;

    }

    public static float desfaseEcuRec(float m, int xc0, int yc0) {
        float b;
        b = (float) yc0 - m * (float) xc0;
        return b;
    }

    public static void main(String[] args) {
        float valpen, fase;
        Parabola par = new Parabola();
        
        
        //Scanner scanner = new Scanner(System.in);
        //int variable = scanner.nextInt();
        //Scanner.close();
        
        
        valpen = pendiente(3, 2, 4, 1);
        fase = desfaseEcuRec(valpen, 1, 2);
        
        String data=par.miprimeraClase();
        System.out.println(data);
                
        par.setParametros(1, 6, 8);
        float parametro1=par.get_a();
        float parametro2=par.get_b();
        float parametro3=par.get_c();
        
        System.out.println("x1= " + par.x1() + " x2= " +par.x2());
        
        
        
        
        System.out.println("La pendiente es : " + valpen + " b= " + fase);
        
        System.out.println("y = " + valpen + "x+" + fase);
        System.out.println(par.miprimeraClase());
        System.out.println(par.x1Complejo());
        System.out.println(par.x2Complejo());

    }
}
