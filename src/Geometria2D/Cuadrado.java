package Geometria2D;

import java.util.Scanner;

public class Cuadrado {
    Scanner sc=  new Scanner(System.in);
     private int lados=4;
     private double vlado=0;
    public void numeroDiagonales()
    {
        int numDiago=(((lados)*(lados-3))/2);
        System.out.println("numero diagonales"+numDiago);


    }
    public void valorDiagonal()
    {
        System.out.println("Ingrese el valor del lado: ");
        vlado=sc.nextDouble();
        double diagonal=(Math.sqrt((Math.pow(vlado,2)+Math.pow(vlado,2))));
        System.out.println("El valor de la diagonal es: "+diagonal);


    }
    public void valores()
    {
        double area=Math.pow(getVlado(),2);
        System.out.println("El area es: "+area);
        double perimetro=getVlado()*4;
        System.out.println("El perimetro es: "+perimetro);
    }

    public double getVlado() {
        return vlado;
    }

    public void setVlado(double vlado) {
        this.vlado = vlado;
    }
}
