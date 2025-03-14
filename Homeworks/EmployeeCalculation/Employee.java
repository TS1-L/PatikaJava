public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
    
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }
    
    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }
    
    public double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - this.hireYear;

        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }
    
    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = this.salary - tax + bonus;
        double totalSalary = salaryWithTaxAndBonus + raise;

        return "Name: " + this.name + "\n" +
                "Salary: " + this.salary + "\n" +
                "Work Hours: " + this.workHours + "\n" +
                "Hire Year: " + this.hireYear + "\n" +
                "Tax: " + tax + "\n" +
                "Bonus: " + bonus + "\n" +
                "Salary Raise: " + raise + "\n" +
                "Salary with Tax and Bonus: " + salaryWithTaxAndBonus + "\n" +
                "Total Salary: " + totalSalary;
    }
}
