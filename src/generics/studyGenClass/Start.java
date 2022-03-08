package generics.studyGenClass;

public class Start {
    public static void main(String[] args) {
        One<Long> object1 = new One<>(565L);
        One<Double> object2 = new One<>(9.99);
        Two<Character, String> object3 = new Two<>('C', "charmer");
        Two<String, Float> object4 = new Two<>("Euler's number", 2.718282F);

        object1.show();
        object2.show();
        object3.show();
        object4.show();
    }
}
