import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        int numero;

        Scanner scan = new Scanner(System.in);

        numero = scan.nextInt();

        for (int i = 0; i < numero; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x % 2 == 0 && y % 2 == 0) {
                double resultado = (double) x / y;
                System.out.println(resultado);

            }
        }

        scan.close();
    }
}
