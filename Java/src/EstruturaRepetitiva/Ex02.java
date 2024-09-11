package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        double raio, area;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        raio = scan.nextDouble();
        area = 3.14159 * Math.pow(raio, 2);
        System.out.printf("A= %.4f", area);

        scan.close();
    }
}
