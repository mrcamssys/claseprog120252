
package com.mycompany.mavenproject1;


public class Parabola {
    private float a;
    private float b;
    private float c;
    private float valor=0;
    
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
    
        return (-this.b+this.raiz())/(2*this.a);
    }
    public float x2(){
        
        return (-this.b-this.raiz())/(2*this.a);
        }
    private float raiz(){  
        
        this.valor = this.b*this.b-4*this.a*this.c;
        if(valor>=0){
             return (float) Math.sqrt(this.valor);
        }else{
            float valora = -1 * this.valor;
            return (float) Math.sqrt(valora);
        }
   
    }
    public String x1Complejo(){
    
       if(this.valor>0){
       return "x1 = "+this.x1();
       }else{
            float real;
            float imaginario;
            real=this.b/(2*this.a);
            imaginario=this.raiz()/(2*this.a);
            return "x1 = " + real + " complejo = " + imaginario;
       }
    }
    public String x2Complejo(){
    
        if(this.valor>0){
        return "x2 = "+this.x2();
        }else{
            float real;
            float imaginario;
            real=this.b/(2*this.a);
            imaginario=this.raiz()/(2*this.a);
            return "x2 = " + real + " complejo = " + imaginario;
        }
    }
     
}

