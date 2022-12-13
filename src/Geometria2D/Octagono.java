package Geometria2D;

import java.util.Scanner;

public class Octagono {
    Scanner sc=new Scanner(System.in);
     int lados=8;

     private  double vlado, h, apotema;
    public int numeroDiagonales()
    {
        int numDiago=(((lados)*(lados-3))/2);
        System.out.println("numero diagonales"+numDiago);
        return numDiago;
    }
    public void apotema()
    {
        System.out.println("Ingresa el valor de los lados: ");
        vlado= sc.nextDouble();

        h=((vlado/2)/(Math.sin(Math.toRadians(22.5))));
        apotema=Math.sqrt((Math.pow(h,2))-(Math.pow((vlado/2),2)));

        System.out.println("El apotema es: "+apotema);

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
