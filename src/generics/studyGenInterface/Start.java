package generics.studyGenInterface;

public class Start {
    public static void main(String[] args) {
        TheFirstClass one = new TheFirstClass();
        one.display("Dignity doesn't consist in possessing honors, but in the consciousness that we deserve them.");

        TheSecondClass<Double> two = new TheSecondClass<>();
        two.display(5373.19);

        TheThirdClass<Integer, Float> three = new TheThirdClass<>();
        three.display(1000);
        three.show(72.49f);
    }
}
