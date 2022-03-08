package generics;

/*
 * Създавам параметризиран клас с множество полета от различен тип.
 */

public class GenericClassVarThree<K, V> {
    private K key;
    private V value;

    public GenericClassVarThree(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericClassVarThree<Integer, String> obj = new GenericClassVarThree<>(5, "dogs");

        System.out.println(obj.getKey() + " " + obj.getValue());
    }
}
