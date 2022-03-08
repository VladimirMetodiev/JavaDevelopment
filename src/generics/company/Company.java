package generics.company;

import generics.company.staff.Employee;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public<T extends Employee> void addDepartment(Department<T> department){
        departments.add(department);
        List<T> employeeList = department.getEmployees();
        this.employees.addAll(employeeList);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void print(List<?> list){
        System.out.println(list);
    }

    @Override
    public String toString() {
        return "Company{" +
                "departments=" + departments +
                ", employees=" + employees +
                '}';
    }
}
