package comparatorExercises.exams;

import java.util.*;
import java.util.stream.Collectors;

public class ExamStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<School> schools = new ArrayList<>();

        for (int a = 0; a < number; a++) {
            String[] data = input.nextLine().split("\\s+");
            students.add(new Student(data[1], data[0], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5])));
        }

        Set<Integer> schoolNumbers = students.stream().map(Student::getSchool).collect(Collectors.toSet());
        schoolNumbers.stream().mapToInt(Integer::intValue).forEach(sch -> schools.add(new School(sch)));

        for(School sch : schools) {
            for(Student st : students) {
                if(sch.getNumber() == st.getSchool()) {
                    sch.addStudent(st.getMathematics(), st.getLanguage(), st.getComputerScience());
                }
            }
        }

        double math = students.stream().mapToDouble(Student::getMathematics).average().orElse(0);
        double language = students.stream().mapToDouble(Student::getLanguage).average().orElse(0);
        double computerScience = students.stream().mapToDouble(Student::getComputerScience).average().orElse(0);
        double total = (math + language + computerScience) / 3.0;

        System.out.printf("The city report: Mathematics - %.1f, Language - %.1f, Computer Science - %.1f, Total average score - %.1f%n", math, language, computerScience, total);

        System.out.println("The school report:");

        Collections.sort(schools, new SchoolComparator());

        for(School sch : schools) {
            System.out.println(sch.toString());
        }

        int maxMath = students.stream().mapToInt(Student::getMathematics).max().orElse(0);
        int maxLanguage = students.stream().mapToInt(Student::getLanguage).max().orElse(0);
        int maxComputerScience = students.stream().mapToInt(Student::getComputerScience).max().orElse(0);

        students.stream()
                .filter(st -> st.getMathematics() == maxMath)
                .sorted(Comparator.comparing(Student::getSurname).thenComparing(Student::getName))
                .forEach(st -> System.out.printf("The best score in Mathematics - %s %s - %d%n", st.getSurname(), st.getName(), maxMath));

        students.stream()
                .filter(st -> st.getLanguage() == maxLanguage)
                .sorted(Comparator.comparing(Student::getSurname).thenComparing(Student::getName))
                .forEach(st -> System.out.printf("The best score in Language - %s %s - %d%n", st.getSurname(), st.getName(), maxLanguage));

        students.stream()
                .filter(st -> st.getComputerScience() == maxComputerScience)
                .sorted(Comparator.comparing(Student::getSurname).thenComparing(Student::getName))
                .forEach(st -> System.out.printf("The best score in Computer science - %s %s - %d%n", st.getSurname(), st.getName(), maxComputerScience));
    }
}



//Tests

//Input
//7
//Dimitrova Anna 32 90 100 90
//Ivanov Peter 71 91 89 100
//Georgiev Boris 1 15 60 30
//Metodiev Vladimir 32 100 100 100
//Panteva Nina 1 75 99 67
//Stoianova Gergana 17 78 87 77
//Genadieva Maria 89 66 54 78

//Output
//The city report: Mathematics - 73,6, Language - 84,1, Computer Science - 77,4, Total average score - 78,4
//The school report:
//School № 32: Mathematics - 95,0, Language - 100,0, Computer Science - 95,0, Total average score - 96,7
//School № 71: Mathematics - 91,0, Language - 89,0, Computer Science - 100,0, Total average score - 93,3
//School № 17: Mathematics - 78,0, Language - 87,0, Computer Science - 77,0, Total average score - 80,7
//School № 89: Mathematics - 66,0, Language - 54,0, Computer Science - 78,0, Total average score - 66,0
//School № 1: Mathematics - 45,0, Language - 79,5, Computer Science - 48,5, Total average score - 57,7
//The best score in Mathematics - Metodiev Vladimir - 100
//The best score in Language - Dimitrova Anna - 100
//The best score in Language - Metodiev Vladimir - 100
//The best score in Computer science - Ivanov Peter - 100
//The best score in Computer science - Metodiev Vladimir - 100


//Input
//9
//Trifonova Emilia 52 0 0 0
//Dimitrov Alexander 65 68 62 67
//Petrov Stoian 16 82 64 100
//Ilieva Valentina 3 90 85 90
//Maximov Nicola 2 30 45 25
//Popov Ivan 88 0 0 0
//Blagoeva Diana 2 55 77 99
//Metodieva Albena 1 100 70 95
//Metodieva Boriana 1 100 100 100

//Output
//The city report: Mathematics - 58,3, Language - 55,9, Computer Science - 64,0, Total average score - 59,4
//The school report:
//School № 1: Mathematics - 100,0, Language - 85,0, Computer Science - 97,5, Total average score - 94,2
//School № 3: Mathematics - 90,0, Language - 85,0, Computer Science - 90,0, Total average score - 88,3
//School № 16: Mathematics - 82,0, Language - 64,0, Computer Science - 100,0, Total average score - 82,0
//School № 65: Mathematics - 68,0, Language - 62,0, Computer Science - 67,0, Total average score - 65,7
//School № 2: Mathematics - 42,5, Language - 61,0, Computer Science - 62,0, Total average score - 55,2
//School № 88: Mathematics - 0,0, Language - 0,0, Computer Science - 0,0, Total average score - 0,0
//School № 52: Mathematics - 0,0, Language - 0,0, Computer Science - 0,0, Total average score - 0,0
//The best score in Mathematics - Metodieva Albena - 100
//The best score in Mathematics - Metodieva Boriana - 100
//The best score in Language - Metodieva Boriana - 100
//The best score in Computer science - Metodieva Boriana - 100
//The best score in Computer science - Petrov Stoian - 100
