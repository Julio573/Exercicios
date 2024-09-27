import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        int senha;

        Scanner scan = new Scanner(System.in);

        senha = scan.nextInt();
        while (senha != 2002) {
            System.out.println("Senha inválida");
            senha = scan.nextInt();
        }

        System.out.println("Acesso permitido");

        scan.close();
    }
}
