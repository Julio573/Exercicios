import java.util.Locale;
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scan.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = scan.nextDouble();
        }

        double soma = 0.0;
        double media = 0.0;
        System.out.print("Valores = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
            soma += vect[i];
            media = soma / n;
        }

        System.out.println();
        System.out.printf("Soma = %.1f%n", soma);
        System.out.printf("Media = %.1f%n", media);

        scan.close();
    }
}
