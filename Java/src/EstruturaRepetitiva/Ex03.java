package EstruturaRepetitiva;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        int A, B, C, D, diferença;

        Scanner scan = new Scanner(System.in);

        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        diferença = (A * B) - (C * D);

        System.out.println("Diferença = " + diferença);

        scan.close();
    }
}
