import java.util.Locale;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        double valor;

        Scanner scan = new Scanner(System.in);

        valor = scan.nextDouble();

        if (valor > 0.25 || valor < 25.50) {
            System.out.println("Intervalo (0,25)");
        } else if (valor < 25.50 || valor < 50.75 ) {
            System.out.println("Intervalo (0,25)");
        } else if (valor > 50.75 || valor > 75.100) {
            System.out.println("Intervalo (75,100)");
        } else {
            System.out.println("Fora do intervalo");
        }

        scan.close();
    }
}
