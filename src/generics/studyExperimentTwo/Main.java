package generics.studyExperimentTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Типът на аргумента, който приема параметризиран метод, може да се укаже явно, в такъв случай,
        // при това конкретно извикване на метода, може да се подаде аргумент само от указаният тип;

        show('G');
        Main.<Character>show('H');
        show(3.14);
        Main.<Double>show(3.1415926535897932384626433832795);

        ExpClassTwo.showObject(6000000000000000L);
        ExpClassTwo.<Long>showObject(6000000000000L);
    }

    private static <T> void show(T var){
        System.out.println(var);
    }
}
