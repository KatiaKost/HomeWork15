package P1;

public class Employee {
    int id;
    public String surname;
    private double salary;

    public void displayId() {
        System.out.println("Id: " + id);
    }

    public void displaySurname() {
        System.out.println("Surname: " + surname);
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }

    public Employee(String surname) {
        this.surname = surname;

    }

    Employee(int id) {
        this.id = id;
    }

    private Employee(double salary) {
        this.salary = salary;
    }
}
