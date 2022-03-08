package generics.studyGenClassTwo;

public class Three<T> {
    private T field;

    public Three(T value){
        field = value;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    void show(){
        System.out.println("VERIFICATION");
        System.out.println("Value of the field: " + field);
        System.out.println("Type of the field: " + field.getClass().getSimpleName() + "\n");
    }
}
