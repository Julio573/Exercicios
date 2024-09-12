import java.util.Scanner;
import java.util.Locale;

public class Ex06 {
    public static void main(String[] args) {

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        triangulo = A * C / 2;
        circulo = 3.14159 * Math.pow(C, 2);
        trapezio = (A + B) * C / 2;
        quadrado = Math.pow(B, 2);
        retangulo = A * B;

        System.out.printf("Triângulo: %.3f%n", triangulo);
        System.out.printf("Círculo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n", retangulo);

        scan.close();
    }
}
