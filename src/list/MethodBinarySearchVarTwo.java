package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MethodBinarySearchVarTwo {
    public static void main(String[] args) {
        ArrayList<Technician> technicians = new ArrayList<>(Arrays.asList(
                new Technician(42, "Peter Michailov", 1500.0),
                new Technician(1, "Alexander Dimitrov", 1500.0),
                new Technician(65, "Georgy Ivanov", 1200.0),
                new Technician(3, "Konstantin Ivanov", 1450.0),
                new Technician(71, "Valentin Stoilov", 1350.0),
                new Technician(5, "Martin Todotrov", 1500.0),
                new Technician(83, "Ivan Radostinov", 1450.0),
                new Technician(4, "Boris Harizanov", 1400.0),
                new Technician(22, "Nicola Petrov", 1200.0),
                new Technician(11, "Teodor Zahariev", 1575.0)));

        Collections.sort(technicians, new Comparator<Technician>() {
            @Override
            public int compare(Technician t1, Technician t2) {
                return t1.compareTo(t2);
            }
        });

        int index = Collections.binarySearch(technicians, new Technician(4, "Boris Harizanov", 1400.0));

        if(index >= 0) {
            System.out.printf("ID[%d] %s get %.2f%n", technicians.get(index).getId(), technicians.get(index).getName(), technicians.get(index).getSalary());
        }
        else {
            System.out.println("There isn't such technician.");
        }
    }
}

class Technician implements Comparable<Technician> {
    private int id;
    private String name;
    private double salary;

    public Technician(int id) {
        this.id = id;
    }

    public Technician(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Technician tech) {
        if(this.id < tech.id) {
            return -1;
        }
        else if(this.id > tech.id) {
            return 1;
        }
        else {
            return this.name.compareTo(tech.name);
        }
    }
}