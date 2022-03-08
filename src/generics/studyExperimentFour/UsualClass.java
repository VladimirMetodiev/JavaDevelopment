package generics.studyExperimentFour;

public class UsualClass {
    int field;

    UsualClass(int field) {
        this.field = field;
    }

    public String toString(){
        return String.format("Value: %d", field);
    }
}
