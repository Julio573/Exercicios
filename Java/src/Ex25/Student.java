package Ex25;

import java.util.Locale;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

    Grade result = new Grade();
        Locale.setDefault(Locale.US);
    Scanner scan = new Scanner(System.in);

        System.out.print("Student, please enter your name: ");
        String studentName = scan.nextLine();
        result.setName(studentName);

        System.out.println(result.getName() + ", please enter your three grades: ");
        double firstGrade = scan.nextDouble();
        result.setGradeA(firstGrade);
        double secondGrade = scan.nextDouble();
        result.setGradeB(secondGrade);
        double thirdGrade = scan.nextDouble();
        result.setGradeC(thirdGrade);

        result.finalGrade();

    scan.close();

    }
}
