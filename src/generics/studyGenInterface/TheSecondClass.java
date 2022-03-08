package generics.studyGenInterface;

public class TheSecondClass<T> implements GenInterfaceOne<T> {
    public void display(T val){
        System.out.println(val);
    }
}
