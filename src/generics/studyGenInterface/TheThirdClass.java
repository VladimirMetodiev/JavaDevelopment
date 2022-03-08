package generics.studyGenInterface;

public class TheThirdClass<T, U> implements GenInterfaceOne<T> {
    private T field1;
    private U field2;

    public TheThirdClass(){
    }

    public TheThirdClass(T field1, U field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public void display(T val){
        System.out.println(val);
    }

    public void show(U val){
        System.out.println(val);
    }

    public T getField1() {
        return field1;
    }

    public U getField2() {
        return field2;
    }
}
