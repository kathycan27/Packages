package Geometria2D;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Rombo  {
    Scanner sc=new Scanner(System.in);
     double vlado1, vlado2, alturaA;
    double area;
    public void alturaB()
    {

        alturaA=sc.nextDouble();
        double alturaB=getArea();
        System.out.println("La altura de B es: "+alturaB);


    }
    public void valores()
    {
        area=vlado1*alturaA;
        System.out.println("El area es: "+area);
       /* double perimetro=getVlado()*4;
        System.out.println("El perimetro es: "+perimetro);*/
    }

    public double getVlado1() {
        return vlado1;
    }

    public void setVlado1(double vlado1) {
        this.vlado1 = vlado1;
    }

    public double getVlado2() {
        return vlado2;
    }

    public void setVlado2(double vlado2) {
        this.vlado2 = vlado2;
    }

    public double getAlturaA() {
        return alturaA;
    }

    public void setAlturaA(double alturaA) {
        this.alturaA = alturaA;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
