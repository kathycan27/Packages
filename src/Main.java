import Geometria2D.*;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
      /*  Octagono octagono=new Octagono();
        octagono.numeroDiagonales();
        octagono.apotema();
        Cuadrado cuadrado=new Cuadrado();
        cuadrado.numeroDiagonales();
        cuadrado.valorDiagonal();
        cuadrado.valores();*/
        double alturaB, vlado1, vlado2, alturaA;
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el valor de un lado a del romboide : ");
        vlado1= sc.nextDouble();
        System.out.println("Ingrese el valor del lado b del romboide: ");
        vlado2=sc.nextDouble();
        System.out.println("Ingrese la altura de a: ");
        alturaA=sc.nextDouble();
        Rombo rombo=new Rombo(vlado1, vlado2, alturaA);
        /*rombo.setVlado1(vlado1);
        rombo.setVlado2(vlado2);
        rombo.setAlturaA(alturaA);*/
        //rombo.alturaB();
        System.out.println(rombo.perimetro(vlado1,vlado2));



    }
}