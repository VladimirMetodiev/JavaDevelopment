package io.serialization.company;

import java.io.Serializable;

public class SalesRepresentative implements Serializable {
    Employee employee;
    private double sale = 0.0;

    // За да мога да сериализирам един обект, то той трябва да имплементира интерфейс Serializable

    public SalesRepresentative(Employee employee) {
        this.employee = employee;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s = %.2f", employee.getId(), employee.getName(), employee.getSurname(), sale);
    }
}
