import java.util.Locale;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        double valor1, valor2;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        valor1 = scan.nextDouble();
        valor2 = scan.nextDouble();

        if (valor1 > 0 && valor2 > 0) {
            System.out.println("Q1");
        } else if (valor1 < 0 && valor2 > 0) {
            System.out.println("Q2");
        } else if (valor1 < 0 && valor2 < 0) {
            System.out.println("Q3");
        } else if (valor1 > 0 && valor2 < 0) {
            System.out.println("Q4");
        } else {
            System.out.println("Origem");
        }

        scan.close();
    }
}
