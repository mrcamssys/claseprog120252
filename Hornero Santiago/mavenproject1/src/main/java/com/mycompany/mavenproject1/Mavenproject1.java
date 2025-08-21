package com.mycompany.mavenproject1;

public class Mavenproject1 {

  public static float pendiente(int yf, int yi, int xf, int xi){
      float m;
      m= (float) (yf-yi)/(xf-xi);
      return m;   
  }
    public static void main(String[] args) {
        float valpen, fase, recta;
        parabola par = new parabola();
        System.out.println(par.miprimeraClase());
        valpen = pendiente (3,2,4,1);
        fase = desface(valpen,1,2);
        recta = ecurecta(valpen,1,fase);
        System.out.println("la pendiente es de: " + valpen);
        System.out.println("la fase es de: " + fase);
        System.out.println("la ecuasion de la recta es: " + recta);
        System.out.println("y = " + valpen + " x + " + fase);
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
}
