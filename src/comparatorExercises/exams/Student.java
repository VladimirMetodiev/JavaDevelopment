package comparatorExercises.exams;

public class Student {
    private String name;
    private String surname;
    private int school;
    private int mathematics;
    private int language;
    private int computerScience;

    public Student(String name, String surname, int school, int mathematics, int language, int computerScience) {
        this.name = name;
        this.surname = surname;
        this.school = school;
        this.mathematics = mathematics;
        this.language = language;
        this.computerScience = computerScience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSchool() {
        return school;
    }

    public int getMathematics() {
        return mathematics;
    }

    public int getLanguage() {
        return language;
    }

    public int getComputerScience() {
        return computerScience;
    }
}
