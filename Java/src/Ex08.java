import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int numero;

        Scanner scan = new Scanner(System.in);

        numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }

        scan.close();
    }
}
