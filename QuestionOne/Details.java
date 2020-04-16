package QuestionOne;

public class Details {
    private String employeeIdNumber;
    private String firstame;
    private String surname;
    private double salary;

    public void setEmployeeIdNumber(String newId) {
        this.employeeIdNumber = newId;
    }

    public String getEmployeeIdNumber() {
        return this.employeeIdNumber;
    }

    public void setFirstName(String newName) {
        this.firstame = newName;
    }

    public String getFirstName() {
        return this.firstame;
    }

    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void getUpdatedSalary() {
        String format = "%-30s%s%n";
        System.out.println("EMPLOYEE DETAILS REPORT");
        System.out.println("******************************");
        System.out.printf(format, "EMPLOYEE NUMBER:", this.employeeIdNumber);
        System.out.printf(format, "EMPLOYEE FIRST NAME:", this.firstame);
        System.out.printf(format, "EMPLOYEE SURNAME", this.surname);
        System.out.printf(format, "ORIGINAL SALARY:", "R" + String.format("%,.2f",this.salary));

        double NewSalary = ((Increase.valueOf("percentage").value + 100) / 100) * this.salary;
        System.out.printf(format, "INCREASED SALARY:", "R" + String.format("%,.2f",NewSalary));

        double increase = (Increase.valueOf("percentage").value / 100) * this.salary;
        System.out.printf(format, "INCREASE AMOUNT", "R" + String.format("%,.2f",increase));
    }

    public void getIncreaseSalaryWithDeductions() {

    }
}