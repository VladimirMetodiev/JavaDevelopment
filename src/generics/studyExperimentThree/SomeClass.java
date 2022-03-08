package generics.studyExperimentThree;

public class SomeClass {
    int field;

    SomeClass(int field) {
        this.field = field;
    }

    public String toString(){
        return String.format("SomeClass with value %d", field);
    }
}
