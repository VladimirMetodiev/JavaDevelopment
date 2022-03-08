package generics.studyExperimentThree;

public class Main {
    public static void main(String[] args) {
        SomeClass object1 = new SomeClass(100);
        NonStaticMethod object2 = new NonStaticMethod();

        object2.set(object1);
        System.out.println(object2);
        object2.set(200L);
        System.out.println(object2);
        object2.set("Tutorial");
        System.out.println(object2);

        String[] capitals = {"Bucharest", "Madrid", "Vienna", "Sofia", "Copenhagen"};
        Character[] letters = {'A', 'B', 'C', 'D', 'E'};
        Integer[] numbers = {1, 3, 9, 27, 81};

        SomeClass[] objects = new SomeClass[numbers.length];
        for(int a = 0; a < objects.length; a++) objects[a] = new SomeClass((a + 1) * 100);

        String cap = object2.get(capitals, 'v');
        Character let = object2.get(letters, 't');
        Integer num = object2.get(numbers, 'a');
        SomeClass obj = object2.get(objects, 'm');

        System.out.println(cap);
        System.out.println(let);
        System.out.println(num);
        System.out.println(obj);
    }
}
