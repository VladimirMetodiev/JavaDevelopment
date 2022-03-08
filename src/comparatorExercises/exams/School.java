package comparatorExercises.exams;

import java.util.ArrayList;

public class School {
    private int number;
    private ArrayList<Integer> mathematics = new ArrayList<>();
    private ArrayList<Integer> language = new ArrayList<>();
    private ArrayList<Integer> computerScience = new ArrayList<>();

    public School(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void addStudent(int mathematics, int language, int computerScience) {
        this.mathematics.add(mathematics);
        this.language.add(language);
        this.computerScience.add(computerScience);
    }

    public double getAverageMathematics() {
        return mathematics.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public double getAverageLanguage() {
        return language.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public double getAverageComputerScience() {
        return computerScience.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public double getAverageTotal() {
        return (getAverageMathematics() + getAverageLanguage() + getAverageComputerScience()) / 3.0;
    }

    @Override
    public String toString() {
        return String.format("School № %d: Mathematics - %.1f, Language - %.1f, Computer Science - %.1f, Total average score - %.1f", number, getAverageMathematics(), getAverageLanguage(), getAverageComputerScience(), getAverageTotal());
    }
}
