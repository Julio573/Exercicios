package Ex24;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee person = new Employee();

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Name: ");
        String Name = scan.nextLine();
        person.setName(Name);
        System.out.print("Gross Salary: ");
        double grossSalary = scan.nextDouble();
        person.setGrossSalary(grossSalary);
        System.out.print("Tax: ");
        double Tax = scan.nextDouble();
        person.setTax(Tax);

        System.out.println();
        System.out.printf("Employee: %s, $%.2f%n", person.getName(), person.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percent = scan.nextDouble();
        person.increaseSalary(percent);

        System.out.println("Updated data: " + person.getName());


        scan.close();
    }
}
