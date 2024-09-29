package Ex25;

public class Grade {
    private String name;
    private double gradeA;
    private double gradeB;
    private double gradeC;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGradeA() {
        return gradeA;
    }

    public void setGradeA(double gradeA) {
        this.gradeA = gradeA;
    }

    public double getGradeB() {
        return gradeB;
    }

    public void setGradeB(double gradeB) {
        this.gradeB = gradeB;
    }

    public double getGradeC() {
        return gradeC;
    }

    public void setGradeC(double gradeC) {
        this.gradeC = gradeC;
    }

    public void finalGrade() {
        double finalGrade = getGradeA() + getGradeB() + getGradeC();
        if (finalGrade > 60) {
            System.out.printf("Final grade = %.2f%n", finalGrade);
            System.out.println("Pass");
        } else if (finalGrade < 60) {
            System.out.printf("Final grade = %.2f%n", finalGrade);
            System.out.println("Failed");
            finalGrade -= 60;
            System.out.printf("Missing %.2f points", finalGrade);
        }

    }
}
