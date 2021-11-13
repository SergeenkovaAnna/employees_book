package ru.skypro;

public class Employee {
    private static int id;
    private final String fullName;
    private float salary;
    private int department;

    private static int counter;

    public Employee(String fullName, float salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        this.id = ++counter;
    }


    public String getFullName() {
        return fullName;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName +
                ", зарплата: " + salary +
                ", отдел: " + department;
    }
}
