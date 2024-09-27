import java.util.Scanner;
import java.util.Locale;

public class Ex13 {
    public static void main(String[] args) {

        double salario, impostoRenda;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        salario = scan.nextDouble();
        impostoRenda = 0.0;

         if (salario >= 2000.01 && salario <= 3000.00) {
            impostoRenda = (salario - 2000) * 8 / 100;
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            impostoRenda = ((salario - 2000) * 8 / 100) + 0.18;
        } else if (salario > 4500.00) {
            impostoRenda = (((salario - 2000) * 8 / 100) + 18 / 100) + 0.28;
        }

         //corrigir depois
        System.out.printf("Imposto de renda: RS%.2f%n", impostoRenda);

        scan.close();
    }
}
