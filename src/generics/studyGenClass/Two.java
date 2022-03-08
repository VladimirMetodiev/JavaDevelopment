package generics.studyGenClass;

public class Two<T, U> {
    T theFirstField;
    U theSecondField;

    Two(T value1, U value2) {
        theFirstField = value1;
        theSecondField = value2;
    }

    void show(){
        System.out.printf("%s and %s%n", theFirstField.toString(), theSecondField.toString());
    }
}
