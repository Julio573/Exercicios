package Ex26;

import java.util.Locale;
import java.util.Scanner;


public class Holder {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your account number: ");
        String number = scan.nextLine();
        System.out.print("Enter account holder: ");
        String holder = scan.nextLine();
        System.out.print("Is there a initial deposit? ");
        char initial = scan.nextLine().charAt(0);

        double value = 0.0;
        Account withDeposit = null;
        if (initial == 'y') {
            System.out.print("Enter initial deposit value: ");
            value = scan.nextDouble();
            withDeposit = new Account(number, holder, value);
        } else if (initial == 'n') {
            Account noDeposit = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.printf("Account %s, Holder: %s, Balance: $%.2f%n", number, holder, value);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double moneyDeposit = scan.nextDouble();

        System.out.println("Updated account data:");
        System.out.printf("Account %s, Holder: %s, Balance: $%.2f%n", number, holder, withDeposit.deposit(moneyDeposit));

        System.out.println();
        System.out.print("Enter a withdrawl value: ");
        double moneyWithdrawl = scan.nextDouble();

        System.out.println("Updated account data");
        System.out.printf("Account %s, Holder: %s, Balance: $%.2f%n", number, holder, withDeposit.withdrawl(moneyWithdrawl));

        scan.close();

    }
}
