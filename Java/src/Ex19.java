import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {

        int numero, in, out;

        Scanner scan = new Scanner(System.in);

        numero = scan.nextInt();
        in = 0;
        out = 0;

        for (int i = 0; i < numero; i++) {
            int x = scan.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        scan.close();
    }
}
