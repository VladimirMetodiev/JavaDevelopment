package generics.studyGenClassInheritance;

public class MySuperClass<T, U> {
    T field1;
    U field2;

    void set(T field1, U field2){
        this.field1 = field1;
        this.field2 = field2;
    }

    void display(){
        System.out.printf("[1] %s%n", field1);
        System.out.printf("[2] %s%n", field2);
    }
}
