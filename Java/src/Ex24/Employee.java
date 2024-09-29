package Ex24;

public class Employee {
    private String Name;
    private double GrossSalary;
    private double tax;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public double getGrossSalary() {
        return GrossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        GrossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double netSalary() {
        return getGrossSalary() - getTax();
    }

    public void increaseSalary(double percentage) {
        percentage = getGrossSalary() * percentage / 100;

    }




}
