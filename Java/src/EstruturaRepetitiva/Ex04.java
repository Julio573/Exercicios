package EstruturaRepetitiva;

import java.util.Scanner;
import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) {

        int numeroFuncionario;
        double horasTrabalhadas, valorHora, salario;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        numeroFuncionario = scan.nextInt();
        horasTrabalhadas = scan.nextDouble();
        valorHora = scan.nextDouble();

        salario = valorHora * horasTrabalhadas;

        System.out.println("Número de funcionário: " + numeroFuncionario);
        System.out.printf("Salário = U$%.2f%n", salario);

        scan.close();
    }
}
