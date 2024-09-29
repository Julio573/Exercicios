package Ex21;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Triangulo trianguloX = new Triangulo();
    Triangulo trianguloY = new Triangulo();

    Locale.setDefault(Locale.US);
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the measures of triangle X:");
    trianguloX.A = scan.nextDouble();
    trianguloX.B = scan.nextDouble();
    trianguloX.C = scan.nextDouble();

    System.out.println("Enter the measures of triangle Y:");
    trianguloY.A = scan.nextDouble();
    trianguloY.B = scan.nextDouble();
    trianguloY.C = scan.nextDouble();

    double AreaX = trianguloX.medidas();
    double AreaY = trianguloY.medidas();

    System.out.printf("Triangle X area: %.4f%n", AreaX);
    System.out.printf("Triangle Y area: %.4f%n", AreaY);
    if (AreaX > AreaY) {
        System.out.println("Larger Area: X");
    } else {
        System.out.println("Larger Area: Y");
    }



    scan.close();


    }
}

