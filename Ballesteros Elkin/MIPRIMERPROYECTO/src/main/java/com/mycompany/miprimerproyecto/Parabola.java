/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miprimerproyecto;

/**
 *
 * @author salacomputo
 */
public class Parabola {

    private float a;
    private float b;
    private float c;
    
    public String miprimeraClase(){
        return "hola estoy desde la clase de parabola";
    }
    public void setParametros(float a,float b,float c){
    this.a=a;
    this.b=b;
    this.c=c;
    }
    public float get_a(){
        return this.a;
    }
    public float get_b(){
        return this.b;
    } 
    public float get_c(){
        return this.c;
    }
    private float raiz(){
        float valor=0;
        valor=this.b*this.b-4*this.a*this.c;
        if(valor>=0){
            return (float) Math.sqrt(valor);
           
        }else{
            return 0;
        }
    }
    public float x1(){
        return (-this.b+this.raiz())/(2*this.a);
    }
    public double x2(){
        return (-this.b-this.raiz())/(2*this.a);
        }
}       