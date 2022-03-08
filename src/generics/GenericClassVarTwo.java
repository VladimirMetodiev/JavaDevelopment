package generics;

/*
 * Създавам параметризиран клас с множество полета, чиито член-променливи са от един и същ тип.
 */

public class GenericClassVarTwo<V> {
    private V value1;
    private V value2;

    public GenericClassVarTwo(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1 () {
        return value1;
    }

    public V getValue2 () {
        return value2;
    }

    public static void main(String[] args) {
        GenericClassVarTwo<String> obj1 = new GenericClassVarTwo<>("Struggle", "Victory");
        GenericClassVarTwo<Double> obj2 = new GenericClassVarTwo<>(3.33, 6.66);

        System.out.println(obj1.getValue1() + " and " + obj1.getValue2());
        System.out.println(obj2.getValue1() + " and " + obj2.getValue2());
    }
}
