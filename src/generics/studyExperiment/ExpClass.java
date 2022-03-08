package generics.studyExperiment;

public class ExpClass {
    int number;

    ExpClass(int number){
        this.number = number;
    }

    public String toString(){
        return String.format("A value of the experimental class: %d", number);
    }
}
