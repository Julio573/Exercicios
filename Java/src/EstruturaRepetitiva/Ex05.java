package EstruturaRepetitiva;

import java.util.Scanner;
import java.util.Locale;

public class Ex05 {
    public static void main(String[] args) {

        int codigoPeça1, codigoPeça2, quantidade1, quantidade2;
        double valorPeça1, valorPeça2, valorTotal;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        codigoPeça1 = scan.nextInt();
        quantidade1 = scan.nextInt();
        valorPeça1 = scan.nextDouble();

        codigoPeça2 = scan.nextInt();
        quantidade2 = scan.nextInt();
        valorPeça2 = scan.nextDouble();

        valorTotal = (quantidade1 * valorPeça1) + (quantidade2 * valorPeça2);

        System.out.printf("Valor a pagar: R$%.2f%n", valorTotal);



        scan.close();
    }
}
