public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int counter = 0;
    public int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public String toString() {
        return "Ф.И.О: "+getFullName() + " отдел №: " + getDepartment() + " зарплата: " + getSalary();
    }


}
