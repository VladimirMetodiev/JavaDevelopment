package generics.studyExperimentFour;

public class WorkingClass {
    String expression;

    <T> WorkingClass(T exp){
        expression = exp.toString();
    }
}
