import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        int codigoItem, quantidade;
        double total;

        Scanner scan = new Scanner(System.in);

        codigoItem = scan.nextInt();
        quantidade = scan.nextInt();

        total = 0.0;
        switch (codigoItem) {
            case 1:
                total = quantidade * 4.00;
            break;
            case 2:
                total = quantidade * 4.50;
            break;
            case 3:
                total = quantidade * 5.00;
            break;
            case 4:
                total = quantidade * 2.00;
            break;
            case 5:
                total = quantidade * 1.50;
            break;

        }

        System.out.printf("Total: R$%.2f%n", total);

        scan.close();
    }
}
