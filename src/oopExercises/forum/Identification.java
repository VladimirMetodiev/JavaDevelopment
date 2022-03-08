package oopExercises.forum;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Identification implements SingUp, LogIn {
    private static String dataBase = "src\\oopExercises\\forum\\Users.txt";

    public static String getDataBase() {
        return dataBase;
    }

    public static void setDataBase(String newDataBase) {
        dataBase = newDataBase;
    }

    @Override
    public boolean singUp() throws IOException {
        Scanner input = new Scanner(System.in);
        String data;

        System.out.println("Welcome to the registration form. If you enter \"END\" the registration will be canceled.");

        Status status = Status.USER;

        System.out.println("Enter your name:");
        data = input.nextLine();
        if(data.equalsIgnoreCase("END")) System.exit(0);
        String name = "";

        String regex = "^[A-Z][a-z]{1,34}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        if(matcher.matches()) name = data;

        while(name.isEmpty()) {
            if(data.length() > 35) System.out.println("The name must be less than 36 characters.");
            if(data.length() < 2) System.out.println("The name must be greater than 1 character.");
            System.out.println("Enter your name:");
            data = input.nextLine();
            if(data.equalsIgnoreCase("END")) System.exit(0);
            matcher = pattern.matcher(data);
            if(matcher.matches()) name = data;
        }


        System.out.println("Enter your surname:");
        data = input.nextLine();
        if(data.equalsIgnoreCase("END")) System.exit(0);
        String surname = "";

        matcher = pattern.matcher(data);
        if(matcher.matches()) surname = data;

        while(surname.isEmpty()) {
            if(data.length() > 35) System.out.println("The surname must be less than 36 characters.");
            if(data.length() < 2) System.out.println("The surname must be greater than 1 character.");
            System.out.println("Enter your surname:");
            data = input.nextLine();
            if(data.equalsIgnoreCase("END")) System.exit(0);
            matcher = pattern.matcher(data);
            if(matcher.matches()) surname = data;
        }


        System.out.println("Enter \"M\" or \"F\" for your sex:");
        data = input.nextLine();
        if(data.equalsIgnoreCase("END")) System.exit(0);
        Sex sex = Sex.UNDEFINED;
        if(data.toUpperCase().charAt(0) == 'M') sex = Sex.MALE;
        if(data.toUpperCase().charAt(0) == 'F') sex = Sex.FEMALE;

        while(!sex.equals(Sex.MALE) && !sex.equals(Sex.FEMALE)) {
            System.out.println("Enter \"M\" or \"F\" for your sex:");
            data = input.nextLine();
            if(data.equalsIgnoreCase("END")) System.exit(0);
            if(data.toUpperCase().charAt(0) == 'M') sex  = Sex.MALE;
            if(data.toUpperCase().charAt(0) == 'F') sex  = Sex.FEMALE;
        }


        System.out.println("Enter your age:");
        data = input.nextLine();
        if(data.equalsIgnoreCase("END")) System.exit(0);
        int age = 0;
        try {
            age = Integer.parseInt(data);
        } catch (NumberFormatException ex) {
            System.err.println("Please, enter a positive integer for your age.");
        }

        while(age == 0) {
            data = input.nextLine();
            if(data.equalsIgnoreCase("END")) System.exit(0);
            try {
                age = Integer.parseInt(data);
            } catch (NumberFormatException ex) {
                System.err.println("Please, enter a positive integer for your age.");
            }
        }


        String email = getEmail();
        String password = getPassword();


        User newUser = new User(name, surname, sex, age, email, password, status);

        if(search(newUser)) {
            addUser(newUser);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int logIn(List<User> users) {
        String email = getEmail();
        String password = getPassword();

        int index = find(users, email, password);

        try {
            if(users.get(index).getStatus().equals(Status.BANNED)) {
                System.out.println("Access denied. The user is blocked.");
                return -1;
            }
        } catch (ArrayIndexOutOfBoundsException ignored) {
        }

        return index;
    }

    private String getEmail() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");
        String data = input.nextLine();
        if(data.equalsIgnoreCase("END")) System.exit(0);
        String email = "";

        String regex = "^[a-zA-Z0-9_.-]+@[a-z.]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        if(matcher.matches()) email = data;
        else System.out.println("Invalid email.");

        while(email.isEmpty()) {
            System.out.println("Enter your email:");
            data = input.nextLine();
            if(data.equalsIgnoreCase("END")) System.exit(0);
            matcher = pattern.matcher(data);
            if(matcher.matches()) email = data;
            else System.out.println("Invalid email.");
        }

        return email;
    }

    private String getPassword() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password:");
        String data = input.nextLine();
        if(data.equalsIgnoreCase("END")) System.exit(0);
        String password = "";

        String regex = "^[A-Za-z1-9!@#$%&*_\\-+\\/]{6,35}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        if(matcher.matches()) password = data;
        else System.out.println("Invalid password.");

        while(password.isEmpty()) {
            System.out.println("Enter your password:");
            data = input.nextLine();
            if(data.equalsIgnoreCase("END")) System.exit(0);
            matcher = pattern.matcher(data);
            if(matcher.matches()) password = data;
            else System.out.println("Invalid password.");
        }

        return password;
    }

    private boolean search(User user) throws IOException {
        int symbol, number;
        String expression;

        BufferedReader reader = new BufferedReader(new FileReader(dataBase));

        while((symbol = reader.read()) != -1) {
            if(symbol == '#') {
                expression = reader.readLine();

                if(expression.equals(user.getName())) {
                    expression = reader.readLine();

                    if(expression.equals(user.getSurname())) {
                        reader.readLine();
                        number = Integer.parseInt(reader.readLine());

                        if(number == user.getAge()) {
                            expression = reader.readLine();

                            if(expression.equals(user.getEmail())) {
                                System.out.println("There is such user.");
                                reader.close();
                                return false;
                            }
                        }
                    }
                }
            }
        }

        reader.close();
        return true;
    }

    private int find(List<User> users, String email, String password) {
        for (int a = 0; a < users.size(); a++) {
            if(users.get(a).getEmail().equals(email) && users.get(a).getPassword().equals(password)) {
                return a;
            }
        }

        return -1;
    }

    private void addUser(User user) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(dataBase, true));

        writer.write("#");
        writer.newLine();
        writer.write(user.getName());
        writer.newLine();
        writer.write(user.getSurname());
        writer.newLine();
        if(user.getSex().equals(Sex.MALE)) writer.write("M");
        else writer.write("F");
        writer.newLine();
        writer.write("" + user.getAge());
        writer.newLine();
        writer.write(user.getEmail());
        writer.newLine();
        writer.write(user.getPassword());
        writer.newLine();
        writer.write("USER");
        writer.newLine();
        writer.newLine();

        writer.close();

        System.out.println("Your registration is complete.");
        System.out.println("Please log in.");
    }
}
