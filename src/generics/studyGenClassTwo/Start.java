package generics.studyGenClassTwo;

public class Start {
    private static Three<Integer> obj = new Three<>(999);
    private static Three experiment = obj;     // на променливата experiment присвоявам препратка към обекта obj

    public static void main(String[] args) {
        print();

        obj.setField(obj.getField() + 1);
        print();

        experiment.setField("This is text.");
        print();

        // Ако сега се опитам да увелича стойността на obj няма да успея
    }

    private static void print(){
        obj.show();
        experiment.show();
    }
}
