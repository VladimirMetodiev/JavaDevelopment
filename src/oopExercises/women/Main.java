package oopExercises.women;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        ArrayList<Woman> women = new ArrayList<>();

        for (int a = 0; a < number; a++) {
            String[] data = input.nextLine().split("\\s+");
            women.add(new Woman(data[0], data[1], Integer.parseInt(data[2])));
        }

        Collections.sort(women, new Comparator<Woman>() {
            @Override
            public int compare(Woman w1, Woman w2) {
                int firstComparison = w1.getName().compareTo(w2.getName());

                if (firstComparison != 0) return firstComparison;
                else return w1.getAge() - w2.getAge();
            }
        });

        women.forEach(w -> System.out.println(w));
    }
}



//Tests

//6
//Anna Dimitrova 30
//Maria Borisova 18
//Valeria Goranova 19
//Anna Petrova 34
//Maria Ivanova 36
//Sofia Angelova 29

//Anna Dimitrova is a 30 years old.
//Anna Petrova is a 34 years old.
//Maria Borisova is a 18 years old.
//Maria Ivanova is a 36 years old.
//Sofia Angelova is a 29 years old.
//Valeria Goranova is a 19 years old.
