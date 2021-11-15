package ru.skypro;

import java.util.Arrays;

public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        addEmployee(new Employee("Иванов Иван Иванович", 60_000f, 1));
        addEmployee(new Employee("Попов Игорь Антонович", 58_362f, 1));
        addEmployee(new Employee("Звягинцев Макар Игнатьевич", 100_000f, 5));
        addEmployee(new Employee("Мурова Ксения Алексеевна", 70_090f, 4));
        addEmployee(new Employee("Булат Марина Грачиковна", 67_580f, 3));
        addEmployee(new Employee("Ризванов Мурат Владеленович", 86_758f, 4));
        addEmployee(new Employee("Бабнищев Людвиг Иванович", 79_064.50f, 2));
        addEmployee(new Employee("Кирина Людмила Леопольдовна", 53_120f, 2));
        addEmployee(new Employee("Белов Юрий Антонович", 64_731f, 4));
        addEmployee(new Employee("Яковлев Николай Павлович", 61_000f, 5));

        System.out.println(Arrays.toString(employees));
        System.out.println("Общая сумма затрат на зарплаты: " + calculateSum());
        System.out.println("Средний размер зарплаты: " + calculateAverageSum());
        minSalary();
        maxSalary();
        printFullName();
    }

    private static Employee maxSalary() {
        float max = 0;
        Employee employeeMaxSalaryCard = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                employeeMaxSalaryCard = employees[i];
            }
        }
        System.out.println("Максимальное значение зарплаты: " + max + "; Карточка сотрудника: " + employeeMaxSalaryCard);
        return employeeMaxSalaryCard;
    }

    private static Employee minSalary() {
        float min = employees[0].getSalary();
        Employee employeeMinSalaryCard = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeMinSalaryCard = employees[i];
            }
        }
        System.out.println("Минимальное значение зарплаты: " + min + "; Карточка сотрудника: " + employeeMinSalaryCard);
        return employeeMinSalaryCard;
    }

    private static float calculateSum() {
        float sum = 0.0f;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static float calculateAverageSum() {
        float averageSum = calculateSum() / employees.length;
        return averageSum;
    }

    private static String printFullName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
        return null;
    }

    private static boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

}
