import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        int codigo, alcool, gasolina, diesel;

        Scanner scan = new Scanner(System.in);

        codigo = scan.nextInt();
        alcool = 0;
        gasolina = 0;
        diesel = 0;

        while (codigo != 4) {
            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
            codigo = scan.nextInt();
        }

        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);



        scan.close();

    }
}
