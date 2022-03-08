package oopExercises.validationOfData;

import java.util.ArrayList;
import java.util.Scanner;

public class StartDataValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] data;
        ArrayList<Employee> employees = new ArrayList<>();
        int number = Integer.parseInt(input.nextLine());

        for (int a = 0; a < number; a++) {
            data = input.nextLine().split("\\s+");
            boolean isANameValid = false, isASurnameValid = false, isAgeValid = false, isASalaryValid = false;

            try {
                isANameValid = DataValidator.checkAName(data[0]);
                DataValidator.checkANameReport(isANameValid);
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            try {
                isASurnameValid = DataValidator.checkASurname(data[1]);
                DataValidator.checkASurnameReport(isASurnameValid);
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            try {
                isAgeValid = DataValidator.checkAge(Integer.parseInt(data[2]));
                DataValidator.checkAgeReport(isAgeValid);
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            try {
                isASalaryValid = DataValidator.checkASalary(Double.parseDouble(data[3]));
                DataValidator.checkASalaryReport(isASalaryValid);
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            if(isANameValid && isASurnameValid && isAgeValid && isASalaryValid) employees.add(new Employee(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
        }

        System.out.println("--------------------");
        for(Employee employee : employees) System.out.println(employee);
    }
}



//Test

//Input
//5
//Alex Pavlov -8 1200
//V Harizanov 37 3737.37
//Valentin Ivanov 27 600
//Peter D 39 800.5
//Dragomir Georgiev 18 250

//Output
//Age cannot be zero or negative integer
//First name cannot be less than 3 symbols
//Last name cannot be less than 3 symbols
//Salary cannot be less than 460 leva
//--------------------
//Valentin Ivanov get 600,0 leva
