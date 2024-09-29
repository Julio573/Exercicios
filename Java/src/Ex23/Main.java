package Ex23;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle calculo = new Rectangle();

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        double width = scan.nextDouble();
        calculo.setWidth(width);
        double height = scan.nextDouble();
        calculo.setHeight(height);

        System.out.printf("Area = %.2f%n", calculo.area());
        System.out.printf("Perimeter = %.2f%n", calculo.perimeter());
        System.out.printf("Diagonal = %.2f%n", calculo.diagonal());

        scan.close();
    }
}
