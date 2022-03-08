package oopExercises.forum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        List<User> users = new ArrayList<>();
        getUserList(users);

        Identification identification = new Identification();
        int profile = -1;

        while(true) {
            System.out.println("Choose: \"Log in\", \"Sing up\" or \"END\"");
            String command = input.nextLine().toUpperCase();
            switch (command) {
                case "LOG IN": {
                    profile = identification.logIn(users);
                    if(profile == -1) System.out.println("The login was unsuccessful.");
                    break;
                }
                case "SING UP": {
                    if(identification.singUp()) {
                        users = new ArrayList<>();
                        getUserList(users);
                    }
                    break;
                }
                case "END": {
                    return;
                }
                default: break;
            }

            if(profile > -1) break;
        }

        switch (users.get(profile).getStatus()) {
            case ADMINISTRATOR: View.startAnAdminSession(users.get(profile)); break;
            case USER: View.startAUserSession(users.get(profile)); break;
            default: System.out.println("Error!"); break;
        }
    }

    protected static void getUserList(List<User> users) {
        try(BufferedReader reader = new BufferedReader(new FileReader(Identification.getDataBase()))) {
            int symbol, age;
            String name, surname, email, password, current;
            Sex sex;
            Status status;

            while((symbol = reader.read()) != -1) {
                if(symbol == '#') {
                    reader.readLine();
                    name = reader.readLine();
                    surname = reader.readLine();
                    current = reader.readLine();
                    if(current.equals("M")) sex = Sex.MALE;
                    else sex = Sex.FEMALE;
                    age = Integer.parseInt(reader.readLine());
                    email = reader.readLine();
                    password = reader.readLine();
                    current = reader.readLine();
                    if(current.equals("ADMINISTRATOR")) status = Status.ADMINISTRATOR;
                    else if(current.equals("USER")) status = Status.USER;
                    else status = Status.BANNED;
                    users.add(new User(name, surname, sex, age, email, password, status));
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("There isn't such file.");
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}



