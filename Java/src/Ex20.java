import java.util.Locale;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        int numero;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        numero = scan.nextInt();

        double mediaPonderada = 0.0;
        for (int i = 0; i < numero; i++) {

            double A = scan.nextDouble();
            double B = scan.nextDouble();
            double C = scan.nextDouble();
            mediaPonderada = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);

            System.out.printf("%.1f%n", mediaPonderada);
        }

        scan.close();
    }
}
