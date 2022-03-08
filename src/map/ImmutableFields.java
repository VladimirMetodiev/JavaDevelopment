package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ImmutableFields {
    public static void main(String[] args) {
        // Създал съм клас Student;
        // Създал съм HashMap, в който да съхранявам обекти на клас Student и съответстващите им годишни оценки;
        // За да мога да сравнявам обектите от тип Student в HashMap, преопределям методите .hashCode() и .equals();
        // ПРОМЕНЯМ курса на студентите от 1 на 2, след което вече не мога да ги открия в HashMap, защото хеш-кодът на обектите от тип Student е променен;
        // За да не се случват подобни грешки пред полетата на клас Student мога да напиша final, за да не мога да ги променям;

        Student s1 = new Student(2000251001, "Anna Dimitrova", 1);
        Student s2 = new Student(2000251002, "Nina Mihailova", 1);
        Student s3 = new Student(2000251003, "Konstantin Ivanov", 1);
        Student s4 = new Student(2000251004, "Vladimir Metodiev", 1);
        Student s5 = new Student(2000251005, "Atanaska Petrova", 1);

        HashMap<Student, Double> students = new HashMap<>();

        students.putIfAbsent(s1, 5.85);
        students.putIfAbsent(s2, 4.9);
        students.putIfAbsent(s3, 4.78);
        students.putIfAbsent(s4, 5.5);
        students.putIfAbsent(s5, 5.9);


        for(Map.Entry<Student, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey().name + " - hash code: " + entry.getKey().hashCode());
        }

        System.out.println("--------------------------------------------------");

        s1.course = 2;
        s2.course = 2;
        s3.course = 2;
        s4.course = 2;
        s5.course = 2;

        System.out.println("Does it contain \"Nina Mihailova\": " + students.containsKey(s1));
        System.out.println("Does it contain \"Konstantin Ivanov\": " + students.containsKey(s2));
        System.out.println("Does it contain \"Atanaska Petrova\": " + students.containsKey(s3));
        System.out.println("Does it contain \"Anna Dimitrova\": " + students.containsKey(s4));
        System.out.println("Does it contain \"Vladimir Metodiev\": " + students.containsKey(s5));

        System.out.println("--------------------------------------------------");

        for(Map.Entry<Student, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey().name + " - hash code: " + entry.getKey().hashCode());
        }
    }
}

class Student {
    int id;
    String name;
    int course;

    public Student(int id, String name, int course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                course == student.course &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, course);
    }
}