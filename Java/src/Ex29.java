import java.util.Locale;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scan.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        double soma = 0.0;
        double alturaMedia = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a " + " pessoa: ");
            System.out.print("Nome: ");
            nome[i] = scan.nextLine();
            scan.nextLine();
            System.out.print("Idade: ");
            idade[i] = scan.nextInt();
            System.out.print("Altura: ");
            altura[i] = scan.nextDouble();
            soma += altura[i];
            alturaMedia = soma / n;
        }

        System.out.println();
        System.out.printf("Altura média: %.2f%n", alturaMedia);

        double menorIdade = 0;
        String pessoas = null;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                pessoas = nome[i];
            }
        }
        menorIdade = (double) (soma * n / 100) * 100;

        System.out.printf("Pessoas com menos de 16 anos %.1f%%", menorIdade);
        System.out.println(pessoas);

        scan.close();
    }
}
