package generics.company;

import generics.company.staff.Employee;

import java.util.ArrayList;
import java.util.List;

public class Department<T extends Employee> {
    private String department;
    private int countOfEmployees;
    private List<T> employees = new ArrayList<>();

    public Department(String department, int countOfEmployees) {
        this.department = department;
        this.countOfEmployees = countOfEmployees;
    }

    public boolean addEmployee(T employee){
        return employees.add(employee);
    }

    public List<T> getEmployees(){
        return employees;
    }

    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    public void setCountOfEmployees(int countOfEmployees) {
        this.countOfEmployees = countOfEmployees;
    }

    public String toString(){
        return String.format("Department %s: %s employee(s).", department, countOfEmployees);
    }
}
