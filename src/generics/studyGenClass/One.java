package generics.studyGenClass;

public class One<T> {
    T field;

    One(T value) {
        field = value;
    }

    void show(){
        System.out.println(field);
    }
}
