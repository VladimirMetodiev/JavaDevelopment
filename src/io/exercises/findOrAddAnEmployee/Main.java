package io.exercises.findOrAddAnEmployee;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff("text\\EmployeeDatabase.txt");

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String command, surname, name;

            getMessage();
            while(!(command = reader.readLine()).equalsIgnoreCase("end")) {
                switch (command) {
                    case "find": {
                        System.out.println("Enter a surname:");
                        surname = reader.readLine();
                        staff.search(surname);
                        break;
                    }
                    case "add": {
                        System.out.println("Enter a surname:");
                        surname = reader.readLine();
                        System.out.println("Enter a name:");
                        name = reader.readLine();
                        staff.addEmployee(surname, name);
                        break;
                    }
                    default: {
                        System.out.println("Wrong command!");
                        break;
                    }
                }
                getMessage();
            }

        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void getMessage() {
        System.out.println("Choose: \"find\", \"add\" or \"end\"");
    }
}



//Tests

//add
//Draganov
//Dragomir
//22
//System administrator
//3000


//add
//Goranova
//Emilia
//twenty-six
//Sales Representative
//2500


//add
//Goranova
//Emilia
//26
//Sales Representative
//2500
