package genericsExercises.genericsProblem;

public class GenericsTest {
    public static void main(String args[]){
        Integer a = 65;
        int b = 65;
        String foo = "A new String";

        MyClass<Integer> one = new MyClass<Integer>(a);
        System.out.println(one.get());

        MyClass<Integer> two = new MyClass<Integer>(b);
        System.out.println(two.get());

        MyClass<String> first = new MyClass<String>(foo);
        System.out.println(first.get());

        MyClass<String> second = new MyClass<String>("A new String");

        if (MyClass.equals(one, two)) {
            System.out.println("They are equal");
        }
        else {
            System.out.println("They are different");
        }

        if (MyClass.equals(first, second)) {
            System.out.println("They are equal");
        }
        else {
            System.out.println("They are different");
        }
    }
}
