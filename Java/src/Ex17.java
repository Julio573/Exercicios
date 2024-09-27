import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

        int numero, resultado;

        Scanner scan = new Scanner(System.in);

        numero = scan.nextInt();
        resultado = 0;

        for (int i = 0; i < numero; i++) {
           int x = scan.nextInt();
            resultado += x;
        }

        System.out.println(resultado);
        scan.close();
    }
}
