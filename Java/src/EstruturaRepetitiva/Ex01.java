package EstruturaRepetitiva;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        int valor1, valor2, resultado;

        Scanner scan = new Scanner(System.in);

        valor1 = scan.nextInt();
        valor2 = scan.nextInt();
        resultado = valor1 + valor2;

        System.out.println("SOMA = " + resultado);

        scan.close();
    }
}