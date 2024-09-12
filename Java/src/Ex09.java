import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        int A, B;

        Scanner scan = new Scanner(System.in);

        A = scan.nextInt();
        B = scan.nextInt();

        if (A % 2 == 0 && B % 2 == 0) {
            System.out.println(A + " e " + B + " São múltiplos");
        } else {
            System.out.println(A + " e " + B + " Não são múltiplos");
        }

        scan.close();
    }
}
