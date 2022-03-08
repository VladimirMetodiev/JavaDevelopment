package io.serialization.company;

import java.io.Serializable;

public class Salary implements Serializable {
    private Employee employee;
    private double salary = 0.0;

    public Salary(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("[%d][%s] %s %s = %.2f", employee.getId(), employee.getPosition(), employee.getName(), employee.getSurname(), salary);
    }
}
