
package com.mycompany.mavenproject1;


public class Parabola {
    private float a;
    private float b;
    private float c;
    
    public String miprimeraClase(){
        return "hola estoy desde la clase parabola" ;
        
    }
    
    public void setParametros( float a, float b, float c){
    this.a=a;
    this.b=b;
    this.c=c;
    }
    public float valorA(){
    return this.a;
    }    
    public float valorB(float b){
    return this.b;
    }     
    public float valorC(){      
    return this.c;
    } 
    
    public float x1(){
    
        return -(this.b+this.raiz())/(2*this.a);
    }
    public float x2(){
        
        return -(this.b-this.raiz())/(2*this.a);
        }
    private float raiz(){  
        float valor =0;
        valor = this.b*this.b-4*this.a*this.c;
        if(valor>=0){
             return (float) Math.sqrt(valor);
        }else{
             return 0;
        }
         
    }
    
}
