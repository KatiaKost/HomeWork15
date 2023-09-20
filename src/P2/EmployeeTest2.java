package P2;

import P1.Employee;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов");
        employee1.displaySurname();
        System.out.println(employee1.surname);

        Employee employee2 = new Employee(45);// Конструктор доступен только внутри пакета Р1.
        employee2.displayId();
        System.out.println(employee2.id);// Объект доступен только внутри пакета Р1.

        Employee employee3 = new Employee(456.6);
        // Не доступен конструктор, так как private(может использоваться только в своём классе)
        employee3.displaySalary();
        System.out.println(employee3.salary);
        // Не доступен объект, так как private(может использоваться только в своём классе)
    }
}
