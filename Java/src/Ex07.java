import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        int numero;

        Scanner scan = new Scanner(System.in);

        numero = scan.nextInt();

        if (numero >= 0) {
            System.out.println(numero + " é um número positivo.");
        } else {
            System.out.println(numero + " é um número negativo.");
        }

        scan.close();

    }
}
