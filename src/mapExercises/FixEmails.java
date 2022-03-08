package mapExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixEmails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedHashMap<String, String> emails = new LinkedHashMap<>();
        String command;

        while(!(command = input.nextLine()).equals("stop")) {
            String name = command;
            String email = input.nextLine();

            Pattern pattern = Pattern.compile(".uk|.us|.com");
            Matcher matcher = pattern.matcher(email);

            if(!matcher.find()) {
                emails.put(name, email);
            }
        }

        for(Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}



//Condition

//You are given a sequence of strings, each on a new line, unitll you receive “stop” command. First string is a name of a person.
//On the second line you receive his email. Your task is to collect their names and emails, and remove emails whose domain
//ends with "us", "uk" or “com” (case insensitive). Print: {name} –> {email}



//Test

//Andrew Porter
//a.porter@gmail.com
//Michael Johnson
//mike.johnson@gmail.com
//Maria Atanasova
//maria.atanasova@abv.bg
//Robert Steinbeck
//roisterer@hotmail.com
//John Baird
//johnny.b@art.uk
//Boris Petrov
//bora@corp.us
//Alexey Bobrinsky
//liocha@mail.ru
//stop
