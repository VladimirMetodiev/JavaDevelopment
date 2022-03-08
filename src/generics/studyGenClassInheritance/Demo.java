package generics.studyGenClassInheritance;

public class Demo {
    public static void main(String[] args){
        MySuperClass<Integer, Double> obj1 = new MySuperClass<>();
        obj1.set(5, 5.5);
        obj1.display();

        TheFirstSubClass<Double> obj2 = new TheFirstSubClass<>();
        obj2.set(3.14, "PI");
        obj2.display();

        TheSecondSubClass obj3 = new TheSecondSubClass();
        obj3.set('A', 1);
        obj3.display();
    }
}
