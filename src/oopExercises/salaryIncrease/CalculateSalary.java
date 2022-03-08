package oopExercises.salaryIncrease;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CalculateSalary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        ArrayList<Salary> employees = new ArrayList<>();

        for (int a = 0; a < count; a++) {
            String[] data = reader.readLine().split("\\s+");
            employees.add(new Salary(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
        }

        Salary.setIncreaseSalary(Integer.parseInt(reader.readLine()));

        for(Salary s : employees) s.increase();

        employees.forEach(employee -> System.out.println(employee));

        reader.close();
    }
}



//Test

//6
//Alexander Ivanov 56 2200
//Teodor Dimitrov 60 3333
//Emilia Petrova 22 1800
//Vladimir Harizanoov 28 600
//Stephan Todorov 39 666.66
//Leonid Draganov 36 559.4
//20

//Alexander Ivanov get 2640,0 leva
//Teodor Dimitrov get 3999,6 leva
//Emilia Petrova get 1980,0 leva
//Vladimir Harizanoov get 660,0 leva
//Stephan Todorov get 799,992 leva
//Leonid Draganov get 671,28 leva
