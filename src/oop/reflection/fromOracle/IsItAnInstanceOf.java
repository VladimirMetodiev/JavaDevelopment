package oop.reflection.fromOracle;

import oop.people.Person;

import java.util.Scanner;

public class IsItAnInstanceOf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            Class c = Class.forName("oop.people.Person");
            boolean b1 = c.isInstance(new Double(100.0));
            System.out.println(b1);
            boolean b2 = c.isInstance(new Person("Vladimir", "Metodiev", 43));
            System.out.println(b2);
        }
        catch (Throwable ex) {
            System.err.println(ex);
        }
    }
}



//https://www.oracle.com/technical-resources/articles/java/javareflection.html



//Test

//Input
//oop.people.Person
//new Person()
//new Person("Vladimir", "Metodiev", 43)
//Output
//true
//true

//Input
//oop.people.Person
//new Double(100.0)
//new Person("Vladimir", "Metodiev", 43)
//Output
//false
//true
