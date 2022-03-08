package generics.company;

import generics.company.staff.*;

public class StartCompany {
    public static void main(String[] args) {
        Company company = new Company();

        Department<Accountant> accounting = new Department<>("Accounting", 1);
        Department<Trader> sales = new Department<>("Sales", 3);
        Department<IT> it = new Department<>("IT", 1);
        Department<Driver> logistics = new Department<>("Logistics", 2);
        Department<Warehouseman> warehouse = new Department<>("Warehouse", 1);

        Accountant accountant = new Accountant("Anna", "Dimitrova", 2000.0);
        Trader manager = new Trader("Vladimir", "Metodiev", 3000.0);
        Trader trader1 = new Trader("Dimitar", "Teodorov", 1800.0);
        Trader trader2 = new Trader("Silvia", "Ivanova", 1800.0);
        IT administrator = new IT("Stoian", "Petrov", 2000.0);
        Driver vanDriver1 = new Driver("Mario", "Barzoletov", 1000.0);
        Driver vanDriver2 = new Driver("Kalin", "Malinov", 1000.0);
        Warehouseman warehouseman = new Warehouseman("Teodor", "Draganov", 1000.0);

        accounting.addEmployee(accountant);
        sales.addEmployee(manager);
        sales.addEmployee(trader1);
        sales.addEmployee(trader2);
        it.addEmployee(administrator);
        logistics.addEmployee(vanDriver1);
        logistics.addEmployee(vanDriver2);
        warehouse.addEmployee(warehouseman);

        company.addDepartment(accounting);
        company.addDepartment(sales);
        company.addDepartment(it);
        company.addDepartment(logistics);
        company.addDepartment(warehouse);

        company.print(company.getDepartments());
        company.print(company.getEmployees());
    }
}
