package P1;

public class EmployeeTest1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов");
        employee1.displaySurname();
        System.out.println(employee1.surname);

        Employee employee2 = new Employee(45);
        employee2.displayId();
        System.out.println(employee2.id);

        Employee employee3 = new Employee(456.6);
        // Не доступен конструктор и параметр, так как private(может использоваться только в своём классе)
        employee3.displaySalary();
        System.out.println(employee3.salary);
        // Не доступен конструктор и параметр, так как private(может использоваться только в своём классе)
    }
}


