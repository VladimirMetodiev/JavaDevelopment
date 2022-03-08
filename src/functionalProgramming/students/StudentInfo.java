package functionalProgramming.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    public static void main(String[] args) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.averageGrade, s1.averageGrade);
            }
        });


        Inquiries<Student> info1 = (Student s) -> s.averageGrade > 5;

        for(Student st : students) {
            if(info1.checkUp(st)) System.out.printf("%s has %.2f%n", st.name, st.averageGrade);
        }
        System.out.println();


        Inquiries<Student> info2 = (Student s) -> s.age <= 20;

        for (Student st : students) {
            if(info2.checkUp(st)) System.out.printf("%s is %d years old%n", st.name, st.age);
        }
        System.out.println();


        Inquiries<Student> info3 = (Student s) -> {
            if(s.sex == 'f') {
                if(s.age >= 20) {
                    if(s.averageGrade > 5.0) return true;
                    else return false;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        };

        for (Student st : students) {
            if(info3.checkUp(st)) System.out.printf("[%c] %s is %d years old, and has %.2f%n", st.sex, st.name, st.age, st.averageGrade);
        }
        System.out.println();


        Inquiries<Student> info4 = (Student s) -> {
            return s.sex == 'm' && s.age > 20 && s.averageGrade >= 4.5;
        };

        for (Student st : students) {
            if(info4.checkUp(st)) System.out.printf("[%c] %s is %d years old, and has %.2f%n", st.sex, st.name, st.age, st.averageGrade);
        }
        System.out.println();


        Predicate<Student> info5 = (Student s) -> s.sex == 'f' && s.age >= 21 && s.age <= 30;

        for (Student st : students) {
            if(info5.test(st)) System.out.printf("%s is %d years old%n", st.name, st.age);
        }
        System.out.println();


        System.out.println("Average age is: " + info6(students, student -> (double)student.age));
        System.out.println("Average grade of the class is: " + info6(students, student -> student.averageGrade));
    }

    static double info6(ArrayList<Student> students, Function<Student, Double> average){
        double result = 0.0;
        for(Student st : students) result += average.apply(st);
        return result / students.size();
    }

    static ArrayList<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Boris", 'm', 21, 3, 5.65),
            new Student("Sofia", 'f', 20, 3, 5.25),
            new Student("Nikola", 'm', 23, 3, 4.77),
            new Student("Ema", 'f', 19, 3, 4.00),
            new Student("Michel", 'm', 22, 3, 5.38),
            new Student("Alexander", 'm', 24, 3, 3.92),
            new Student("Ekaterina", 'f', 22, 3, 4.66),
            new Student("Lora", 'f', 18, 3, 5.25),
            new Student("Philip", 'm', 20, 3, 6.00),
            new Student("Maria", 'f', 21, 3, 5.95)
    ));
}
