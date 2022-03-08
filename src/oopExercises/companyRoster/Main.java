package oopExercises.companyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        ArrayList<AnEmployee> staff = new ArrayList<>();

        for (int a = 0; a < number; a++) {
            String[] data = input.nextLine().split("\\s+");

            int length = data.length;

            switch (length) {
                case 4: staff.add(new AnEmployee(data[0], Double.parseDouble(data[1]), data[2], data[3])); break;
                case 5: {
                    try {
                        staff.add(new AnEmployee(data[0], Double.parseDouble(data[1]), data[2], data[3], data[4]));
                    }
                    catch (Exception ex) {
                        staff.add(new AnEmployee(data[0], Double.parseDouble(data[1]), data[2], data[3], Integer.parseInt(data[4])));
                    }
                    break;
                }
                case 6: staff.add(new AnEmployee(data[0], Double.parseDouble(data[1]), data[2], data[3], data[4], Integer.parseInt(data[5]))); break;
                default: break;
            }
        }

        TreeSet<String> current = new TreeSet<>();
        ArrayList<String> departments = new ArrayList<>();
        //ArrayList<Double> averageSalary = new ArrayList<>();


        for(int b = 0; b < staff.size(); b++) {
            current.add(staff.get(b).getDepartment());
        }

        Iterator<String> iterator = current.iterator();

        while(iterator.hasNext()){
            departments.add(iterator.next());
        }

        double[] averageSalary = new double[departments.size()];

        for (int c = 0; c < departments.size(); c++) {
            for (int d = 0; d < staff.size(); d++) {
                if(departments.get(c).equals(staff.get(d).getDepartment())){
                    if(averageSalary[c] == 0) averageSalary[c] = staff.get(d).getSalary();
                    else averageSalary[c] = (averageSalary[c] + staff.get(d).getSalary()) / 2.0;
                }
            }
        }

        String dep = "";
        double max = 0.0;

        for (int e = 0; e < averageSalary.length; e++) {
            if(averageSalary[e] > max) {
                max = averageSalary[e];
                dep = departments.get(e);
            }
        }

        ArrayList<AnEmployee> depStaff = new ArrayList<>();

        for(int e = 0; e < staff.size(); e++) {
            if(staff.get(e).getDepartment().equals(dep)) {
                depStaff.add(staff.get(e));
            }
        }

        Collections.sort(depStaff, (x, y) ->  y.getSalary() - x.getSalary() == 0 ? 0 : (y.getSalary() - x.getSalary() < 0 ? -1 : 1));

        System.out.println("Highest Average Salary: " + dep);
        depStaff.forEach(el -> System.out.printf("%s %.2f %s %d%n", el.getName(), el.getSalary(), el.getEmail(), el.getAge()));
    }
}



//Condition

//Create a Person class.
//Define a class Employee that holds the following information: name, salary, position, department, email and age. The name, salary,
//position and department are mandatory while the rest are optional. Your task is to write a program which takes N lines of employees
//from the console and calculates the department with the highest average salary and prints for each employee in that department his name,
//salary, email and age – sorted by salary in descending order. If an employee does not have an email – in place of that field you should
//print “n/a” instead, if he does not have an age – print “-1” instead. The salary should be printed to two decimal places after the separator.



//Tests

//4
//Pesho 120.00 Dev Development pesho@abv.bg 28
//Toncho 333.33 Manager Marketing 33
//Ivan 840.20 ProjectLeader Development ivan@ivan.com
//Gosho 0.20 Freeloader Nowhere 18

//6
//Stanimir 496.37 Temp Coding stancho@yahoo.com
//Yovcho 610.13 Manager Sales
//Toshko 609.99 Manager Sales toshko@abv.bg 44
//Venci 0.02 Director BeerDrinking beer@beer.br 23
//Andrei 700.00 Director Coding
//Popeye 13.3333 Sailor SpinachGroup popeye@pop.ey

