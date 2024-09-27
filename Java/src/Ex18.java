import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

        int x;

        Scanner scan = new Scanner(System.in);

        x = scan.nextInt();

        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scan.close();
    }
}
