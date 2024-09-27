import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        double X, Y;

        Scanner scan = new Scanner(System.in);

        X = scan.nextDouble();
        Y = scan.nextDouble();

        while (X != 0 || Y != 0) {
            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("Segundo");
            } else if (X < 0 && Y < 0) {
                System.out.println("Terceiro");
            } else if (X > 0 && Y < 0) {
                System.out.println("Quarto");
            }
            X = scan.nextDouble();
            Y = scan.nextDouble();
        }


        scan.close();
    }
}
