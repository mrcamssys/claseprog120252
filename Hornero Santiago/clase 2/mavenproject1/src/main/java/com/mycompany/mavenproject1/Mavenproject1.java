package com.mycompany.mavenproject1;

public class Mavenproject1 {

  public static float pendiente(int yf, int yi, int xf, int xi){
      float m;
      m= (float) (yf-yi)/(xf-xi);
      return m;   
  }
    public static void main(String[] args) {
        float valpen, fase, recta, valorb;
        // instanciar la clase parabola 
        Parabola par = new Parabola();
        System.out.println(par.miprimeraClase());
        valpen = pendiente (3,2,4,1); //M
        fase = desface(valpen,1,2);  // 
        recta = ecurecta(valpen,1,fase); //Y
        valorb = valorB(valpen,1,recta);
        System.out.println("la pendiente es de: " + valpen);
        System.out.println("la fase es de: " + fase);
        System.out.println("la ecuasion de la recta es: " + recta);
        System.out.println("y = " + valpen + " x + " + fase);
        System.out.println("el valor en b es: " + valorb);
        
        // ingresar  datos a parabola
        par.setParametros(1, 6, 8);
        
        float parametro1 = par.valorA();
        System.out.println("el valor del parametro 1 es: " + parametro1);
        float parametro2 = par.valorB(fase);
        System.out.println("el valor del parametro 2 es: " + parametro2);
        float parametro3 = par.valorC();
        System.out.println("el valor del parametro 3 es: " + parametro3);
        System.out.println("el valor en X1 es: " + par.x1());
        System.out.println("el valor de X2 es: " + par.x2());
        
    }
    public static float desface(float m, int xc0,int yc0){
    float b;
    b = (float ) yc0 - m * (float ) xc0;
     return b;
  }
    public static float ecurecta(float m ,int x, float b){
    float y;
    y = (float)m * x + (float)b;
     return y;
  }
    public static float valorB(float m, int x, float y ){
    float b;
    
    b = (float) m * x / (float)y;
    
    return b;
    }

}
