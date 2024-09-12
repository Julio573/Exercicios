import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        int horaInicial, horaFinal, duracao;

        Scanner scan = new Scanner(System.in);

        horaInicial = scan.nextInt();
        horaFinal = scan.nextInt();

         if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");

        scan.close();
    }
}
