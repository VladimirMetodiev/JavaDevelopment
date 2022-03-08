package generics;

public class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public String toString () {
        return String.format(">>> %s", value);
    }

    public static void main(String[] args) {
        GenericClass<String> value1 = new GenericClass<>("Victory");
        GenericClass<Integer> value2 = new GenericClass<>(10);

        System.out.println(value1);
        System.out.println(value2);
    }
}
