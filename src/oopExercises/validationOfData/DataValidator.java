package oopExercises.validationOfData;

public class DataValidator {
    public static boolean checkAName(String name) {
        return name.length() >= 3;
    }

    public static String checkANameReport(boolean isANameValid) {
        if(!isANameValid) throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        else return "";
    }

    public static boolean checkASurname(String surname) {
        return surname.length() >= 3;
    }

    public static String checkASurnameReport(boolean isASurnameValid) {
        if(!isASurnameValid) throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        else return "";
    }

    public static boolean checkAge(int age) {
        return age > 0;
    }

    public static String checkAgeReport(boolean isAgeValid) {
        if(!isAgeValid) throw new IllegalArgumentException("Age cannot be zero or negative integer");
        else return "";
    }

    public static boolean checkASalary(double salary) {
        return salary >= 460.0;
    }

    public static String checkASalaryReport(boolean isASalaryValid) {
        if(!isASalaryValid) throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        else return "";
    }
}
